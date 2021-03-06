package com.earth2me.essentials.signs;

import static com.earth2me.essentials.I18n._;
import com.earth2me.essentials.Trade.TradeType;
import com.earth2me.essentials.*;
import com.earth2me.essentials.Trade.OverflowType;
import java.math.BigDecimal;
import java.util.Map;
import org.bukkit.inventory.ItemStack;

//TODO: TL exceptions
public class SignTrade extends EssentialsSign
{
	public SignTrade()
	{
		super("Trade");
	}


	public enum AmountType
	{
		TOTAL,
		ROUNDED,
		COST
	}

	@Override
	protected boolean onSignCreate(final ISign sign, final User player, final String username, final IEssentials ess) throws SignException, ChargeException
	{
		validateTrade(sign, 1, false, ess);
		validateTrade(sign, 2, true, ess);
		final Trade trade = getTrade(sign, 2, AmountType.ROUNDED, true, ess);
		final Trade charge = getTrade(sign, 1, AmountType.ROUNDED, false, ess);
		if (trade.getType() == charge.getType() && (trade.getType() != TradeType.ITEM || trade.getItemStack().getType().equals(charge.getItemStack().getType())))
		{
			throw new SignException("You cannot trade for the same item type.");
		}
		trade.isAffordableFor(player);
		sign.setLine(3, "§8" + username);
		trade.charge(player);
		Trade.log("Sign", "Trade", "Create", username, trade, username, null, sign.getBlock().getLocation(), ess);
		return true;
	}

	@Override
	protected boolean onSignInteract(final ISign sign, final User player, final String username, final IEssentials ess) throws SignException, ChargeException
	{
		if (sign.getLine(3).substring(2).equalsIgnoreCase(username))
		{
			final Trade store = rechargeSign(sign, ess, player);
			Trade stored = null;
			try
			{
				stored = getTrade(sign, 1, AmountType.TOTAL, true, ess);
				subtractAmount(sign, 1, stored, ess);

				Map<Integer, ItemStack> withdraw = stored.pay(player, OverflowType.RETURN);

				if (withdraw == null)
				{
					Trade.log("Sign", "Trade", "Withdraw", username, store, username, null, sign.getBlock().getLocation(), ess);
				}
				else
				{
					setAmount(sign, 1, BigDecimal.valueOf(withdraw.get(0).getAmount()), ess);
					Trade.log("Sign", "Trade", "Withdraw", username, stored, username, new Trade(withdraw.get(0), ess), sign.getBlock().getLocation(), ess);
				}
			}
			catch (SignException e)
			{
				if (store == null)
				{
					throw new SignException(_("tradeSignEmptyOwner"), e);
				}
			}
			Trade.log("Sign", "Trade", "Deposit", username, store, username, null, sign.getBlock().getLocation(), ess);
		}
		else
		{
			final Trade charge = getTrade(sign, 1, AmountType.COST, false, ess);
			final Trade trade = getTrade(sign, 2, AmountType.COST, true, ess);
			charge.isAffordableFor(player);
			addAmount(sign, 1, charge, ess);
			subtractAmount(sign, 2, trade, ess);
			if (!trade.pay(player))
			{
				subtractAmount(sign, 1, charge, ess);
				addAmount(sign, 2, trade, ess);
				throw new ChargeException("Full inventory");
			}
			charge.charge(player);
			Trade.log("Sign", "Trade", "Interact", sign.getLine(3), charge, username, trade, sign.getBlock().getLocation(), ess);
		}
		sign.updateSign();
		return true;
	}

	private Trade rechargeSign(final ISign sign, final IEssentials ess, final User player) throws SignException, ChargeException
	{
		final Trade trade = getTrade(sign, 2, AmountType.COST, false, ess);
		if (trade.getItemStack() != null && player.getItemInHand() != null
			&& trade.getItemStack().getTypeId() == player.getItemInHand().getTypeId()
			&& trade.getItemStack().getDurability() == player.getItemInHand().getDurability()
			&& trade.getItemStack().getEnchantments().equals(player.getItemInHand().getEnchantments()))
		{
			int amount = player.getItemInHand().getAmount();
			amount -= amount % trade.getItemStack().getAmount();
			if (amount > 0)
			{
				final ItemStack stack = player.getItemInHand().clone();
				stack.setAmount(amount);
				final Trade store = new Trade(stack, ess);
				addAmount(sign, 2, store, ess);
				store.charge(player);
				return store;
			}
		}
		return null;
	}

	@Override
	protected boolean onSignBreak(final ISign sign, final User player, final String username, final IEssentials ess) throws SignException
	{
		if ((sign.getLine(3).length() > 3 && sign.getLine(3).substring(2).equalsIgnoreCase(username))
			|| player.isAuthorized("essentials.signs.trade.override"))
		{
			try
			{
				final Trade stored1 = getTrade(sign, 1, AmountType.TOTAL, false, ess);
				final Trade stored2 = getTrade(sign, 2, AmountType.TOTAL, false, ess);
				Map<Integer, ItemStack> withdraw1 = stored1.pay(player, OverflowType.RETURN);
				Map<Integer, ItemStack> withdraw2 = stored2.pay(player, OverflowType.RETURN);

				if (withdraw1 == null && withdraw2 == null)
				{
					Trade.log("Sign", "Trade", "Break", username, stored2, username, stored1, sign.getBlock().getLocation(), ess);
					return true;
				}

				setAmount(sign, 1, BigDecimal.valueOf(withdraw1 == null ? 0L : withdraw1.get(0).getAmount()), ess);
				Trade.log("Sign", "Trade", "Withdraw", username, stored1, username, withdraw1 == null ? null : new Trade(withdraw1.get(0), ess), sign.getBlock().getLocation(), ess);

				setAmount(sign, 2, BigDecimal.valueOf(withdraw2 == null ? 0L : withdraw2.get(0).getAmount()), ess);
				Trade.log("Sign", "Trade", "Withdraw", username, stored2, username, withdraw2 == null ? null : new Trade(withdraw2.get(0), ess), sign.getBlock().getLocation(), ess);

				sign.updateSign();
			}
			catch (SignException e)
			{
				if (player.isAuthorized("essentials.signs.trade.override"))
				{
					return true;
				}
				throw e;
			}
			return false;
		}
		else
		{
			return false;
		}
	}

	protected final void validateTrade(final ISign sign, final int index, final boolean amountNeeded, final IEssentials ess) throws SignException
	{
		final String line = sign.getLine(index).trim();
		if (line.isEmpty())
		{
			throw new SignException("Empty line");
		}
		final String[] split = line.split("[ :]+");

		if (split.length == 1 && !amountNeeded)
		{
			final BigDecimal money = getMoney(split[0]);
			if (money != null)
			{
				if (Util.shortCurrency(money, ess).length() * 2 > 15)
				{
					throw new SignException("Line can be too long!");
				}
				sign.setLine(index, Util.shortCurrency(money, ess) + ":0");
				return;
			}
		}

		if (split.length == 2 && amountNeeded)
		{
			final BigDecimal money = getMoney(split[0]);
			BigDecimal amount = getBigDecimalPositive(split[1]);
			if (money != null && amount != null)
			{
				amount = amount.subtract(amount.remainder(money));
				if (amount.compareTo(MINTRANSACTION) < 0 || money.compareTo(MINTRANSACTION) < 0)
				{
					throw new SignException(_("moreThanZero"));
				}
				sign.setLine(index, Util.shortCurrency(money, ess) + ":" + Util.shortCurrency(amount, ess).substring(1));
				return;
			}
		}

		if (split.length == 2 && !amountNeeded)
		{
			final int amount = getIntegerPositive(split[0]);

			if (amount < 1)
			{
				throw new SignException(_("moreThanZero"));
			}
			if (!(split[1].equalsIgnoreCase("exp") || split[1].equalsIgnoreCase("xp"))
				&& getItemStack(split[1], amount, ess).getTypeId() == 0)
			{
				throw new SignException(_("moreThanZero"));
			}
			String newline = amount + " " + split[1] + ":0";
			if ((newline + amount).length() > 15)
			{
				throw new SignException("Line can be too long!");
			}
			sign.setLine(index, newline);
			return;
		}

		if (split.length == 3 && amountNeeded)
		{
			final int stackamount = getIntegerPositive(split[0]);
			int amount = getIntegerPositive(split[2]);
			amount -= amount % stackamount;
			if (amount < 1 || stackamount < 1)
			{
				throw new SignException(_("moreThanZero"));
			}
			if (!(split[1].equalsIgnoreCase("exp") || split[1].equalsIgnoreCase("xp"))
				&& getItemStack(split[1], stackamount, ess).getTypeId() == 0)
			{
				throw new SignException(_("moreThanZero"));
			}
			sign.setLine(index, stackamount + " " + split[1] + ":" + amount);
			return;
		}
		throw new SignException(_("invalidSignLine", index + 1));
	}

	protected final Trade getTrade(final ISign sign, final int index, final AmountType amountType, final boolean notEmpty, final IEssentials ess) throws SignException
	{
		final String line = sign.getLine(index).trim();
		if (line.isEmpty())
		{
			throw new SignException("Empty line");
		}
		final String[] split = line.split("[ :]+");

		if (split.length == 2)
		{
			try
			{
				final BigDecimal money = getMoney(split[0]);
				final BigDecimal amount = notEmpty ? getBigDecimalPositive(split[1]) : getBigDecimal(split[1]);
				if (money != null && amount != null)
				{
					return new Trade(amountType == AmountType.COST ? money : amount, ess);
				}
			}
			catch (SignException e)
			{
				throw new SignException(_("tradeSignEmpty"), e);
			}
		}

		if (split.length == 3)
		{
			if (split[1].equalsIgnoreCase("exp") || split[1].equalsIgnoreCase("xp"))
			{
				final int stackamount = getIntegerPositive(split[0]);
				int amount = getInteger(split[2]);
				if (amountType == AmountType.ROUNDED)
				{
					amount -= amount % stackamount;
				}
				if (notEmpty && (amount < 1 || stackamount < 1))
				{
					throw new SignException(_("tradeSignEmpty"));
				}
				return new Trade((amountType == AmountType.COST ? stackamount : amount), ess);
			}
			else
			{
				final int stackamount = getIntegerPositive(split[0]);
				final ItemStack item = getItemStack(split[1], stackamount, ess);
				int amount = getInteger(split[2]);
				if (amountType == AmountType.ROUNDED)
				{
					amount -= amount % stackamount;
				}
				if (notEmpty && (amount < 1 || stackamount < 1 || item.getTypeId() == 0))
				{
					throw new SignException(_("tradeSignEmpty"));
				}
				item.setAmount(amountType == AmountType.COST ? stackamount : amount);
				return new Trade(item, ess);
			}
		}
		throw new SignException(_("invalidSignLine", index + 1));
	}

	protected final void subtractAmount(final ISign sign, final int index, final Trade trade, final IEssentials ess) throws SignException
	{
		final BigDecimal money = trade.getMoney();
		if (money != null)
		{
			changeAmount(sign, index, money.negate(), ess);
		}
		final ItemStack item = trade.getItemStack();
		if (item != null)
		{
			changeAmount(sign, index, BigDecimal.valueOf(-item.getAmount()), ess);
		}
		final Integer exp = trade.getExperience();
		if (exp != null)
		{
			changeAmount(sign, index, BigDecimal.valueOf(-exp.intValue()), ess);
		}
	}

	protected final void addAmount(final ISign sign, final int index, final Trade trade, final IEssentials ess) throws SignException
	{
		final BigDecimal money = trade.getMoney();
		if (money != null)
		{
			changeAmount(sign, index, money, ess);
		}
		final ItemStack item = trade.getItemStack();
		if (item != null)
		{
			changeAmount(sign, index, BigDecimal.valueOf(item.getAmount()), ess);
		}
		final Integer exp = trade.getExperience();
		if (exp != null)
		{
			changeAmount(sign, index, BigDecimal.valueOf(exp.intValue()), ess);
		}
	}

	//TODO: Translate these exceptions.
	private void changeAmount(final ISign sign, final int index, final BigDecimal value, final IEssentials ess) throws SignException
	{
		final String line = sign.getLine(index).trim();
		if (line.isEmpty())
		{
			throw new SignException("Empty line");
		}
		final String[] split = line.split("[ :]+");

		if (split.length == 2)
		{
			final BigDecimal amount = getBigDecimal(split[1]).add(value);
			setAmount(sign, index, amount, ess);
			return;
		}
		if (split.length == 3)
		{
			final BigDecimal amount = getBigDecimal(split[2]).add(value);
			setAmount(sign, index, amount, ess);
			return;
		}
		throw new SignException(_("invalidSignLine", index + 1));
	}

	//TODO: Translate these exceptions.
	private void setAmount(final ISign sign, final int index, final BigDecimal value, final IEssentials ess) throws SignException
	{

		final String line = sign.getLine(index).trim();
		if (line.isEmpty())
		{
			throw new SignException("Empty line");
		}
		final String[] split = line.split("[ :]+");

		if (split.length == 2)
		{
			final BigDecimal money = getMoney(split[0]);
			final BigDecimal amount = getBigDecimal(split[1]);
			if (money != null && amount != null)
			{
				final String newline = Util.shortCurrency(money, ess) + ":" + Util.shortCurrency(value, ess).substring(1);
				if (newline.length() > 15)
				{
					throw new SignException("This sign is full: Line too long!");
				}
				sign.setLine(index, newline);
				return;
			}
		}

		if (split.length == 3)
		{
			if (split[1].equalsIgnoreCase("exp") || split[1].equalsIgnoreCase("xp"))
			{
				final int stackamount = getIntegerPositive(split[0]);
				final String newline = stackamount + " " + split[1] + ":" + (value.intValueExact());
				if (newline.length() > 15)
				{
					throw new SignException("This sign is full: Line too long!");
				}
				sign.setLine(index, newline);
				return;
			}
			else
			{
				final int stackamount = getIntegerPositive(split[0]);
				getItemStack(split[1], stackamount, ess);
				final String newline = stackamount + " " + split[1] + ":" + (value.intValueExact());
				if (newline.length() > 15)
				{
					throw new SignException("This sign is full: Line too long!");
				}
				sign.setLine(index, newline);
				return;
			}
		}
		throw new SignException(_("invalidSignLine", index + 1));
	}
}
