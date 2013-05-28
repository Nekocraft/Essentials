package com.maxmind.geoip;
// generated automatically from admin/generate_regionName.pl
public class regionName {
static public String regionNameByCode(String country_code,String region_code) {
    String name = null;
    int region_code2 = -1;
    if (region_code == null) { return null; }
    if (region_code.equals("")) { return null; }

    if (    ((region_code.charAt(0) >= 48 ) && ( region_code.charAt(0) < ( 48 + 10 )))
         && ((region_code.charAt(1) >= 48 ) && ( region_code.charAt(1) < ( 48 + 10 )))
    ){
      // only numbers, that shorten the large switch statements
      region_code2 = (region_code.charAt(0)- 48) * 10 + region_code.charAt(1) - 48;
    }
	  else if (    (    ((region_code.charAt(0) >= 65) && (region_code.charAt(0) < (65 + 26)))
                 || ((region_code.charAt(0) >= 48) && (region_code.charAt(0) < (48 + 10))))
            && (    ((region_code.charAt(1) >= 65) && (region_code.charAt(1) < (65 + 26)))
                 || ((region_code.charAt(1) >= 48) && (region_code.charAt(1) < (48 + 10))))
  ) {

    region_code2 = (region_code.charAt(0) - 48) * (65 + 26 - 48) + region_code.charAt(1) - 48 + 100;
  }

  if (region_code2 == -1) {return null;}
    if (country_code.equals("CA") == true) {
      switch (region_code2) {
        case 849:
        name = "阿尔伯塔 ";
        break;
        case 893:
        name = "不列颠哥伦比亚省 ";
        break;
        case 1365:
        name = "马尼托巴 ";
        break;
        case 1408:
        name = "新不伦瑞克 ";
        break;
        case 1418:
        name = "纽芬兰 ";
        break;
        case 1425:
        name = "新斯科舍省 ";
        break;
        case 1427:
        name = "努纳武特地区 ";
        break;
        case 1463:
        name = "安大略省 ";
        break;
        case 1497:
        name = "爱德华王子岛 ";
        break;
        case 1538:
        name = "魁北克 ";
        break;
        case 1632:
        name = "萨斯喀彻温省 ";
        break;
        case 1426:
        name = "西北地区 ";
        break;
        case 1899:
        name = "育空地区 ";
        break;
      }
    }
    if (country_code.equals("US") == true) {
      switch (region_code2) {
        case 848:
        name = "武装部队美洲 ";
        break;
        case 852:
        name = "欧洲武装部队 ";
        break;
        case 858:
        name = "阿拉斯加州 ";
        break;
        case 859:
        name = "阿拉巴马州 ";
        break;
        case 863:
        name = "武装部队太平洋 ";
        break;
        case 865:
        name = "阿肯色州 ";
        break;
        case 866:
        name = "美国萨摩亚 ";
        break;
        case 873:
        name = "亚利桑那 ";
        break;
        case 934:
        name = "加州 ";
        break;
        case 948:
        name = "科罗拉多州 ";
        break;
        case 953:
        name = "康涅狄格 ";
        break;
        case 979:
        name = "哥伦比亚特区 ";
        break;
        case 981:
        name = "特拉华州 ";
        break;
        case 1074:
        name = "佛罗里达 ";
        break;
        case 1075:
        name = "密克罗尼西亚联邦 ";
        break;
        case 1106:
        name = "格鲁吉亚 ";
        break;
        case 1126:
        name = "关岛 ";
        break;
        case 1157:
        name = "夏威夷 ";
        break;
        case 1192:
        name = "爱荷华州 ";
        break;
        case 1195:
        name = "爱达荷州 ";
        break;
        case 1203:
        name = "伊利诺伊州 ";
        break;
        case 1205:
        name = "印地安那 ";
        break;
        case 1296:
        name = "堪萨斯 ";
        break;
        case 1302:
        name = "肯塔基州 ";
        break;
        case 1321:
        name = "路易斯安那州 ";
        break;
        case 1364:
        name = "马萨诸塞州 ";
        break;
        case 1367:
        name = "马里兰 ";
        break;
        case 1368:
        name = "缅因州 ";
        break;
        case 1371:
        name = "马绍尔群岛 ";
        break;
        case 1372:
        name = "密歇根州 ";
        break;
        case 1377:
        name = "明尼苏达州 ";
        break;
        case 1378:
        name = "密苏里州 ";
        break;
        case 1379:
        name = "北马里亚纳群岛 ";
        break;
        case 1382:
        name = "密西西比 ";
        break;
        case 1383:
        name = "蒙大拿 ";
        break;
        case 1409:
        name = "北卡罗莱纳州 ";
        break;
        case 1410:
        name = "北达科他州 ";
        break;
        case 1411:
        name = "内布拉斯加州 ";
        break;
        case 1414:
        name = "新罕布什尔州 ";
        break;
        case 1416:
        name = "新泽西州 ";
        break;
        case 1419:
        name = "新墨西哥州 ";
        break;
        case 1428:
        name = "内华达州 ";
        break;
        case 1431:
        name = "纽约 ";
        break;
        case 1457:
        name = "俄亥俄州 ";
        break;
        case 1460:
        name = "俄克拉何马州 ";
        break;
        case 1467:
        name = "俄勒冈州 ";
        break;
        case 1493:
        name = "宾夕法尼亚 ";
        break;
        case 1510:
        name = "波多黎各 ";
        break;
        case 1515:
        name = "帕劳 ";
        break;
        case 1587:
        name = "罗德岛 ";
        break;
        case 1624:
        name = "南卡罗来纳州 ";
        break;
        case 1625:
        name = "南达科他州 ";
        break;
        case 1678:
        name = "田纳西州 ";
        break;
        case 1688:
        name = "德州 ";
        break;
        case 1727:
        name = "犹他州 ";
        break;
        case 1751:
        name = "弗吉尼亚州 ";
        break;
        case 1759:
        name = "维尔京群岛 ";
        break;
        case 1770:
        name = "佛蒙特 ";
        break;
        case 1794:
        name = "华盛顿 ";
        break;
        case 1815:
        name = "西弗吉尼亚州 ";
        break;
        case 1802:
        name = "威斯康星州的 ";
        break;
        case 1818:
        name = "怀俄明州 ";
        break;
      }
    }
    if (country_code.equals("AD") == true) {
      switch (region_code2) {
        case 2:
        name = "卡尼 ";
        break;
        case 3:
        name = "扎营 ";
        break;
        case 4:
        name = "马萨纳 ";
        break;
        case 5:
        name = "奥尔迪诺 ";
        break;
        case 6:
        name = "圣利亚洛里亚 ";
        break;
        case 7:
        name = "安道​​尔城 ";
        break;
        case 8:
        name = "埃斯桑德 - 恩戈尔达 ";
        break;
      }
    }
    if (country_code.equals("AE") == true) {
      switch (region_code2) {
        case 1:
        name = "阿布扎比 ";
        break;
        case 2:
        name = "阿吉曼 ";
        break;
        case 3:
        name = "迪拜 ";
        break;
        case 4:
        name = "富查伊拉 ";
        break;
        case 5:
        name = "哈伊马角 ";
        break;
        case 6:
        name = "沙迦 ";
        break;
        case 7:
        name = "乌姆盖万 ";
        break;
      }
    }
    if (country_code.equals("AF") == true) {
      switch (region_code2) {
        case 1:
        name = "巴达赫尚 ";
        break;
        case 2:
        name = "巴德吉斯 ";
        break;
        case 3:
        name = "巴格兰 ";
        break;
        case 5:
        name = "八面 ";
        break;
        case 6:
        name = "法拉 ";
        break;
        case 7:
        name = "法里亚布 ";
        break;
        case 8:
        name = "加兹尼 ";
        break;
        case 9:
        name = "古尔 ";
        break;
        case 10:
        name = "赫尔曼德 ";
        break;
        case 11:
        name = "赫拉特 ";
        break;
        case 13:
        name = "Kabol ";
        break;
        case 14:
        name = "卡皮萨 ";
        break;
        case 15:
        name = "库纳尔 ";
        break;
        case 16:
        name = "拉格曼 ";
        break;
        case 17:
        name = "洛加尔 ";
        break;
        case 18:
        name = "楠格哈尔 ";
        break;
        case 19:
        name = "尼姆鲁兹 ";
        break;
        case 21:
        name = "帕克蒂亚 ";
        break;
        case 22:
        name = "帕尔旺 ";
        break;
        case 23:
        name = "坎大哈 ";
        break;
        case 24:
        name = "昆都士 ";
        break;
        case 26:
        name = "塔哈尔 ";
        break;
        case 27:
        name = "瓦尔达克 ";
        break;
        case 28:
        name = "扎布尔 ";
        break;
        case 29:
        name = "帕克提卡 ";
        break;
        case 30:
        name = "巴尔赫 ";
        break;
        case 31:
        name = "朱兹詹 ";
        break;
        case 32:
        name = "萨曼甘 ";
        break;
        case 33:
        name = "萨尔普勒 ";
        break;
        case 34:
        name = "库纳尔 ";
        break;
        case 35:
        name = "拉格曼 ";
        break;
        case 36:
        name = "帕克蒂亚 ";
        break;
        case 37:
        name = "霍斯特省 ";
        break;
        case 38:
        name = "努里斯坦 ";
        break;
        case 39:
        name = "乌鲁兹甘 ";
        break;
        case 40:
        name = "帕尔旺 ";
        break;
        case 41:
        name = "戴孔迪 ";
        break;
        case 42:
        name = "潘杰希尔 ";
        break;
      }
    }
    if (country_code.equals("AG") == true) {
      switch (region_code2) {
        case 1:
        name = "巴布达 ";
        break;
        case 3:
        name = "圣乔治 ";
        break;
        case 4:
        name = "圣约翰 ";
        break;
        case 5:
        name = "圣玛丽 ";
        break;
        case 6:
        name = "圣保罗 ";
        break;
        case 7:
        name = "圣彼得 ";
        break;
        case 8:
        name = "圣菲利普 ";
        break;
      }
    }
    if (country_code.equals("AL") == true) {
      switch (region_code2) {
        case 40:
        name = "培拉特 ";
        break;
        case 41:
        name = "迪勃拉 ";
        break;
        case 42:
        name = "杜勒斯 ";
        break;
        case 43:
        name = "爱尔巴桑 ";
        break;
        case 44:
        name = "费里 ";
        break;
        case 45:
        name = "吉诺卡斯特 ";
        break;
        case 46:
        name = "科尔察 ";
        break;
        case 47:
        name = "库克斯 ";
        break;
        case 48:
        name = "莱什 ";
        break;
        case 49:
        name = "斯库台 ";
        break;
        case 50:
        name = "地拉那 ";
        break;
        case 51:
        name = "发罗拉 ";
        break;
      }
    }
    if (country_code.equals("AM") == true) {
      switch (region_code2) {
        case 1:
        name = "阿拉加措特恩 ";
        break;
        case 2:
        name = "亚拉腊 ";
        break;
        case 3:
        name = "阿尔马维尔 ";
        break;
        case 4:
        name = "Geghark'unik' ";
        break;
        case 5:
        name = "科泰克 ";
        break;
        case 6:
        name = "LORRI ";
        break;
        case 7:
        name = "斯拉克 ";
        break;
        case 8:
        name = "休尼克 ";
        break;
        case 9:
        name = "塔武什 ";
        break;
        case 10:
        name = "瓦约茨佐尔Dzor ";
        break;
        case 11:
        name = "埃里温 ";
        break;
      }
    }
    if (country_code.equals("AO") == true) {
      switch (region_code2) {
        case 1:
        name = "格拉 ";
        break;
        case 2:
        name = "憋 ";
        break;
        case 3:
        name = "卡宾达 ";
        break;
        case 4:
        name = "宽多库邦戈 ";
        break;
        case 5:
        name = "北宽扎 ";
        break;
        case 6:
        name = "南宽扎 ";
        break;
        case 7:
        name = "安哥拉库内纳 ";
        break;
        case 8:
        name = "万博 ";
        break;
        case 9:
        name = "威拉 ";
        break;
        case 10:
        name = "罗安达 ";
        break;
        case 12:
        name = "马兰 ";
        break;
        case 13:
        name = "纳米贝 ";
        break;
        case 14:
        name = "莫西科 ";
        break;
        case 15:
        name = "威热 ";
        break;
        case 16:
        name = "扎伊尔 ";
        break;
        case 17:
        name = "北隆达 ";
        break;
        case 18:
        name = "南隆达 ";
        break;
        case 19:
        name = "戈 ";
        break;
        case 20:
        name = "罗安达 ";
        break;
      }
    }
    if (country_code.equals("AR") == true) {
      switch (region_code2) {
        case 1:
        name = "布宜诺斯艾利斯 ";
        break;
        case 2:
        name = "卡塔马卡 ";
        break;
        case 3:
        name = "查科 ";
        break;
        case 4:
        name = "丘布特 ";
        break;
        case 5:
        name = "科尔多瓦 ";
        break;
        case 6:
        name = "科连特斯 ";
        break;
        case 7:
        name = "联邦首都区 ";
        break;
        case 8:
        name = "恩特雷里奥斯 ";
        break;
        case 9:
        name = "台塑 ";
        break;
        case 10:
        name = "胡胡伊 ";
        break;
        case 11:
        name = "拉潘帕 ";
        break;
        case 12:
        name = "拉里奥哈 ";
        break;
        case 13:
        name = "门多萨 ";
        break;
        case 14:
        name = "米西奥内斯 ";
        break;
        case 15:
        name = "内乌肯 ";
        break;
        case 16:
        name = "里奥内格罗 ";
        break;
        case 17:
        name = "萨尔塔 ";
        break;
        case 18:
        name = "圣胡安 ";
        break;
        case 19:
        name = "圣路易斯 ";
        break;
        case 20:
        name = "圣克鲁斯 ";
        break;
        case 21:
        name = "圣达菲 ";
        break;
        case 22:
        name = "圣地亚哥 - 德尔埃斯特罗 ";
        break;
        case 23:
        name = "火地岛 ";
        break;
        case 24:
        name = "图库曼 ";
        break;
      }
    }
    if (country_code.equals("AT") == true) {
      switch (region_code2) {
        case 1:
        name = "布尔根兰州 ";
        break;
        case 2:
        name = "卡尔顿 ";
        break;
        case 3:
        name = "下奥地利 ";
        break;
        case 4:
        name = "上奥地利 ";
        break;
        case 5:
        name = "萨尔茨堡 ";
        break;
        case 6:
        name = "施蒂利亚州 ";
        break;
        case 7:
        name = "蒂罗尔 ";
        break;
        case 8:
        name = "福拉尔贝格 ";
        break;
        case 9:
        name = "维也纳 ";
        break;
      }
    }
    if (country_code.equals("AU") == true) {
      switch (region_code2) {
        case 1:
        name = "澳大利亚首都直辖区 ";
        break;
        case 2:
        name = "新南威尔士州 ";
        break;
        case 3:
        name = "北领地 ";
        break;
        case 4:
        name = "昆士兰 ";
        break;
        case 5:
        name = "南澳大利亚 ";
        break;
        case 6:
        name = "塔斯马尼亚 ";
        break;
        case 7:
        name = "维多利亚 ";
        break;
        case 8:
        name = "西澳大利亚 ";
        break;
      }
    }
    if (country_code.equals("AZ") == true) {
      switch (region_code2) {
        case 1:
        name = "Abseron ";
        break;
        case 2:
        name = "阿卡巴迪 ";
        break;
        case 3:
        name = "阿格达姆 ";
        break;
        case 4:
        name = "亚格达斯 ";
        break;
        case 5:
        name = "阿克斯塔法 ";
        break;
        case 6:
        name = "Agsu ";
        break;
        case 7:
        name = "阿里Bayramli ";
        break;
        case 8:
        name = "阿斯塔拉 ";
        break;
        case 9:
        name = "巴基 ";
        break;
        case 10:
        name = "巴拉坎 ";
        break;
        case 11:
        name = "巴尔达 ";
        break;
        case 12:
        name = "贝拉甘 ";
        break;
        case 13:
        name = "比拉苏瓦尔 ";
        break;
        case 14:
        name = "卡布拉伊 ";
        break;
        case 15:
        name = "Calilabad ";
        break;
        case 16:
        name = "达士卡桑 ";
        break;
        case 17:
        name = "Davaci ";
        break;
        case 18:
        name = "富祖里 ";
        break;
        case 19:
        name = "加达贝依 ";
        break;
        case 20:
        name = "甘萨 ";
        break;
        case 21:
        name = "戈兰博伊 ";
        break;
        case 22:
        name = "盖奥克恰伊 ";
        break;
        case 23:
        name = "哈吉卡布尔 ";
        break;
        case 24:
        name = "伊米斯里 ";
        break;
        case 25:
        name = "Ismayilli ";
        break;
        case 26:
        name = "卡尔巴卡尔 ";
        break;
        case 27:
        name = "丘尔达米尔 ";
        break;
        case 28:
        name = "Lacin ";
        break;
        case 29:
        name = "Lankaran的 ";
        break;
        case 30:
        name = "Lankaran的 ";
        break;
        case 31:
        name = "勒里克 ";
        break;
        case 32:
        name = "Masalli ";
        break;
        case 33:
        name = "明盖恰乌尔 ";
        break;
        case 34:
        name = "纳弗塔兰 ";
        break;
        case 35:
        name = "纳希切万 ";
        break;
        case 36:
        name = "Neftcala ";
        break;
        case 37:
        name = "奥古兹 ";
        break;
        case 38:
        name = "盖贝莱 ";
        break;
        case 39:
        name = "QAX ";
        break;
        case 40:
        name = "卡扎赫 ";
        break;
        case 41:
        name = "科布斯坦 ";
        break;
        case 42:
        name = "库巴 ";
        break;
        case 43:
        name = "Qubadli ";
        break;
        case 44:
        name = "库萨尔 ";
        break;
        case 45:
        name = "萨特雷 ";
        break;
        case 46:
        name = "萨比拉巴德 ";
        break;
        case 47:
        name = "萨基 ";
        break;
        case 48:
        name = "萨基 ";
        break;
        case 49:
        name = "萨利亚 ";
        break;
        case 50:
        name = "Samaxi ";
        break;
        case 51:
        name = "萨米克尔 ";
        break;
        case 52:
        name = "撒姆克 ";
        break;
        case 53:
        name = "锡亚赞 ";
        break;
        case 54:
        name = "苏姆盖特 ";
        break;
        case 55:
        name = "苏萨 ";
        break;
        case 56:
        name = "苏萨 ";
        break;
        case 57:
        name = "鞑靼 ";
        break;
        case 58:
        name = "塔乌兹 ";
        break;
        case 59:
        name = "尤卡 ";
        break;
        case 60:
        name = "哈奇马斯 ";
        break;
        case 61:
        name = "尚坎迪 ";
        break;
        case 62:
        name = "坎拉尔 ";
        break;
        case 63:
        name = "西子 ";
        break;
        case 64:
        name = "Xocali ";
        break;
        case 65:
        name = "霍卡万 ";
        break;
        case 66:
        name = "Yardimli ";
        break;
        case 67:
        name = "叶夫拉赫 ";
        break;
        case 68:
        name = "叶夫拉赫 ";
        break;
        case 69:
        name = "赞吉兰 ";
        break;
        case 70:
        name = "扎卡塔雷 ";
        break;
        case 71:
        name = "扎尔达布 ";
        break;
      }
    }
    if (country_code.equals("BA") == true) {
      switch (region_code2) {
        case 1:
        name = "波斯尼亚和黑塞哥维那联邦 ";
        break;
        case 2:
        name = "塞族共和国 ";
        break;
      }
    }
    if (country_code.equals("BB") == true) {
      switch (region_code2) {
        case 1:
        name = "基督堂 ";
        break;
        case 2:
        name = "圣安德鲁 ";
        break;
        case 3:
        name = "圣乔治 ";
        break;
        case 4:
        name = "圣詹姆斯 ";
        break;
        case 5:
        name = "圣约翰 ";
        break;
        case 6:
        name = "圣约瑟夫 ";
        break;
        case 7:
        name = "圣露西 ";
        break;
        case 8:
        name = "圣迈克尔 ";
        break;
        case 9:
        name = "圣彼得 ";
        break;
        case 10:
        name = "圣菲利普 ";
        break;
        case 11:
        name = "圣托马斯 ";
        break;
      }
    }
    if (country_code.equals("BD") == true) {
      switch (region_code2) {
        case 1:
        name = "巴里萨尔 ";
        break;
        case 4:
        name = "班多尔班 ";
        break;
        case 5:
        name = "库米拉 ";
        break;
        case 12:
        name = "迈门辛 ";
        break;
        case 13:
        name = "诺克哈利 ";
        break;
        case 15:
        name = "博杜阿卡利 ";
        break;
        case 22:
        name = "巴格尔海 ";
        break;
        case 23:
        name = "波拉 ";
        break;
        case 24:
        name = "博格拉 ";
        break;
        case 25:
        name = "博尔古纳 ";
        break;
        case 26:
        name = "婆罗门巴里亚 ";
        break;
        case 27:
        name = "德布尔 ";
        break;
        case 28:
        name = "差派Nawabganj ";
        break;
        case 29:
        name = "Chattagram ";
        break;
        case 30:
        name = "Chuadanga ";
        break;
        case 31:
        name = "科克斯巴扎尔 ";
        break;
        case 32:
        name = "达卡 ";
        break;
        case 33:
        name = "迪纳杰布尔 ";
        break;
        case 34:
        name = "福里德布尔 ";
        break;
        case 35:
        name = "芬尼 ";
        break;
        case 36:
        name = "戈伊班达 ";
        break;
        case 37:
        name = "加济布尔 ";
        break;
        case 38:
        name = "戈巴尔甘杰 ";
        break;
        case 39:
        name = "霍比甘杰 ";
        break;
        case 40:
        name = "伊布尔哈德 ";
        break;
        case 41:
        name = "杰马勒布尔 ";
        break;
        case 42:
        name = "杰索尔 ";
        break;
        case 43:
        name = "贾拉卡迪 ";
        break;
        case 44:
        name = "切尼达 ";
        break;
        case 45:
        name = "Khagrachari的 ";
        break;
        case 46:
        name = "库尔纳 ";
        break;
        case 47:
        name = "Kishorganj ";
        break;
        case 48:
        name = "库里格莱姆 ";
        break;
        case 49:
        name = "库什蒂亚 ";
        break;
        case 50:
        name = "Laksmipur ";
        break;
        case 51:
        name = "拉尔莫尼哈德 ";
        break;
        case 52:
        name = "马达里布尔 ";
        break;
        case 53:
        name = "马古拉 ";
        break;
        case 54:
        name = "马尼格甘杰 ";
        break;
        case 55:
        name = "莫赫尔普 ";
        break;
        case 56:
        name = "Moulavibazar ";
        break;
        case 57:
        name = "蒙希甘杰 ";
        break;
        case 58:
        name = "瑙冈 ";
        break;
        case 59:
        name = "诺拉尔 ";
        break;
        case 60:
        name = "纳拉扬甘杰 ";
        break;
        case 61:
        name = "诺尔辛迪 ";
        break;
        case 62:
        name = "NATOR ";
        break;
        case 63:
        name = "奈托库纳 ";
        break;
        case 64:
        name = "尼尔法玛里 ";
        break;
        case 65:
        name = "巴布纳 ";
        break;
        case 66:
        name = "Panchagar ";
        break;
        case 67:
        name = "Parbattya Chattagram ";
        break;
        case 68:
        name = "皮罗基普 ";
        break;
        case 69:
        name = "拉杰巴里 ";
        break;
        case 70:
        name = "拉杰沙希 ";
        break;
        case 71:
        name = "朗布尔 ";
        break;
        case 72:
        name = "沙特基拉 ";
        break;
        case 73:
        name = "Shariyatpur ";
        break;
        case 74:
        name = "谢尔布尔 ";
        break;
        case 75:
        name = "锡拉杰甘杰 ";
        break;
        case 76:
        name = "苏纳姆甘杰 ";
        break;
        case 77:
        name = "锡尔赫特 ";
        break;
        case 78:
        name = "坦盖尔 ";
        break;
        case 79:
        name = "萨库尔贡 ";
        break;
        case 81:
        name = "达卡 ";
        break;
        case 82:
        name = "库尔纳 ";
        break;
        case 83:
        name = "拉杰沙希 ";
        break;
        case 84:
        name = "吉大港 ";
        break;
        case 85:
        name = "巴里萨尔 ";
        break;
        case 86:
        name = "锡尔赫特 ";
        break;
      }
    }
    if (country_code.equals("BE") == true) {
      switch (region_code2) {
        case 1:
        name = "安特卫普 ";
        break;
        case 2:
        name = "布拉班特 ";
        break;
        case 3:
        name = "埃诺 ";
        break;
        case 4:
        name = "诸侯的 ";
        break;
        case 5:
        name = "林堡省 ";
        break;
        case 6:
        name = "卢森堡 ";
        break;
        case 7:
        name = "那慕尔 ";
        break;
        case 8:
        name = "东佛兰德 ";
        break;
        case 9:
        name = "西佛兰德 ";
        break;
        case 10:
        name = "瓦隆 - 布拉班特 ";
        break;
        case 11:
        name = "布鲁塞尔首都行政自治区 ";
        break;
        case 12:
        name = "佛兰芒 - 布拉班特 ";
        break;
      }
    }
    if (country_code.equals("BF") == true) {
      switch (region_code2) {
        case 15:
        name = "哄骗 ";
        break;
        case 19:
        name = "布尔基恩德 ";
        break;
        case 20:
        name = "冈祖尔古 ";
        break;
        case 21:
        name = "尼亚尼亚 ";
        break;
        case 28:
        name = "库里滕加 ";
        break;
        case 33:
        name = "乌达兰 ";
        break;
        case 34:
        name = "帕索雷 ";
        break;
        case 36:
        name = "桑吉 ";
        break;
        case 40:
        name = "苏木 ";
        break;
        case 42:
        name = "塔波阿 ";
        break;
        case 44:
        name = "宗德韦奥戈 ";
        break;
        case 45:
        name = "包 ";
        break;
        case 46:
        name = "板瓦 ";
        break;
        case 47:
        name = "巴泽加 ";
        break;
        case 48:
        name = "布古里巴 ";
        break;
        case 49:
        name = "布尔古 ";
        break;
        case 50:
        name = "古尔马 ";
        break;
        case 51:
        name = "乌埃 ";
        break;
        case 52:
        name = "伊奥巴 ";
        break;
        case 53:
        name = "卡焦戈 ";
        break;
        case 54:
        name = "凯内杜古 ";
        break;
        case 55:
        name = "科莫埃河 ";
        break;
        case 56:
        name = "科蒙加里 ";
        break;
        case 57:
        name = "孔皮恩加 ";
        break;
        case 58:
        name = "科西 ";
        break;
        case 59:
        name = "库尔佩罗戈 ";
        break;
        case 60:
        name = "库尔维奥戈 ";
        break;
        case 61:
        name = "雷拉巴 ";
        break;
        case 62:
        name = "罗卢姆 ";
        break;
        case 63:
        name = "穆翁 ";
        break;
        case 64:
        name = "纳门滕加 ";
        break;
        case 65:
        name = "Naouri ";
        break;
        case 66:
        name = "纳亚拉 ";
        break;
        case 67:
        name = "努姆比埃尔 ";
        break;
        case 68:
        name = "乌布里滕加 ";
        break;
        case 69:
        name = "波尼 ";
        break;
        case 70:
        name = "桑马滕加 ";
        break;
        case 71:
        name = "仙翁 ";
        break;
        case 72:
        name = "锡西里 ";
        break;
        case 73:
        name = "苏鲁 ";
        break;
        case 74:
        name = "绥 ";
        break;
        case 75:
        name = "亚加 ";
        break;
        case 76:
        name = "亚敦加 ";
        break;
        case 77:
        name = "济罗 ";
        break;
        case 78:
        name = "宗多马 ";
        break;
      }
    }
    if (country_code.equals("BG") == true) {
      switch (region_code2) {
        case 33:
        name = "Mikhaylovgrad ";
        break;
        case 38:
        name = "布拉戈耶 ";
        break;
        case 39:
        name = "布尔加斯 ";
        break;
        case 40:
        name = "多布里奇 ";
        break;
        case 41:
        name = "加布罗沃 ";
        break;
        case 42:
        name = "毕业Sofiya ";
        break;
        case 43:
        name = "Khaskovo ";
        break;
        case 44:
        name = "克尔贾利 ";
        break;
        case 45:
        name = "丘斯滕迪尔 ";
        break;
        case 46:
        name = "洛维奇 ";
        break;
        case 47:
        name = "蒙大拿 ";
        break;
        case 48:
        name = "帕扎尔吉克 ";
        break;
        case 49:
        name = "佩尔尼克 ";
        break;
        case 50:
        name = "普列文 ";
        break;
        case 51:
        name = "普罗夫迪夫 ";
        break;
        case 52:
        name = "拉兹格勒 ";
        break;
        case 53:
        name = "谋略 ";
        break;
        case 54:
        name = "苏曼 ";
        break;
        case 55:
        name = "锡利斯特拉 ";
        break;
        case 56:
        name = "斯利文 ";
        break;
        case 57:
        name = "斯莫 ";
        break;
        case 58:
        name = "Sofiya ";
        break;
        case 59:
        name = "旧扎戈拉 ";
        break;
        case 60:
        name = "Turgovishte ";
        break;
        case 61:
        name = "瓦尔纳 ";
        break;
        case 62:
        name = "大特尔诺沃 ";
        break;
        case 63:
        name = "维丁 ";
        break;
        case 64:
        name = "弗拉察 ";
        break;
        case 65:
        name = "扬博尔 ";
        break;
      }
    }
    if (country_code.equals("BH") == true) {
      switch (region_code2) {
        case 1:
        name = "Al哈特贾南的 ";
        break;
        case 2:
        name = "麦纳麦 ";
        break;
        case 3:
        name = "Al木海拉格的 ";
        break;
        case 5:
        name = "Jidd哈夫斯 ";
        break;
        case 6:
        name = "锡特拉 ";
        break;
        case 7:
        name = "AR日发'WA人Mintaqah加努巴亚 ";
        break;
        case 8:
        name = "铝Mintaqah人比亚 ";
        break;
        case 9:
        name = "Mintaqat Juzur哈瓦尔 ";
        break;
        case 10:
        name = "铝灰Mintaqah Shamaliyah ";
        break;
        case 11:
        name = "铝Mintaqah人Wusta ";
        break;
        case 12:
        name = "古城 ";
        break;
        case 13:
        name = "氩日发 ";
        break;
        case 14:
        name = "哈马德古城 ";
        break;
        case 15:
        name = "Al木海拉格的 ";
        break;
        case 16:
        name = "Al Asimah的 ";
        break;
        case 17:
        name = "哈加奴比亚 ";
        break;
        case 18:
        name = "北部省 ";
        break;
        case 19:
        name = "Al Wusta的 ";
        break;
      }
    }
    if (country_code.equals("BI") == true) {
      switch (region_code2) {
        case 2:
        name = "布琼布拉 ";
        break;
        case 9:
        name = "布班扎 ";
        break;
        case 10:
        name = "布鲁 ";
        break;
        case 11:
        name = "坎库佐 ";
        break;
        case 12:
        name = "锡比托克 ";
        break;
        case 13:
        name = "基特加 ";
        break;
        case 14:
        name = "卡鲁 ";
        break;
        case 15:
        name = "卡扬扎 ";
        break;
        case 16:
        name = "基隆 ";
        break;
        case 17:
        name = "马坎巴 ";
        break;
        case 18:
        name = "穆因加 ";
        break;
        case 19:
        name = "恩戈齐 ";
        break;
        case 20:
        name = "鲁塔纳 ";
        break;
        case 21:
        name = "鲁伊吉 ";
        break;
        case 22:
        name = "穆朗维亚 ";
        break;
        case 23:
        name = "穆瓦洛 ";
        break;
      }
    }
    if (country_code.equals("BJ") == true) {
      switch (region_code2) {
        case 1:
        name = "阿塔科拉 ";
        break;
        case 2:
        name = "大西洋 ";
        break;
        case 3:
        name = "博尔古 ";
        break;
        case 4:
        name = "单声道 ";
        break;
        case 5:
        name = "韦梅 ";
        break;
        case 6:
        name = "邹 ";
        break;
        case 7:
        name = "阿黎博里 ";
        break;
        case 8:
        name = "阿塔科拉 ";
        break;
        case 9:
        name = "Atlanyique ";
        break;
        case 10:
        name = "博尔古 ";
        break;
        case 11:
        name = "科林斯 ";
        break;
        case 12:
        name = "库福 ";
        break;
        case 13:
        name = "东阿 ";
        break;
        case 14:
        name = "濒海 ";
        break;
        case 15:
        name = "单声道 ";
        break;
        case 16:
        name = "韦梅 ";
        break;
        case 17:
        name = "高原 ";
        break;
        case 18:
        name = "邹 ";
        break;
      }
    }
    if (country_code.equals("BM") == true) {
      switch (region_code2) {
        case 1:
        name = "德文郡 ";
        break;
        case 2:
        name = "汉密尔顿 ";
        break;
        case 3:
        name = "汉密尔顿 ";
        break;
        case 4:
        name = "佩吉特 ";
        break;
        case 5:
        name = "彭布罗克 ";
        break;
        case 6:
        name = "圣乔治 ";
        break;
        case 7:
        name = "圣乔治 ";
        break;
        case 8:
        name = "桑迪斯 ";
        break;
        case 9:
        name = "史密斯 ";
        break;
        case 10:
        name = "南安普敦 ";
        break;
        case 11:
        name = "华威 ";
        break;
      }
    }
    if (country_code.equals("BN") == true) {
      switch (region_code2) {
        case 7:
        name = "阿黎博里 ";
        break;
        case 8:
        name = "奕 ";
        break;
        case 9:
        name = "文莱和穆阿拉 ";
        break;
        case 10:
        name = "淡布隆 ";
        break;
        case 11:
        name = "科林斯 ";
        break;
        case 12:
        name = "库福 ";
        break;
        case 13:
        name = "东阿 ";
        break;
        case 14:
        name = "濒海 ";
        break;
        case 15:
        name = "都东 ";
        break;
        case 16:
        name = "韦梅 ";
        break;
        case 17:
        name = "高原 ";
        break;
        case 18:
        name = "邹 ";
        break;
      }
    }
    if (country_code.equals("BO") == true) {
      switch (region_code2) {
        case 1:
        name = "丘基萨卡 ";
        break;
        case 2:
        name = "科恰班巴 ";
        break;
        case 3:
        name = "贝尼 ";
        break;
        case 4:
        name = "拉巴斯 ";
        break;
        case 5:
        name = "奥鲁罗 ";
        break;
        case 6:
        name = "潘多 ";
        break;
        case 7:
        name = "波托西 ";
        break;
        case 8:
        name = "圣克鲁斯 ";
        break;
        case 9:
        name = "塔里哈 ";
        break;
      }
    }
    if (country_code.equals("BR") == true) {
      switch (region_code2) {
        case 1:
        name = "英亩 ";
        break;
        case 2:
        name = "阿拉戈斯 ";
        break;
        case 3:
        name = "阿玛帕 ";
        break;
        case 4:
        name = "亚马孙 ";
        break;
        case 5:
        name = "巴伊亚 ";
        break;
        case 6:
        name = "塞阿拉 ";
        break;
        case 7:
        name = "联邦首都区 ";
        break;
        case 8:
        name = "圣埃斯皮里图 ";
        break;
        case 11:
        name = "南马托格罗索 ";
        break;
        case 13:
        name = "马拉尼昂 ";
        break;
        case 14:
        name = "马托格罗索 ";
        break;
        case 15:
        name = "米纳斯吉拉斯州 ";
        break;
        case 16:
        name = "帕拉 ";
        break;
        case 17:
        name = "帕拉伊巴 ";
        break;
        case 18:
        name = "巴拉那 ";
        break;
        case 20:
        name = "皮奥伊 ";
        break;
        case 21:
        name = "里约热内卢 ";
        break;
        case 22:
        name = "北里奥格兰德州 ";
        break;
        case 23:
        name = "南里奥格兰德州 ";
        break;
        case 24:
        name = "朗多尼亚州 ";
        break;
        case 25:
        name = "罗赖马 ";
        break;
        case 26:
        name = "圣卡塔琳娜 ";
        break;
        case 27:
        name = "圣保罗 ";
        break;
        case 28:
        name = "塞尔希培 ";
        break;
        case 29:
        name = "戈亚斯 ";
        break;
        case 30:
        name = "伯南布哥 ";
        break;
        case 31:
        name = "托坎廷斯 ";
        break;
      }
    }
    if (country_code.equals("BS") == true) {
      switch (region_code2) {
        case 5:
        name = "比米尼岛 ";
        break;
        case 6:
        name = "猫岛 ";
        break;
        case 10:
        name = "埃克苏马 ";
        break;
        case 13:
        name = "因那瓜 ";
        break;
        case 15:
        name = "长岛 ";
        break;
        case 16:
        name = "马亚 ";
        break;
        case 18:
        name = "拉吉德岛 ";
        break;
        case 22:
        name = "海港岛 ";
        break;
        case 23:
        name = "新普罗维登斯 ";
        break;
        case 24:
        name = "阿克林和歪群岛 ";
        break;
        case 25:
        name = "自由港 ";
        break;
        case 26:
        name = "新溪 ";
        break;
        case 27:
        name = "总督的港湾 ";
        break;
        case 28:
        name = "绿龟岛 ";
        break;
        case 29:
        name = "高岩 ";
        break;
        case 30:
        name = "肯普斯贝 ";
        break;
        case 31:
        name = "马什港 ";
        break;
        case 32:
        name = "Nichollstown和浆果群岛 ";
        break;
        case 33:
        name = "罗克桑德 ";
        break;
        case 34:
        name = "桑迪波因特 ";
        break;
        case 35:
        name = "圣萨尔瓦多和朗姆礁的 ";
        break;
      }
    }
    if (country_code.equals("BT") == true) {
      switch (region_code2) {
        case 5:
        name = "布姆唐 ";
        break;
        case 6:
        name = "楚卡 ";
        break;
        case 7:
        name = "Chirang ";
        break;
        case 8:
        name = "达嘎 ";
        break;
        case 9:
        name = "Geylegphug ";
        break;
        case 10:
        name = "哈 ";
        break;
        case 11:
        name = "Lhuntshi ";
        break;
        case 12:
        name = "蒙加尔 ";
        break;
        case 13:
        name = "帕罗 ";
        break;
        case 14:
        name = "Pemagatsel ";
        break;
        case 15:
        name = "普那卡 ";
        break;
        case 16:
        name = "Samchi ";
        break;
        case 17:
        name = "萨姆德鲁琼 ";
        break;
        case 18:
        name = "Shemgang ";
        break;
        case 19:
        name = "Tashigang ";
        break;
        case 20:
        name = "廷布 ";
        break;
        case 21:
        name = "Tongsa ";
        break;
        case 22:
        name = "旺地杜波德朗宗 ";
        break;
      }
    }
    if (country_code.equals("BW") == true) {
      switch (region_code2) {
        case 1:
        name = "中央 ";
        break;
        case 3:
        name = "杭济 ";
        break;
        case 4:
        name = "卡拉哈迪 ";
        break;
        case 5:
        name = "卡特伦 ";
        break;
        case 6:
        name = "奎嫩 ";
        break;
        case 8:
        name = "东北 ";
        break;
        case 9:
        name = "东南亚 ";
        break;
        case 10:
        name = "南部的 ";
        break;
        case 11:
        name = "西北 ";
        break;
      }
    }
    if (country_code.equals("BY") == true) {
      switch (region_code2) {
        case 1:
        name = "布列斯特Voblasts' ";
        break;
        case 2:
        name = "Homyel'skaya Voblasts' ";
        break;
        case 3:
        name = "Hrodzyenskaya Voblasts' ";
        break;
        case 4:
        name = "明斯克 ";
        break;
        case 5:
        name = "Minskaya Voblasts' ";
        break;
        case 6:
        name = "莫吉廖夫州Voblasts' ";
        break;
        case 7:
        name = "Vitsyebskaya Voblasts' ";
        break;
      }
    }
    if (country_code.equals("BZ") == true) {
      switch (region_code2) {
        case 1:
        name = "伯利兹 ";
        break;
        case 2:
        name = "卡约 ";
        break;
        case 3:
        name = "科罗萨尔 ";
        break;
        case 4:
        name = "奥兰治城 ";
        break;
        case 5:
        name = "斯坦克里克 ";
        break;
        case 6:
        name = "托莱多 ";
        break;
      }
    }
    if (country_code.equals("CD") == true) {
      switch (region_code2) {
        case 1:
        name = "杜 ";
        break;
        case 2:
        name = "赤道 ";
        break;
        case 4:
        name = "东开赛 ";
        break;
        case 5:
        name = "加丹加 ";
        break;
        case 6:
        name = "金沙萨 ";
        break;
        case 7:
        name = "基伍 ";
        break;
        case 8:
        name = "下刚果 ";
        break;
        case 9:
        name = "东方 ";
        break;
        case 10:
        name = "马尼埃马 ";
        break;
        case 11:
        name = "北基伍 ";
        break;
        case 12:
        name = "南基伍 ";
        break;
        case 13:
        name = "比色皿 ";
        break;
      }
    }
    if (country_code.equals("CF") == true) {
      switch (region_code2) {
        case 1:
        name = "巴明吉 - 班 ";
        break;
        case 2:
        name = "下科托 ";
        break;
        case 3:
        name = "上科托 ";
        break;
        case 4:
        name = "曼贝雷卡代 ";
        break;
        case 5:
        name = "上姆博穆 ";
        break;
        case 6:
        name = "凯莫 ";
        break;
        case 7:
        name = "洛巴耶 ";
        break;
        case 8:
        name = "姆博穆 ";
        break;
        case 9:
        name = "娜娜曼贝雷的 ";
        break;
        case 11:
        name = "瓦卡 ";
        break;
        case 12:
        name = "瓦姆 ";
        break;
        case 13:
        name = "瓦姆 - 彭代 ";
        break;
        case 14:
        name = "西盆地 ";
        break;
        case 15:
        name = "纳纳 - 格里比齐 ";
        break;
        case 16:
        name = "僧伽姆巴埃雷的 ";
        break;
        case 17:
        name = "翁贝拉 - 姆波科 ";
        break;
        case 18:
        name = "班吉 ";
        break;
      }
    }
    if (country_code.equals("CG") == true) {
      switch (region_code2) {
        case 1:
        name = "布昂扎 ";
        break;
        case 3:
        name = "比色皿 ";
        break;
        case 4:
        name = "奎卢 ";
        break;
        case 5:
        name = "莱库穆 ";
        break;
        case 6:
        name = "利夸拉 ";
        break;
        case 7:
        name = "尼阿里 ";
        break;
        case 8:
        name = "高原 ";
        break;
        case 10:
        name = "僧伽 ";
        break;
        case 11:
        name = "水池 ";
        break;
        case 12:
        name = "布拉柴维尔 ";
        break;
      }
    }
    if (country_code.equals("CH") == true) {
      switch (region_code2) {
        case 1:
        name = "阿尔 ";
        break;
        case 2:
        name = "Ausser罗登 ";
        break;
        case 3:
        name = "巴塞尔乡村半州 ";
        break;
        case 4:
        name = "巴塞尔城市 ";
        break;
        case 5:
        name = "伯尔尼 ";
        break;
        case 6:
        name = "弗里堡 ";
        break;
        case 7:
        name = "日内瓦 ";
        break;
        case 8:
        name = "格拉鲁斯 ";
        break;
        case 9:
        name = "格劳宾登 ";
        break;
        case 10:
        name = "内蒙古罗登 ";
        break;
        case 11:
        name = "卢塞恩 ";
        break;
        case 12:
        name = "纳沙泰尔 ";
        break;
        case 13:
        name = "瓦尔登 ";
        break;
        case 14:
        name = "瓦尔登 ";
        break;
        case 15:
        name = "圣加伦 ";
        break;
        case 16:
        name = "沙夫豪森 ";
        break;
        case 17:
        name = "施维茨 ";
        break;
        case 18:
        name = "索洛图恩 ";
        break;
        case 19:
        name = "高州 ";
        break;
        case 20:
        name = "提契诺 ";
        break;
        case 21:
        name = "乌里 ";
        break;
        case 22:
        name = "瓦莱州 ";
        break;
        case 23:
        name = "沃 ";
        break;
        case 24:
        name = "祖格 ";
        break;
        case 25:
        name = "苏黎世 ";
        break;
        case 26:
        name = "朱拉 ";
        break;
      }
    }
    if (country_code.equals("CI") == true) {
      switch (region_code2) {
        case 5:
        name = "阿塔卡马 ";
        break;
        case 6:
        name = "比奥比奥 ";
        break;
        case 51:
        name = "萨桑德拉 ";
        break;
        case 61:
        name = "阿比让 ";
        break;
        case 74:
        name = "阿涅比 ";
        break;
        case 75:
        name = "巴芬 ";
        break;
        case 76:
        name = "BAS-萨桑德拉的 ";
        break;
        case 77:
        name = "登盖莱 ";
        break;
        case 78:
        name = "迪克斯的Huit Montagnes ";
        break;
        case 79:
        name = "弗罗马格尔 ";
        break;
        case 80:
        name = "上萨桑德拉 ";
        break;
        case 81:
        name = "紫胶 ";
        break;
        case 82:
        name = "泻湖 ";
        break;
        case 83:
        name = "马拉韦 ";
        break;
        case 84:
        name = "卡瓦利 ";
        break;
        case 85:
        name = "中科莫埃 ";
        break;
        case 86:
        name = "N'zi科莫埃 ";
        break;
        case 87:
        name = "萨瓦纳 ";
        break;
        case 88:
        name = "南邦达马 ";
        break;
        case 89:
        name = "南科莫埃 ";
        break;
        case 90:
        name = "邦达马河谷 ";
        break;
        case 91:
        name = "沃罗杜古 ";
        break;
        case 92:
        name = "赞赞 ";
        break;
      }
    }
    if (country_code.equals("CL") == true) {
      switch (region_code2) {
        case 1:
        name = "瓦尔帕莱索 ";
        break;
        case 2:
        name = "德尔卡洛斯·伊瓦涅斯将军艾森坎波 ";
        break;
        case 3:
        name = "安托法加斯塔 ";
        break;
        case 4:
        name = "阿劳卡尼亚 ";
        break;
        case 5:
        name = "阿塔卡马 ";
        break;
        case 6:
        name = "比奥比奥 ";
        break;
        case 7:
        name = "科金博 ";
        break;
        case 8:
        name = "贝尔纳多·奥希金斯将军解放者 ";
        break;
        case 9:
        name = "洛杉矶拉各斯 ";
        break;
        case 10:
        name = "麦哲伦Ÿ德拉南极Chilena ";
        break;
        case 11:
        name = "马乌莱 ";
        break;
        case 12:
        name = "首都大区 ";
        break;
        case 13:
        name = "塔拉帕卡大区 ";
        break;
        case 14:
        name = "洛杉矶拉各斯 ";
        break;
        case 15:
        name = "塔拉帕卡大区 ";
        break;
        case 16:
        name = "阿里卡Ÿ帕里纳科塔 ";
        break;
        case 17:
        name = "洛斯里奥斯 ";
        break;
      }
    }
    if (country_code.equals("CM") == true) {
      switch (region_code2) {
        case 4:
        name = "预计 ";
        break;
        case 5:
        name = "濒海 ";
        break;
        case 7:
        name = "西北省 ";
        break;
        case 8:
        name = "西部省 ";
        break;
        case 9:
        name = "SUD-Ouest酒店 ";
        break;
        case 10:
        name = "阿达马瓦 ";
        break;
        case 11:
        name = "中心 ";
        break;
        case 12:
        name = "至尊 - 北 ";
        break;
        case 13:
        name = "北 ";
        break;
        case 14:
        name = "南基 ";
        break;
      }
    }
    if (country_code.equals("CN") == true) {
      switch (region_code2) {
        case 1:
        name = "安徽 ";
        break;
        case 2:
        name = "浙江 ";
        break;
        case 3:
        name = "江西 ";
        break;
        case 4:
        name = "江苏 ";
        break;
        case 5:
        name = "吉林 ";
        break;
        case 6:
        name = "青海 ";
        break;
        case 7:
        name = "福建 ";
        break;
        case 8:
        name = "黑龙江 ";
        break;
        case 9:
        name = "河南 ";
        break;
        case 10:
        name = "河北 ";
        break;
        case 11:
        name = "湖南 ";
        break;
        case 12:
        name = "湖北 ";
        break;
        case 13:
        name = "新疆 ";
        break;
        case 14:
        name = "西藏 ";
        break;
        case 15:
        name = "甘肃 ";
        break;
        case 16:
        name = "广西 ";
        break;
        case 18:
        name = "贵州 ";
        break;
        case 19:
        name = "辽宁 ";
        break;
        case 20:
        name = "内蒙古 ";
        break;
        case 21:
        name = "宁夏 ";
        break;
        case 22:
        name = "北京 ";
        break;
        case 23:
        name = "上海 ";
        break;
        case 24:
        name = "山西 ";
        break;
        case 25:
        name = "山东 ";
        break;
        case 26:
        name = "陕西 ";
        break;
        case 28:
        name = "天津 ";
        break;
        case 29:
        name = "云南 ";
        break;
        case 30:
        name = "广东 ";
        break;
        case 31:
        name = "海南 ";
        break;
        case 32:
        name = "四川 ";
        break;
        case 33:
        name = "渝 ";
        break;
      }
    }
    if (country_code.equals("CO") == true) {
      switch (region_code2) {
        case 1:
        name = "亚马孙 ";
        break;
        case 2:
        name = "安蒂奥基亚 ";
        break;
        case 3:
        name = "阿劳卡 ";
        break;
        case 4:
        name = "大西洋 ";
        break;
        case 5:
        name = "玻利瓦尔部 ";
        break;
        case 6:
        name = "博亚卡部 ";
        break;
        case 7:
        name = "卡尔达斯部 ";
        break;
        case 8:
        name = "卡克塔 ";
        break;
        case 9:
        name = "考卡 ";
        break;
        case 10:
        name = "塞萨尔 ";
        break;
        case 11:
        name = "乔科 ";
        break;
        case 12:
        name = "科尔多瓦 ";
        break;
        case 14:
        name = "瓜维亚雷 ";
        break;
        case 15:
        name = "瓜伊尼亚 ";
        break;
        case 16:
        name = "威拉 ";
        break;
        case 17:
        name = "拉瓜希拉省 ";
        break;
        case 18:
        name = "马格达莱纳省 ";
        break;
        case 19:
        name = "元 ";
        break;
        case 20:
        name = "纳里尼奥 ";
        break;
        case 21:
        name = "北桑坦德 ";
        break;
        case 22:
        name = "普图马约 ";
        break;
        case 23:
        name = "金迪奥 ";
        break;
        case 24:
        name = "利萨拉尔达 ";
        break;
        case 25:
        name = "圣安德烈斯Ÿ普罗维登 ";
        break;
        case 26:
        name = "桑坦德 ";
        break;
        case 27:
        name = "苏克雷 ";
        break;
        case 28:
        name = "托利马 ";
        break;
        case 29:
        name = "考卡山谷省 ";
        break;
        case 30:
        name = "沃佩斯 ";
        break;
        case 31:
        name = "比查达 ";
        break;
        case 32:
        name = "卡萨纳雷 ";
        break;
        case 33:
        name = "昆迪纳马卡 ";
        break;
        case 34:
        name = "特殊DISTRITO ";
        break;
        case 35:
        name = "玻利瓦尔 ";
        break;
        case 36:
        name = "博亚卡 ";
        break;
        case 37:
        name = "卡尔达斯 ";
        break;
        case 38:
        name = "马格达莱纳 ";
        break;
      }
    }
    if (country_code.equals("CR") == true) {
      switch (region_code2) {
        case 1:
        name = "阿拉胡埃拉 ";
        break;
        case 2:
        name = "卡塔戈 ";
        break;
        case 3:
        name = "瓜纳卡斯特 ";
        break;
        case 4:
        name = "埃雷迪亚 ";
        break;
        case 6:
        name = "利蒙 ";
        break;
        case 7:
        name = "蓬塔雷纳斯 ";
        break;
        case 8:
        name = "圣何塞 ";
        break;
      }
    }
    if (country_code.equals("CU") == true) {
      switch (region_code2) {
        case 1:
        name = "比那尔德里奥 ";
        break;
        case 2:
        name = "哈瓦那城 ";
        break;
        case 3:
        name = "马坦萨斯 ";
        break;
        case 4:
        name = "青年岛 ";
        break;
        case 5:
        name = "卡马圭 ";
        break;
        case 7:
        name = "谢戈德阿维拉 ";
        break;
        case 8:
        name = "西恩富戈斯 ";
        break;
        case 9:
        name = "格拉玛 ";
        break;
        case 10:
        name = "关塔那摩 ";
        break;
        case 11:
        name = "哈瓦那 ";
        break;
        case 12:
        name = "奥尔金 ";
        break;
        case 13:
        name = "拉斯图纳斯 ";
        break;
        case 14:
        name = "圣斯皮里图斯 ";
        break;
        case 15:
        name = "古巴圣地亚哥 ";
        break;
        case 16:
        name = "比亚克拉拉 ";
        break;
      }
    }
    if (country_code.equals("CV") == true) {
      switch (region_code2) {
        case 1:
        name = "博阿维斯塔 ";
        break;
        case 2:
        name = "拉瓦 ";
        break;
        case 4:
        name = "马尤 ";
        break;
        case 5:
        name = "保罗 ";
        break;
        case 7:
        name = "大里贝拉 ";
        break;
        case 8:
        name = "萨尔 ";
        break;
        case 10:
        name = "圣尼古拉 ";
        break;
        case 11:
        name = "圣维森特 ";
        break;
        case 13:
        name = "莫斯特罗 ";
        break;
        case 14:
        name = "普拉亚 ";
        break;
        case 15:
        name = "圣卡塔琳娜 ";
        break;
        case 16:
        name = "圣克鲁斯 ";
        break;
        case 17:
        name = "圣多明戈斯 ";
        break;
        case 18:
        name = "累西腓 ";
        break;
        case 19:
        name = "圣米格尔 ";
        break;
        case 20:
        name = "塔拉法尔 ";
        break;
      }
    }
    if (country_code.equals("CY") == true) {
      switch (region_code2) {
        case 1:
        name = "法马古斯塔 ";
        break;
        case 2:
        name = "凯里尼亚 ";
        break;
        case 3:
        name = "拉纳卡 ";
        break;
        case 4:
        name = "尼科西亚 ";
        break;
        case 5:
        name = "利马索尔 ";
        break;
        case 6:
        name = "帕福斯 ";
        break;
      }
    }
    if (country_code.equals("CZ") == true) {
      switch (region_code2) {
        case 3:
        name = "布兰斯科 ";
        break;
        case 4:
        name = "布热茨拉夫 ";
        break;
        case 20:
        name = "克拉洛韦 ";
        break;
        case 21:
        name = "尼斯河畔亚布洛内茨 ";
        break;
        case 23:
        name = "伊钦 ";
        break;
        case 24:
        name = "伊赫拉瓦 ";
        break;
        case 30:
        name = "歌林 ";
        break;
        case 33:
        name = "利贝雷茨 ";
        break;
        case 36:
        name = "梅尔尼克 ";
        break;
        case 37:
        name = "波利斯拉夫 ";
        break;
        case 39:
        name = "纳霍德 ";
        break;
        case 41:
        name = "宁布尔克 ";
        break;
        case 45:
        name = "巴尔杜比采 ";
        break;
        case 52:
        name = "HLAVNI梅斯托布拉格 ";
        break;
        case 61:
        name = "塞米利 ";
        break;
        case 70:
        name = "特鲁特诺夫 ";
        break;
        case 78:
        name = "南摩拉维亚州 ";
        break;
        case 79:
        name = "南捷克州 ";
        break;
        case 80:
        name = "维索基纳 ";
        break;
        case 81:
        name = "卡罗维发利亚州 ";
        break;
        case 82:
        name = "克拉洛韦赫拉德茨亚州 ";
        break;
        case 83:
        name = "利贝雷克亚州 ";
        break;
        case 84:
        name = "奥洛穆茨亚州 ";
        break;
        case 85:
        name = "摩拉维亚西里西亚亚州 ";
        break;
        case 86:
        name = "帕尔杜比采亚州 ";
        break;
        case 87:
        name = "比尔森亚州 ";
        break;
        case 88:
        name = "中捷克亚州 ";
        break;
        case 89:
        name = "乌斯季亚州 ";
        break;
        case 90:
        name = "兹林亚州 ";
        break;
      }
    }
    if (country_code.equals("DE") == true) {
      switch (region_code2) {
        case 1:
        name = "巴登 - 符腾堡州 ";
        break;
        case 2:
        name = "拜仁慕尼黑 ";
        break;
        case 3:
        name = "不来梅 ";
        break;
        case 4:
        name = "汉堡 ";
        break;
        case 5:
        name = "黑森州 ";
        break;
        case 6:
        name = "下萨克森州 ";
        break;
        case 7:
        name = "北莱茵 - 威斯特法伦 ";
        break;
        case 8:
        name = "莱茵兰 - 普法尔茨 ";
        break;
        case 9:
        name = "萨尔 ";
        break;
        case 10:
        name = "石勒苏益格 - 荷尔斯泰因 ";
        break;
        case 11:
        name = "勃兰登堡 ";
        break;
        case 12:
        name = "梅克伦堡 - 前波莫瑞（Mecklenburg-Vorpommern） ";
        break;
        case 13:
        name = "萨克森 ";
        break;
        case 14:
        name = "萨克森 - 安哈尔特 ";
        break;
        case 15:
        name = "图林根州 ";
        break;
        case 16:
        name = "柏林 ";
        break;
      }
    }
    if (country_code.equals("DJ") == true) {
      switch (region_code2) {
        case 1:
        name = "阿里萨比赫 ";
        break;
        case 4:
        name = "奥博克 ";
        break;
        case 5:
        name = "塔朱拉 ";
        break;
        case 6:
        name = "迪基勒 ";
        break;
        case 7:
        name = "吉布提 ";
        break;
        case 8:
        name = "阿尔塔 ";
        break;
      }
    }
    if (country_code.equals("DK") == true) {
      switch (region_code2) {
        case 17:
        name = "Hovedstaden ";
        break;
        case 18:
        name = "米迪兰特 ";
        break;
        case 19:
        name = "北日德兰 ";
        break;
        case 20:
        name = "Sjelland ";
        break;
        case 21:
        name = "Syddanmark ";
        break;
      }
    }
    if (country_code.equals("DM") == true) {
      switch (region_code2) {
        case 2:
        name = "圣安德鲁 ";
        break;
        case 3:
        name = "圣大卫 ";
        break;
        case 4:
        name = "圣乔治 ";
        break;
        case 5:
        name = "圣约翰 ";
        break;
        case 6:
        name = "圣约瑟夫 ";
        break;
        case 7:
        name = "圣路加 ";
        break;
        case 8:
        name = "圣马克 ";
        break;
        case 9:
        name = "圣帕特里克节 ";
        break;
        case 10:
        name = "圣保罗 ";
        break;
        case 11:
        name = "圣彼得 ";
        break;
      }
    }
    if (country_code.equals("DO") == true) {
      switch (region_code2) {
        case 1:
        name = "阿苏阿 ";
        break;
        case 2:
        name = "Baoruco ";
        break;
        case 3:
        name = "巴拉奥纳 ";
        break;
        case 4:
        name = "达哈翁 ";
        break;
        case 5:
        name = "国家区 ";
        break;
        case 6:
        name = "杜阿尔特 ";
        break;
        case 8:
        name = "埃斯派拉特 ";
        break;
        case 9:
        name = "独立 ";
        break;
        case 10:
        name = "阿尔塔格拉西亚 ";
        break;
        case 11:
        name = "埃利亚斯翩 ";
        break;
        case 12:
        name = "罗马纳 ";
        break;
        case 14:
        name = "玛丽亚·特立尼达·桑切斯 ";
        break;
        case 15:
        name = "蒙特克里斯蒂 ";
        break;
        case 16:
        name = "佩德纳莱斯 ";
        break;
        case 17:
        name = "佩拉维亚 ";
        break;
        case 18:
        name = "普拉塔港 ";
        break;
        case 19:
        name = "萨尔塞 ";
        break;
        case 20:
        name = "萨马纳 ";
        break;
        case 21:
        name = "桑切斯拉米雷斯 ";
        break;
        case 23:
        name = "圣胡安 ";
        break;
        case 24:
        name = "圣佩德罗·科里斯 ";
        break;
        case 25:
        name = "圣地亚哥 ";
        break;
        case 26:
        name = "圣地亚哥·罗德里格斯 ";
        break;
        case 27:
        name = "巴尔韦德 ";
        break;
        case 28:
        name = "厄尔尼诺西望 ";
        break;
        case 29:
        name = "马约尔 ";
        break;
        case 30:
        name = "拉维加 ";
        break;
        case 31:
        name = "努埃尔 ";
        break;
        case 32:
        name = "蒙特普拉塔 ";
        break;
        case 33:
        name = "圣克里斯托瓦尔 ";
        break;
        case 34:
        name = "国家区 ";
        break;
        case 35:
        name = "佩拉维亚 ";
        break;
        case 36:
        name = "圣约瑟de OCOA的 ";
        break;
        case 37:
        name = "圣多明各 ";
        break;
      }
    }
    if (country_code.equals("DZ") == true) {
      switch (region_code2) {
        case 1:
        name = "阿尔杰 ";
        break;
        case 3:
        name = "巴特纳 ";
        break;
        case 4:
        name = "君士坦丁 ";
        break;
        case 6:
        name = "美狄亚 ";
        break;
        case 7:
        name = "穆斯塔加奈姆 ";
        break;
        case 9:
        name = "奥兰 ";
        break;
        case 10:
        name = "赛伊达 ";
        break;
        case 12:
        name = "塞提夫 ";
        break;
        case 13:
        name = "提亚雷特 ";
        break;
        case 14:
        name = "提济乌祖 ";
        break;
        case 15:
        name = "特莱姆森 ";
        break;
        case 18:
        name = "贝贾亚 ";
        break;
        case 19:
        name = "比斯克拉 ";
        break;
        case 20:
        name = "卜利达 ";
        break;
        case 21:
        name = "布维拉 ";
        break;
        case 22:
        name = "杰勒法 ";
        break;
        case 23:
        name = "盖勒马 ";
        break;
        case 24:
        name = "Jijel的 ";
        break;
        case 25:
        name = "Laghouat的 ";
        break;
        case 26:
        name = "睫毛膏 ";
        break;
        case 27:
        name = "姆西拉 ";
        break;
        case 29:
        name = "韦梅EL Bouaghi ";
        break;
        case 30:
        name = "西迪贝勒阿巴斯 ";
        break;
        case 31:
        name = "斯基克达 ";
        break;
        case 33:
        name = "泰贝萨 ";
        break;
        case 34:
        name = "阿德拉尔 ";
        break;
        case 35:
        name = "Ain德夫拉的 ";
        break;
        case 36:
        name = "艾因泰穆尚特 ";
        break;
        case 37:
        name = "安纳巴 ";
        break;
        case 38:
        name = "贝沙尔 ";
        break;
        case 39:
        name = "波尔吉 ";
        break;
        case 40:
        name = "布米尔达斯 ";
        break;
        case 41:
        name = "切尔夫的 ";
        break;
        case 42:
        name = "厄尔尼诺Bayadh ";
        break;
        case 43:
        name = "埃尔奎德 ";
        break;
        case 44:
        name = "塔里夫 ";
        break;
        case 45:
        name = "盖尔达耶的 ";
        break;
        case 46:
        name = "伊利齐的 ";
        break;
        case 47:
        name = "罕西拉 ";
        break;
        case 48:
        name = "米拉 ";
        break;
        case 49:
        name = "纳马 ";
        break;
        case 50:
        name = "瓦尔格拉 ";
        break;
        case 51:
        name = "埃利 ";
        break;
        case 52:
        name = "阿赫拉斯 ";
        break;
        case 53:
        name = "塔曼拉塞特 ";
        break;
        case 54:
        name = "廷杜夫 ";
        break;
        case 55:
        name = "提帕萨 ";
        break;
        case 56:
        name = "提塞姆西勒特 ";
        break;
      }
    }
    if (country_code.equals("EC") == true) {
      switch (region_code2) {
        case 1:
        name = "加拉帕戈斯 ";
        break;
        case 2:
        name = "阿苏艾 ";
        break;
        case 3:
        name = "玻利瓦尔 ";
        break;
        case 4:
        name = "CANAR ";
        break;
        case 5:
        name = "卡尔奇 ";
        break;
        case 6:
        name = "钦博拉索 ";
        break;
        case 7:
        name = "科托帕希 ";
        break;
        case 8:
        name = "埃尔奥罗 ";
        break;
        case 9:
        name = "埃斯梅拉达 ";
        break;
        case 10:
        name = "瓜亚斯 ";
        break;
        case 11:
        name = "因巴布拉 ";
        break;
        case 12:
        name = "洛哈 ";
        break;
        case 13:
        name = "洛斯里奥斯 ";
        break;
        case 14:
        name = "马纳维 ";
        break;
        case 15:
        name = "莫罗纳 - 圣地亚哥 ";
        break;
        case 17:
        name = "帕斯塔萨 ";
        break;
        case 18:
        name = "皮钦查 ";
        break;
        case 19:
        name = "通古拉瓦 ";
        break;
        case 20:
        name = "萨莫拉 - 钦奇佩 ";
        break;
        case 22:
        name = "苏古姆比奥斯省 ";
        break;
        case 23:
        name = "纳波 ";
        break;
        case 24:
        name = "奥雷利亚纳 ";
        break;
      }
    }
    if (country_code.equals("EE") == true) {
      switch (region_code2) {
        case 1:
        name = "哈留 ";
        break;
        case 2:
        name = "希乌马 ";
        break;
        case 3:
        name = "IDA-维鲁 ";
        break;
        case 4:
        name = "雅尔瓦省 ";
        break;
        case 5:
        name = "耶盖瓦省 ";
        break;
        case 6:
        name = "Kohtla耶尔韦 ";
        break;
        case 7:
        name = "莱内县 ";
        break;
        case 8:
        name = "里亚维鲁 ";
        break;
        case 9:
        name = "纳尔瓦 ";
        break;
        case 10:
        name = "帕努 ";
        break;
        case 11:
        name = "帕尔努 ";
        break;
        case 12:
        name = "贝尔瓦省 ";
        break;
        case 13:
        name = "拉普拉 ";
        break;
        case 14:
        name = "萨列马 ";
        break;
        case 15:
        name = "SILLAMAE ";
        break;
        case 16:
        name = "塔林 ";
        break;
        case 17:
        name = "塔尔图 ";
        break;
        case 18:
        name = "塔图尔 ";
        break;
        case 19:
        name = "瓦尔加 ";
        break;
        case 20:
        name = "维良地 ";
        break;
        case 21:
        name = "维鲁省 ";
        break;
      }
    }
    if (country_code.equals("EG") == true) {
      switch (region_code2) {
        case 1:
        name = "代盖赫利耶 ";
        break;
        case 2:
        name = "铝巴哈尔人艾哈迈尔 ";
        break;
        case 3:
        name = "布海拉 ";
        break;
        case 4:
        name = "法尤姆 ";
        break;
        case 5:
        name = "阿尔比亚 ";
        break;
        case 6:
        name = "伊斯坎德里耶 ";
        break;
        case 7:
        name = "Al Isma'iliyah的 ";
        break;
        case 8:
        name = "吉泽 ";
        break;
        case 9:
        name = "米努夫 ";
        break;
        case 10:
        name = "明亚 ";
        break;
        case 11:
        name = "开罗 ";
        break;
        case 12:
        name = "盖勒尤卜 ";
        break;
        case 13:
        name = "铝瓦迪人贾迪德 ";
        break;
        case 14:
        name = "东部省 ";
        break;
        case 15:
        name = "苏伊士 ";
        break;
        case 16:
        name = "阿斯旺 ";
        break;
        case 17:
        name = "艾斯尤特 ";
        break;
        case 18:
        name = "贝尼苏韦夫 ";
        break;
        case 19:
        name = "布尔赛义德 ";
        break;
        case 20:
        name = "杜姆亚特 ";
        break;
        case 21:
        name = "谢赫村 ";
        break;
        case 22:
        name = "马特鲁 ";
        break;
        case 23:
        name = "奇纳 ";
        break;
        case 24:
        name = "索哈杰 ";
        break;
        case 26:
        name = "南西奈省 ";
        break;
        case 27:
        name = "北西奈 ";
        break;
      }
    }
    if (country_code.equals("ER") == true) {
      switch (region_code2) {
        case 1:
        name = "安塞巴 ";
        break;
        case 2:
        name = "德巴 ";
        break;
        case 3:
        name = "Debubawi K'eyih巴赫里 ";
        break;
        case 4:
        name = "加什 - 巴尔卡 ";
        break;
        case 5:
        name = "Ma'akel ";
        break;
        case 6:
        name = "Semenawi K'eyih巴赫里 ";
        break;
      }
    }
    if (country_code.equals("ES") == true) {
      switch (region_code2) {
        case 7:
        name = "巴利阿里群岛 ";
        break;
        case 27:
        name = "拉里奥哈 ";
        break;
        case 29:
        name = "马德里 ";
        break;
        case 31:
        name = "穆尔西亚 ";
        break;
        case 32:
        name = "纳瓦拉 ";
        break;
        case 34:
        name = "阿斯图里亚斯 ";
        break;
        case 39:
        name = "坎塔布里亚 ";
        break;
        case 51:
        name = "安达卢西亚 ";
        break;
        case 52:
        name = "阿拉贡 ";
        break;
        case 53:
        name = "加那利群岛 ";
        break;
        case 54:
        name = "卡斯蒂利亚 - 拉曼恰 ";
        break;
        case 55:
        name = "卡斯蒂利亚 - 莱昂 ";
        break;
        case 56:
        name = "加泰罗尼亚 ";
        break;
        case 57:
        name = "埃斯特雷马杜拉 ";
        break;
        case 58:
        name = "加利西亚 ";
        break;
        case 59:
        name = "巴斯克 ";
        break;
        case 60:
        name = "COMUNIDAD瓦伦西亚 ";
        break;
      }
    }
    if (country_code.equals("ET") == true) {
      switch (region_code2) {
        case 2:
        name = "阿姆哈拉 ";
        break;
        case 7:
        name = "索马里 ";
        break;
        case 8:
        name = "甘贝拉 ";
        break;
        case 10:
        name = "亚的斯亚贝巴 ";
        break;
        case 11:
        name = "南部的 ";
        break;
        case 12:
        name = "提格雷 ";
        break;
        case 13:
        name = "贝尼 ";
        break;
        case 14:
        name = "远 ";
        break;
        case 44:
        name = "阿迪斯阿贝巴 ";
        break;
        case 45:
        name = "远 ";
        break;
        case 46:
        name = "阿马拉 ";
        break;
        case 47:
        name = "宾香古尔 ";
        break;
        case 48:
        name = "德雷达瓦 ";
        break;
        case 49:
        name = "甘贝拉各族 ";
        break;
        case 50:
        name = "哈拉尔赫兹伯 ";
        break;
        case 51:
        name = "奥罗米亚 ";
        break;
        case 52:
        name = "Sumale ";
        break;
        case 53:
        name = "提格雷 ";
        break;
        case 54:
        name = "NA贝拉各族YeDebub Biheroch Bihereseboch ";
        break;
      }
    }
    if (country_code.equals("FI") == true) {
      switch (region_code2) {
        case 1:
        name = "奥兰 ";
        break;
        case 6:
        name = "拉普兰 ";
        break;
        case 8:
        name = "奥卢 ";
        break;
        case 13:
        name = "芬兰南部 ";
        break;
        case 14:
        name = "芬兰东部 ";
        break;
        case 15:
        name = "芬兰西部 ";
        break;
      }
    }
    if (country_code.equals("FJ") == true) {
      switch (region_code2) {
        case 1:
        name = "中央 ";
        break;
        case 2:
        name = "东 ";
        break;
        case 3:
        name = "北方 ";
        break;
        case 4:
        name = "罗图马 ";
        break;
        case 5:
        name = "西 ";
        break;
      }
    }
    if (country_code.equals("FM") == true) {
      switch (region_code2) {
        case 1:
        name = "科斯雷 ";
        break;
        case 2:
        name = "波纳佩 ";
        break;
        case 3:
        name = "丘克 ";
        break;
        case 4:
        name = "狺 ";
        break;
      }
    }
    if (country_code.equals("FR") == true) {
      switch (region_code2) {
        case 97:
        name = "阿基坦大区 ";
        break;
        case 98:
        name = "奥弗涅 ";
        break;
        case 99:
        name = "下诺曼底 ";
        break;
        case 832:
        name = "勃艮第（Bourgogne） ";
        break;
        case 833:
        name = "布列塔尼（Bretagne） ";
        break;
        case 834:
        name = "中心 ";
        break;
        case 835:
        name = "香槟 - 阿登 ";
        break;
        case 836:
        name = "CORSE ";
        break;
        case 837:
        name = "弗朗什孔泰 ";
        break;
        case 838:
        name = "Haute-Normandie的 ";
        break;
        case 839:
        name = "法国法兰西岛大区 ";
        break;
        case 840:
        name = "朗格多克 - 鲁西永 ";
        break;
        case 875:
        name = "利木赞牛 ";
        break;
        case 876:
        name = "洛林 ";
        break;
        case 877:
        name = "南比利牛斯 ";
        break;
        case 878:
        name = "北部 - 加莱 ";
        break;
        case 879:
        name = "卢瓦尔河 ";
        break;
        case 880:
        name = "皮卡 ";
        break;
        case 881:
        name = "普瓦图 - 夏朗德 ";
        break;
        case 882:
        name = "普罗旺斯 - 阿尔卑斯 - 蔚蓝海岸 ";
        break;
        case 883:
        name = "罗纳 - 阿尔卑斯 ";
        break;
        case 918:
        name = "阿尔萨斯 ";
        break;
      }
    }
    if (country_code.equals("GA") == true) {
      switch (region_code2) {
        case 1:
        name = "Estuaire贴心 ";
        break;
        case 2:
        name = "上奥果韦 ";
        break;
        case 3:
        name = "中奥果韦 ";
        break;
        case 4:
        name = "恩古涅 ";
        break;
        case 5:
        name = "尼扬加 ";
        break;
        case 6:
        name = "奥果韦 - 伊温多 ";
        break;
        case 7:
        name = "奥果韦 - 洛洛 ";
        break;
        case 8:
        name = "滨海奥果韦 ";
        break;
        case 9:
        name = "沃勒 - 恩特姆的 ";
        break;
      }
    }
    if (country_code.equals("GB") == true) {
      switch (region_code2) {
        case 1:
        name = "雅芳 ";
        break;
        case 3:
        name = "伯克希尔 ";
        break;
        case 7:
        name = "克利夫兰 ";
        break;
        case 17:
        name = "大伦敦 ";
        break;
        case 18:
        name = "大曼彻斯特地区 ";
        break;
        case 20:
        name = "赫里福德和伍斯特 ";
        break;
        case 22:
        name = "亨伯赛德 ";
        break;
        case 28:
        name = "默西塞德郡 ";
        break;
        case 37:
        name = "南约克郡 ";
        break;
        case 41:
        name = "泰恩-威尔 ";
        break;
        case 43:
        name = "西米德兰 ";
        break;
        case 45:
        name = "西约克郡 ";
        break;
        case 79:
        name = "中央 ";
        break;
        case 82:
        name = "嘉林 ";
        break;
        case 84:
        name = "洛锡安 ";
        break;
        case 87:
        name = "斯特拉斯克莱德 ";
        break;
        case 88:
        name = "泰赛德 ";
        break;
        case 90:
        name = "克卢伊德 ";
        break;
        case 91:
        name = "迪费德 ";
        break;
        case 92:
        name = "格温特 ";
        break;
        case 94:
        name = "中格拉摩根 ";
        break;
        case 96:
        name = "南格拉摩根 ";
        break;
        case 97:
        name = "西格拉摩根 ";
        break;
        case 832:
        name = "巴金 - 达格南 ";
        break;
        case 833:
        name = "巴尼特 ";
        break;
        case 834:
        name = "巴恩斯利 ";
        break;
        case 835:
        name = "巴斯和东北萨默塞特 ";
        break;
        case 836:
        name = "贝德福德 ";
        break;
        case 837:
        name = "贝克斯利 ";
        break;
        case 838:
        name = "伯明翰 ";
        break;
        case 839:
        name = "布莱克与达尔文 ";
        break;
        case 840:
        name = "布莱克浦 ";
        break;
        case 875:
        name = "博尔顿 ";
        break;
        case 876:
        name = "伯恩茅斯 ";
        break;
        case 877:
        name = "布拉克内尔森林 ";
        break;
        case 878:
        name = "布拉德福德 ";
        break;
        case 879:
        name = "黑雁 ";
        break;
        case 880:
        name = "布赖顿 ";
        break;
        case 881:
        name = "布里斯托尔 ";
        break;
        case 882:
        name = "布罗姆利 ";
        break;
        case 883:
        name = "白金汉 ";
        break;
        case 918:
        name = "埋葬 ";
        break;
        case 919:
        name = "卡尔德达尔 ";
        break;
        case 920:
        name = "剑桥 ";
        break;
        case 921:
        name = "卡姆登 ";
        break;
        case 922:
        name = "柴郡 ";
        break;
        case 923:
        name = "康沃尔 ";
        break;
        case 924:
        name = "考文垂 ";
        break;
        case 925:
        name = "克罗伊登 ";
        break;
        case 926:
        name = "坎布里亚郡 ";
        break;
        case 961:
        name = "达林顿 ";
        break;
        case 962:
        name = "德比 ";
        break;
        case 963:
        name = "德比郡 ";
        break;
        case 964:
        name = "德文郡 ";
        break;
        case 965:
        name = "唐卡斯特 ";
        break;
        case 966:
        name = "赛特 ";
        break;
        case 967:
        name = "达德利 ";
        break;
        case 968:
        name = "达勒姆 ";
        break;
        case 969:
        name = "伊林 ";
        break;
        case 1004:
        name = "东约克郡 ";
        break;
        case 1005:
        name = "东萨塞克斯 ";
        break;
        case 1006:
        name = "恩菲尔德 ";
        break;
        case 1007:
        name = "埃塞克斯 ";
        break;
        case 1008:
        name = "盖茨黑德 ";
        break;
        case 1009:
        name = "格洛斯特 ";
        break;
        case 1010:
        name = "格林威治 ";
        break;
        case 1011:
        name = "哈克尼 ";
        break;
        case 1012:
        name = "哈尔顿 ";
        break;
        case 1047:
        name = "哈默史密斯和富勒姆 ";
        break;
        case 1048:
        name = "新罕布什尔州 ";
        break;
        case 1049:
        name = "夏灵基 ";
        break;
        case 1050:
        name = "耙 ";
        break;
        case 1051:
        name = "哈特尔浦 ";
        break;
        case 1052:
        name = "哈佛林 ";
        break;
        case 1053:
        name = "赫里福 ";
        break;
        case 1054:
        name = "赫特福德 ";
        break;
        case 1055:
        name = "西陵 ";
        break;
        case 1090:
        name = "豪恩斯洛 ";
        break;
        case 1091:
        name = "怀特岛 ";
        break;
        case 1092:
        name = "伊斯灵顿 ";
        break;
        case 1093:
        name = "肯辛顿和切尔西 ";
        break;
        case 1094:
        name = "肯特 ";
        break;
        case 1095:
        name = "赫尔河畔京斯敦 ";
        break;
        case 1096:
        name = "金斯顿 ";
        break;
        case 1097:
        name = "科克利斯 ";
        break;
        case 1098:
        name = "诺斯利 ";
        break;
        case 1133:
        name = "兰贝斯 ";
        break;
        case 1134:
        name = "兰开夏郡 ";
        break;
        case 1135:
        name = "利兹 ";
        break;
        case 1136:
        name = "莱斯特 ";
        break;
        case 1137:
        name = "莱斯特 ";
        break;
        case 1138:
        name = "刘易 ";
        break;
        case 1139:
        name = "林肯郡 ";
        break;
        case 1140:
        name = "利物浦 ";
        break;
        case 1141:
        name = "伦敦 ";
        break;
        case 1176:
        name = "卢顿 ";
        break;
        case 1177:
        name = "曼彻斯特 ";
        break;
        case 1178:
        name = "梅德韦 ";
        break;
        case 1179:
        name = "默顿 ";
        break;
        case 1180:
        name = "米德尔斯堡 ";
        break;
        case 1181:
        name = "米尔顿凯恩斯 ";
        break;
        case 1182:
        name = "纽卡斯尔 ";
        break;
        case 1183:
        name = "纽汉姆 ";
        break;
        case 1184:
        name = "诺福克 ";
        break;
        case 1219:
        name = "北安普敦郡 ";
        break;
        case 1220:
        name = "东北林肯郡 ";
        break;
        case 1221:
        name = "北林肯郡 ";
        break;
        case 1222:
        name = "北萨默塞特 ";
        break;
        case 1223:
        name = "北泰恩赛德 ";
        break;
        case 1224:
        name = "诺森伯兰 ";
        break;
        case 1225:
        name = "北约克郡 ";
        break;
        case 1226:
        name = "诺丁汉 ";
        break;
        case 1227:
        name = "诺丁汉 ";
        break;
        case 1262:
        name = "奥尔德姆 ";
        break;
        case 1263:
        name = "牛津 ";
        break;
        case 1264:
        name = "彼得伯勒 ";
        break;
        case 1265:
        name = "普利茅斯 ";
        break;
        case 1266:
        name = "普尔 ";
        break;
        case 1267:
        name = "朴茨茅斯 ";
        break;
        case 1268:
        name = "阅读 ";
        break;
        case 1269:
        name = "雷德布里奇 ";
        break;
        case 1270:
        name = "雷德卡和克利夫兰 ";
        break;
        case 1305:
        name = "泰晤士河畔里士满 ";
        break;
        case 1306:
        name = "罗奇代尔 ";
        break;
        case 1307:
        name = "罗瑟勒姆 ";
        break;
        case 1308:
        name = "拉特兰 ";
        break;
        case 1309:
        name = "索尔福德 ";
        break;
        case 1310:
        name = "什罗普 ";
        break;
        case 1311:
        name = "桑德韦尔 ";
        break;
        case 1312:
        name = "塞夫顿 ";
        break;
        case 1313:
        name = "谢菲尔德 ";
        break;
        case 1348:
        name = "泥沼 ";
        break;
        case 1349:
        name = "索利赫尔 ";
        break;
        case 1350:
        name = "萨默塞特 ";
        break;
        case 1351:
        name = "南安普敦 ";
        break;
        case 1352:
        name = "绍森德 ";
        break;
        case 1353:
        name = "南Gloucestershire ";
        break;
        case 1354:
        name = "南泰恩赛德 ";
        break;
        case 1355:
        name = "南华 ";
        break;
        case 1356:
        name = "斯塔福德 ";
        break;
        case 1391:
        name = "圣海伦斯 ";
        break;
        case 1392:
        name = "斯托克波特 ";
        break;
        case 1393:
        name = "斯托克顿三通 ";
        break;
        case 1394:
        name = "特伦特河畔斯托克 ";
        break;
        case 1395:
        name = "萨福克 ";
        break;
        case 1396:
        name = "桑德兰 ";
        break;
        case 1397:
        name = "萨里 ";
        break;
        case 1398:
        name = "萨顿 ";
        break;
        case 1399:
        name = "斯温顿 ";
        break;
        case 1434:
        name = "泰晤士 ";
        break;
        case 1435:
        name = "德福和Wrekin ";
        break;
        case 1436:
        name = "瑟罗克 ";
        break;
        case 1437:
        name = "托贝 ";
        break;
        case 1438:
        name = "伦敦塔桥 ";
        break;
        case 1439:
        name = "老特拉福德 ";
        break;
        case 1440:
        name = "韦克菲尔德 ";
        break;
        case 1441:
        name = "沃尔索尔 ";
        break;
        case 1442:
        name = "沃尔瑟姆森林 ";
        break;
        case 1477:
        name = "旺兹沃思 ";
        break;
        case 1478:
        name = "沃灵顿 ";
        break;
        case 1479:
        name = "沃里克郡 ";
        break;
        case 1480:
        name = "西伯克希尔 ";
        break;
        case 1481:
        name = "威斯敏斯特 ";
        break;
        case 1482:
        name = "西萨塞克斯 ";
        break;
        case 1483:
        name = "维冈 ";
        break;
        case 1484:
        name = "威尔特 ";
        break;
        case 1485:
        name = "温莎和梅登黑德 ";
        break;
        case 1520:
        name = "威罗 ";
        break;
        case 1521:
        name = "沃金厄姆 ";
        break;
        case 1522:
        name = "伍尔弗汉普顿 ";
        break;
        case 1523:
        name = "伍斯特郡 ";
        break;
        case 1524:
        name = "纽约 ";
        break;
        case 1525:
        name = "安特里姆 ";
        break;
        case 1526:
        name = "阿兹 ";
        break;
        case 1527:
        name = "阿马 ";
        break;
        case 1528:
        name = "巴利米纳 ";
        break;
        case 1563:
        name = "巴利马尼 ";
        break;
        case 1564:
        name = "班布里奇 ";
        break;
        case 1565:
        name = "贝尔法斯特 ";
        break;
        case 1566:
        name = "卡里克弗格斯 ";
        break;
        case 1567:
        name = "卡斯尔雷 ";
        break;
        case 1568:
        name = "利宁 ";
        break;
        case 1569:
        name = "库克斯敦 ";
        break;
        case 1570:
        name = "克雷加文 ";
        break;
        case 1571:
        name = "下 ";
        break;
        case 1606:
        name = "邓甘嫩 ";
        break;
        case 1607:
        name = "弗马纳 ";
        break;
        case 1608:
        name = "拉恩 ";
        break;
        case 1609:
        name = "科马瓦迪 ";
        break;
        case 1610:
        name = "利斯 ";
        break;
        case 1611:
        name = "歌谣 ";
        break;
        case 1612:
        name = "马拉费尔特 ";
        break;
        case 1613:
        name = "莫伊尔 ";
        break;
        case 1614:
        name = "纽里和莫恩 ";
        break;
        case 1649:
        name = "纽敦阿比 ";
        break;
        case 1650:
        name = "北唐 ";
        break;
        case 1651:
        name = "奥马 ";
        break;
        case 1652:
        name = "斯特拉班 ";
        break;
        case 1653:
        name = "阿伯丁市 ";
        break;
        case 1654:
        name = "阿伯丁 ";
        break;
        case 1655:
        name = "安格斯 ";
        break;
        case 1656:
        name = "阿盖尔 ";
        break;
        case 1657:
        name = "苏格兰边界 ";
        break;
        case 1692:
        name = "克拉克曼南 ";
        break;
        case 1693:
        name = "邓弗里斯和加洛韦 ";
        break;
        case 1694:
        name = "邓迪市 ";
        break;
        case 1695:
        name = "东艾尔郡 ";
        break;
        case 1696:
        name = "东邓巴顿郡 ";
        break;
        case 1697:
        name = "东洛锡安 ";
        break;
        case 1698:
        name = "东伦弗鲁 ";
        break;
        case 1699:
        name = "爱丁堡 ";
        break;
        case 1700:
        name = "福尔柯克 ";
        break;
        case 1735:
        name = "龠 ";
        break;
        case 1736:
        name = "格拉斯哥市 ";
        break;
        case 1737:
        name = "高原 ";
        break;
        case 1738:
        name = "因弗克莱德 ";
        break;
        case 1739:
        name = "洛锡安 ";
        break;
        case 1740:
        name = "马里 ";
        break;
        case 1741:
        name = "北艾尔郡 ";
        break;
        case 1742:
        name = "北拉纳克郡 ";
        break;
        case 1743:
        name = "奥克尼 ";
        break;
        case 1778:
        name = "珀斯和金罗斯 ";
        break;
        case 1779:
        name = "伦弗鲁郡 ";
        break;
        case 1780:
        name = "设得兰群岛 ";
        break;
        case 1781:
        name = "南艾尔郡 ";
        break;
        case 1782:
        name = "苏格兰 ";
        break;
        case 1783:
        name = "斯特林 ";
        break;
        case 1784:
        name = "西邓巴顿郡 ";
        break;
        case 1785:
        name = "锡尔岛区 ";
        break;
        case 1786:
        name = "西洛锡安 ";
        break;
        case 1821:
        name = "安格尔西岛 ";
        break;
        case 1822:
        name = "旅游Blaenau格温特的 ";
        break;
        case 1823:
        name = "布里 ";
        break;
        case 1824:
        name = "卡菲利 ";
        break;
        case 1825:
        name = "加的夫 ";
        break;
        case 1826:
        name = "锡尔迪 ";
        break;
        case 1827:
        name = "卡马森郡 ";
        break;
        case 1828:
        name = "康威 ";
        break;
        case 1829:
        name = "登比郡 ";
        break;
        case 1864:
        name = "弗林特 ";
        break;
        case 1865:
        name = "圭内斯 ";
        break;
        case 1866:
        name = "麦瑟提维 ";
        break;
        case 1867:
        name = "格洛斯特郡 ";
        break;
        case 1868:
        name = "尼思塔尔伯特港 ";
        break;
        case 1869:
        name = "新港 ";
        break;
        case 1870:
        name = "彭布罗克郡 ";
        break;
        case 1871:
        name = "波伊斯 ";
        break;
        case 1872:
        name = "朗达卡农塔夫 ";
        break;
        case 1907:
        name = "斯旺西 ";
        break;
        case 1908:
        name = "托法恩 ";
        break;
        case 1909:
        name = "格拉摩根谷 ";
        break;
        case 1910:
        name = "雷克瑟姆 ";
        break;
      }
    }
    if (country_code.equals("GD") == true) {
      switch (region_code2) {
        case 1:
        name = "圣安德鲁 ";
        break;
        case 2:
        name = "圣大卫 ";
        break;
        case 3:
        name = "圣乔治 ";
        break;
        case 4:
        name = "圣约翰 ";
        break;
        case 5:
        name = "圣马克 ";
        break;
        case 6:
        name = "圣帕特里克节 ";
        break;
      }
    }
    if (country_code.equals("GE") == true) {
      switch (region_code2) {
        case 1:
        name = "Abashis Raioni ";
        break;
        case 2:
        name = "阿布哈兹 ";
        break;
        case 3:
        name = "Adigenis Raioni ";
        break;
        case 4:
        name = "阿扎尔 ";
        break;
        case 5:
        name = "Akhalgoris Raioni ";
        break;
        case 6:
        name = "Akhalk'alak'is Raioni ";
        break;
        case 7:
        name = "Akhalts'ikhis Raioni ";
        break;
        case 8:
        name = "Akhmetis Raioni ";
        break;
        case 9:
        name = "Ambrolauris Raioni ";
        break;
        case 10:
        name = "Aspindzis Raioni ";
        break;
        case 11:
        name = "Baghdat'is Raioni ";
        break;
        case 12:
        name = "Bolnisis Raioni ";
        break;
        case 13:
        name = "Borjomis Raioni ";
        break;
        case 14:
        name = "Chiat'ura ";
        break;
        case 15:
        name = "Ch'khorotsqus Raioni ";
        break;
        case 16:
        name = "Ch'okhatauris Raioni ";
        break;
        case 17:
        name = "Dedop'listsqaros Raioni ";
        break;
        case 18:
        name = "Dmanisis Raioni ";
        break;
        case 19:
        name = "Dushet'is Raioni ";
        break;
        case 20:
        name = "Gardabanis Raioni ";
        break;
        case 21:
        name = "哥里 ";
        break;
        case 22:
        name = "戈里斯Raioni的 ";
        break;
        case 23:
        name = "Gurjaanis Raioni ";
        break;
        case 24:
        name = "JAVIS Raioni的 ";
        break;
        case 25:
        name = "K'arelis Raioni ";
        break;
        case 26:
        name = "Kaspis Raioni ";
        break;
        case 27:
        name = "Kharagaulis Raioni ";
        break;
        case 28:
        name = "Khashuris Raioni ";
        break;
        case 29:
        name = "Khobis Raioni ";
        break;
        case 30:
        name = "Khonis Raioni ";
        break;
        case 31:
        name = "K'ut'aisi ";
        break;
        case 32:
        name = "Lagodekhis Raioni ";
        break;
        case 33:
        name = "Lanch'khut'is Raioni ";
        break;
        case 34:
        name = "Lentekhis Raioni ";
        break;
        case 35:
        name = "Marneulis Raioni ";
        break;
        case 36:
        name = "Martvilis Raioni ";
        break;
        case 37:
        name = "Mestiis Raioni ";
        break;
        case 38:
        name = "Mts'khet'is Raioni ";
        break;
        case 39:
        name = "Ninotsmindis Raioni ";
        break;
        case 40:
        name = "特里萨Raioni的 ";
        break;
        case 41:
        name = "Ozurget'is Raioni ";
        break;
        case 42:
        name = "P'ot'i ";
        break;
        case 43:
        name = "Qazbegis Raioni ";
        break;
        case 44:
        name = "Qvarlis Raioni ";
        break;
        case 45:
        name = "Rust'avi ";
        break;
        case 46:
        name = "Sach'kheris Raioni ";
        break;
        case 47:
        name = "Sagarejos Raioni ";
        break;
        case 48:
        name = "Samtrediis Raioni ";
        break;
        case 49:
        name = "Senakis Raioni ";
        break;
        case 50:
        name = "Sighnaghis Raioni ";
        break;
        case 51:
        name = "第比利斯 ";
        break;
        case 52:
        name = "T'elavis Raioni ";
        break;
        case 53:
        name = "T'erjolis Raioni ";
        break;
        case 54:
        name = "T'et'ritsqaros Raioni ";
        break;
        case 55:
        name = "T'ianet'is Raioni ";
        break;
        case 56:
        name = "Tqibuli ";
        break;
        case 57:
        name = "Ts'ageris Raioni ";
        break;
        case 58:
        name = "Tsalenjikhis Raioni ";
        break;
        case 59:
        name = "Tsalkis Raioni ";
        break;
        case 60:
        name = "Tsqaltubo ";
        break;
        case 61:
        name = "Vanis Raioni ";
        break;
        case 62:
        name = "Zestap'onis Raioni ";
        break;
        case 63:
        name = "祖格迪迪 ";
        break;
        case 64:
        name = "Zugdidis Raioni ";
        break;
      }
    }
    if (country_code.equals("GH") == true) {
      switch (region_code2) {
        case 1:
        name = "大阿克拉 ";
        break;
        case 2:
        name = "阿散蒂 ";
        break;
        case 3:
        name = "布朗阿哈福 ";
        break;
        case 4:
        name = "中央 ";
        break;
        case 5:
        name = "东 ";
        break;
        case 6:
        name = "北方 ";
        break;
        case 8:
        name = "沃尔 ";
        break;
        case 9:
        name = "西 ";
        break;
        case 10:
        name = "上东区 ";
        break;
        case 11:
        name = "上西区 ";
        break;
      }
    }
    if (country_code.equals("GL") == true) {
      switch (region_code2) {
        case 1:
        name = "Nordgronland ";
        break;
        case 2:
        name = "Ostgronland ";
        break;
        case 3:
        name = "Vestgronland ";
        break;
      }
    }
    if (country_code.equals("GM") == true) {
      switch (region_code2) {
        case 1:
        name = "班珠尔 ";
        break;
        case 2:
        name = "下河 ";
        break;
        case 3:
        name = "环江 ";
        break;
        case 4:
        name = "上河 ";
        break;
        case 5:
        name = "西 ";
        break;
        case 7:
        name = "北岸 ";
        break;
      }
    }
    if (country_code.equals("GN") == true) {
      switch (region_code2) {
        case 1:
        name = "Beyla ";
        break;
        case 2:
        name = "博法 ";
        break;
        case 3:
        name = "博凯 ";
        break;
        case 4:
        name = "科纳克里 ";
        break;
        case 5:
        name = "达博拉 ";
        break;
        case 6:
        name = "达拉巴 ";
        break;
        case 7:
        name = "丁吉拉伊 ";
        break;
        case 9:
        name = "法拉纳 ";
        break;
        case 10:
        name = "福雷卡里亚 ";
        break;
        case 11:
        name = "弗里亚 ";
        break;
        case 12:
        name = "加瓦尔 ";
        break;
        case 13:
        name = "盖凯杜 ";
        break;
        case 15:
        name = "凯鲁阿 ";
        break;
        case 16:
        name = "金迪亚 ";
        break;
        case 17:
        name = "基西杜古 ";
        break;
        case 18:
        name = "孔达拉 ";
        break;
        case 19:
        name = "库鲁萨 ";
        break;
        case 21:
        name = "马森塔 ";
        break;
        case 22:
        name = "马里 ";
        break;
        case 23:
        name = "马木 ";
        break;
        case 25:
        name = "皮塔 ";
        break;
        case 27:
        name = "泰利梅莱 ";
        break;
        case 28:
        name = "舌状 ";
        break;
        case 29:
        name = "约穆 ";
        break;
        case 30:
        name = "科亚 ";
        break;
        case 31:
        name = "杜布雷卡 ";
        break;
        case 32:
        name = "康康 ";
        break;
        case 33:
        name = "库比亚 ";
        break;
        case 34:
        name = "拉贝 ";
        break;
        case 35:
        name = "莱卢马 ";
        break;
        case 36:
        name = "萝拉 ";
        break;
        case 37:
        name = "芒加纳 ";
        break;
        case 38:
        name = "恩泽雷科雷 ";
        break;
        case 39:
        name = "锡吉里 ";
        break;
      }
    }
    if (country_code.equals("GQ") == true) {
      switch (region_code2) {
        case 3:
        name = "安诺本岛 ";
        break;
        case 4:
        name = "北比奥科 ";
        break;
        case 5:
        name = "南比奥科 ";
        break;
        case 6:
        name = "中南部地区 ";
        break;
        case 7:
        name = "祺恩特姆的 ";
        break;
        case 8:
        name = "滨海 ";
        break;
        case 9:
        name = "韦莱 - 恩萨斯的 ";
        break;
      }
    }
    if (country_code.equals("GR") == true) {
      switch (region_code2) {
        case 1:
        name = "埃夫罗斯 ";
        break;
        case 2:
        name = "Rodhopi ";
        break;
        case 3:
        name = "萨丁 ";
        break;
        case 4:
        name = "戏剧 ";
        break;
        case 5:
        name = "塞雷 ";
        break;
        case 6:
        name = "基尔基斯 ";
        break;
        case 7:
        name = "佩拉 ";
        break;
        case 8:
        name = "弗洛 ";
        break;
        case 9:
        name = "卡斯托里亚 ";
        break;
        case 10:
        name = "格雷韦纳 ";
        break;
        case 11:
        name = "科扎尼 ";
        break;
        case 12:
        name = "伊马希亚 ";
        break;
        case 13:
        name = "塞萨洛尼基 ";
        break;
        case 14:
        name = "卡瓦拉 ";
        break;
        case 15:
        name = "Khalkidhiki ";
        break;
        case 16:
        name = "皮耶利亚 ";
        break;
        case 17:
        name = "约阿尼纳 ";
        break;
        case 18:
        name = "科孚 ";
        break;
        case 19:
        name = "普利维扎 ";
        break;
        case 20:
        name = "阿尔塔 ";
        break;
        case 21:
        name = "拉里莎 ";
        break;
        case 22:
        name = "特里卡拉 ";
        break;
        case 23:
        name = "Kardhitsa ";
        break;
        case 24:
        name = "马格尼西亚 ";
        break;
        case 25:
        name = "克基拉 ";
        break;
        case 26:
        name = "雷夫卡达 ";
        break;
        case 27:
        name = "凯法利尼亚岛的 ";
        break;
        case 28:
        name = "罗得 ";
        break;
        case 29:
        name = "弗西奥蒂斯 ";
        break;
        case 30:
        name = "Evritania ";
        break;
        case 31:
        name = "埃托利亚偕阿卡纳尼亚 ";
        break;
        case 32:
        name = "福基斯 ";
        break;
        case 33:
        name = "Voiotia ";
        break;
        case 34:
        name = "Evvoia ";
        break;
        case 35:
        name = "阿提卡 ";
        break;
        case 36:
        name = "阿尔戈利斯 ";
        break;
        case 37:
        name = "科林斯 ";
        break;
        case 38:
        name = "Akhaia ";
        break;
        case 39:
        name = "伊利亚 ";
        break;
        case 40:
        name = "麦锡尼 ";
        break;
        case 41:
        name = "Arkadhia ";
        break;
        case 42:
        name = "拉科尼亚 ";
        break;
        case 43:
        name = "尼亚 ";
        break;
        case 44:
        name = "Rethimni ";
        break;
        case 45:
        name = "伊拉克利翁 ";
        break;
        case 46:
        name = "拉希提 ";
        break;
        case 47:
        name = "Dhodhekanisos ";
        break;
        case 48:
        name = "萨莫斯 ";
        break;
        case 49:
        name = "Kikladhes ";
        break;
        case 50:
        name = "Khios ";
        break;
        case 51:
        name = "莱斯沃斯 ";
        break;
      }
    }
    if (country_code.equals("GT") == true) {
      switch (region_code2) {
        case 1:
        name = "上韦拉帕斯 ";
        break;
        case 2:
        name = "下韦拉帕斯 ";
        break;
        case 3:
        name = "奇马尔特南戈 ";
        break;
        case 4:
        name = "奇基穆拉 ";
        break;
        case 5:
        name = "普罗格雷索 ";
        break;
        case 6:
        name = "埃斯昆特拉 ";
        break;
        case 7:
        name = "危地马拉 ";
        break;
        case 8:
        name = "韦韦特南戈 ";
        break;
        case 9:
        name = "伊萨瓦尔 ";
        break;
        case 10:
        name = "哈拉帕 ";
        break;
        case 11:
        name = "胡蒂亚帕 ";
        break;
        case 12:
        name = "佩滕 ";
        break;
        case 13:
        name = "克萨尔特南 ";
        break;
        case 14:
        name = "基切 ";
        break;
        case 15:
        name = "雷塔卢莱乌 ";
        break;
        case 16:
        name = "萨卡特佩克斯 ";
        break;
        case 17:
        name = "圣马科斯 ";
        break;
        case 18:
        name = "圣罗莎 ";
        break;
        case 19:
        name = "索洛拉 ";
        break;
        case 20:
        name = "苏奇特佩克斯 ";
        break;
        case 21:
        name = "托托尼卡潘 ";
        break;
        case 22:
        name = "萨卡帕 ";
        break;
      }
    }
    if (country_code.equals("GW") == true) {
      switch (region_code2) {
        case 1:
        name = "巴法塔 ";
        break;
        case 2:
        name = "基纳拉 ";
        break;
        case 4:
        name = "奥约 ";
        break;
        case 5:
        name = "博拉马 ";
        break;
        case 6:
        name = "卡谢乌 ";
        break;
        case 7:
        name = "巴利 ";
        break;
        case 10:
        name = "加布 ";
        break;
        case 11:
        name = "几内亚比绍 ";
        break;
        case 12:
        name = "比翁博 ";
        break;
      }
    }
    if (country_code.equals("GY") == true) {
      switch (region_code2) {
        case 10:
        name = "巴里马瓦伊尼 ";
        break;
        case 11:
        name = "库尤尼马扎鲁尼 ";
        break;
        case 12:
        name = "德梅拉拉马海卡的 ";
        break;
        case 13:
        name = "东伯比斯科兰太因 ";
        break;
        case 14:
        name = "埃塞奎博群岛 - 西德梅拉拉 ";
        break;
        case 15:
        name = "马海卡伯比斯 ";
        break;
        case 16:
        name = "波默伦苏佩纳姆 ";
        break;
        case 17:
        name = "波塔罗锡帕鲁尼的 ";
        break;
        case 18:
        name = "上德梅拉拉伯比斯的 ";
        break;
        case 19:
        name = "上塔库图 - 上埃塞奎博 ";
        break;
      }
    }
    if (country_code.equals("HN") == true) {
      switch (region_code2) {
        case 1:
        name = "阿特兰蒂达 ";
        break;
        case 2:
        name = "乔卢特卡 ";
        break;
        case 3:
        name = "冒号 ";
        break;
        case 4:
        name = "科马亚瓜 ";
        break;
        case 5:
        name = "科潘 ";
        break;
        case 6:
        name = "科尔特斯 ";
        break;
        case 7:
        name = "帕拉伊索 ";
        break;
        case 8:
        name = "弗朗西斯科 - 莫拉桑 ";
        break;
        case 9:
        name = "格拉西亚斯奥斯 ";
        break;
        case 10:
        name = "因蒂布卡 ";
        break;
        case 11:
        name = "海湾群岛 ";
        break;
        case 12:
        name = "拉巴斯 ";
        break;
        case 13:
        name = "伦皮拉 ";
        break;
        case 14:
        name = "奥科特佩克 ";
        break;
        case 15:
        name = "奥兰乔 ";
        break;
        case 16:
        name = "圣巴巴拉 ";
        break;
        case 17:
        name = "山谷 ";
        break;
        case 18:
        name = "养老 ";
        break;
      }
    }
    if (country_code.equals("HR") == true) {
      switch (region_code2) {
        case 1:
        name = "别洛瓦尔比洛戈拉的 ";
        break;
        case 2:
        name = "布罗德 - 波萨维纳 ";
        break;
        case 3:
        name = "杜布罗夫斯克 - 内雷特瓦 ";
        break;
        case 4:
        name = "伊斯特拉 ";
        break;
        case 5:
        name = "卡尔洛瓦茨 ";
        break;
        case 6:
        name = "科普里夫尼察 - 克里热夫齐 ";
        break;
        case 7:
        name = "Krapinsko Zagorska ";
        break;
        case 8:
        name = "利奇塞尼 ";
        break;
        case 9:
        name = "梅吉穆列 ";
        break;
        case 10:
        name = "奥西耶克 - 巴兰吉斯卡的 ";
        break;
        case 11:
        name = "波热加 - 斯拉沃尼亚 ";
        break;
        case 12:
        name = "普里莫戈兰斯卡的 ";
        break;
        case 13:
        name = "Sibensko - 克宁 ";
        break;
        case 14:
        name = "锡萨克 - 莫斯拉维纳 ";
        break;
        case 15:
        name = "斯普利特 - 达尔马提亚 ";
        break;
        case 16:
        name = "瓦拉史汀斯卡 ";
        break;
        case 17:
        name = "维罗维蒂察波德拉夫 ";
        break;
        case 18:
        name = "武科瓦尔 - 斯里耶姆 ";
        break;
        case 19:
        name = "Zadarska ";
        break;
        case 20:
        name = "Zagrebacka街 ";
        break;
        case 21:
        name = "萨格勒布 ";
        break;
      }
    }
    if (country_code.equals("HT") == true) {
      switch (region_code2) {
        case 3:
        name = "西北省 ";
        break;
        case 6:
        name = "阿蒂博尼特 ";
        break;
        case 7:
        name = "中心 ";
        break;
        case 9:
        name = "北 ";
        break;
        case 10:
        name = "北EST ";
        break;
        case 11:
        name = "西部省 ";
        break;
        case 12:
        name = "南基 ";
        break;
        case 13:
        name = "SUD-EST ";
        break;
        case 14:
        name = "安塞 ";
        break;
        case 15:
        name = "尼佩斯 ";
        break;
      }
    }
    if (country_code.equals("HU") == true) {
      switch (region_code2) {
        case 1:
        name = "巴奇 - 基什孔州 ";
        break;
        case 2:
        name = "巴兰尼 ";
        break;
        case 3:
        name = "贝凯什 ";
        break;
        case 4:
        name = "包尔绍德 - 奥包乌伊 - 曾普伦州 ";
        break;
        case 5:
        name = "布达佩斯 ";
        break;
        case 6:
        name = "琼格拉德 ";
        break;
        case 7:
        name = "德布勒森 ";
        break;
        case 8:
        name = "费耶尔 ";
        break;
        case 9:
        name = "杰尔 - 莫松 - 肖普朗 ";
        break;
        case 10:
        name = "豪伊杜 - 比 ";
        break;
        case 11:
        name = "赫维什 ";
        break;
        case 12:
        name = "科马罗姆 - 埃斯泰尔戈姆 ";
        break;
        case 13:
        name = "米什科尔茨 ";
        break;
        case 14:
        name = "诺格拉德 ";
        break;
        case 15:
        name = "佩奇 ";
        break;
        case 16:
        name = "害虫 ";
        break;
        case 17:
        name = "绍莫吉 ";
        break;
        case 18:
        name = "索博尔奇 - 索特马尔贝瑞格的 ";
        break;
        case 19:
        name = "塞格德 ";
        break;
        case 20:
        name = "亚斯 - 纳杰孔 - 索尔诺克 ";
        break;
        case 21:
        name = "托尔瑙 ";
        break;
        case 22:
        name = "沃什 ";
        break;
        case 23:
        name = "维斯普雷姆 ";
        break;
        case 24:
        name = "砸落 ";
        break;
        case 25:
        name = "杰尔 ";
        break;
        case 26:
        name = "贝凯什乔包 ";
        break;
        case 27:
        name = "多瑙新城 ";
        break;
        case 28:
        name = "埃格尔 ";
        break;
        case 29:
        name = "霍德梅泽瓦沙海伊 ";
        break;
        case 30:
        name = "卡伯司瓦 ";
        break;
        case 31:
        name = "凯奇凯梅特 ";
        break;
        case 32:
        name = "瑙吉考尼饶 ";
        break;
        case 33:
        name = "尼赖吉哈佐 ";
        break;
        case 34:
        name = "索普隆 ";
        break;
        case 35:
        name = "塞克什白堡 ";
        break;
        case 36:
        name = "索尔诺克 ";
        break;
        case 37:
        name = "松博特海伊 ";
        break;
        case 38:
        name = "陶陶巴尼奥 ";
        break;
        case 39:
        name = "维斯普雷姆 ";
        break;
        case 40:
        name = "佐洛埃格塞格 ";
        break;
        case 41:
        name = "绍尔戈陶尔扬 ";
        break;
        case 42:
        name = "赛克萨德 ";
        break;
      }
    }
    if (country_code.equals("ID") == true) {
      switch (region_code2) {
        case 1:
        name = "亚齐 ";
        break;
        case 2:
        name = "巴厘岛 ";
        break;
        case 3:
        name = "明古鲁 ";
        break;
        case 4:
        name = "雅加达 ";
        break;
        case 5:
        name = "占碑 ";
        break;
        case 6:
        name = "西爪哇 ";
        break;
        case 7:
        name = "中爪哇 ";
        break;
        case 8:
        name = "东爪哇 ";
        break;
        case 9:
        name = "巴布亚 ";
        break;
        case 10:
        name = "日惹 ";
        break;
        case 11:
        name = "西加里曼丹 ";
        break;
        case 12:
        name = "南加里曼丹 ";
        break;
        case 13:
        name = "中加里曼丹 ";
        break;
        case 14:
        name = "东加里曼丹 ";
        break;
        case 15:
        name = "楠榜 ";
        break;
        case 16:
        name = "马鲁古 ";
        break;
        case 17:
        name = "西努沙登加拉 ";
        break;
        case 18:
        name = "东努沙登加拉 ";
        break;
        case 19:
        name = "廖 ";
        break;
        case 20:
        name = "南苏拉威西 ";
        break;
        case 21:
        name = "中苏拉威西 ";
        break;
        case 22:
        name = "东南苏拉威西 ";
        break;
        case 23:
        name = "北苏拉威西 ";
        break;
        case 24:
        name = "西苏门答腊 ";
        break;
        case 25:
        name = "南苏门答腊 ";
        break;
        case 26:
        name = "北苏门答腊 ";
        break;
        case 28:
        name = "马鲁古 ";
        break;
        case 29:
        name = "北马鲁古 ";
        break;
        case 30:
        name = "西爪哇 ";
        break;
        case 31:
        name = "北苏拉威西 ";
        break;
        case 32:
        name = "南苏门答腊 ";
        break;
        case 33:
        name = "万丹 ";
        break;
        case 34:
        name = "哥伦打洛 ";
        break;
        case 35:
        name = "邦加勿里洞Kepulauan ";
        break;
        case 36:
        name = "巴布亚 ";
        break;
        case 37:
        name = "廖 ";
        break;
        case 38:
        name = "南苏拉威西 ";
        break;
        case 39:
        name = "伊里安查亚巴拉特 ";
        break;
        case 40:
        name = "廖内群岛 ";
        break;
        case 41:
        name = "西苏拉威西 ";
        break;
      }
    }
    if (country_code.equals("IE") == true) {
      switch (region_code2) {
        case 1:
        name = "卡洛 ";
        break;
        case 2:
        name = "卡瓦 ";
        break;
        case 3:
        name = "克莱尔 ";
        break;
        case 4:
        name = "软木 ";
        break;
        case 6:
        name = "多尼戈尔 ";
        break;
        case 7:
        name = "都柏林 ";
        break;
        case 10:
        name = "戈尔韦 ";
        break;
        case 11:
        name = "黑色的小乳牛 ";
        break;
        case 12:
        name = "基尔代尔 ";
        break;
        case 13:
        name = "基尔肯尼 ";
        break;
        case 14:
        name = "利特里姆 ";
        break;
        case 15:
        name = "崂 ";
        break;
        case 16:
        name = "五行打油诗 ";
        break;
        case 18:
        name = "朗福德 ";
        break;
        case 19:
        name = "劳斯 ";
        break;
        case 20:
        name = "梅奥 ";
        break;
        case 21:
        name = "米斯 ";
        break;
        case 22:
        name = "莫纳汉 ";
        break;
        case 23:
        name = "奥法利 ";
        break;
        case 24:
        name = "罗斯康 ";
        break;
        case 25:
        name = "斯莱戈 ";
        break;
        case 26:
        name = "蒂珀雷 ";
        break;
        case 27:
        name = "沃特福德 ";
        break;
        case 29:
        name = "西米斯 ";
        break;
        case 30:
        name = "韦克斯福德 ";
        break;
        case 31:
        name = "威克洛 ";
        break;
      }
    }
    if (country_code.equals("IL") == true) {
      switch (region_code2) {
        case 1:
        name = "南部区 ";
        break;
        case 2:
        name = "HaMerkaz ";
        break;
        case 3:
        name = "HAZAFON ";
        break;
        case 4:
        name = "鹤发 ";
        break;
        case 5:
        name = "特拉维夫 ";
        break;
        case 6:
        name = "耶路撒冷 ";
        break;
      }
    }
    if (country_code.equals("IN") == true) {
      switch (region_code2) {
        case 1:
        name = "安达曼和尼科巴群岛 ";
        break;
        case 2:
        name = "安德拉邦 ";
        break;
        case 3:
        name = "阿萨姆邦 ";
        break;
        case 5:
        name = "昌迪加尔 ";
        break;
        case 6:
        name = "达德拉和纳加尔哈维 ";
        break;
        case 7:
        name = "新德里 ";
        break;
        case 9:
        name = "古吉拉特邦 ";
        break;
        case 10:
        name = "哈里亚纳邦 ";
        break;
        case 11:
        name = "喜马偕尔邦 ";
        break;
        case 12:
        name = "查谟和克什米尔 ";
        break;
        case 13:
        name = "喀拉拉邦 ";
        break;
        case 14:
        name = "拉克沙群岛 ";
        break;
        case 16:
        name = "马哈拉施特拉邦 ";
        break;
        case 17:
        name = "曼尼普尔邦 ";
        break;
        case 18:
        name = "梅加拉亚邦 ";
        break;
        case 19:
        name = "卡纳塔克邦 ";
        break;
        case 20:
        name = "那加兰邦 ";
        break;
        case 21:
        name = "奥里萨邦 ";
        break;
        case 22:
        name = "本地治里 ";
        break;
        case 23:
        name = "旁遮普 ";
        break;
        case 24:
        name = "拉贾斯坦邦 ";
        break;
        case 25:
        name = "泰米尔纳德邦 ";
        break;
        case 26:
        name = "特里普拉邦 ";
        break;
        case 28:
        name = "西孟加拉邦 ";
        break;
        case 29:
        name = "锡金 ";
        break;
        case 30:
        name = "阿鲁纳恰尔邦 ";
        break;
        case 31:
        name = "米佐拉姆 ";
        break;
        case 32:
        name = "达曼和第乌 ";
        break;
        case 33:
        name = "果阿 ";
        break;
        case 34:
        name = "比哈尔邦 ";
        break;
        case 35:
        name = "中央邦 ";
        break;
        case 36:
        name = "北方邦 ";
        break;
        case 37:
        name = "切蒂斯格尔 ";
        break;
        case 38:
        name = "恰尔肯德邦 ";
        break;
        case 39:
        name = "北阿坎德邦 ";
        break;
      }
    }
    if (country_code.equals("IQ") == true) {
      switch (region_code2) {
        case 1:
        name = "安巴尔 ";
        break;
        case 2:
        name = "巴斯拉 ";
        break;
        case 3:
        name = "穆萨纳 ";
        break;
        case 4:
        name = "卡迪西亚 ";
        break;
        case 5:
        name = "由于苏莱曼尼亚 ";
        break;
        case 6:
        name = "巴比伦 ";
        break;
        case 7:
        name = "巴格达 ";
        break;
        case 8:
        name = "杜胡克 ";
        break;
        case 9:
        name = "济加尔 ";
        break;
        case 10:
        name = "迪亚拉 ";
        break;
        case 11:
        name = "埃尔比勒 ";
        break;
        case 12:
        name = "卡尔巴拉 ";
        break;
        case 13:
        name = "塔米姆 ";
        break;
        case 14:
        name = "米桑 ";
        break;
        case 15:
        name = "尼尼微省 ";
        break;
        case 16:
        name = "瓦西特 ";
        break;
        case 17:
        name = "纳杰夫 ";
        break;
        case 18:
        name = "萨拉赫丁 ";
        break;
      }
    }
    if (country_code.equals("IR") == true) {
      switch (region_code2) {
        case 1:
        name = "西阿塞拜疆Bakhtari ";
        break;
        case 2:
        name = "西阿塞拜疆Khavari ";
        break;
        case 3:
        name = "恰哈马哈勒巴赫蒂亚 ";
        break;
        case 4:
        name = "锡斯坦 - 俾路支斯坦 ";
        break;
        case 5:
        name = "Kohkiluyeh VA采购艾哈迈迪 ";
        break;
        case 7:
        name = "法尔斯 ";
        break;
        case 8:
        name = "吉兰 ";
        break;
        case 9:
        name = "哈马丹 ";
        break;
        case 10:
        name = "伊拉姆 ";
        break;
        case 11:
        name = "霍尔木兹甘 ";
        break;
        case 12:
        name = "克尔曼 ";
        break;
        case 13:
        name = "巴赫塔软 ";
        break;
        case 15:
        name = "胡齐斯坦 ";
        break;
        case 16:
        name = "库尔德斯坦 ";
        break;
        case 17:
        name = "马赞达兰 ";
        break;
        case 18:
        name = "塞姆南省 ";
        break;
        case 19:
        name = "马凯斯 ";
        break;
        case 21:
        name = "赞詹 ";
        break;
        case 22:
        name = "布什尔 ";
        break;
        case 23:
        name = "洛雷斯坦 ";
        break;
        case 24:
        name = "马凯斯 ";
        break;
        case 25:
        name = "塞姆南 ";
        break;
        case 26:
        name = "德黑兰 ";
        break;
        case 27:
        name = "赞詹 ";
        break;
        case 28:
        name = "伊斯法罕 ";
        break;
        case 29:
        name = "克尔曼 ";
        break;
        case 30:
        name = "呼罗珊 ";
        break;
        case 31:
        name = "亚兹德 ";
        break;
        case 32:
        name = "阿尔达比勒 ";
        break;
        case 33:
        name = "东阿塞拜疆 ";
        break;
        case 34:
        name = "马凯斯 ";
        break;
        case 35:
        name = "马赞达兰 ";
        break;
        case 36:
        name = "赞詹 ";
        break;
        case 37:
        name = "洛雷斯坦 ";
        break;
        case 38:
        name = "加兹温 ";
        break;
        case 39:
        name = "库姆 ";
        break;
        case 40:
        name = "亚兹德 ";
        break;
        case 41:
        name = "呼罗珊-E Janubi ";
        break;
        case 42:
        name = "拉扎维呼罗珊-E ";
        break;
        case 43:
        name = "呼罗珊-E Shemali ";
        break;
      }
    }
    if (country_code.equals("IS") == true) {
      switch (region_code2) {
        case 3:
        name = "Arnessysla ";
        break;
        case 5:
        name = "Austur Hunavatnssysla ";
        break;
        case 6:
        name = "Austur Skaftafellssysla ";
        break;
        case 7:
        name = "Borgarfjardarsysla ";
        break;
        case 9:
        name = "Eyjafjardarsysla ";
        break;
        case 10:
        name = "Gullbringusysla ";
        break;
        case 15:
        name = "Kjosarsysla ";
        break;
        case 17:
        name = "Myrasysla ";
        break;
        case 20:
        name = "Nordur Mulasysla ";
        break;
        case 21:
        name = "Nordur Tingeyjarsysla ";
        break;
        case 23:
        name = "Rangarvallasysla ";
        break;
        case 28:
        name = "Skagafjardarsysla ";
        break;
        case 29:
        name = "Snafellsnes OG Hnappadalssysla ";
        break;
        case 30:
        name = "Strandasysla ";
        break;
        case 31:
        name = "Sudur Mulasysla ";
        break;
        case 32:
        name = "Sudur Tingeyjarsysla ";
        break;
        case 34:
        name = "Vestur Bardastrandarsysla ";
        break;
        case 35:
        name = "Vestur Hunavatnssysla ";
        break;
        case 36:
        name = "Vestur Isafjardarsysla ";
        break;
        case 37:
        name = "Vestur Skaftafellssysla ";
        break;
        case 40:
        name = "Norourland Eystra ";
        break;
        case 41:
        name = "Norourland Vestra ";
        break;
        case 42:
        name = "Suourland ";
        break;
        case 43:
        name = "Suournes ";
        break;
        case 44:
        name = "Vestfiroir ";
        break;
        case 45:
        name = "西部区 ";
        break;
      }
    }
    if (country_code.equals("IT") == true) {
      switch (region_code2) {
        case 1:
        name = "阿布鲁齐 ";
        break;
        case 2:
        name = "巴西利卡塔 ";
        break;
        case 3:
        name = "卡拉布里亚 ";
        break;
        case 4:
        name = "坎帕尼亚大区 ";
        break;
        case 5:
        name = "艾米利亚 - 罗马涅大区 ";
        break;
        case 6:
        name = "弗留利 - 威尼斯朱利亚 ";
        break;
        case 7:
        name = "拉齐奥大区 ";
        break;
        case 8:
        name = "利古里亚 ";
        break;
        case 9:
        name = "伦巴第大区 ";
        break;
        case 10:
        name = "马尔凯 ";
        break;
        case 11:
        name = "莫利塞 ";
        break;
        case 12:
        name = "皮埃蒙特大区 ";
        break;
        case 13:
        name = "普利亚大区 ";
        break;
        case 14:
        name = "撒丁岛 ";
        break;
        case 15:
        name = "西西里岛 ";
        break;
        case 16:
        name = "托斯卡纳 ";
        break;
        case 17:
        name = "特伦蒂诺 - 上阿迪杰 ";
        break;
        case 18:
        name = "翁布里亚 ";
        break;
        case 19:
        name = "瓦莱达奥斯塔 ";
        break;
        case 20:
        name = "威尼托 ";
        break;
      }
    }
    if (country_code.equals("JM") == true) {
      switch (region_code2) {
        case 1:
        name = "克拉伦登 ";
        break;
        case 2:
        name = "汉诺威 ";
        break;
        case 4:
        name = "曼彻斯特 ";
        break;
        case 7:
        name = "波特兰 ";
        break;
        case 8:
        name = "圣安德鲁 ";
        break;
        case 9:
        name = "圣安 ";
        break;
        case 10:
        name = "圣凯瑟琳 ";
        break;
        case 11:
        name = "圣伊丽莎白 ";
        break;
        case 12:
        name = "圣詹姆斯 ";
        break;
        case 13:
        name = "圣玛丽 ";
        break;
        case 14:
        name = "圣托马斯 ";
        break;
        case 15:
        name = "特里劳尼 ";
        break;
        case 16:
        name = "威斯特摩兰 ";
        break;
        case 17:
        name = "金士顿 ";
        break;
      }
    }
    if (country_code.equals("JO") == true) {
      switch (region_code2) {
        case 2:
        name = "巴尔卡“ ";
        break;
        case 7:
        name = "妈 ";
        break;
        case 9:
        name = "卡拉克 ";
        break;
        case 10:
        name = "麦夫拉格 ";
        break;
        case 11:
        name = "安曼省 ";
        break;
        case 12:
        name = "在塔菲拉 ";
        break;
        case 13:
        name = "AZ扎尔卡 ";
        break;
        case 14:
        name = "伊尔比德 ";
        break;
        case 16:
        name = "安曼 ";
        break;
      }
    }
    if (country_code.equals("JP") == true) {
      switch (region_code2) {
        case 1:
        name = "爱知 ";
        break;
        case 2:
        name = "秋田 ";
        break;
        case 3:
        name = "青森 ";
        break;
        case 4:
        name = "千叶 ";
        break;
        case 5:
        name = "爱媛 ";
        break;
        case 6:
        name = "福井 ";
        break;
        case 7:
        name = "福冈 ";
        break;
        case 8:
        name = "福岛 ";
        break;
        case 9:
        name = "岐阜 ";
        break;
        case 10:
        name = "群马县 ";
        break;
        case 11:
        name = "广岛 ";
        break;
        case 12:
        name = "北海道 ";
        break;
        case 13:
        name = "兵库县 ";
        break;
        case 14:
        name = "茨城 ";
        break;
        case 15:
        name = "石川 ";
        break;
        case 16:
        name = "岩手 ";
        break;
        case 17:
        name = "香川 ";
        break;
        case 18:
        name = "鹿儿岛 ";
        break;
        case 19:
        name = "神奈川 ";
        break;
        case 20:
        name = "高知县 ";
        break;
        case 21:
        name = "熊本 ";
        break;
        case 22:
        name = "京都 ";
        break;
        case 23:
        name = "三重 ";
        break;
        case 24:
        name = "宫城 ";
        break;
        case 25:
        name = "宫崎 ";
        break;
        case 26:
        name = "长野 ";
        break;
        case 27:
        name = "长崎 ";
        break;
        case 28:
        name = "奈良 ";
        break;
        case 29:
        name = "新泻 ";
        break;
        case 30:
        name = "大分 ";
        break;
        case 31:
        name = "冈山 ";
        break;
        case 32:
        name = "大阪 ";
        break;
        case 33:
        name = "冒险故事 ";
        break;
        case 34:
        name = "埼玉 ";
        break;
        case 35:
        name = "滋贺县 ";
        break;
        case 36:
        name = "岛根县 ";
        break;
        case 37:
        name = "静冈 ";
        break;
        case 38:
        name = "枥木 ";
        break;
        case 39:
        name = "德岛 ";
        break;
        case 40:
        name = "东京 ";
        break;
        case 41:
        name = "鸟取 ";
        break;
        case 42:
        name = "富山 ";
        break;
        case 43:
        name = "和歌山 ";
        break;
        case 44:
        name = "山形 ";
        break;
        case 45:
        name = "山口 ";
        break;
        case 46:
        name = "山梨县 ";
        break;
        case 47:
        name = "冲绳岛 ";
        break;
      }
    }
    if (country_code.equals("KE") == true) {
      switch (region_code2) {
        case 1:
        name = "中央 ";
        break;
        case 2:
        name = "滨 ";
        break;
        case 3:
        name = "东 ";
        break;
        case 5:
        name = "内罗毕地区 ";
        break;
        case 6:
        name = "北东部 ";
        break;
        case 7:
        name = "尼安萨 ";
        break;
        case 8:
        name = "东非大裂谷 ";
        break;
        case 9:
        name = "西 ";
        break;
      }
    }
    if (country_code.equals("KG") == true) {
      switch (region_code2) {
        case 1:
        name = "比什凯克 ";
        break;
        case 2:
        name = "丘伊 ";
        break;
        case 3:
        name = "贾拉拉巴德 ";
        break;
        case 4:
        name = "纳伦 ";
        break;
        case 5:
        name = "奥什 ";
        break;
        case 6:
        name = "塔拉斯 ";
        break;
        case 7:
        name = "Ysyk KOL ";
        break;
        case 8:
        name = "奥什 ";
        break;
        case 9:
        name = "巴特肯 ";
        break;
      }
    }
    if (country_code.equals("KH") == true) {
      switch (region_code2) {
        case 1:
        name = "马德望 ";
        break;
        case 2:
        name = "磅湛 ";
        break;
        case 3:
        name = "磅清扬 ";
        break;
        case 4:
        name = "磅士卑省 ";
        break;
        case 5:
        name = "甘榜姆 ";
        break;
        case 6:
        name = "贡布 ";
        break;
        case 7:
        name = "干丹 ";
        break;
        case 8:
        name = "香港岛 ";
        break;
        case 9:
        name = "桔井 ";
        break;
        case 10:
        name = "蒙多基里省 ";
        break;
        case 11:
        name = "金边 ";
        break;
        case 12:
        name = "菩萨 ";
        break;
        case 13:
        name = "柏威夏 ";
        break;
        case 14:
        name = "波萝勉 ";
        break;
        case 15:
        name = "腊塔纳基里滴 ";
        break;
        case 16:
        name = "暹粒 ";
        break;
        case 17:
        name = "上丁 ";
        break;
        case 18:
        name = "柴桢 ";
        break;
        case 19:
        name = "猛男 ";
        break;
        case 25:
        name = "班迭棉吉 ";
        break;
        case 29:
        name = "马德望 ";
        break;
        case 30:
        name = "拜林 ";
        break;
      }
    }
    if (country_code.equals("KI") == true) {
      switch (region_code2) {
        case 1:
        name = "吉尔伯特群岛 ";
        break;
        case 2:
        name = "莱恩群岛 ";
        break;
        case 3:
        name = "凤凰岛 ";
        break;
      }
    }
    if (country_code.equals("KM") == true) {
      switch (region_code2) {
        case 1:
        name = "昂儒昂岛 ";
        break;
        case 2:
        name = "大科摩罗岛 ";
        break;
        case 3:
        name = "莫埃利 ";
        break;
      }
    }
    if (country_code.equals("KN") == true) {
      switch (region_code2) {
        case 1:
        name = "尼古拉镇基督教堂 ";
        break;
        case 2:
        name = "圣安娜沙角 ";
        break;
        case 3:
        name = "圣徒乔治·巴斯特尔 ";
        break;
        case 4:
        name = "圣乔治金哲兰的 ";
        break;
        case 5:
        name = "圣詹姆斯迎风 ";
        break;
        case 6:
        name = "圣约翰卡皮斯特莱的 ";
        break;
        case 7:
        name = "圣约翰Figtree ";
        break;
        case 8:
        name = "圣玛丽峡谷 ";
        break;
        case 9:
        name = "圣保罗卡皮斯特莱 ";
        break;
        case 10:
        name = "圣保罗查尔斯 ";
        break;
        case 11:
        name = "圣彼得巴斯特尔 ";
        break;
        case 12:
        name = "圣托马斯低地 ";
        break;
        case 13:
        name = "圣托马斯中东岛 ";
        break;
        case 15:
        name = "三位一体棕榈点 ";
        break;
      }
    }
    if (country_code.equals("KP") == true) {
      switch (region_code2) {
        case 1:
        name = "慈江道 ";
        break;
        case 3:
        name = "咸镜北道南道 ";
        break;
        case 6:
        name = "黄海南道南道 ";
        break;
        case 7:
        name = "黄海bukto的 ";
        break;
        case 8:
        name = "开城-SI ";
        break;
        case 9:
        name = "江原道 ";
        break;
        case 11:
        name = "P'yongan bukto ";
        break;
        case 12:
        name = "平壤-SI ";
        break;
        case 13:
        name = "景阳岗 ";
        break;
        case 14:
        name = "Namp'o-SI ";
        break;
        case 15:
        name = "P'yongan南道 ";
        break;
        case 17:
        name = "咸镜道bukto的 ";
        break;
        case 18:
        name = "罗先直辖市 ";
        break;
      }
    }
    if (country_code.equals("KR") == true) {
      switch (region_code2) {
        case 1:
        name = "济州岛 ";
        break;
        case 3:
        name = "全罗bukto的 ";
        break;
        case 5:
        name = "Ch'ungch'ong bukto ";
        break;
        case 6:
        name = "江原道 ";
        break;
        case 10:
        name = "釜山jikhalsi的 ";
        break;
        case 11:
        name = "首尔特别市 ";
        break;
        case 12:
        name = "仁川jikhalsi的 ";
        break;
        case 13:
        name = "京畿道 ";
        break;
        case 14:
        name = "庆尚bukto的 ";
        break;
        case 15:
        name = "大邱jikhalsi的 ";
        break;
        case 16:
        name = "全罗道南道 ";
        break;
        case 17:
        name = "Ch'ungch'ong南道 ";
        break;
        case 18:
        name = "光州jikhalsi的 ";
        break;
        case 19:
        name = "大田jikhalsi的 ";
        break;
        case 20:
        name = "庆尚南道 ";
        break;
        case 21:
        name = "蔚山广域市 ";
        break;
      }
    }
    if (country_code.equals("KW") == true) {
      switch (region_code2) {
        case 1:
        name = "艾哈迈迪 ";
        break;
        case 2:
        name = "科威特省 ";
        break;
        case 5:
        name = "杰赫拉 ";
        break;
        case 7:
        name = "费尔瓦尼耶 ";
        break;
        case 8:
        name = "哈瓦利 ";
        break;
        case 9:
        name = "穆巴拉克人卡比尔 ";
        break;
      }
    }
    if (country_code.equals("KY") == true) {
      switch (region_code2) {
        case 1:
        name = "溪 ";
        break;
        case 2:
        name = "东 ";
        break;
        case 3:
        name = "美联 ";
        break;
        case 4:
        name = "南头镇 ";
        break;
        case 5:
        name = "现货湾 ";
        break;
        case 6:
        name = "放样湾 ";
        break;
        case 7:
        name = "西区 ";
        break;
        case 8:
        name = "西 ";
        break;
      }
    }
    if (country_code.equals("KZ") == true) {
      switch (region_code2) {
        case 1:
        name = "阿拉木图 ";
        break;
        case 2:
        name = "阿拉木图市 ";
        break;
        case 3:
        name = "阿克莫拉 ";
        break;
        case 4:
        name = "阿克托别 ";
        break;
        case 5:
        name = "阿斯塔纳 ";
        break;
        case 6:
        name = "阿特劳 ";
        break;
        case 7:
        name = "西哈萨克斯坦 ";
        break;
        case 8:
        name = "Bayqonyr ";
        break;
        case 9:
        name = "曼格斯套 ";
        break;
        case 10:
        name = "南哈萨克斯坦 ";
        break;
        case 11:
        name = "巴甫洛达尔 ";
        break;
        case 12:
        name = "卡拉干达 ";
        break;
        case 13:
        name = "科斯塔奈 ";
        break;
        case 14:
        name = "克孜勒奥尔达 ";
        break;
        case 15:
        name = "东哈萨克斯坦 ";
        break;
        case 16:
        name = "北哈萨克斯坦 ";
        break;
        case 17:
        name = "拾 ";
        break;
      }
    }
    if (country_code.equals("LA") == true) {
      switch (region_code2) {
        case 1:
        name = "阿速坡 ";
        break;
        case 2:
        name = "巴塞 ";
        break;
        case 3:
        name = "华潘 ";
        break;
        case 4:
        name = "甘蒙 ";
        break;
        case 5:
        name = "琅南塔 ";
        break;
        case 7:
        name = "乌多姆赛 ";
        break;
        case 8:
        name = "丰沙里 ";
        break;
        case 9:
        name = "沙拉湾 ";
        break;
        case 10:
        name = "沙湾拿吉 ";
        break;
        case 11:
        name = "万象 ";
        break;
        case 13:
        name = "Xaignabouri ";
        break;
        case 14:
        name = "川圹 ";
        break;
        case 17:
        name = "琅勃拉邦 ";
        break;
      }
    }
    if (country_code.equals("LB") == true) {
      switch (region_code2) {
        case 1:
        name = "贝卡 ";
        break;
        case 2:
        name = "铝南达尔 ";
        break;
        case 3:
        name = "黎巴嫩 - 北 ";
        break;
        case 4:
        name = "BEYROUTH ";
        break;
        case 5:
        name = "黎巴嫩山 ";
        break;
        case 6:
        name = "黎巴嫩-SUD ";
        break;
        case 7:
        name = "纳巴提耶 ";
        break;
        case 8:
        name = "贝卡 ";
        break;
        case 9:
        name = "黎巴嫩 - 北 ";
        break;
        case 10:
        name = "AAKK ";
        break;
        case 11:
        name = "巴勒贝克赫迈勒的 ";
        break;
      }
    }
    if (country_code.equals("LC") == true) {
      switch (region_code2) {
        case 1:
        name = "安斯-LA-RAYE ";
        break;
        case 2:
        name = "多芬 ";
        break;
        case 3:
        name = "卡斯特里 ";
        break;
        case 4:
        name = "舒瓦瑟尔 ";
        break;
        case 5:
        name = "登尼赖 ";
        break;
        case 6:
        name = "格罗斯胰岛 ";
        break;
        case 7:
        name = "拉博 ";
        break;
        case 8:
        name = "米库 ";
        break;
        case 9:
        name = "苏弗里耶尔 ";
        break;
        case 10:
        name = "旧堡 ";
        break;
        case 11:
        name = "普拉兰 ";
        break;
      }
    }
    if (country_code.equals("LI") == true) {
      switch (region_code2) {
        case 1:
        name = "查斯 ";
        break;
        case 2:
        name = "埃申 ";
        break;
        case 3:
        name = "甘普林 ";
        break;
        case 4:
        name = "玛伦 ";
        break;
        case 5:
        name = "伯朗肯 ";
        break;
        case 6:
        name = "旅游Ruggell ";
        break;
        case 7:
        name = "沙恩 ";
        break;
        case 8:
        name = "施伦贝格 ";
        break;
        case 9:
        name = "特里森 ";
        break;
        case 10:
        name = "特里森贝格 ";
        break;
        case 11:
        name = "瓦杜兹 ";
        break;
        case 21:
        name = "巴波卢 ";
        break;
        case 22:
        name = "吉河 ";
        break;
      }
    }
    if (country_code.equals("LK") == true) {
      switch (region_code2) {
        case 1:
        name = "Amparai ";
        break;
        case 2:
        name = "阿努拉德普勒 ";
        break;
        case 3:
        name = "巴杜拉 ";
        break;
        case 4:
        name = "拜蒂克洛 ";
        break;
        case 6:
        name = "加勒 ";
        break;
        case 7:
        name = "汉班托塔 ";
        break;
        case 9:
        name = "卡卢特勒 ";
        break;
        case 10:
        name = "康提 ";
        break;
        case 11:
        name = "克盖拉 ";
        break;
        case 12:
        name = "库鲁内格勒 ";
        break;
        case 14:
        name = "马特莱 ";
        break;
        case 15:
        name = "马特勒 ";
        break;
        case 16:
        name = "Moneragala ";
        break;
        case 17:
        name = "努沃勒埃利耶 ";
        break;
        case 18:
        name = "波隆纳鲁沃 ";
        break;
        case 19:
        name = "普塔勒姆 ";
        break;
        case 20:
        name = "拉特纳普勒 ";
        break;
        case 21:
        name = "亭可马里 ";
        break;
        case 23:
        name = "科伦坡 ";
        break;
        case 24:
        name = "加姆珀哈 ";
        break;
        case 25:
        name = "贾夫纳 ";
        break;
        case 26:
        name = "马纳尔 ";
        break;
        case 27:
        name = "穆莱蒂武 ";
        break;
        case 28:
        name = "瓦武尼亚 ";
        break;
        case 29:
        name = "中央 ";
        break;
        case 30:
        name = "北环 ";
        break;
        case 31:
        name = "北方 ";
        break;
        case 32:
        name = "北西方 ";
        break;
        case 33:
        name = "萨巴拉加穆瓦 ";
        break;
        case 34:
        name = "南部的 ";
        break;
        case 35:
        name = "乌瓦 ";
        break;
        case 36:
        name = "西 ";
        break;
      }
    }
    if (country_code.equals("LR") == true) {
      switch (region_code2) {
        case 1:
        name = "奉 ";
        break;
        case 4:
        name = "大角山 ";
        break;
        case 5:
        name = "洛法 ";
        break;
        case 6:
        name = "马里兰 ";
        break;
        case 7:
        name = "蒙罗维亚 ";
        break;
        case 9:
        name = "宁巴 ";
        break;
        case 10:
        name = "中 ";
        break;
        case 11:
        name = "大巴萨 ";
        break;
        case 12:
        name = "大角山 ";
        break;
        case 13:
        name = "马里兰 ";
        break;
        case 14:
        name = "蒙特塞拉特 ";
        break;
        case 17:
        name = "马吉 ";
        break;
        case 18:
        name = "里弗塞斯 ";
        break;
        case 19:
        name = "大吉德 ";
        break;
        case 20:
        name = "洛法 ";
        break;
        case 21:
        name = "巴波卢 ";
        break;
        case 22:
        name = "吉河 ";
        break;
      }
    }
    if (country_code.equals("LS") == true) {
      switch (region_code2) {
        case 10:
        name = "伯里亚 ";
        break;
        case 11:
        name = "布塔布泰 ";
        break;
        case 12:
        name = "莱里贝 ";
        break;
        case 13:
        name = "马费滕 ";
        break;
        case 14:
        name = "马塞卢 ";
        break;
        case 15:
        name = "莫哈莱斯胡克 ";
        break;
        case 16:
        name = "莫霍特隆 ";
        break;
        case 17:
        name = "Qachas NEK ";
        break;
        case 18:
        name = "古廷 ";
        break;
        case 19:
        name = "塔巴 - 采卡 ";
        break;
      }
    }
    if (country_code.equals("LT") == true) {
      switch (region_code2) {
        case 56:
        name = "阿利图斯Apskritis ";
        break;
        case 57:
        name = "考纳斯Apskritis ";
        break;
        case 58:
        name = "Klaipedos Apskritis ";
        break;
        case 59:
        name = "Marijampoles Apskritis ";
        break;
        case 60:
        name = "帕涅韦日斯Apskritis ";
        break;
        case 61:
        name = "啸琉Apskritis ";
        break;
        case 62:
        name = "陶拉盖Apskritis ";
        break;
        case 63:
        name = "泰尔希艾县Apskritis ";
        break;
        case 64:
        name = "乌特诺Apskritis ";
        break;
        case 65:
        name = "维尔纽斯Apskritis ";
        break;
      }
    }
    if (country_code.equals("LU") == true) {
      switch (region_code2) {
        case 1:
        name = "迪基希 ";
        break;
        case 2:
        name = "格雷文马赫 ";
        break;
        case 3:
        name = "卢森堡 ";
        break;
      }
    }
    if (country_code.equals("LV") == true) {
      switch (region_code2) {
        case 1:
        name = "Aizkraukles ";
        break;
        case 2:
        name = "阿卢克斯内 ";
        break;
        case 3:
        name = "巴尔维 ";
        break;
        case 4:
        name = "包乌斯卡 ";
        break;
        case 5:
        name = "CESU ";
        break;
        case 6:
        name = "陶格夫匹尔斯 ";
        break;
        case 7:
        name = "陶格夫匹尔斯 ";
        break;
        case 8:
        name = "多贝莱 ";
        break;
        case 9:
        name = "古尔贝 ";
        break;
        case 10:
        name = "杰卡布皮尔斯 ";
        break;
        case 11:
        name = "叶尔加瓦 ";
        break;
        case 12:
        name = "叶尔加瓦 ";
        break;
        case 13:
        name = "尤尔马拉 ";
        break;
        case 14:
        name = "克拉斯拉瓦 ";
        break;
        case 15:
        name = "库尔迪加 ";
        break;
        case 16:
        name = "利耶帕亚 ";
        break;
        case 17:
        name = "利帕亚斯 ";
        break;
        case 18:
        name = "林巴济 ";
        break;
        case 19:
        name = "卢扎 ";
        break;
        case 20:
        name = "马多纳 ";
        break;
        case 21:
        name = "食人魔 ";
        break;
        case 22:
        name = "Preilu ";
        break;
        case 23:
        name = "雷泽克 ";
        break;
        case 24:
        name = "雷泽克内 ";
        break;
        case 25:
        name = "里加 ";
        break;
        case 26:
        name = "里加斯 ";
        break;
        case 27:
        name = "萨尔杜斯 ";
        break;
        case 28:
        name = "塔尔西 ";
        break;
        case 29:
        name = "图库马 ";
        break;
        case 30:
        name = "瓦尔加 ";
        break;
        case 31:
        name = "Valmieras ";
        break;
        case 32:
        name = "文茨皮尔斯 ";
        break;
        case 33:
        name = "文茨皮尔斯 ";
        break;
      }
    }
    if (country_code.equals("LY") == true) {
      switch (region_code2) {
        case 3:
        name = "阿齐济耶 ";
        break;
        case 5:
        name = "胡夫拉 ";
        break;
        case 8:
        name = "库夫拉 ";
        break;
        case 13:
        name = "沙提 ";
        break;
        case 30:
        name = "穆尔祖格 ";
        break;
        case 34:
        name = "塞卜哈 ";
        break;
        case 41:
        name = "泰尔胡奈 ";
        break;
        case 42:
        name = "Tubruq ";
        break;
        case 45:
        name = "Zlitan ";
        break;
        case 47:
        name = "艾季达比亚 ";
        break;
        case 48:
        name = "铝法提赫 ";
        break;
        case 49:
        name = "绿山 ";
        break;
        case 50:
        name = "胡姆斯 ";
        break;
        case 51:
        name = "一个人Nuqat印日玛线 ";
        break;
        case 52:
        name = "奥巴里 ";
        break;
        case 53:
        name = "扎维耶 ";
        break;
        case 54:
        name = "班加西 ";
        break;
        case 55:
        name = "德尔纳 ";
        break;
        case 56:
        name = "古达米斯 ";
        break;
        case 57:
        name = "盖尔扬 ";
        break;
        case 58:
        name = "米苏拉塔 ";
        break;
        case 59:
        name = "Sawfajjin ";
        break;
        case 60:
        name = "苏尔特 ";
        break;
        case 61:
        name = "Tarabulus ";
        break;
        case 62:
        name = "耶夫兰 ";
        break;
      }
    }
    if (country_code.equals("MA") == true) {
      switch (region_code2) {
        case 1:
        name = "阿加迪尔 ";
        break;
        case 2:
        name = "胡塞马 ";
        break;
        case 3:
        name = "拉勒 ";
        break;
        case 4:
        name = "本苏莱曼 ";
        break;
        case 5:
        name = "贝尼迈拉勒 ";
        break;
        case 6:
        name = "布勒曼 ";
        break;
        case 7:
        name = "卡萨布兰卡 ";
        break;
        case 8:
        name = "沙万 ";
        break;
        case 9:
        name = "杰迪代 ";
        break;
        case 10:
        name = "克拉德斯斯Srarhna ";
        break;
        case 11:
        name = "拉希迪耶 ";
        break;
        case 12:
        name = "索维拉 ";
        break;
        case 13:
        name = "非斯 ";
        break;
        case 14:
        name = "菲吉格 ";
        break;
        case 15:
        name = "盖尼特拉 ";
        break;
        case 16:
        name = "海米萨特 ";
        break;
        case 17:
        name = "海尼夫拉 ";
        break;
        case 18:
        name = "胡里卜盖 ";
        break;
        case 19:
        name = "马拉喀什 ";
        break;
        case 20:
        name = "梅克内斯 ";
        break;
        case 21:
        name = "纳多尔 ";
        break;
        case 22:
        name = "瓦尔扎扎特 ";
        break;
        case 23:
        name = "乌季达 ";
        break;
        case 24:
        name = "拉巴特 - 销售 ";
        break;
        case 25:
        name = "萨菲 ";
        break;
        case 26:
        name = "塞塔特 ";
        break;
        case 27:
        name = "丹吉尔 ";
        break;
        case 29:
        name = "塔塔 ";
        break;
        case 30:
        name = "塔扎 ";
        break;
        case 32:
        name = "提兹尼特 ";
        break;
        case 33:
        name = "盖勒敏 ";
        break;
        case 34:
        name = "伊夫兰 ";
        break;
        case 35:
        name = "阿尤恩 ";
        break;
        case 36:
        name = "坦坦 ";
        break;
        case 37:
        name = "陶纳特 ";
        break;
        case 38:
        name = "西迪卡塞姆 ";
        break;
        case 39:
        name = "塔鲁丹特 ";
        break;
        case 40:
        name = "得土安 ";
        break;
        case 41:
        name = "拉腊 ";
        break;
        case 45:
        name = "大卡萨布兰卡大区 ";
        break;
        case 46:
        name = "菲斯 ";
        break;
        case 47:
        name = "马拉喀什 - 豪兹 ";
        break;
        case 48:
        name = "梅克内斯 - 塔菲拉勒特大 ";
        break;
        case 49:
        name = "拉巴特 - 销售 - 宰穆尔 - 扎埃尔大区 ";
        break;
        case 50:
        name = "沙维雅 - 瓦拉迪格大区 ";
        break;
        case 51:
        name = "杜卡拉 - 阿卜达 ";
        break;
        case 52:
        name = "西部 - 舍拉拉德贝尼贝尼赫森大区 ";
        break;
        case 53:
        name = "盖勒敏-ES斯马拉 ";
        break;
        case 54:
        name = "东方的 ";
        break;
        case 55:
        name = "苏斯 - 马塞 - 博士 ";
        break;
        case 56:
        name = "塔德莱拉勒 ";
        break;
        case 57:
        name = "丹吉尔得土安 ";
        break;
        case 58:
        name = "塔扎 - 胡塞马 - 陶纳特 ";
        break;
        case 59:
        name = "啦 ";
        break;
      }
    }
    if (country_code.equals("MC") == true) {
      switch (region_code2) {
        case 1:
        name = "康达敏 ";
        break;
        case 2:
        name = "摩纳哥 ";
        break;
        case 3:
        name = "蒙特卡洛 ";
        break;
      }
    }
    if (country_code.equals("MD") == true) {
      switch (region_code2) {
        case 46:
        name = "巴蒂 ";
        break;
        case 47:
        name = "卡古尔 ";
        break;
        case 48:
        name = "基希讷乌 ";
        break;
        case 49:
        name = "Stinga Nistrului ";
        break;
        case 50:
        name = "埃迪内茨 ";
        break;
        case 51:
        name = "加告兹 ";
        break;
        case 52:
        name = "拉普斯纳 ";
        break;
        case 53:
        name = "奥尔海伊 ";
        break;
        case 54:
        name = "索罗卡 ";
        break;
        case 55:
        name = "蒂吉娜 ";
        break;
        case 56:
        name = "温格内 ";
        break;
        case 58:
        name = "Stinga Nistrului ";
        break;
        case 59:
        name = "Anenii NOI ";
        break;
        case 60:
        name = "巴蒂 ";
        break;
        case 61:
        name = "Basarabeasca ";
        break;
        case 62:
        name = "德尔 ";
        break;
        case 63:
        name = "Briceni ";
        break;
        case 64:
        name = "卡古尔 ";
        break;
        case 65:
        name = "坎泰米尔 ";
        break;
        case 66:
        name = "克勒拉希 ";
        break;
        case 67:
        name = "Causeni ";
        break;
        case 68:
        name = "Cimislia ";
        break;
        case 69:
        name = "Criuleni ";
        break;
        case 70:
        name = "Donduseni ";
        break;
        case 71:
        name = "德罗基亚 ";
        break;
        case 72:
        name = "杜伯萨里 ";
        break;
        case 73:
        name = "埃迪内茨 ";
        break;
        case 74:
        name = "Falesti ";
        break;
        case 75:
        name = "弗洛雷什蒂 ";
        break;
        case 76:
        name = "Glodeni ";
        break;
        case 77:
        name = "都是百翠庄园 ";
        break;
        case 78:
        name = "Ialoveni ";
        break;
        case 79:
        name = "Leova ";
        break;
        case 80:
        name = "Nisporeni ";
        break;
        case 81:
        name = "Ocnita ";
        break;
        case 83:
        name = "Rezina ";
        break;
        case 84:
        name = "Riscani ";
        break;
        case 85:
        name = "Singerei ";
        break;
        case 86:
        name = "Soldanesti ";
        break;
        case 87:
        name = "索罗卡 ";
        break;
        case 88:
        name = "斯特凡 - 沃达 ";
        break;
        case 89:
        name = "Straseni ";
        break;
        case 90:
        name = "塔拉克利亚 ";
        break;
        case 91:
        name = "Telenesti ";
        break;
        case 92:
        name = "温格内 ";
        break;
      }
    }
    if (country_code.equals("MG") == true) {
      switch (region_code2) {
        case 1:
        name = "安齐拉纳纳 ";
        break;
        case 2:
        name = "菲亚纳兰楚阿 ";
        break;
        case 3:
        name = "马哈赞加 ";
        break;
        case 4:
        name = "图阿马西纳 ";
        break;
        case 5:
        name = "塔那那利佛 ";
        break;
        case 6:
        name = "图利亚拉 ";
        break;
      }
    }
    if (country_code.equals("MK") == true) {
      switch (region_code2) {
        case 1:
        name = "阿拉津诺沃 ";
        break;
        case 2:
        name = "薄 ";
        break;
        case 3:
        name = "Belcista ";
        break;
        case 4:
        name = "贝罗沃 ";
        break;
        case 5:
        name = "比斯特里察 ";
        break;
        case 6:
        name = "比托拉 ";
        break;
        case 7:
        name = "布拉泰茨 ";
        break;
        case 8:
        name = "博丹奇 ";
        break;
        case 9:
        name = "Bogomila ";
        break;
        case 10:
        name = "博戈维尼耶 ";
        break;
        case 11:
        name = "博西洛沃 ";
        break;
        case 12:
        name = "布尔文尼卡 ";
        break;
        case 13:
        name = "CAIR ";
        break;
        case 14:
        name = "Capari ";
        break;
        case 15:
        name = "卡仕达 ";
        break;
        case 16:
        name = "Cegrane ";
        break;
        case 17:
        name = "CENTAR ";
        break;
        case 18:
        name = "辛塔尔祖帕 ";
        break;
        case 19:
        name = "塞辛诺沃 ";
        break;
        case 20:
        name = "Cucer Sandevo ";
        break;
        case 21:
        name = "取消比赛资格 ";
        break;
        case 22:
        name = "德尔塞沃 ";
        break;
        case 23:
        name = "Delogozdi ";
        break;
        case 24:
        name = "德米尔希萨尔 ";
        break;
        case 25:
        name = "德米尔卡皮雅 ";
        break;
        case 26:
        name = "Dobrusevo ";
        break;
        case 27:
        name = "下，下Banjica ";
        break;
        case 28:
        name = "多尔涅尼 ";
        break;
        case 29:
        name = "彼得罗夫Dorce ";
        break;
        case 30:
        name = "德鲁戈沃 ";
        break;
        case 31:
        name = "Dzepciste ";
        break;
        case 32:
        name = "嘎子巴巴 ";
        break;
        case 33:
        name = "杰夫格里雅 ";
        break;
        case 34:
        name = "戈斯蒂瓦尔 ";
        break;
        case 35:
        name = "格拉兹科 ";
        break;
        case 36:
        name = "伊林登 ";
        break;
        case 37:
        name = "泉镇 ";
        break;
        case 38:
        name = "耶古诺维切 ";
        break;
        case 39:
        name = "Kamenjane ";
        break;
        case 40:
        name = "卡尔宾奇 ";
        break;
        case 41:
        name = "卡尔波什 ";
        break;
        case 42:
        name = "卡瓦达尔齐 ";
        break;
        case 43:
        name = "基切沃 ";
        break;
        case 44:
        name = "沃达 ";
        break;
        case 45:
        name = "Klecevce ";
        break;
        case 46:
        name = "科查尼 ";
        break;
        case 47:
        name = "孔塞 ";
        break;
        case 48:
        name = "Kondovo ";
        break;
        case 49:
        name = "科诺皮什切 ";
        break;
        case 50:
        name = "Kosel的 ";
        break;
        case 51:
        name = "克拉托沃 ";
        break;
        case 52:
        name = "克里瓦帕兰卡 ";
        break;
        case 53:
        name = "克里沃加斯塔尼 ";
        break;
        case 54:
        name = "克鲁舍沃 ";
        break;
        case 55:
        name = "Kuklis ";
        break;
        case 56:
        name = "Kukurecani ";
        break;
        case 57:
        name = "库马诺沃 ";
        break;
        case 58:
        name = "Labunista ";
        break;
        case 59:
        name = "里普科沃 ";
        break;
        case 60:
        name = "洛佐沃 ";
        break;
        case 61:
        name = "Lukovo ";
        break;
        case 62:
        name = "马其顿卡梅尼察 ";
        break;
        case 63:
        name = "布罗德 ";
        break;
        case 64:
        name = "Mavrovi Anovi ";
        break;
        case 65:
        name = "Meseista ";
        break;
        case 66:
        name = "Miravci ";
        break;
        case 67:
        name = "莫吉拉 ";
        break;
        case 68:
        name = "Murtino ";
        break;
        case 69:
        name = "内戈蒂诺 ";
        break;
        case 70:
        name = "内戈蒂诺Polosko ";
        break;
        case 71:
        name = "Novaci ";
        break;
        case 72:
        name = "诺沃塞洛 ";
        break;
        case 73:
        name = "奥布勒塞沃 ";
        break;
        case 74:
        name = "奥赫里德 ";
        break;
        case 75:
        name = "Orasac（克罗地亚） ";
        break;
        case 76:
        name = "Orizari ";
        break;
        case 77:
        name = "奥斯洛梅 ";
        break;
        case 78:
        name = "佩赫塞沃 ";
        break;
        case 79:
        name = "气象站 ";
        break;
        case 80:
        name = "普拉什尼查 ";
        break;
        case 81:
        name = "Podares ";
        break;
        case 82:
        name = "普里莱普 ";
        break;
        case 83:
        name = "普罗比什提普 ";
        break;
        case 84:
        name = "拉多维什 ";
        break;
        case 85:
        name = "兰科夫塞 ";
        break;
        case 86:
        name = "里森 ";
        break;
        case 87:
        name = "罗索曼 ";
        break;
        case 88:
        name = "Rostusa ";
        break;
        case 89:
        name = "萨莫科夫 ";
        break;
        case 90:
        name = "萨拉伊 ";
        break;
        case 91:
        name = "Sipkovica ";
        break;
        case 92:
        name = "苏皮什特 ";
        break;
        case 93:
        name = "Sopotnica ";
        break;
        case 94:
        name = "Srbinovo ";
        break;
        case 95:
        name = "Staravina ";
        break;
        case 96:
        name = "星多伊兰 ";
        break;
        case 97:
        name = "纳戈里查 ";
        break;
        case 98:
        name = "什蒂普 ";
        break;
        case 99:
        name = "斯特鲁加 ";
        break;
        case 832:
        name = "斯特鲁米察 ";
        break;
        case 833:
        name = "斯图登尼 ";
        break;
        case 834:
        name = "奥里扎里 ";
        break;
        case 835:
        name = "尼科列 ";
        break;
        case 836:
        name = "特阿尔塞 ";
        break;
        case 837:
        name = "泰托沃 ";
        break;
        case 838:
        name = "Topolcani ";
        break;
        case 839:
        name = "瓦兰多沃 ";
        break;
        case 840:
        name = "瓦西列沃 ";
        break;
        case 875:
        name = "韦莱斯 ";
        break;
        case 876:
        name = "Velesta ";
        break;
        case 877:
        name = "维夫查尼 ";
        break;
        case 878:
        name = "维尼卡 ";
        break;
        case 879:
        name = "Vitoliste ";
        break;
        case 880:
        name = "弗兰尼斯提卡 ";
        break;
        case 881:
        name = "Vrapciste ";
        break;
        case 882:
        name = "Vratnica ";
        break;
        case 883:
        name = "Vrutok ";
        break;
        case 918:
        name = "扎雅斯 ";
        break;
        case 919:
        name = "泽伦尼科沃 ";
        break;
        case 920:
        name = "泽林诺 ";
        break;
        case 921:
        name = "Zitose ";
        break;
        case 922:
        name = "Zletovo ";
        break;
        case 923:
        name = "日尔诺维奇 ";
        break;
      }
    }
    if (country_code.equals("ML") == true) {
      switch (region_code2) {
        case 1:
        name = "巴马科 ";
        break;
        case 3:
        name = "卡耶大 ";
        break;
        case 4:
        name = "莫普提 ";
        break;
        case 5:
        name = "塞古 ";
        break;
        case 6:
        name = "锡卡索 ";
        break;
        case 7:
        name = "库里科罗 ";
        break;
        case 8:
        name = "通布图 ";
        break;
        case 9:
        name = "高 ";
        break;
        case 10:
        name = "基达尔 ";
        break;
      }
    }
    if (country_code.equals("MM") == true) {
      switch (region_code2) {
        case 1:
        name = "若开邦 ";
        break;
        case 2:
        name = "钦邦 ";
        break;
        case 3:
        name = "伊洛瓦底江 ";
        break;
        case 4:
        name = "克钦邦 ";
        break;
        case 5:
        name = "卡兰州 ";
        break;
        case 6:
        name = "克耶邦 ";
        break;
        case 7:
        name = "马圭 ";
        break;
        case 8:
        name = "曼德勒 ";
        break;
        case 9:
        name = "勃固 ";
        break;
        case 10:
        name = "实皆 ";
        break;
        case 11:
        name = "掸邦 ";
        break;
        case 12:
        name = "德林达依 ";
        break;
        case 13:
        name = "孟邦 ";
        break;
        case 14:
        name = "仰光 ";
        break;
        case 17:
        name = "仰光 ";
        break;
      }
    }
    if (country_code.equals("MN") == true) {
      switch (region_code2) {
        case 1:
        name = "杭爱 ";
        break;
        case 2:
        name = "巴彦洪戈尔 ";
        break;
        case 3:
        name = "巴彦乌勒盖 ";
        break;
        case 5:
        name = "达尔罕茂 ";
        break;
        case 6:
        name = "东方省 ";
        break;
        case 7:
        name = "东戈壁 ";
        break;
        case 8:
        name = "戈壁 ";
        break;
        case 9:
        name = "扎布汗 ";
        break;
        case 10:
        name = "戈壁阿尔泰 ";
        break;
        case 11:
        name = "Hentiy ";
        break;
        case 12:
        name = "科布多 ";
        break;
        case 13:
        name = "库苏古尔 ";
        break;
        case 14:
        name = "南戈壁 ";
        break;
        case 15:
        name = "前杭爱 ";
        break;
        case 16:
        name = "色楞格 ";
        break;
        case 17:
        name = "苏赫巴托尔 ";
        break;
        case 18:
        name = "TOV ";
        break;
        case 19:
        name = "乌布苏 ";
        break;
        case 20:
        name = "乌兰巴托 ";
        break;
        case 21:
        name = "布尔干 ";
        break;
        case 22:
        name = "额尔登特 ";
        break;
        case 23:
        name = "达尔汗乌勒 ";
        break;
        case 24:
        name = "Govisumber ";
        break;
        case 25:
        name = "鄂尔浑 ";
        break;
      }
    }
    if (country_code.equals("MO") == true) {
      switch (region_code2) {
        case 1:
        name = "Ilhas ";
        break;
        case 2:
        name = "澳门 ";
        break;
      }
    }
    if (country_code.equals("MR") == true) {
      switch (region_code2) {
        case 1:
        name = "西胡德 ";
        break;
        case 2:
        name = "东胡德 ";
        break;
        case 3:
        name = "阿萨巴 ";
        break;
        case 4:
        name = "戈尔戈勒 ";
        break;
        case 5:
        name = "卜拉克纳 ";
        break;
        case 6:
        name = "特拉扎 ";
        break;
        case 7:
        name = "阿德拉尔 ";
        break;
        case 8:
        name = "努瓦迪布 ";
        break;
        case 9:
        name = "塔甘特区 ";
        break;
        case 10:
        name = "吉迪马卡 ";
        break;
        case 11:
        name = "提里斯宰 ";
        break;
        case 12:
        name = "因希里 ";
        break;
      }
    }
    if (country_code.equals("MS") == true) {
      switch (region_code2) {
        case 1:
        name = "圣安东尼 ";
        break;
        case 2:
        name = "圣乔治 ";
        break;
        case 3:
        name = "圣彼得 ";
        break;
      }
    }
    if (country_code.equals("MU") == true) {
      switch (region_code2) {
        case 12:
        name = "黑河 ";
        break;
        case 13:
        name = "弗拉克 ";
        break;
        case 14:
        name = "大港 ";
        break;
        case 15:
        name = "摩卡 ";
        break;
        case 16:
        name = "庞普勒穆斯 ";
        break;
        case 17:
        name = "威廉平原 ";
        break;
        case 18:
        name = "路易港 ";
        break;
        case 19:
        name = "里维耶尔 - 迪朗帕 ";
        break;
        case 20:
        name = "萨凡纳 ";
        break;
        case 21:
        name = "阿加莱加群岛 ";
        break;
        case 22:
        name = "卡加多斯卡拉若斯 ";
        break;
        case 23:
        name = "罗德里格斯 ";
        break;
      }
    }
    if (country_code.equals("MV") == true) {
      switch (region_code2) {
        case 1:
        name = "西努 ";
        break;
        case 2:
        name = "Aliff ";
        break;
        case 3:
        name = "Laviyani ";
        break;
        case 4:
        name = "Waavu ";
        break;
        case 5:
        name = "拉姆 ";
        break;
        case 7:
        name = "蒂拉杜马蒂 ";
        break;
        case 8:
        name = "THAA ";
        break;
        case 12:
        name = "美慕 ";
        break;
        case 13:
        name = "拉加 ";
        break;
        case 14:
        name = "法弗 ";
        break;
        case 17:
        name = "Daalu ";
        break;
        case 20:
        name = "巴阿 ";
        break;
        case 23:
        name = "哈阿Daalu的 ";
        break;
        case 24:
        name = "沙维亚尼 ";
        break;
        case 25:
        name = "诺鲁 ";
        break;
        case 26:
        name = "卡夫 ";
        break;
        case 27:
        name = "加福Aliff的 ";
        break;
        case 28:
        name = "加福Daalu的 ";
        break;
        case 29:
        name = "Naviyani ";
        break;
        case 40:
        name = "男性 ";
        break;
      }
    }
    if (country_code.equals("MW") == true) {
      switch (region_code2) {
        case 2:
        name = "奇克瓦瓦 ";
        break;
        case 3:
        name = "奇拉祖鲁 ";
        break;
        case 4:
        name = "奇蒂帕 ";
        break;
        case 5:
        name = "乔洛 ";
        break;
        case 6:
        name = "代扎 ";
        break;
        case 7:
        name = "同和 ";
        break;
        case 8:
        name = "卡隆加 ";
        break;
        case 9:
        name = "卡松古 ";
        break;
        case 11:
        name = "利隆圭 ";
        break;
        case 12:
        name = "曼戈切 ";
        break;
        case 13:
        name = "姆钦吉 ";
        break;
        case 15:
        name = "姆津巴 ";
        break;
        case 16:
        name = "恩彻乌 ";
        break;
        case 17:
        name = "恩卡塔湾 ";
        break;
        case 18:
        name = "恩科塔科塔 ";
        break;
        case 19:
        name = "恩桑杰 ";
        break;
        case 20:
        name = "恩奇斯 ";
        break;
        case 21:
        name = "Rumphi ";
        break;
        case 22:
        name = "萨利马 ";
        break;
        case 23:
        name = "松巴 ";
        break;
        case 24:
        name = "布兰太尔 ";
        break;
        case 25:
        name = "姆万扎 ";
        break;
        case 26:
        name = "巴拉卡 ";
        break;
        case 27:
        name = "利科马 ";
        break;
        case 28:
        name = "马钦加 ";
        break;
        case 29:
        name = "姆兰杰 ";
        break;
        case 30:
        name = "法隆贝 ";
        break;
      }
    }
    if (country_code.equals("MX") == true) {
      switch (region_code2) {
        case 1:
        name = "阿瓜斯卡连特斯 ";
        break;
        case 2:
        name = "下加利福尼亚州 ";
        break;
        case 3:
        name = "南下加利福尼亚州 ";
        break;
        case 4:
        name = "坎佩切 ";
        break;
        case 5:
        name = "恰帕斯州 ";
        break;
        case 6:
        name = "奇瓦瓦 ";
        break;
        case 7:
        name = "科阿韦拉州去萨拉戈萨 ";
        break;
        case 8:
        name = "科利马 ";
        break;
        case 9:
        name = "联邦首都区 ";
        break;
        case 10:
        name = "杜兰戈 ";
        break;
        case 11:
        name = "瓜纳华托 ";
        break;
        case 12:
        name = "格雷罗 ";
        break;
        case 13:
        name = "伊达尔戈 ";
        break;
        case 14:
        name = "哈利斯科州 ";
        break;
        case 15:
        name = "墨西哥 ";
        break;
        case 16:
        name = "米却肯州的奥坎波 ";
        break;
        case 17:
        name = "莫雷洛斯 ";
        break;
        case 18:
        name = "纳亚里特 ";
        break;
        case 19:
        name = "新莱昂州 ";
        break;
        case 20:
        name = "瓦哈卡 ";
        break;
        case 21:
        name = "普埃布拉 ";
        break;
        case 22:
        name = "克雷塔罗的亚特嘉的 ";
        break;
        case 23:
        name = "金塔纳罗奥 ";
        break;
        case 24:
        name = "圣路易斯波托西 ";
        break;
        case 25:
        name = "锡那罗亚州 ";
        break;
        case 26:
        name = "索诺拉 ";
        break;
        case 27:
        name = "塔巴斯科 ";
        break;
        case 28:
        name = "塔毛利帕斯州 ";
        break;
        case 29:
        name = "特拉斯卡拉 ";
        break;
        case 30:
        name = "韦拉克鲁斯Llave ";
        break;
        case 31:
        name = "尤卡坦半岛 ";
        break;
        case 32:
        name = "萨卡特卡斯 ";
        break;
      }
    }
    if (country_code.equals("MY") == true) {
      switch (region_code2) {
        case 1:
        name = "柔佛 ";
        break;
        case 2:
        name = "吉打 ";
        break;
        case 3:
        name = "吉兰丹 ";
        break;
        case 4:
        name = "马六甲 ";
        break;
        case 5:
        name = "森美兰 ";
        break;
        case 6:
        name = "彭亨 ";
        break;
        case 7:
        name = "霹雳 ";
        break;
        case 8:
        name = "玻璃市 ";
        break;
        case 9:
        name = "槟城 ";
        break;
        case 11:
        name = "沙捞越 ";
        break;
        case 12:
        name = "雪兰莪 ";
        break;
        case 13:
        name = "登嘉楼 ";
        break;
        case 14:
        name = "吉隆坡 ";
        break;
        case 15:
        name = "纳闽 ";
        break;
        case 16:
        name = "沙巴 ";
        break;
        case 17:
        name = "普特拉贾亚 ";
        break;
      }
    }
    if (country_code.equals("MZ") == true) {
      switch (region_code2) {
        case 1:
        name = "德尔加杜角 ";
        break;
        case 2:
        name = "加沙 ";
        break;
        case 3:
        name = "伊尼扬巴内 ";
        break;
        case 4:
        name = "马普托 ";
        break;
        case 5:
        name = "索法拉 ";
        break;
        case 6:
        name = "楠普拉 ";
        break;
        case 7:
        name = "尼亚萨 ";
        break;
        case 8:
        name = "太特 ";
        break;
        case 9:
        name = "赞比西亚 ";
        break;
        case 10:
        name = "马尼卡 ";
        break;
        case 11:
        name = "马普托 ";
        break;
      }
    }
    if (country_code.equals("NA") == true) {
      switch (region_code2) {
        case 1:
        name = "Bethanien ";
        break;
        case 2:
        name = "卡普里维OOS ";
        break;
        case 3:
        name = "Boesmanland ";
        break;
        case 4:
        name = "戈巴比斯 ";
        break;
        case 5:
        name = "赫鲁特方丹 ";
        break;
        case 6:
        name = "卡奥科兰 ";
        break;
        case 7:
        name = "Karibib ";
        break;
        case 8:
        name = "基特曼斯胡 ";
        break;
        case 9:
        name = "吕德里茨 ";
        break;
        case 10:
        name = "Maltahohe ";
        break;
        case 11:
        name = "奥卡汉贾 ";
        break;
        case 12:
        name = "奥马鲁鲁 ";
        break;
        case 13:
        name = "Otjiwarongo的 ";
        break;
        case 14:
        name = "奥乔 ";
        break;
        case 15:
        name = "Owambo ";
        break;
        case 16:
        name = "里霍博斯 ";
        break;
        case 17:
        name = "斯瓦科普蒙 ";
        break;
        case 18:
        name = "楚梅布 ";
        break;
        case 20:
        name = "Karasburg ";
        break;
        case 21:
        name = "温得和克 ";
        break;
        case 22:
        name = "达马拉兰 ";
        break;
        case 23:
        name = "Hereroland OOS ";
        break;
        case 24:
        name = "Hereroland韦斯 ";
        break;
        case 25:
        name = "奥卡万戈 ";
        break;
        case 26:
        name = "马林塔尔 ";
        break;
        case 27:
        name = "纳马兰 ";
        break;
        case 28:
        name = "卡普里维 ";
        break;
        case 29:
        name = "埃龙戈 ";
        break;
        case 30:
        name = "哈达普 ";
        break;
        case 31:
        name = "卡拉斯 ";
        break;
        case 32:
        name = "库内 ";
        break;
        case 33:
        name = "奥汉圭纳 ";
        break;
        case 34:
        name = "奥卡万戈 ";
        break;
        case 35:
        name = "奥马赫科 ";
        break;
        case 36:
        name = "奥姆沙蒂 ";
        break;
        case 37:
        name = "奥沙纳 ";
        break;
        case 38:
        name = "奥希科托 ";
        break;
        case 39:
        name = "奥乔宗朱帕区 ";
        break;
      }
    }
    if (country_code.equals("NE") == true) {
      switch (region_code2) {
        case 1:
        name = "阿加德兹 ";
        break;
        case 2:
        name = "迪法 ";
        break;
        case 3:
        name = "多索 ";
        break;
        case 4:
        name = "马拉迪 ";
        break;
        case 5:
        name = "尼亚美 ";
        break;
        case 6:
        name = "塔瓦 ";
        break;
        case 7:
        name = "津德尔 ";
        break;
        case 8:
        name = "尼亚美 ";
        break;
      }
    }
    if (country_code.equals("NG") == true) {
      switch (region_code2) {
        case 5:
        name = "拉各斯 ";
        break;
        case 10:
        name = "里弗斯 ";
        break;
        case 11:
        name = "联邦首都区 ";
        break;
        case 12:
        name = "贡戈拉 ";
        break;
        case 16:
        name = "奥贡 ";
        break;
        case 17:
        name = "翁 ";
        break;
        case 18:
        name = "奥约 ";
        break;
        case 21:
        name = "阿夸伊博姆 ";
        break;
        case 22:
        name = "克罗斯河 ";
        break;
        case 23:
        name = "卡杜纳 ";
        break;
        case 24:
        name = "卡齐纳 ";
        break;
        case 25:
        name = "阿南布拉 ";
        break;
        case 26:
        name = "贝努埃 ";
        break;
        case 27:
        name = "博尔诺 ";
        break;
        case 28:
        name = "伊莫 ";
        break;
        case 29:
        name = "卡诺 ";
        break;
        case 30:
        name = "夸拉 ";
        break;
        case 31:
        name = "尼日尔 ";
        break;
        case 32:
        name = "奥约 ";
        break;
        case 35:
        name = "阿达马瓦 ";
        break;
        case 36:
        name = "三角洲 ";
        break;
        case 37:
        name = "江户 ";
        break;
        case 39:
        name = "吉加瓦 ";
        break;
        case 40:
        name = "凯比 ";
        break;
        case 41:
        name = "科吉 ";
        break;
        case 42:
        name = "奥逊 ";
        break;
        case 43:
        name = "塔拉巴 ";
        break;
        case 44:
        name = "约贝 ";
        break;
        case 45:
        name = "阿比亚 ";
        break;
        case 46:
        name = "博契 ";
        break;
        case 47:
        name = "埃努古 ";
        break;
        case 48:
        name = "翁 ";
        break;
        case 49:
        name = "高原 ";
        break;
        case 50:
        name = "里弗斯 ";
        break;
        case 51:
        name = "索科托 ";
        break;
        case 52:
        name = "巴耶尔萨 ";
        break;
        case 53:
        name = "埃邦伊 ";
        break;
        case 54:
        name = "埃基蒂 ";
        break;
        case 55:
        name = "贡贝 ";
        break;
        case 56:
        name = "纳萨拉瓦 ";
        break;
        case 57:
        name = "扎姆法拉 ";
        break;
      }
    }
    if (country_code.equals("NI") == true) {
      switch (region_code2) {
        case 1:
        name = "博阿科 ";
        break;
        case 2:
        name = "卡拉索 ";
        break;
        case 3:
        name = "奇南德加 ";
        break;
        case 4:
        name = "琼塔莱斯 ";
        break;
        case 5:
        name = "埃斯特利 ";
        break;
        case 6:
        name = "格拉纳达 ";
        break;
        case 7:
        name = "希诺特加 ";
        break;
        case 8:
        name = "莱昂 ";
        break;
        case 9:
        name = "马德里斯 ";
        break;
        case 10:
        name = "马那瓜 ";
        break;
        case 11:
        name = "马萨亚 ";
        break;
        case 12:
        name = "马塔加尔帕 ";
        break;
        case 13:
        name = "新塞哥维亚 ";
        break;
        case 14:
        name = "圣胡安 ";
        break;
        case 15:
        name = "里瓦斯 ";
        break;
        case 16:
        name = "塞拉亚 ";
        break;
        case 17:
        name = "北大西洋自治区自治 ";
        break;
        case 18:
        name = "南大西洋地区自治 ";
        break;
      }
    }
    if (country_code.equals("NL") == true) {
      switch (region_code2) {
        case 1:
        name = "德伦特 ";
        break;
        case 2:
        name = "弗里斯兰 ";
        break;
        case 3:
        name = "海尔德兰 ";
        break;
        case 4:
        name = "格罗宁根 ";
        break;
        case 5:
        name = "林堡省 ";
        break;
        case 6:
        name = "北布拉邦 ";
        break;
        case 7:
        name = "北荷兰省 ";
        break;
        case 8:
        name = "艾瑟尔 ";
        break;
        case 9:
        name = "乌得勒支 ";
        break;
        case 10:
        name = "泽兰 ";
        break;
        case 11:
        name = "南荷兰省 ";
        break;
        case 12:
        name = "的Dronten ";
        break;
        case 13:
        name = "Zuidelijke IJsselmeerpolders ";
        break;
        case 14:
        name = "莱利斯塔德 ";
        break;
        case 15:
        name = "艾瑟尔 ";
        break;
        case 16:
        name = "弗勒沃兰 ";
        break;
      }
    }
    if (country_code.equals("NO") == true) {
      switch (region_code2) {
        case 1:
        name = "阿克斯胡斯 ";
        break;
        case 2:
        name = "东阿格德尔 ";
        break;
        case 4:
        name = "布斯克吕 ";
        break;
        case 5:
        name = "芬马克 ";
        break;
        case 6:
        name = "海德马克 ";
        break;
        case 7:
        name = "霍达兰 ";
        break;
        case 8:
        name = "鲁姆斯达尔 ";
        break;
        case 9:
        name = "诺德兰 ";
        break;
        case 10:
        name = "北特伦德拉格 ";
        break;
        case 11:
        name = "奥普兰 ";
        break;
        case 12:
        name = "奥斯陆 ";
        break;
        case 13:
        name = "奥斯特福 ";
        break;
        case 14:
        name = "斯塔万格 ";
        break;
        case 15:
        name = "松恩 - 菲尤拉讷 ";
        break;
        case 16:
        name = "南特伦德拉格 ";
        break;
        case 17:
        name = "泰勒马克 ";
        break;
        case 18:
        name = "特罗姆斯 ";
        break;
        case 19:
        name = "西阿格德尔 ";
        break;
        case 20:
        name = "西福尔 ";
        break;
      }
    }
    if (country_code.equals("NP") == true) {
      switch (region_code2) {
        case 1:
        name = "巴格马蒂 ";
        break;
        case 2:
        name = "Bheri ";
        break;
        case 3:
        name = "道拉吉里 ";
        break;
        case 4:
        name = "甘达基 ";
        break;
        case 5:
        name = "贾纳克布尔 ";
        break;
        case 6:
        name = "卡纳利 ";
        break;
        case 7:
        name = "戈西 ";
        break;
        case 8:
        name = "蓝毗尼 ";
        break;
        case 9:
        name = "马哈卡里 ";
        break;
        case 10:
        name = "梅吉 ";
        break;
        case 11:
        name = "纳拉亚尼 ";
        break;
        case 12:
        name = "拉布蒂 ";
        break;
        case 13:
        name = "萨加玛塔 ";
        break;
        case 14:
        name = "塞提 ";
        break;
      }
    }
    if (country_code.equals("NR") == true) {
      switch (region_code2) {
        case 1:
        name = "艾沃 ";
        break;
        case 2:
        name = "阿纳巴尔 ";
        break;
        case 3:
        name = "安塞巴 ";
        break;
        case 4:
        name = "安巴尔 ";
        break;
        case 5:
        name = "文Baiti ";
        break;
        case 6:
        name = "京东方 ";
        break;
        case 7:
        name = "布亚达 ";
        break;
        case 8:
        name = "丹尼果莫杜 ";
        break;
        case 9:
        name = "埃瓦 ";
        break;
        case 10:
        name = "艾珠 ";
        break;
        case 11:
        name = "湄泞 ";
        break;
        case 12:
        name = "尼柏 ";
        break;
        case 13:
        name = "优雅布 ";
        break;
        case 14:
        name = "亚伦 ";
        break;
      }
    }
    if (country_code.equals("NZ") == true) {
      switch (region_code2) {
        case 10:
        name = "查塔姆群岛 ";
        break;
        case 1010:
        name = "奥克兰 ";
        break;
        case 1011:
        name = "丰盛湾 ";
        break;
        case 1012:
        name = "坎特伯雷 ";
        break;
        case 1047:
        name = "吉斯伯恩 ";
        break;
        case 1048:
        name = "霍克斯湾 ";
        break;
        case 1049:
        name = "马纳瓦图 - 旺加努伊 ";
        break;
        case 1050:
        name = "马尔堡 ";
        break;
        case 1051:
        name = "尼尔森 ";
        break;
        case 1052:
        name = "北国 ";
        break;
        case 1053:
        name = "奥塔哥 ";
        break;
        case 1054:
        name = "南国 ";
        break;
        case 1055:
        name = "塔拉纳基 ";
        break;
        case 1090:
        name = "怀卡托 ";
        break;
        case 1091:
        name = "惠灵顿 ";
        break;
        case 1092:
        name = "西海岸 ";
        break;
        case 85:
        name = "怀卡托 ";
        break;
      }
    }
    if (country_code.equals("OM") == true) {
      switch (region_code2) {
        case 1:
        name = "内地区 ";
        break;
        case 2:
        name = "巴提奈 ";
        break;
        case 3:
        name = "Al Wusta的 ";
        break;
        case 4:
        name = "东部省 ";
        break;
        case 5:
        name = "达希莱 ";
        break;
        case 6:
        name = "马斯喀特 ";
        break;
        case 7:
        name = "穆桑达姆 ";
        break;
        case 8:
        name = "Zufar ";
        break;
      }
    }
    if (country_code.equals("PA") == true) {
      switch (region_code2) {
        case 1:
        name = "博卡斯 - 德尔托罗 ";
        break;
        case 2:
        name = "奇里基 ";
        break;
        case 3:
        name = "科克莱 ";
        break;
        case 4:
        name = "冒号 ";
        break;
        case 5:
        name = "达里恩 ";
        break;
        case 6:
        name = "埃雷拉 ";
        break;
        case 7:
        name = "洛斯桑托斯 ";
        break;
        case 8:
        name = "巴拿马 ";
        break;
        case 9:
        name = "圣布拉斯 ";
        break;
        case 10:
        name = "贝拉瓜斯 ";
        break;
      }
    }
    if (country_code.equals("PE") == true) {
      switch (region_code2) {
        case 1:
        name = "亚马孙 ";
        break;
        case 2:
        name = "安卡什 ";
        break;
        case 3:
        name = "阿普里马克 ";
        break;
        case 4:
        name = "阿雷基帕 ";
        break;
        case 5:
        name = "阿亚库乔 ";
        break;
        case 6:
        name = "卡哈马卡 ";
        break;
        case 7:
        name = "卡亚俄 ";
        break;
        case 8:
        name = "库斯科 ";
        break;
        case 9:
        name = "利卡 ";
        break;
        case 10:
        name = "瓦努科 ";
        break;
        case 11:
        name = "伊卡 ";
        break;
        case 12:
        name = "胡宁 ";
        break;
        case 13:
        name = "拉利伯塔德 ";
        break;
        case 14:
        name = "兰巴耶克 ";
        break;
        case 15:
        name = "利马 ";
        break;
        case 16:
        name = "洛雷托 ";
        break;
        case 17:
        name = "马德雷德迪奥斯 ";
        break;
        case 18:
        name = "莫克瓜 ";
        break;
        case 19:
        name = "帕斯科 ";
        break;
        case 20:
        name = "皮乌拉 ";
        break;
        case 21:
        name = "普诺 ";
        break;
        case 22:
        name = "圣马丁 ";
        break;
        case 23:
        name = "塔克纳 ";
        break;
        case 24:
        name = "通贝斯 ";
        break;
        case 25:
        name = "乌卡亚利 ";
        break;
      }
    }
    if (country_code.equals("PG") == true) {
      switch (region_code2) {
        case 1:
        name = "中央 ";
        break;
        case 2:
        name = "海湾 ";
        break;
        case 3:
        name = "米尔恩湾 ";
        break;
        case 4:
        name = "北方 ";
        break;
        case 5:
        name = "南部高地 ";
        break;
        case 6:
        name = "西 ";
        break;
        case 7:
        name = "北所罗门 ";
        break;
        case 8:
        name = "钦布 ";
        break;
        case 9:
        name = "东高地 ";
        break;
        case 10:
        name = "东新不列颠 ";
        break;
        case 11:
        name = "东塞皮克 ";
        break;
        case 12:
        name = "马丹 ";
        break;
        case 13:
        name = "马努斯 ";
        break;
        case 14:
        name = "莫罗贝 ";
        break;
        case 15:
        name = "新爱尔兰 ";
        break;
        case 16:
        name = "西高地 ";
        break;
        case 17:
        name = "西新不列颠 ";
        break;
        case 18:
        name = "桑道恩 ";
        break;
        case 19:
        name = "恩加 ";
        break;
        case 20:
        name = "国家首都 ";
        break;
      }
    }
    if (country_code.equals("PH") == true) {
      switch (region_code2) {
        case 1:
        name = "阿布拉 ";
        break;
        case 2:
        name = "北阿古桑 ";
        break;
        case 3:
        name = "南阿古桑 ";
        break;
        case 4:
        name = "阿卡兰 ";
        break;
        case 5:
        name = "阿尔拜 ";
        break;
        case 6:
        name = "古董 ";
        break;
        case 7:
        name = "巴丹 ";
        break;
        case 8:
        name = "巴丹 ";
        break;
        case 9:
        name = "八打雁 ";
        break;
        case 10:
        name = "本格特 ";
        break;
        case 11:
        name = "波荷 ";
        break;
        case 12:
        name = "布基农 ";
        break;
        case 13:
        name = "布拉干 ";
        break;
        case 14:
        name = "卡加延 ";
        break;
        case 15:
        name = "北甘马粦 ";
        break;
        case 16:
        name = "卡马里内斯苏尔 ";
        break;
        case 17:
        name = "甘米银 ";
        break;
        case 18:
        name = "卡皮斯 ";
        break;
        case 19:
        name = "卡坦端内斯 ";
        break;
        case 20:
        name = "卡维特 ";
        break;
        case 21:
        name = "宿雾 ";
        break;
        case 22:
        name = "巴西兰岛 ";
        break;
        case 23:
        name = "东萨马 ";
        break;
        case 24:
        name = "达沃 ";
        break;
        case 25:
        name = "南达沃 ";
        break;
        case 26:
        name = "达沃东方 ";
        break;
        case 27:
        name = "伊富高 ";
        break;
        case 28:
        name = "北伊罗戈 ";
        break;
        case 29:
        name = "南伊罗戈 ";
        break;
        case 30:
        name = "伊洛伊洛 ";
        break;
        case 31:
        name = "伊莎贝拉 ";
        break;
        case 32:
        name = "卡林阿 - 阿巴尧 ";
        break;
        case 33:
        name = "拉古纳 ";
        break;
        case 34:
        name = "北拉瑙 ";
        break;
        case 35:
        name = "南拉瑙 ";
        break;
        case 36:
        name = "拉乌尼翁 ";
        break;
        case 37:
        name = "莱特 ";
        break;
        case 38:
        name = "马林杜克 ";
        break;
        case 39:
        name = "马斯巴特 ";
        break;
        case 40:
        name = "西民都洛 ";
        break;
        case 41:
        name = "东方民都洛岛 ";
        break;
        case 42:
        name = "西米萨米斯 ";
        break;
        case 43:
        name = "东米萨米斯 ";
        break;
        case 44:
        name = "山 ";
        break;
        case 45:
        name = "西内格罗斯 ";
        break;
        case 46:
        name = "东内格罗斯 ";
        break;
        case 47:
        name = "新怡诗夏 ";
        break;
        case 48:
        name = "新比斯开 ";
        break;
        case 49:
        name = "巴拉望岛 ";
        break;
        case 50:
        name = "邦板牙 ";
        break;
        case 51:
        name = "邦阿西 ";
        break;
        case 53:
        name = "黎刹 ";
        break;
        case 54:
        name = "朗布隆 ";
        break;
        case 55:
        name = "萨马 ";
        break;
        case 56:
        name = "马京达瑙省 ";
        break;
        case 57:
        name = "北哥打巴托省 ";
        break;
        case 58:
        name = "索索贡 ";
        break;
        case 59:
        name = "南莱特 ";
        break;
        case 60:
        name = "苏鲁 ";
        break;
        case 61:
        name = "北苏里高 ";
        break;
        case 62:
        name = "南苏里高 ";
        break;
        case 63:
        name = "塔拉克 ";
        break;
        case 64:
        name = "三描礼士 ";
        break;
        case 65:
        name = "北三宝颜 ";
        break;
        case 66:
        name = "三宝颜 ";
        break;
        case 67:
        name = "北萨马 ";
        break;
        case 68:
        name = "基里诺 ";
        break;
        case 69:
        name = "锡基霍尔 ";
        break;
        case 70:
        name = "南哥打巴托 ";
        break;
        case 71:
        name = "苏丹库达拉 ";
        break;
        case 72:
        name = "塔威塔威 ";
        break;
        case 832:
        name = "洛杉矶 ";
        break;
        case 833:
        name = "巴科洛德 ";
        break;
        case 834:
        name = "巴戈 ";
        break;
        case 835:
        name = "碧瑶 ";
        break;
        case 836:
        name = "白族 ";
        break;
        case 837:
        name = "巴西兰市 ";
        break;
        case 838:
        name = "八打雁市 ";
        break;
        case 839:
        name = "武端 ";
        break;
        case 840:
        name = "那端 ";
        break;
        case 875:
        name = "加的斯 ";
        break;
        case 876:
        name = "卡加延德奥罗 ";
        break;
        case 877:
        name = "甲描育 ";
        break;
        case 878:
        name = "卡洛奥坎 ";
        break;
        case 879:
        name = "坎拉翁 ";
        break;
        case 880:
        name = "甲米地市 ";
        break;
        case 881:
        name = "宿雾市 ";
        break;
        case 882:
        name = "哥打巴托 ";
        break;
        case 883:
        name = "拉牛 ";
        break;
        case 918:
        name = "达瑙 ";
        break;
        case 919:
        name = "Dapitan ";
        break;
        case 920:
        name = "达沃市 ";
        break;
        case 921:
        name = "波罗 ";
        break;
        case 922:
        name = "杜马格特 ";
        break;
        case 923:
        name = "桑托斯将军城 ";
        break;
        case 924:
        name = "Gingoog ";
        break;
        case 925:
        name = "伊利甘 ";
        break;
        case 926:
        name = "怡朗市 ";
        break;
        case 961:
        name = "伊里加 ";
        break;
        case 962:
        name = "拉卡洛塔 ";
        break;
        case 963:
        name = "拉瓦格 ";
        break;
        case 964:
        name = "拉普拉普 ";
        break;
        case 965:
        name = "黎牙实比 ";
        break;
        case 966:
        name = "利帕 ";
        break;
        case 967:
        name = "卢塞纳 ";
        break;
        case 968:
        name = "曼达韦 ";
        break;
        case 969:
        name = "马尼拉 ";
        break;
        case 1004:
        name = "Marawi ";
        break;
        case 1005:
        name = "娜迦 ";
        break;
        case 1006:
        name = "奥隆阿波 ";
        break;
        case 1007:
        name = "Ormoc的 ";
        break;
        case 1008:
        name = "Oroquieta的 ";
        break;
        case 1009:
        name = "奥萨米斯 ";
        break;
        case 1010:
        name = "帕加迪安 ";
        break;
        case 1011:
        name = "Palayan ";
        break;
        case 1012:
        name = "帕 ";
        break;
        case 1047:
        name = "普林塞萨港 ";
        break;
        case 1048:
        name = "奎松市 ";
        break;
        case 1049:
        name = "罗哈斯 ";
        break;
        case 1050:
        name = "圣卡洛斯 ";
        break;
        case 1051:
        name = "圣卡洛斯 ";
        break;
        case 1052:
        name = "圣何塞 ";
        break;
        case 1053:
        name = "圣巴勃罗 ";
        break;
        case 1054:
        name = "Silay ";
        break;
        case 1055:
        name = "苏里高 ";
        break;
        case 1090:
        name = "塔克洛班 ";
        break;
        case 1091:
        name = "大雅台 ";
        break;
        case 1092:
        name = "塔比拉兰 ";
        break;
        case 1093:
        name = "Tangub ";
        break;
        case 1094:
        name = "托莱多 ";
        break;
        case 1095:
        name = "Trece雷斯 ";
        break;
        case 1096:
        name = "三宝颜 ";
        break;
        case 1097:
        name = "极光 ";
        break;
        case 1134:
        name = "奎松 ";
        break;
        case 1135:
        name = "西内格罗斯 ";
        break;
      }
    }
    if (country_code.equals("PK") == true) {
      switch (region_code2) {
        case 1:
        name = "联邦直辖部落地区 ";
        break;
        case 2:
        name = "俾路支 ";
        break;
        case 3:
        name = "西北边境 ";
        break;
        case 4:
        name = "旁遮普 ";
        break;
        case 5:
        name = "信德省 ";
        break;
        case 6:
        name = "阿扎德克什米尔 ";
        break;
        case 7:
        name = "北部地区 ";
        break;
        case 8:
        name = "伊斯兰堡 ";
        break;
      }
    }
    if (country_code.equals("PL") == true) {
      switch (region_code2) {
        case 72:
        name = "希隆斯克 ";
        break;
        case 73:
        name = "库亚瓦波美拉尼亚 ";
        break;
        case 74:
        name = "罗兹 ";
        break;
        case 75:
        name = "卢布林 ";
        break;
        case 76:
        name = "鲁布斯卡 ";
        break;
        case 77:
        name = "小波兰 ";
        break;
        case 78:
        name = "马佐夫舍 ";
        break;
        case 79:
        name = "奥波莱 ";
        break;
        case 80:
        name = "喀尔巴阡山 ";
        break;
        case 81:
        name = "波德拉谢 ";
        break;
        case 82:
        name = "滨海省 ";
        break;
        case 83:
        name = "希隆斯克 ";
        break;
        case 84:
        name = "圣十字 ";
        break;
        case 85:
        name = "瓦尔米亚马祖尔 ";
        break;
        case 86:
        name = "大波兰省 ";
        break;
        case 87:
        name = "西滨海 ";
        break;
      }
    }
    if (country_code.equals("PS") == true) {
      switch (region_code2) {
        case 1131:
        name = "加沙 ";
        break;
        case 1798:
        name = "西岸 ";
        break;
      }
    }
    if (country_code.equals("PT") == true) {
      switch (region_code2) {
        case 2:
        name = "阿威罗 ";
        break;
        case 3:
        name = "贝雅 ";
        break;
        case 4:
        name = "布拉加 ";
        break;
        case 5:
        name = "布拉干萨 ";
        break;
        case 6:
        name = "卡斯特洛·布兰科 ";
        break;
        case 7:
        name = "科英布拉 ";
        break;
        case 8:
        name = "埃武拉 ";
        break;
        case 9:
        name = "鲁 ";
        break;
        case 10:
        name = "马德拉 ";
        break;
        case 11:
        name = "瓜尔达 ";
        break;
        case 13:
        name = "莱里亚 ";
        break;
        case 14:
        name = "新葡京 ";
        break;
        case 16:
        name = "波塔莱格雷 ";
        break;
        case 17:
        name = "波尔图 ";
        break;
        case 18:
        name = "圣塔伦 ";
        break;
        case 19:
        name = "塞图巴尔 ";
        break;
        case 20:
        name = "维亚纳堡 ";
        break;
        case 21:
        name = "雷阿尔 ";
        break;
        case 22:
        name = "维塞乌 ";
        break;
        case 23:
        name = "亚速尔群岛 ";
        break;
      }
    }
    if (country_code.equals("PY") == true) {
      switch (region_code2) {
        case 1:
        name = "上巴拉那 ";
        break;
        case 2:
        name = "阿曼拜 ";
        break;
        case 3:
        name = "博克 ";
        break;
        case 4:
        name = "卡瓜苏 ";
        break;
        case 5:
        name = "卡萨帕 ";
        break;
        case 6:
        name = "中央 ";
        break;
        case 7:
        name = "康塞普西翁 ";
        break;
        case 8:
        name = "科迪勒拉 ";
        break;
        case 10:
        name = "瓜伊拉 ";
        break;
        case 11:
        name = "伊塔普亚 ";
        break;
        case 12:
        name = "米西奥内斯 ";
        break;
        case 13:
        name = "涅恩布库 ";
        break;
        case 15:
        name = "巴拉瓜 ";
        break;
        case 16:
        name = "阿耶斯总统 ";
        break;
        case 17:
        name = "圣佩德罗 ";
        break;
        case 19:
        name = "卡宁德尤 ";
        break;
        case 20:
        name = "查科 ";
        break;
        case 21:
        name = "努埃瓦亚松森 ";
        break;
        case 23:
        name = "上巴拉圭 ";
        break;
      }
    }
    if (country_code.equals("QA") == true) {
      switch (region_code2) {
        case 1:
        name = "多哈 ";
        break;
        case 2:
        name = "古韦里耶 ";
        break;
        case 3:
        name = "朱迈利耶 ";
        break;
        case 4:
        name = "豪尔 ";
        break;
        case 5:
        name = "艾尔瓦克拉市 ";
        break;
        case 6:
        name = "赖扬 ";
        break;
        case 8:
        name = "古城ACH夏马尔 ";
        break;
        case 9:
        name = "乌姆锡拉勒 ";
        break;
        case 10:
        name = "艾尔瓦克拉 ";
        break;
        case 11:
        name = "Jariyan人Batnah ";
        break;
        case 12:
        name = "乌姆赛义德 ";
        break;
      }
    }
    if (country_code.equals("RO") == true) {
      switch (region_code2) {
        case 1:
        name = "阿尔巴 ";
        break;
        case 2:
        name = "阿拉德 ";
        break;
        case 3:
        name = "阿尔杰什 ";
        break;
        case 4:
        name = "巴克乌国际 ";
        break;
        case 5:
        name = "比霍尔 ";
        break;
        case 6:
        name = "比斯特里察 - 讷瑟乌德的 ";
        break;
        case 7:
        name = "博托沙尼 ";
        break;
        case 8:
        name = "布勒伊拉 ";
        break;
        case 9:
        name = "布拉索夫 ";
        break;
        case 10:
        name = "布加勒斯特 ";
        break;
        case 11:
        name = "布泽乌 ";
        break;
        case 12:
        name = "卡拉什 - 塞维林 ";
        break;
        case 13:
        name = "克卢日 ";
        break;
        case 14:
        name = "康斯坦察 ";
        break;
        case 15:
        name = "科瓦斯纳 ";
        break;
        case 16:
        name = "登博维察 ";
        break;
        case 17:
        name = "多尔日 ";
        break;
        case 18:
        name = "加拉茨 ";
        break;
        case 19:
        name = "戈尔日 ";
        break;
        case 20:
        name = "哈尔吉塔 ";
        break;
        case 21:
        name = "胡内多阿拉 ";
        break;
        case 22:
        name = "雅洛米察 ";
        break;
        case 23:
        name = "雅西 ";
        break;
        case 25:
        name = "马拉穆列什 ";
        break;
        case 26:
        name = "梅赫丁茨 ";
        break;
        case 27:
        name = "穆列什 ";
        break;
        case 28:
        name = "尼亚姆茨 ";
        break;
        case 29:
        name = "奥尔特 ";
        break;
        case 30:
        name = "普拉霍瓦 ";
        break;
        case 31:
        name = "瑟拉 ";
        break;
        case 32:
        name = "萨图马雷 ";
        break;
        case 33:
        name = "锡比乌 ";
        break;
        case 34:
        name = "苏恰瓦 ";
        break;
        case 35:
        name = "泰莱奥尔曼 ";
        break;
        case 36:
        name = "蒂米什 ";
        break;
        case 37:
        name = "图尔恰 ";
        break;
        case 38:
        name = "瓦斯卢伊 ";
        break;
        case 39:
        name = "沃尔恰 ";
        break;
        case 40:
        name = "弗朗恰 ";
        break;
        case 41:
        name = "克勒拉希 ";
        break;
        case 42:
        name = "久尔久 ";
        break;
        case 43:
        name = "伊尔福夫 ";
        break;
      }
    }
    if (country_code.equals("RS") == true) {
      switch (region_code2) {
        case 1:
        name = "科索沃 ";
        break;
        case 2:
        name = "伏伊伏丁那 ";
        break;
      }
    }
    if (country_code.equals("RU") == true) {
      switch (region_code2) {
        case 1:
        name = "阿迪格 ";
        break;
        case 2:
        name = "阿金斯科布里雅Buryatsky AO ";
        break;
        case 3:
        name = "戈尔诺 - 阿尔泰 ";
        break;
        case 4:
        name = "Altaisky边疆区 ";
        break;
        case 5:
        name = "阿穆尔 ";
        break;
        case 6:
        name = "Arkhangel'sk ";
        break;
        case 7:
        name = "阿斯特拉罕' ";
        break;
        case 8:
        name = "巴什科尔托斯坦共和国 ";
        break;
        case 9:
        name = "别尔哥罗德 ";
        break;
        case 10:
        name = "布良斯克 ";
        break;
        case 11:
        name = "布里亚特 ";
        break;
        case 12:
        name = "车臣 ";
        break;
        case 13:
        name = "车里雅宾斯克 ";
        break;
        case 14:
        name = "赤塔 ";
        break;
        case 15:
        name = "楚克奇 ";
        break;
        case 16:
        name = "楚瓦什 ";
        break;
        case 17:
        name = "达吉斯坦 ";
        break;
        case 18:
        name = "鄂温克族自治旗 ";
        break;
        case 19:
        name = "印古什 ";
        break;
        case 20:
        name = "伊尔库茨克 ";
        break;
        case 21:
        name = "伊万诺沃 ";
        break;
        case 22:
        name = "卡巴尔达 - 巴尔卡尔 ";
        break;
        case 23:
        name = "加里宁格勒 ";
        break;
        case 24:
        name = "卡尔梅克 ";
        break;
        case 25:
        name = "卡卢加 ";
        break;
        case 26:
        name = "堪察加 ";
        break;
        case 27:
        name = "卡拉恰伊Cherkess的 ";
        break;
        case 28:
        name = "卡累利阿 ";
        break;
        case 29:
        name = "克麦罗沃 ";
        break;
        case 30:
        name = "哈巴罗夫斯克 ";
        break;
        case 31:
        name = "哈卡斯 ";
        break;
        case 32:
        name = "汉特 - Mansiy ";
        break;
        case 33:
        name = "基洛夫 ";
        break;
        case 34:
        name = "科米 ";
        break;
        case 35:
        name = "科米Permyak的 ";
        break;
        case 36:
        name = "科里亚克 ";
        break;
        case 37:
        name = "科斯特罗马 ";
        break;
        case 38:
        name = "克拉斯诺达尔 ";
        break;
        case 39:
        name = "克拉斯诺亚尔斯克 ";
        break;
        case 40:
        name = "库尔干 ";
        break;
        case 41:
        name = "库尔斯克 ";
        break;
        case 42:
        name = "列宁格勒 ";
        break;
        case 43:
        name = "利佩茨克 ";
        break;
        case 44:
        name = "马加丹 ";
        break;
        case 45:
        name = "马里 - 萨尔瓦多 ";
        break;
        case 46:
        name = "莫尔多瓦 ";
        break;
        case 47:
        name = "莫斯科 ";
        break;
        case 48:
        name = "莫斯科市 ";
        break;
        case 49:
        name = "摩尔曼斯克 ";
        break;
        case 50:
        name = "涅涅茨 ";
        break;
        case 51:
        name = "哥罗德 ";
        break;
        case 52:
        name = "诺夫哥罗德 ";
        break;
        case 53:
        name = "新西伯利亚 ";
        break;
        case 54:
        name = "鄂木斯克 ";
        break;
        case 55:
        name = "奥伦堡 ";
        break;
        case 56:
        name = "奥勒尔 ";
        break;
        case 57:
        name = "奔萨 ";
        break;
        case 58:
        name = "彼尔姆 ";
        break;
        case 59:
        name = "Primor'ye ";
        break;
        case 60:
        name = "普斯科夫 ";
        break;
        case 61:
        name = "罗斯托夫 ";
        break;
        case 62:
        name = "梁赞 ";
        break;
        case 63:
        name = "萨哈 ";
        break;
        case 64:
        name = "萨哈林 ";
        break;
        case 65:
        name = "萨马拉 ";
        break;
        case 66:
        name = "圣彼得堡市 ";
        break;
        case 67:
        name = "萨拉托夫 ";
        break;
        case 68:
        name = "北奥塞梯 ";
        break;
        case 69:
        name = "斯摩棱斯克 ";
        break;
        case 70:
        name = "斯塔夫罗波尔' ";
        break;
        case 71:
        name = "斯维尔德洛夫斯克 ";
        break;
        case 72:
        name = "坦波夫州 ";
        break;
        case 73:
        name = "鞑靼斯坦 ";
        break;
        case 74:
        name = "海泰梅尔 ";
        break;
        case 75:
        name = "托木斯克 ";
        break;
        case 76:
        name = "图拉 ";
        break;
        case 77:
        name = "特维尔' ";
        break;
        case 78:
        name = "秋明' ";
        break;
        case 79:
        name = "图瓦 ";
        break;
        case 80:
        name = "乌德穆尔特 ";
        break;
        case 81:
        name = "Ul'yanovsk ";
        break;
        case 82:
        name = "乌斯季奥尔达布里亚特 ";
        break;
        case 83:
        name = "弗拉基米尔 ";
        break;
        case 84:
        name = "伏尔加格勒 ";
        break;
        case 85:
        name = "沃洛格达 ";
        break;
        case 86:
        name = "沃罗涅日 ";
        break;
        case 87:
        name = "亚马尔 - 涅涅茨 ";
        break;
        case 88:
        name = "雅罗斯拉夫尔 ";
        break;
        case 89:
        name = "Yevrey ";
        break;
        case 90:
        name = "彼尔姆边疆区 ";
        break;
        case 91:
        name = "克拉斯诺亚尔斯克边疆区 ";
        break;
        case 942:
        name = "车臣共和国 ";
        break;
      }
    }
    if (country_code.equals("RW") == true) {
      switch (region_code2) {
        case 1:
        name = "布塔雷 ";
        break;
        case 6:
        name = "吉塔拉马 ";
        break;
        case 7:
        name = "基本古 ";
        break;
        case 9:
        name = "基加利 ";
        break;
        case 11:
        name = "预计 ";
        break;
        case 12:
        name = "基加利 ";
        break;
        case 13:
        name = "北 ";
        break;
        case 14:
        name = "西部省 ";
        break;
        case 15:
        name = "南基 ";
        break;
      }
    }
    if (country_code.equals("SA") == true) {
      switch (region_code2) {
        case 2:
        name = "巴哈 ";
        break;
        case 3:
        name = "焦夫 ";
        break;
        case 5:
        name = "麦地那 ";
        break;
        case 6:
        name = "东部省 ";
        break;
        case 8:
        name = "卡西姆 ";
        break;
        case 9:
        name = "Al Qurayyat的 ";
        break;
        case 10:
        name = "利雅得 ";
        break;
        case 13:
        name = "哈伊勒 ";
        break;
        case 14:
        name = "麦加 ";
        break;
        case 15:
        name = "铝灰回教刑法Shamaliyah ";
        break;
        case 16:
        name = "纳兰 ";
        break;
        case 17:
        name = "吉赞 ";
        break;
        case 19:
        name = "塔布克 ";
        break;
        case 20:
        name = "焦夫 ";
        break;
      }
    }
    if (country_code.equals("SB") == true) {
      switch (region_code2) {
        case 3:
        name = "马莱塔 ";
        break;
        case 6:
        name = "瓜达尔卡纳尔岛 ";
        break;
        case 7:
        name = "伊莎贝尔 ";
        break;
        case 8:
        name = "马基拉 ";
        break;
        case 9:
        name = "泰莫图 ";
        break;
        case 10:
        name = "中央 ";
        break;
        case 11:
        name = "西 ";
        break;
        case 12:
        name = "舒瓦瑟尔 ";
        break;
        case 13:
        name = "伦内尔和贝罗纳 ";
        break;
      }
    }
    if (country_code.equals("SC") == true) {
      switch (region_code2) {
        case 1:
        name = "安塞辅助销 ";
        break;
        case 2:
        name = "安塞布瓦洛 ";
        break;
        case 3:
        name = "安塞Etoile酒店 ";
        break;
        case 4:
        name = "安塞路易斯 ";
        break;
        case 5:
        name = "安塞罗瓦尔 ";
        break;
        case 6:
        name = "拜伊拉札尔 ";
        break;
        case 7:
        name = "贝圣安安妮 ";
        break;
        case 8:
        name = "博瓦隆 ";
        break;
        case 9:
        name = "贝莱尔 ";
        break;
        case 10:
        name = "贝尔欧布莱 ";
        break;
        case 11:
        name = "级联 ";
        break;
        case 12:
        name = "缓慢倾斜 ";
        break;
        case 13:
        name = "安塞 ";
        break;
        case 14:
        name = "安塞 ";
        break;
        case 15:
        name = "拉迪格 ";
        break;
        case 16:
        name = "La Riviere的釉的 ";
        break;
        case 17:
        name = "布克斯顿山 ";
        break;
        case 18:
        name = "弗雷里山 ";
        break;
        case 19:
        name = "皮亚琴察 ";
        break;
        case 20:
        name = "鲁埃 ";
        break;
        case 21:
        name = "格罗港 ";
        break;
        case 22:
        name = "圣路易 ";
        break;
        case 23:
        name = "塔卡马卡 ";
        break;
      }
    }
    if (country_code.equals("SD") == true) {
      switch (region_code2) {
        case 27:
        name = "Al Wusta的 ";
        break;
        case 28:
        name = "Al Istiwa'iyah的 ";
        break;
        case 29:
        name = "喀土穆 ";
        break;
        case 30:
        name = "北部省 ";
        break;
        case 31:
        name = "东部省 ";
        break;
        case 32:
        name = "加扎勒河 ";
        break;
        case 33:
        name = "达尔富尔 ";
        break;
        case 34:
        name = "科尔多凡 ";
        break;
        case 35:
        name = "尼罗河上游 ";
        break;
        case 40:
        name = "Al Wahadah的国家 ";
        break;
        case 44:
        name = "中赤道州 ";
        break;
      }
    }
    if (country_code.equals("SE") == true) {
      switch (region_code2) {
        case 1:
        name = "Alvsborgs兰 ";
        break;
        case 2:
        name = "布莱金厄 ";
        break;
        case 3:
        name = "耶夫勒堡省 ";
        break;
        case 4:
        name = "哥德堡OCH布胡斯兰 ";
        break;
        case 5:
        name = "哥德兰 ";
        break;
        case 6:
        name = "哈兰 ";
        break;
        case 7:
        name = "耶姆特兰 ";
        break;
        case 8:
        name = "延雪平 ";
        break;
        case 9:
        name = "卡尔玛 ";
        break;
        case 10:
        name = "达拉纳 ";
        break;
        case 11:
        name = "Kristianstads兰 ";
        break;
        case 12:
        name = "克鲁努贝里 ";
        break;
        case 13:
        name = "兰的Malmöhus ";
        break;
        case 14:
        name = "北博滕省 ";
        break;
        case 15:
        name = "厄勒布鲁 ";
        break;
        case 16:
        name = "东约特兰 ";
        break;
        case 17:
        name = "Skaraborgs兰 ";
        break;
        case 18:
        name = "南曼兰 ";
        break;
        case 21:
        name = "乌普萨拉 ";
        break;
        case 22:
        name = "韦姆兰 ";
        break;
        case 23:
        name = "西博滕省 ";
        break;
        case 24:
        name = "西诺尔兰 ";
        break;
        case 25:
        name = "西曼兰 ";
        break;
        case 26:
        name = "斯德哥尔摩兰 ";
        break;
        case 27:
        name = "斯科纳 ";
        break;
        case 28:
        name = "西约特兰省 ";
        break;
      }
    }
    if (country_code.equals("SH") == true) {
      switch (region_code2) {
        case 1:
        name = "上升 ";
        break;
        case 2:
        name = "圣赫勒拿 ";
        break;
        case 3:
        name = "特里斯坦达库尼亚 ";
        break;
      }
    }
    if (country_code.equals("SI") == true) {
      switch (region_code2) {
        case 1:
        name = "Ajdovscina（斯洛文尼亚） ";
        break;
        case 2:
        name = "Beltinci ";
        break;
        case 3:
        name = "布莱德 ";
        break;
        case 4:
        name = "渤兴 ";
        break;
        case 5:
        name = "博罗夫尼察 ";
        break;
        case 6:
        name = "博夫克 ";
        break;
        case 7:
        name = "Brda先生 ";
        break;
        case 8:
        name = "布雷日采 ";
        break;
        case 9:
        name = "Brezovica ";
        break;
        case 11:
        name = "采列 ";
        break;
        case 12:
        name = "Cerklje的na Gorenjskem的 ";
        break;
        case 13:
        name = "Cerknica ";
        break;
        case 14:
        name = "Cerkno ";
        break;
        case 15:
        name = "Crensovci ";
        break;
        case 16:
        name = "CRNA NA Koroskem ";
        break;
        case 17:
        name = "Crnomelj ";
        break;
        case 19:
        name = "位于Divaca ";
        break;
        case 20:
        name = "Dobrepolje ";
        break;
        case 22:
        name = "芘优先Ljubljani的 ";
        break;
        case 24:
        name = "Dornava ";
        break;
        case 25:
        name = "Dravograd镇 ";
        break;
        case 26:
        name = "Duplek ";
        break;
        case 27:
        name = "Gorenja VAS Poljane ";
        break;
        case 28:
        name = "Gorisnica ";
        break;
        case 29:
        name = "Gornja Radgona的 ";
        break;
        case 30:
        name = "上瓦毕业 ";
        break;
        case 31:
        name = "勾基Petrovci的 ";
        break;
        case 32:
        name = "格罗苏普列 ";
        break;
        case 34:
        name = "Hrastnik ";
        break;
        case 35:
        name = "Hrpelje Kozina的 ";
        break;
        case 36:
        name = "伊德里亚 ";
        break;
        case 37:
        name = "免疫球蛋白 ";
        break;
        case 38:
        name = "Ilirska比斯特里察 ";
        break;
        case 39:
        name = "Ivancna戈里察 ";
        break;
        case 40:
        name = "伊佐拉伊索拉 ";
        break;
        case 42:
        name = "Jursinci ";
        break;
        case 44:
        name = "凯纳 ";
        break;
        case 45:
        name = "基德里切沃 ";
        break;
        case 46:
        name = "Kobarid（斯洛文尼亚） ";
        break;
        case 47:
        name = "Kobilje ";
        break;
        case 49:
        name = "科曼 ";
        break;
        case 50:
        name = "科佩尔Capodistria的 ";
        break;
        case 51:
        name = "Kozje ";
        break;
        case 52:
        name = "克拉尼 ";
        break;
        case 53:
        name = "克拉尼斯卡戈拉 ";
        break;
        case 54:
        name = "克尔斯科 ";
        break;
        case 55:
        name = "Kungota ";
        break;
        case 57:
        name = "拉斯科 ";
        break;
        case 61:
        name = "卢布尔雅那 ";
        break;
        case 62:
        name = "Ljubno ";
        break;
        case 64:
        name = "LOGATEC ";
        break;
        case 66:
        name = "Loski Potok的 ";
        break;
        case 68:
        name = "Lukovica ";
        break;
        case 71:
        name = "梅德沃德 ";
        break;
        case 72:
        name = "杰斯 ";
        break;
        case 73:
        name = "Metlika ";
        break;
        case 74:
        name = "Mezica ";
        break;
        case 76:
        name = "Mislinja ";
        break;
        case 77:
        name = "Moravce ";
        break;
        case 78:
        name = "摩拉瓦托采 ";
        break;
        case 79:
        name = "Mozirje ";
        break;
        case 80:
        name = "穆尔斯卡索博塔 ";
        break;
        case 81:
        name = "墓塔 ";
        break;
        case 82:
        name = "纳克洛 ";
        break;
        case 83:
        name = "Nazarje利用 ";
        break;
        case 84:
        name = "新戈里察 ";
        break;
        case 86:
        name = "Odranci ";
        break;
        case 87:
        name = "Ormoz ";
        break;
        case 88:
        name = "Osilnica ";
        break;
        case 89:
        name = "Pesnica ";
        break;
        case 91:
        name = "PIVKA ";
        break;
        case 92:
        name = "博德森特克 ";
        break;
        case 94:
        name = "波斯托伊纳 ";
        break;
        case 97:
        name = "Puconci ";
        break;
        case 98:
        name = "Racam ";
        break;
        case 99:
        name = "Radece ";
        break;
        case 832:
        name = "拉登齐 ";
        break;
        case 833:
        name = "Radlje OB Dravi ";
        break;
        case 834:
        name = "拉多夫吉卡 ";
        break;
        case 837:
        name = "Rogasovci ";
        break;
        case 838:
        name = "罗加斯卡斯斯拉蒂纳 ";
        break;
        case 839:
        name = "Rogatec ";
        break;
        case 875:
        name = "SEMIC ";
        break;
        case 876:
        name = "Sencur ";
        break;
        case 877:
        name = "Sentilj ";
        break;
        case 878:
        name = "Sentjernej ";
        break;
        case 880:
        name = "Sevnica ";
        break;
        case 881:
        name = "塞扎纳 ";
        break;
        case 882:
        name = "斯科契扬 ";
        break;
        case 883:
        name = "什科菲亚洛洛卡 ";
        break;
        case 918:
        name = "Skofljica ";
        break;
        case 919:
        name = "斯洛文尼亚格拉代茨 ";
        break;
        case 921:
        name = "的Slovenske Konjice的 ";
        break;
        case 922:
        name = "pri Jelsah的Smarje ";
        break;
        case 923:
        name = "Smartno OB帕基 ";
        break;
        case 924:
        name = "Sostanj ";
        break;
        case 925:
        name = "STARSE ";
        break;
        case 926:
        name = "存储 ";
        break;
        case 961:
        name = "尤里·圣斯特 ";
        break;
        case 962:
        name = "TOLMIN ";
        break;
        case 963:
        name = "Trbovlje ";
        break;
        case 964:
        name = "Trebnje ";
        break;
        case 965:
        name = "旅游Trzic ";
        break;
        case 966:
        name = "Turnisce ";
        break;
        case 967:
        name = "韦莱涅 ";
        break;
        case 968:
        name = "Velike Lasce ";
        break;
        case 1004:
        name = "维帕瓦 ";
        break;
        case 1005:
        name = "Vitanje ";
        break;
        case 1006:
        name = "沃迪斯 ";
        break;
        case 1008:
        name = "Vrhnika ";
        break;
        case 1009:
        name = "Vuzenica ";
        break;
        case 1010:
        name = "扎戈列OB萨维 ";
        break;
        case 1012:
        name = "Zavrc ";
        break;
        case 1047:
        name = "Zelezniki ";
        break;
        case 1048:
        name = "紫日 ";
        break;
        case 1049:
        name = "Zrece ";
        break;
        case 1093:
        name = "Dobrova Horjul Polhov格拉代茨 ";
        break;
        case 1096:
        name = "Domžale的 ";
        break;
        case 1136:
        name = "耶塞尼采 ";
        break;
        case 1138:
        name = "卡姆尼克 ";
        break;
        case 1139:
        name = "Kocevje ";
        break;
        case 1177:
        name = "库兹马 ";
        break;
        case 1178:
        name = "LENART ";
        break;
        case 1180:
        name = "Litija ";
        break;
        case 1181:
        name = "Ljutomer ";
        break;
        case 1182:
        name = "Loska DOLINA ";
        break;
        case 1184:
        name = "卢斯 ";
        break;
        case 1219:
        name = "Majsperk ";
        break;
        case 1220:
        name = "马里博尔 ";
        break;
        case 1223:
        name = "MIREN Kostanjevica ";
        break;
        case 1225:
        name = "新梅斯托 ";
        break;
        case 1227:
        name = "皮兰 ";
        break;
        case 1266:
        name = "位于Preddvor ";
        break;
        case 1268:
        name = "普图杰 ";
        break;
        case 1305:
        name = "Ribnica的 ";
        break;
        case 1307:
        name = "谋略 ";
        break;
        case 1311:
        name = "pri Celju的Sentjur ";
        break;
        case 1312:
        name = "斯洛文尼亚比斯特里察 ";
        break;
        case 1392:
        name = "Videm ";
        break;
        case 1393:
        name = "Vojnik ";
        break;
        case 1395:
        name = "ZALEC ";
        break;
      }
    }
    if (country_code.equals("SK") == true) {
      switch (region_code2) {
        case 1:
        name = "班斯卡 - 比斯特里察 ";
        break;
        case 2:
        name = "布拉迪斯拉发 ";
        break;
        case 3:
        name = "科希策 ";
        break;
        case 4:
        name = "尼特拉 ";
        break;
        case 5:
        name = "普雷绍夫 ";
        break;
        case 6:
        name = "特伦钦 ";
        break;
        case 7:
        name = "特尔纳瓦 ";
        break;
        case 8:
        name = "日利纳 ";
        break;
      }
    }
    if (country_code.equals("SL") == true) {
      switch (region_code2) {
        case 1:
        name = "东 ";
        break;
        case 2:
        name = "北方 ";
        break;
        case 3:
        name = "南部的 ";
        break;
        case 4:
        name = "西部地区 ";
        break;
      }
    }
    if (country_code.equals("SM") == true) {
      switch (region_code2) {
        case 1:
        name = "阿夸 ";
        break;
        case 2:
        name = "Chiesanuova ";
        break;
        case 3:
        name = "Domagnano（圣马力诺） ";
        break;
        case 4:
        name = "Faetano（圣马力诺） ";
        break;
        case 5:
        name = "提诺 ";
        break;
        case 6:
        name = "马焦雷镇 ";
        break;
        case 7:
        name = "圣马力诺 ";
        break;
        case 8:
        name = "蒙Giardino酒店 ";
        break;
        case 9:
        name = "塞拉瓦莱斯 ";
        break;
      }
    }
    if (country_code.equals("SN") == true) {
      switch (region_code2) {
        case 1:
        name = "达喀尔 ";
        break;
        case 3:
        name = "迪乌贝尔 ";
        break;
        case 4:
        name = "圣路易 ";
        break;
        case 5:
        name = "坦巴昆达 ";
        break;
        case 7:
        name = "捷斯 ";
        break;
        case 8:
        name = "卢加 ";
        break;
        case 9:
        name = "法蒂克 ";
        break;
        case 10:
        name = "拉克 ";
        break;
        case 11:
        name = "科尔达 ";
        break;
        case 12:
        name = "济金绍尔 ";
        break;
        case 13:
        name = "卢加 ";
        break;
        case 14:
        name = "圣路易 ";
        break;
        case 15:
        name = "马塔姆 ";
        break;
      }
    }
    if (country_code.equals("SO") == true) {
      switch (region_code2) {
        case 1:
        name = "巴科勒 ";
        break;
        case 2:
        name = "巴纳迪尔 ";
        break;
        case 3:
        name = "巴里 ";
        break;
        case 4:
        name = "海湾 ";
        break;
        case 5:
        name = "加尔古杜德 ";
        break;
        case 6:
        name = "盖多 ";
        break;
        case 7:
        name = "希兰 ";
        break;
        case 8:
        name = "朱伯 ";
        break;
        case 9:
        name = "下朱伯 ";
        break;
        case 10:
        name = "穆杜格 ";
        break;
        case 11:
        name = "努加尔 ";
        break;
        case 12:
        name = "萨纳格 ";
        break;
        case 13:
        name = "沙贝勒 ";
        break;
        case 14:
        name = "下沙贝勒 ";
        break;
        case 16:
        name = "沃库宜Galbeed的 ";
        break;
        case 18:
        name = "努加尔 ";
        break;
        case 19:
        name = "托德希尔 ";
        break;
        case 20:
        name = "沃库宜Galbeed的 ";
        break;
        case 21:
        name = "Awdal ";
        break;
        case 22:
        name = "苏尔 ";
        break;
      }
    }
    if (country_code.equals("SR") == true) {
      switch (region_code2) {
        case 10:
        name = "布罗科蓬多 ";
        break;
        case 11:
        name = "科默韦讷 ";
        break;
        case 12:
        name = "科罗尼 ";
        break;
        case 13:
        name = "马罗韦纳 ";
        break;
        case 14:
        name = "尼克里 ";
        break;
        case 15:
        name = "帕拉 ";
        break;
        case 16:
        name = "帕拉马里博 ";
        break;
        case 17:
        name = "萨拉马卡 ";
        break;
        case 18:
        name = "锡帕利维尼 ";
        break;
        case 19:
        name = "瓦尼卡 ";
        break;
      }
    }
    if (country_code.equals("ST") == true) {
      switch (region_code2) {
        case 1:
        name = "普林西 ";
        break;
        case 2:
        name = "圣多美和普林西比 ";
        break;
      }
    }
    if (country_code.equals("SV") == true) {
      switch (region_code2) {
        case 1:
        name = "阿瓦查潘 ";
        break;
        case 2:
        name = "卡巴纳斯 ";
        break;
        case 3:
        name = "查拉特南戈 ";
        break;
        case 4:
        name = "库斯卡特兰 ";
        break;
        case 5:
        name = "拉利伯塔德 ";
        break;
        case 6:
        name = "拉巴斯 ";
        break;
        case 7:
        name = "拉乌尼翁 ";
        break;
        case 8:
        name = "莫拉桑 ";
        break;
        case 9:
        name = "圣米格尔 ";
        break;
        case 10:
        name = "圣萨尔瓦多 ";
        break;
        case 11:
        name = "圣安娜 ";
        break;
        case 12:
        name = "圣维森特 ";
        break;
        case 13:
        name = "松索纳特 ";
        break;
        case 14:
        name = "乌苏卢坦 ";
        break;
      }
    }
    if (country_code.equals("SY") == true) {
      switch (region_code2) {
        case 1:
        name = "哈塞克 ";
        break;
        case 2:
        name = "拉塔基亚 ";
        break;
        case 3:
        name = "库奈特拉 ";
        break;
        case 4:
        name = "拉卡 ";
        break;
        case 5:
        name = "由于苏韦达' ";
        break;
        case 6:
        name = "达累斯萨拉姆 ";
        break;
        case 7:
        name = "代尔祖尔 ";
        break;
        case 8:
        name = "大马士革 ";
        break;
        case 9:
        name = "阿勒颇 ";
        break;
        case 10:
        name = "哈马 ";
        break;
        case 11:
        name = "霍姆斯 ";
        break;
        case 12:
        name = "伊德利卜 ";
        break;
        case 13:
        name = "Dimashq ";
        break;
        case 14:
        name = "塔尔图斯 ";
        break;
      }
    }
    if (country_code.equals("SZ") == true) {
      switch (region_code2) {
        case 1:
        name = "霍霍 ";
        break;
        case 2:
        name = "卢邦博 ";
        break;
        case 3:
        name = "曼齐尼 ";
        break;
        case 4:
        name = "希塞卢韦尼 ";
        break;
        case 5:
        name = "普拉兰 ";
        break;
      }
    }
    if (country_code.equals("TD") == true) {
      switch (region_code2) {
        case 1:
        name = "巴塔 ";
        break;
        case 2:
        name = "比尔廷 ";
        break;
        case 3:
        name = "博尔库 - 恩内迪 - 提贝斯提 ";
        break;
        case 4:
        name = "沙里 - 巴吉尔米 ";
        break;
        case 5:
        name = "盖拉 ";
        break;
        case 6:
        name = "卡内姆 ";
        break;
        case 7:
        name = "紫胶 ";
        break;
        case 8:
        name = "西洛贡 ";
        break;
        case 9:
        name = "洛贡东方 ";
        break;
        case 10:
        name = "梅奥凯比 ";
        break;
        case 11:
        name = "沙里 ";
        break;
        case 12:
        name = "瓦达伊 ";
        break;
        case 13:
        name = "萨拉马特 ";
        break;
        case 14:
        name = "坦吉莱 ";
        break;
      }
    }
    if (country_code.equals("TG") == true) {
      switch (region_code2) {
        case 9:
        name = "达赖喇嘛卡拉 ";
        break;
        case 18:
        name = "Tsevie ";
        break;
        case 22:
        name = "中央 ";
        break;
        case 23:
        name = "卡拉 ";
        break;
        case 24:
        name = "海上 ";
        break;
        case 25:
        name = "高原 ";
        break;
        case 26:
        name = "萨瓦纳 ";
        break;
      }
    }
    if (country_code.equals("TH") == true) {
      switch (region_code2) {
        case 1:
        name = "湄宏顺 ";
        break;
        case 2:
        name = "清迈 ";
        break;
        case 3:
        name = "清莱 ";
        break;
        case 4:
        name = "南 ";
        break;
        case 5:
        name = "南奔 ";
        break;
        case 6:
        name = "南邦 ";
        break;
        case 7:
        name = "帕 ";
        break;
        case 8:
        name = "德 ";
        break;
        case 9:
        name = "素可泰 ";
        break;
        case 10:
        name = "逸 ";
        break;
        case 11:
        name = "甘烹碧 ";
        break;
        case 12:
        name = "彭世洛 ";
        break;
        case 13:
        name = "披集府 ";
        break;
        case 14:
        name = "碧差汶 ";
        break;
        case 15:
        name = "乌泰他尼 ";
        break;
        case 16:
        name = "那空沙旺 ";
        break;
        case 17:
        name = "农凯 ";
        break;
        case 18:
        name = "黎 ";
        break;
        case 20:
        name = "沙功那空 ";
        break;
        case 21:
        name = "那空拍侬 ";
        break;
        case 22:
        name = "孔敬 ";
        break;
        case 23:
        name = "加拉信 ";
        break;
        case 24:
        name = "玛哈沙拉堪 ";
        break;
        case 25:
        name = "黎逸 ";
        break;
        case 26:
        name = "猜也蓬 ";
        break;
        case 27:
        name = "呵叻府（Nakhon Ratchasima） ";
        break;
        case 28:
        name = "武里南 ";
        break;
        case 29:
        name = "苏林 ";
        break;
        case 30:
        name = "四色菊 ";
        break;
        case 31:
        name = "那拉提瓦 ";
        break;
        case 32:
        name = "猜 ";
        break;
        case 33:
        name = "唱武里 ";
        break;
        case 34:
        name = "华富里（Lop Buri） ";
        break;
        case 35:
        name = "安通 ";
        break;
        case 36:
        name = "大城 ";
        break;
        case 37:
        name = "沙拉武里 ";
        break;
        case 38:
        name = "暖武里府 ";
        break;
        case 39:
        name = "巴吞他尼 ";
        break;
        case 40:
        name = "克伦德普 ";
        break;
        case 41:
        name = "帕尧 ";
        break;
        case 42:
        name = "北榄府 ";
        break;
        case 43:
        name = "那空那育 ";
        break;
        case 44:
        name = "北柳 ";
        break;
        case 45:
        name = "巴真武里 ";
        break;
        case 46:
        name = "春武里府 ";
        break;
        case 47:
        name = "罗勇 ";
        break;
        case 48:
        name = "尖竹汶府 ";
        break;
        case 49:
        name = "达勒 ";
        break;
        case 50:
        name = "北碧府 ";
        break;
        case 51:
        name = "素攀武里 ";
        break;
        case 52:
        name = "叻丕府 ";
        break;
        case 53:
        name = "佛统 ";
        break;
        case 54:
        name = "沙没颂堪 ";
        break;
        case 55:
        name = "龙仔厝 ";
        break;
        case 56:
        name = "佛丕府 ";
        break;
        case 57:
        name = "巴蜀 ";
        break;
        case 58:
        name = "春蓬 ";
        break;
        case 59:
        name = "拉廊 ";
        break;
        case 60:
        name = "素叻他尼 ";
        break;
        case 61:
        name = "攀牙 ";
        break;
        case 62:
        name = "普吉岛 ";
        break;
        case 63:
        name = "喀比 ";
        break;
        case 64:
        name = "洛坤府 ";
        break;
        case 65:
        name = "庄 ";
        break;
        case 66:
        name = "博达伦 ";
        break;
        case 67:
        name = "沙敦 ";
        break;
        case 68:
        name = "宋卡 ";
        break;
        case 69:
        name = "北大 ";
        break;
        case 70:
        name = "雅拉 ";
        break;
        case 71:
        name = "乌汶 ";
        break;
        case 72:
        name = "益梭通 ";
        break;
        case 73:
        name = "那空拍侬 ";
        break;
        case 75:
        name = "乌汶 ";
        break;
        case 76:
        name = "乌隆 ";
        break;
        case 77:
        name = "安纳乍能 ";
        break;
        case 78:
        name = "穆达汉 ";
        break;
        case 79:
        name = "农磨兰普 ";
        break;
        case 80:
        name = "沙缴 ";
        break;
      }
    }
    if (country_code.equals("TJ") == true) {
      switch (region_code2) {
        case 1:
        name = "Kuhistoni Badakhshon ";
        break;
        case 2:
        name = "哈特隆 ";
        break;
        case 3:
        name = "索格特州 ";
        break;
      }
    }
    if (country_code.equals("TM") == true) {
      switch (region_code2) {
        case 1:
        name = "阿哈尔 ";
        break;
        case 2:
        name = "巴尔干 ";
        break;
        case 3:
        name = "达沙古兹 ";
        break;
        case 4:
        name = "列巴普 ";
        break;
        case 5:
        name = "玛丽 ";
        break;
      }
    }
    if (country_code.equals("TN") == true) {
      switch (region_code2) {
        case 2:
        name = "卡塞林 ";
        break;
        case 3:
        name = "凯鲁万 ";
        break;
        case 6:
        name = "坚杜拜 ";
        break;
        case 14:
        name = "卡夫 ";
        break;
        case 15:
        name = "铝马赫迪耶 ";
        break;
        case 16:
        name = "Al Munastir的 ";
        break;
        case 17:
        name = "Bajah ";
        break;
        case 18:
        name = "比塞大 ";
        break;
        case 19:
        name = "纳布勒 ";
        break;
        case 22:
        name = "锡勒亚奈 ";
        break;
        case 23:
        name = "苏塞 ";
        break;
        case 26:
        name = "阿丽亚娜 ";
        break;
        case 27:
        name = "本阿鲁斯 ";
        break;
        case 28:
        name = "Madanin ";
        break;
        case 29:
        name = "加贝斯 ";
        break;
        case 30:
        name = "加夫萨 ";
        break;
        case 31:
        name = "凯比利 ";
        break;
        case 32:
        name = "斯法克斯 ";
        break;
        case 33:
        name = "西迪布济德 ";
        break;
        case 34:
        name = "泰塔 ";
        break;
        case 35:
        name = "托泽尔 ";
        break;
        case 36:
        name = "突尼斯 ";
        break;
        case 37:
        name = "宰格万 ";
        break;
        case 38:
        name = "Aiana ";
        break;
        case 39:
        name = "马努巴 ";
        break;
      }
    }
    if (country_code.equals("TO") == true) {
      switch (region_code2) {
        case 1:
        name = "哈 ";
        break;
        case 2:
        name = "汤加塔布 ";
        break;
        case 3:
        name = "瓦瓦 ";
        break;
      }
    }
    if (country_code.equals("TR") == true) {
      switch (region_code2) {
        case 2:
        name = "阿德亚曼 ";
        break;
        case 3:
        name = "阿菲永 ";
        break;
        case 4:
        name = "粮油 ";
        break;
        case 5:
        name = "阿马西亚 ";
        break;
        case 7:
        name = "安塔利亚 ";
        break;
        case 8:
        name = "阿尔特温 ";
        break;
        case 9:
        name = "艾登 ";
        break;
        case 10:
        name = "巴勒克希尔 ";
        break;
        case 11:
        name = "比莱吉克 ";
        break;
        case 12:
        name = "宾格尔 ";
        break;
        case 13:
        name = "比特利斯 ";
        break;
        case 14:
        name = "博卢 ";
        break;
        case 15:
        name = "布尔杜尔 ";
        break;
        case 16:
        name = "囊 ";
        break;
        case 17:
        name = "恰纳卡莱 ";
        break;
        case 19:
        name = "乔鲁 ";
        break;
        case 20:
        name = "德尼兹利 ";
        break;
        case 21:
        name = "迪亚巴克尔 ";
        break;
        case 22:
        name = "埃迪尔 ";
        break;
        case 23:
        name = "埃拉泽 ";
        break;
        case 24:
        name = "埃尔津詹 ";
        break;
        case 25:
        name = "埃尔祖鲁姆 ";
        break;
        case 26:
        name = "埃斯基谢希尔 ";
        break;
        case 28:
        name = "吉雷松 ";
        break;
        case 31:
        name = "哈塔伊 ";
        break;
        case 32:
        name = "梅尔辛 ";
        break;
        case 33:
        name = "伊斯帕尔塔 ";
        break;
        case 34:
        name = "伊斯坦布尔 ";
        break;
        case 35:
        name = "伊兹密尔 ";
        break;
        case 37:
        name = "卡斯塔莫努 ";
        break;
        case 38:
        name = "开塞利 ";
        break;
        case 39:
        name = "克尔克拉雷 ";
        break;
        case 40:
        name = "克尔谢希尔 ";
        break;
        case 41:
        name = "科贾埃利 ";
        break;
        case 43:
        name = "屈塔希亚 ";
        break;
        case 44:
        name = "马拉蒂亚 ";
        break;
        case 45:
        name = "马尼萨 ";
        break;
        case 46:
        name = "卡赫拉曼马拉什 ";
        break;
        case 48:
        name = "穆拉 ";
        break;
        case 49:
        name = "亩 ";
        break;
        case 50:
        name = "内夫谢希尔 ";
        break;
        case 52:
        name = "奥尔杜 ";
        break;
        case 53:
        name = "里泽 ";
        break;
        case 54:
        name = "萨卡里亚 ";
        break;
        case 55:
        name = "萨姆松 ";
        break;
        case 57:
        name = "锡诺普 ";
        break;
        case 58:
        name = "锡瓦斯 ";
        break;
        case 59:
        name = "泰基尔达 ";
        break;
        case 60:
        name = "托卡特 ";
        break;
        case 61:
        name = "特拉布宗 ";
        break;
        case 62:
        name = "通杰利 ";
        break;
        case 63:
        name = "桑尼乌法 ";
        break;
        case 64:
        name = "乌沙克 ";
        break;
        case 65:
        name = "货车 ";
        break;
        case 66:
        name = "约兹加特 ";
        break;
        case 68:
        name = "安卡拉 ";
        break;
        case 69:
        name = "居米什哈 ";
        break;
        case 70:
        name = "哈卡里 ";
        break;
        case 71:
        name = "科尼亚 ";
        break;
        case 72:
        name = "马尔丁 ";
        break;
        case 73:
        name = "尼代 ";
        break;
        case 74:
        name = "锡尔特 ";
        break;
        case 75:
        name = "阿克萨赖 ";
        break;
        case 76:
        name = "蝙蝠侠 ";
        break;
        case 77:
        name = "巴伊布尔特 ";
        break;
        case 78:
        name = "卡拉曼 ";
        break;
        case 79:
        name = "克勒克卡莱 ";
        break;
        case 80:
        name = "舍尔纳克 ";
        break;
        case 81:
        name = "阿达纳 ";
        break;
        case 82:
        name = "昌克勒 ";
        break;
        case 83:
        name = "加济安泰普 ";
        break;
        case 84:
        name = "卡尔斯 ";
        break;
        case 85:
        name = "宗古尔达克 ";
        break;
        case 86:
        name = "阿尔达汉 ";
        break;
        case 87:
        name = "巴尔腾 ";
        break;
        case 88:
        name = "伊迪尔 ";
        break;
        case 89:
        name = "卡拉比克 ";
        break;
        case 90:
        name = "基利斯 ";
        break;
        case 91:
        name = "奥斯曼尼耶 ";
        break;
        case 92:
        name = "亚洛瓦 ";
        break;
        case 93:
        name = "迪兹杰 ";
        break;
      }
    }
    if (country_code.equals("TT") == true) {
      switch (region_code2) {
        case 1:
        name = "华宇 ";
        break;
        case 2:
        name = "卡罗尼 ";
        break;
        case 3:
        name = "马亚罗 ";
        break;
        case 4:
        name = "Nariva ";
        break;
        case 5:
        name = "港，西班牙 ";
        break;
        case 6:
        name = "圣安德鲁 ";
        break;
        case 7:
        name = "圣大卫 ";
        break;
        case 8:
        name = "圣乔治 ";
        break;
        case 9:
        name = "圣帕特里克节 ";
        break;
        case 10:
        name = "圣费尔南多 ";
        break;
        case 11:
        name = "多巴哥 ";
        break;
        case 12:
        name = "维多利亚 ";
        break;
      }
    }
    if (country_code.equals("TW") == true) {
      switch (region_code2) {
        case 1:
        name = "福谦 ";
        break;
        case 2:
        name = "高雄 ";
        break;
        case 3:
        name = "台培 ";
        break;
        case 4:
        name = "台婉 ";
        break;
      }
    }
    if (country_code.equals("TZ") == true) {
      switch (region_code2) {
        case 2:
        name = "滨海区 ";
        break;
        case 3:
        name = "多多马 ";
        break;
        case 4:
        name = "伊林加 ";
        break;
        case 5:
        name = "基戈马 ";
        break;
        case 6:
        name = "乞力马扎罗山 ";
        break;
        case 7:
        name = "临敌 ";
        break;
        case 8:
        name = "马拉 ";
        break;
        case 9:
        name = "姆贝亚 ";
        break;
        case 10:
        name = "莫罗戈罗 ";
        break;
        case 11:
        name = "姆特瓦拉 ";
        break;
        case 12:
        name = "姆万扎 ";
        break;
        case 13:
        name = "北奔巴岛 ";
        break;
        case 14:
        name = "鲁伍马 ";
        break;
        case 15:
        name = "希尼安加 ";
        break;
        case 16:
        name = "辛吉达 ";
        break;
        case 17:
        name = "塔波拉 ";
        break;
        case 18:
        name = "坦噶 ";
        break;
        case 19:
        name = "卡盖拉 ";
        break;
        case 20:
        name = "奔巴岛南 ";
        break;
        case 21:
        name = "桑给巴尔中央 ";
        break;
        case 22:
        name = "桑给巴尔北 ";
        break;
        case 23:
        name = "达累斯萨拉姆 ";
        break;
        case 24:
        name = "鲁夸 ";
        break;
        case 25:
        name = "桑给巴尔城市 ";
        break;
        case 26:
        name = "阿鲁沙 ";
        break;
        case 27:
        name = "马尼亚拉 ";
        break;
      }
    }
    if (country_code.equals("UA") == true) {
      switch (region_code2) {
        case 1:
        name = "切尔卡瑟州' ";
        break;
        case 2:
        name = "切尔尼戈夫州' ";
        break;
        case 3:
        name = "切尔诺夫策州' ";
        break;
        case 4:
        name = "第聂伯罗波得罗夫斯克州' ";
        break;
        case 5:
        name = "顿涅茨克州' ";
        break;
        case 6:
        name = "的伊万诺 - 佛兰科夫州' ";
        break;
        case 7:
        name = "哈尔科夫州' ";
        break;
        case 8:
        name = "赫尔松州' ";
        break;
        case 9:
        name = "赫梅利尼茨基州' ";
        break;
        case 10:
        name = "基洛夫格勒州' ";
        break;
        case 11:
        name = "克里木 ";
        break;
        case 12:
        name = "省份Kyyiv ";
        break;
        case 13:
        name = "Kyyivs'ka州' ";
        break;
        case 14:
        name = "卢甘斯克州' ";
        break;
        case 15:
        name = "利沃夫州' ";
        break;
        case 16:
        name = "Mykolayivs'ka州' ";
        break;
        case 17:
        name = "Odes'ka州' ";
        break;
        case 18:
        name = "波尔塔瓦州' ";
        break;
        case 19:
        name = "洛夫诺州' ";
        break;
        case 20:
        name = "塞瓦斯托波尔' ";
        break;
        case 21:
        name = "Sums'ka州' ";
        break;
        case 22:
        name = "捷尔诺波尔州' ";
        break;
        case 23:
        name = "文尼察州' ";
        break;
        case 24:
        name = "Volyns'ka州' ";
        break;
        case 25:
        name = "外喀尔巴阡州' ";
        break;
        case 26:
        name = "扎波罗热州“ ";
        break;
        case 27:
        name = "日托米尔州' ";
        break;
      }
    }
    if (country_code.equals("UG") == true) {
      switch (region_code2) {
        case 5:
        name = "布索加 ";
        break;
        case 8:
        name = "卡拉莫贾 ";
        break;
        case 12:
        name = "南布干达 ";
        break;
        case 18:
        name = "中央 ";
        break;
        case 20:
        name = "东 ";
        break;
        case 21:
        name = "尼罗河 ";
        break;
        case 22:
        name = "北布干达 ";
        break;
        case 23:
        name = "北方 ";
        break;
        case 24:
        name = "南部的 ";
        break;
        case 25:
        name = "西 ";
        break;
        case 33:
        name = "神社 ";
        break;
        case 36:
        name = "卡兰加拉 ";
        break;
        case 37:
        name = "坎帕拉 ";
        break;
        case 42:
        name = "基博加 ";
        break;
        case 52:
        name = "姆巴拉拉 ";
        break;
        case 56:
        name = "穆本德 ";
        break;
        case 65:
        name = "阿朱马尼 ";
        break;
        case 66:
        name = "布吉里 ";
        break;
        case 67:
        name = "布西亚 ";
        break;
        case 69:
        name = "卡塔奎 ";
        break;
        case 71:
        name = "马萨卡 ";
        break;
        case 73:
        name = "纳卡松戈拉 ";
        break;
        case 74:
        name = "森巴布莱 ";
        break;
        case 77:
        name = "阿鲁阿 ";
        break;
        case 78:
        name = "伊甘加 ";
        break;
        case 79:
        name = "卡巴罗莱 ";
        break;
        case 80:
        name = "卡贝拉马伊多 ";
        break;
        case 81:
        name = "卡姆文盖 ";
        break;
        case 82:
        name = "卡农古 ";
        break;
        case 83:
        name = "卡永加 ";
        break;
        case 84:
        name = "基特古姆 ";
        break;
        case 85:
        name = "基恩乔乔 ";
        break;
        case 86:
        name = "马尤盖 ";
        break;
        case 87:
        name = "姆巴莱 ";
        break;
        case 88:
        name = "诸元 ";
        break;
        case 89:
        name = "姆皮吉 ";
        break;
        case 90:
        name = "穆科诺 ";
        break;
        case 91:
        name = "纳卡皮里皮里特 ";
        break;
        case 92:
        name = "帕德尔 ";
        break;
        case 93:
        name = "鲁昆吉里 ";
        break;
        case 94:
        name = "锡龙科 ";
        break;
        case 95:
        name = "索罗提 ";
        break;
        case 96:
        name = "瓦基索 ";
        break;
        case 97:
        name = "永贝 ";
        break;
      }
    }
    if (country_code.equals("UY") == true) {
      switch (region_code2) {
        case 1:
        name = "阿蒂加斯 ";
        break;
        case 2:
        name = "卡内洛内斯 ";
        break;
        case 3:
        name = "塞罗拉尔戈 ";
        break;
        case 4:
        name = "科洛尼亚 ";
        break;
        case 5:
        name = "杜拉斯诺 ";
        break;
        case 6:
        name = "弗洛雷斯 ";
        break;
        case 7:
        name = "佛罗里达 ";
        break;
        case 8:
        name = "拉瓦耶哈 ";
        break;
        case 9:
        name = "马尔多纳多 ";
        break;
        case 10:
        name = "蒙得维的亚 ";
        break;
        case 11:
        name = "派桑杜 ";
        break;
        case 12:
        name = "里奥内格罗 ";
        break;
        case 13:
        name = "里维拉 ";
        break;
        case 14:
        name = "罗恰 ";
        break;
        case 15:
        name = "萨尔托 ";
        break;
        case 16:
        name = "圣何塞 ";
        break;
        case 17:
        name = "索里亚诺 ";
        break;
        case 18:
        name = "塔夸伦博 ";
        break;
        case 19:
        name = "Ÿ特雷斯Treinta ";
        break;
      }
    }
    if (country_code.equals("UZ") == true) {
      switch (region_code2) {
        case 1:
        name = "安集延 ";
        break;
        case 2:
        name = "Bukhoro ";
        break;
        case 3:
        name = "Farghona ";
        break;
        case 4:
        name = "Jizzakh ";
        break;
        case 5:
        name = "Khorazm ";
        break;
        case 6:
        name = "纳曼干 ";
        break;
        case 7:
        name = "Nawoiy ";
        break;
        case 8:
        name = "卡什卡达里亚 ";
        break;
        case 9:
        name = "Qoraqalpoghiston ";
        break;
        case 10:
        name = "撒马尔罕 ";
        break;
        case 11:
        name = "锡尔河 ";
        break;
        case 12:
        name = "Surkhondaryo ";
        break;
        case 13:
        name = "塔什干 ";
        break;
        case 14:
        name = "塔什干 ";
        break;
      }
    }
    if (country_code.equals("VC") == true) {
      switch (region_code2) {
        case 1:
        name = "夏洛特 ";
        break;
        case 2:
        name = "圣安德鲁 ";
        break;
        case 3:
        name = "圣大卫 ";
        break;
        case 4:
        name = "圣乔治 ";
        break;
        case 5:
        name = "圣帕特里克节 ";
        break;
        case 6:
        name = "格林纳丁斯 ";
        break;
      }
    }
    if (country_code.equals("VE") == true) {
      switch (region_code2) {
        case 1:
        name = "亚马孙 ";
        break;
        case 2:
        name = "安索阿特吉 ";
        break;
        case 3:
        name = "阿普雷 ";
        break;
        case 4:
        name = "阿拉瓜州 ";
        break;
        case 5:
        name = "巴里纳斯 ";
        break;
        case 6:
        name = "玻利瓦尔 ";
        break;
        case 7:
        name = "卡拉沃沃 ";
        break;
        case 8:
        name = "科赫德斯 ";
        break;
        case 9:
        name = "阿马库罗三角洲 ";
        break;
        case 11:
        name = "鹘 ";
        break;
        case 12:
        name = "瓜里科 ";
        break;
        case 13:
        name = "拉拉 ";
        break;
        case 14:
        name = "梅里达 ";
        break;
        case 15:
        name = "米兰达 ";
        break;
        case 16:
        name = "莫纳加斯 ";
        break;
        case 17:
        name = "新埃斯帕塔 ";
        break;
        case 18:
        name = "波图格萨 ";
        break;
        case 19:
        name = "苏克雷 ";
        break;
        case 20:
        name = "塔奇拉 ";
        break;
        case 21:
        name = "特鲁希略 ";
        break;
        case 22:
        name = "亚拉奎 ";
        break;
        case 23:
        name = "苏利亚 ";
        break;
        case 24:
        name = "联邦属地 ";
        break;
        case 25:
        name = "联邦首都区 ";
        break;
        case 26:
        name = "巴尔加斯 ";
        break;
      }
    }
    if (country_code.equals("VN") == true) {
      switch (region_code2) {
        case 1:
        name = "安江 ";
        break;
        case 2:
        name = "BAC泰国 ";
        break;
        case 3:
        name = "槟 ";
        break;
        case 4:
        name = "平阳三添 ";
        break;
        case 5:
        name = "高平 ";
        break;
        case 6:
        name = "九龙江 ";
        break;
        case 7:
        name = "DAC紫胶 ";
        break;
        case 9:
        name = "同塔 ";
        break;
        case 11:
        name = "哈BAC ";
        break;
        case 12:
        name = "海红 ";
        break;
        case 13:
        name = "海防 ";
        break;
        case 14:
        name = "哈越南广宁 ";
        break;
        case 15:
        name = "河内 ";
        break;
        case 16:
        name = "哈子平 ";
        break;
        case 17:
        name = "哈宣 ";
        break;
        case 19:
        name = "黄连山 ";
        break;
        case 20:
        name = "胡志明市 ";
        break;
        case 21:
        name = "坚江 ";
        break;
        case 22:
        name = "莱洲 ";
        break;
        case 23:
        name = "林东 ";
        break;
        case 24:
        name = "龙安 ";
        break;
        case 25:
        name = "明海 ";
        break;
        case 26:
        name = "义安静省 ";
        break;
        case 27:
        name = "义平 ";
        break;
        case 28:
        name = "富庆 ";
        break;
        case 29:
        name = "广南岘港 ";
        break;
        case 30:
        name = "广宁 ";
        break;
        case 31:
        name = "宋BE ";
        break;
        case 32:
        name = "儿子拉 ";
        break;
        case 33:
        name = "西宁 ";
        break;
        case 34:
        name = "清化 ";
        break;
        case 35:
        name = "泰平 ";
        break;
        case 36:
        name = "顺海 ";
        break;
        case 37:
        name = "田江 ";
        break;
        case 38:
        name = "富永 ";
        break;
        case 39:
        name = "谅山 ";
        break;
        case 40:
        name = "同奈省 ";
        break;
        case 43:
        name = "安江 ";
        break;
        case 44:
        name = "DAC紫胶 ";
        break;
        case 45:
        name = "同奈省 ";
        break;
        case 46:
        name = "同塔 ";
        break;
        case 47:
        name = "坚江 ";
        break;
        case 48:
        name = "明海 ";
        break;
        case 49:
        name = "宋BE ";
        break;
        case 50:
        name = "富永 ";
        break;
        case 51:
        name = "河内 ";
        break;
        case 52:
        name = "胡志明市 ";
        break;
        case 53:
        name = "巴地 - 头顿 ";
        break;
        case 54:
        name = "平定 ";
        break;
        case 55:
        name = "平顺 ";
        break;
        case 56:
        name = "芹苴 ";
        break;
        case 57:
        name = "嘉莱 ";
        break;
        case 58:
        name = "河江 ";
        break;
        case 59:
        name = "河西 ";
        break;
        case 60:
        name = "河静 ";
        break;
        case 61:
        name = "华平 ";
        break;
        case 62:
        name = "庆和省 ";
        break;
        case 63:
        name = "昆嵩 ";
        break;
        case 64:
        name = "广治 ";
        break;
        case 65:
        name = "南河 ";
        break;
        case 66:
        name = "义安 ";
        break;
        case 67:
        name = "宁平 ";
        break;
        case 68:
        name = "宁顺 ";
        break;
        case 69:
        name = "富安 ";
        break;
        case 70:
        name = "广平 ";
        break;
        case 71:
        name = "Quang Ngai的 ";
        break;
        case 72:
        name = "广治 ";
        break;
        case 73:
        name = "朔庄 ";
        break;
        case 74:
        name = "承天 ";
        break;
        case 75:
        name = "茶荣 ";
        break;
        case 76:
        name = "宣光 ";
        break;
        case 77:
        name = "永隆 ";
        break;
        case 78:
        name = "岘港 ";
        break;
        case 79:
        name = "海阳 ";
        break;
        case 80:
        name = "哈南 ";
        break;
        case 81:
        name = "兴安 ";
        break;
        case 82:
        name = "南定省 ";
        break;
        case 83:
        name = "富寿 ";
        break;
        case 84:
        name = "广南 ";
        break;
        case 85:
        name = "泰国阮 ";
        break;
        case 86:
        name = "荣市局省 ";
        break;
        case 87:
        name = "芹苴 ";
        break;
        case 88:
        name = "多乐 ";
        break;
        case 89:
        name = "莱洲 ";
        break;
        case 90:
        name = "老财 ";
        break;
        case 91:
        name = "达农 ";
        break;
        case 92:
        name = "奠边府 ";
        break;
        case 93:
        name = "后江 ";
        break;
      }
    }
    if (country_code.equals("VU") == true) {
      switch (region_code2) {
        case 5:
        name = "Ambrym ";
        break;
        case 6:
        name = "青叶 ";
        break;
        case 7:
        name = "托尔巴 ";
        break;
        case 8:
        name = "埃法特岛 ";
        break;
        case 9:
        name = "外延 ";
        break;
        case 10:
        name = "Malakula ";
        break;
        case 11:
        name = "帕阿马 ";
        break;
        case 12:
        name = "庞特科特 ";
        break;
        case 13:
        name = "秋刀鱼 ";
        break;
        case 14:
        name = "牧羊人 ";
        break;
        case 15:
        name = "塔菲阿 ";
        break;
        case 16:
        name = "马朗帕 ";
        break;
        case 17:
        name = "彭纳马 ";
        break;
        case 18:
        name = "谢法 ";
        break;
      }
    }
    if (country_code.equals("WS") == true) {
      switch (region_code2) {
        case 2:
        name = "艾加-I-LE-大 ";
        break;
        case 3:
        name = "阿图阿 ";
        break;
        case 4:
        name = "发 ";
        break;
        case 5:
        name = "加加 ";
        break;
        case 6:
        name = "VA ";
        break;
        case 7:
        name = "加盖福毛加 ";
        break;
        case 8:
        name = "帕劳利 ";
        break;
        case 9:
        name = "Satupa ";
        break;
        case 10:
        name = "图阿马萨加 ";
        break;
        case 11:
        name = "韦西加诺 ";
        break;
      }
    }
    if (country_code.equals("YE") == true) {
      switch (region_code2) {
        case 1:
        name = "阿比扬 ";
        break;
        case 2:
        name = "阿丹 ";
        break;
        case 3:
        name = "Al Mahrah的 ";
        break;
        case 4:
        name = "哈达拉毛 ";
        break;
        case 5:
        name = "夏布瓦 ";
        break;
        case 6:
        name = "艾尔格哈达 ";
        break;
        case 8:
        name = "荷台达 ";
        break;
        case 10:
        name = "迈赫维特 ";
        break;
        case 11:
        name = "扎马尔 ";
        break;
        case 14:
        name = "马里卜 ";
        break;
        case 15:
        name = "萨 ";
        break;
        case 16:
        name = "圣 ";
        break;
        case 20:
        name = "贝达 ";
        break;
        case 21:
        name = "焦夫 ";
        break;
        case 22:
        name = "哈杰 ";
        break;
        case 23:
        name = "伊布 ";
        break;
        case 24:
        name = "拉赫季 ";
        break;
        case 25:
        name = "大 ";
        break;
      }
    }
    if (country_code.equals("ZA") == true) {
      switch (region_code2) {
        case 1:
        name = "西北省 ";
        break;
        case 2:
        name = "夸祖鲁 - 纳塔尔省 ";
        break;
        case 3:
        name = "自由州 ";
        break;
        case 5:
        name = "东开普省 ";
        break;
        case 6:
        name = "电话 ";
        break;
        case 7:
        name = "姆普马兰加 ";
        break;
        case 8:
        name = "北开普省 ";
        break;
        case 9:
        name = "林波波 ";
        break;
        case 10:
        name = "西北 ";
        break;
        case 11:
        name = "西开普省 ";
        break;
      }
    }
    if (country_code.equals("ZM") == true) {
      switch (region_code2) {
        case 1:
        name = "西 ";
        break;
        case 2:
        name = "中央 ";
        break;
        case 3:
        name = "东 ";
        break;
        case 4:
        name = "卢阿普拉 ";
        break;
        case 5:
        name = "北方 ";
        break;
        case 6:
        name = "北西方 ";
        break;
        case 7:
        name = "南部的 ";
        break;
        case 8:
        name = "铜带 ";
        break;
        case 9:
        name = "卢萨卡 ";
        break;
      }
    }
    if (country_code.equals("ZW") == true) {
      switch (region_code2) {
        case 1:
        name = "马尼卡​​兰 ";
        break;
        case 2:
        name = "米德兰 ";
        break;
        case 3:
        name = "马绍纳兰 ";
        break;
        case 4:
        name = "东马绍纳兰 ";
        break;
        case 5:
        name = "西马绍纳兰 ";
        break;
        case 6:
        name = "北马塔贝莱兰省 ";
        break;
        case 7:
        name = "南马塔贝莱兰省 ";
        break;
        case 8:
        name = "马斯温戈 ";
        break;
        case 9:
        name = "布拉瓦约 ";
        break;
        case 10:
        name = "哈拉雷";
        break;
      }
    }
    return name;
  }
}
