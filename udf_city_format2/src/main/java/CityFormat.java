import org.apache.hadoop.hive.ql.exec.UDF;

/*
    CityFormat("北京") 输出 北京市
    CityFormat("北京") 输出 北京市

    CityFormat("北京","CityShorName2FullName") 输出 北京市
    CityFormat("北京市","CtiyFullName2ShorName") 输出 北京
 */

public class CityFormat extends UDF {

    public String CtiyFullName2ShorName(String CityString){
        if (CityString.equals("北京市") ){ return "北京"; }
        else  if (CityString.equals("天津市") ){ return "天津"; }
        else  if (CityString.equals("石家庄市") ){ return "石家庄"; }
        else  if (CityString.equals("唐山市") ){ return "唐山"; }
        else  if (CityString.equals("秦皇岛市") ){ return "秦皇岛"; }
        else  if (CityString.equals("邯郸市") ){ return "邯郸"; }
        else  if (CityString.equals("邢台市") ){ return "邢台"; }
        else  if (CityString.equals("保定市") ){ return "保定"; }
        else  if (CityString.equals("张家口市") ){ return "张家口"; }
        else  if (CityString.equals("承德市") ){ return "承德"; }
        else  if (CityString.equals("沧州市") ){ return "沧州"; }
        else  if (CityString.equals("廊坊市") ){ return "廊坊"; }
        else  if (CityString.equals("衡水市") ){ return "衡水"; }
        else  if (CityString.equals("太原市") ){ return "太原"; }
        else  if (CityString.equals("大同市") ){ return "大同"; }
        else  if (CityString.equals("阳泉市") ){ return "阳泉"; }
        else  if (CityString.equals("长治市") ){ return "长治"; }
        else  if (CityString.equals("晋城市") ){ return "晋城"; }
        else  if (CityString.equals("朔州市") ){ return "朔州"; }
        else  if (CityString.equals("晋中市") ){ return "晋中"; }
        else  if (CityString.equals("运城市") ){ return "运城"; }
        else  if (CityString.equals("忻州市") ){ return "忻州"; }
        else  if (CityString.equals("临汾市") ){ return "临汾"; }
        else  if (CityString.equals("吕梁市") ){ return "吕梁"; }
        else  if (CityString.equals("呼和浩特市") ){ return "呼和浩特"; }
        else  if (CityString.equals("包头市") ){ return "包头"; }
        else  if (CityString.equals("乌海市") ){ return "乌海"; }
        else  if (CityString.equals("赤峰市") ){ return "赤峰"; }
        else  if (CityString.equals("通辽市") ){ return "通辽"; }
        else  if (CityString.equals("鄂尔多斯市") ){ return "鄂尔多斯"; }
        else  if (CityString.equals("呼伦贝尔市") ){ return "呼伦贝尔"; }
        else  if (CityString.equals("巴彦淖尔市") ){ return "巴彦淖尔"; }
        else  if (CityString.equals("乌兰察布市") ){ return "乌兰察布"; }
        else  if (CityString.equals("兴安盟") ){ return "兴安盟"; }
        else  if (CityString.equals("锡林郭勒盟") ){ return "锡林郭勒"; }
        else  if (CityString.equals("阿拉善盟") ){ return "阿拉善盟"; }
        else  if (CityString.equals("沈阳市") ){ return "沈阳"; }
        else  if (CityString.equals("大连市") ){ return "大连"; }
        else  if (CityString.equals("鞍山市") ){ return "鞍山"; }
        else  if (CityString.equals("抚顺市") ){ return "抚顺"; }
        else  if (CityString.equals("本溪市") ){ return "本溪"; }
        else  if (CityString.equals("丹东市") ){ return "丹东"; }
        else  if (CityString.equals("锦州市") ){ return "锦州"; }
        else  if (CityString.equals("营口市") ){ return "营口"; }
        else  if (CityString.equals("阜新市") ){ return "阜新"; }
        else  if (CityString.equals("辽阳市") ){ return "辽阳"; }
        else  if (CityString.equals("盘锦市") ){ return "盘锦"; }
        else  if (CityString.equals("铁岭市") ){ return "铁岭"; }
        else  if (CityString.equals("朝阳市") ){ return "朝阳"; }
        else  if (CityString.equals("葫芦岛市") ){ return "葫芦岛"; }
        else  if (CityString.equals("长春市") ){ return "长春"; }
        else  if (CityString.equals("吉林市") ){ return "吉林"; }
        else  if (CityString.equals("四平市") ){ return "四平"; }
        else  if (CityString.equals("辽源市") ){ return "辽源"; }
        else  if (CityString.equals("通化市") ){ return "通化"; }
        else  if (CityString.equals("白山市") ){ return "白山"; }
        else  if (CityString.equals("松原市") ){ return "松原"; }
        else  if (CityString.equals("白城市") ){ return "白城"; }
        else  if (CityString.equals("延边朝鲜族自治州") ){ return "延边"; }
        else  if (CityString.equals("哈尔滨市") ){ return "哈尔滨"; }
        else  if (CityString.equals("齐齐哈尔市") ){ return "齐齐哈尔"; }
        else  if (CityString.equals("鸡西市") ){ return "鸡西"; }
        else  if (CityString.equals("鹤岗市") ){ return "鹤岗"; }
        else  if (CityString.equals("双鸭山市") ){ return "双鸭山"; }
        else  if (CityString.equals("大庆市") ){ return "大庆"; }
        else  if (CityString.equals("伊春市") ){ return "伊春"; }
        else  if (CityString.equals("佳木斯市") ){ return "佳木斯"; }
        else  if (CityString.equals("七台河市") ){ return "七台河"; }
        else  if (CityString.equals("牡丹江市") ){ return "牡丹江"; }
        else  if (CityString.equals("黑河市") ){ return "黑河"; }
        else  if (CityString.equals("绥化市") ){ return "绥化"; }
        else  if (CityString.equals("大兴安岭地区") ){ return "大兴安岭"; }
        else  if (CityString.equals("上海市") ){ return "上海"; }
        else  if (CityString.equals("南京市") ){ return "南京"; }
        else  if (CityString.equals("无锡市") ){ return "无锡"; }
        else  if (CityString.equals("徐州市") ){ return "徐州"; }
        else  if (CityString.equals("常州市") ){ return "常州"; }
        else  if (CityString.equals("苏州市") ){ return "苏州"; }
        else  if (CityString.equals("南通市") ){ return "南通"; }
        else  if (CityString.equals("连云港市") ){ return "连云港"; }
        else  if (CityString.equals("淮安市") ){ return "淮安"; }
        else  if (CityString.equals("盐城市") ){ return "盐城"; }
        else  if (CityString.equals("扬州市") ){ return "扬州"; }
        else  if (CityString.equals("镇江市") ){ return "镇江"; }
        else  if (CityString.equals("泰州市") ){ return "泰州"; }
        else  if (CityString.equals("宿迁市") ){ return "宿迁"; }
        else  if (CityString.equals("杭州市") ){ return "杭州"; }
        else  if (CityString.equals("宁波市") ){ return "宁波"; }
        else  if (CityString.equals("温州市") ){ return "温州"; }
        else  if (CityString.equals("嘉兴市") ){ return "嘉兴"; }
        else  if (CityString.equals("湖州市") ){ return "湖州"; }
        else  if (CityString.equals("绍兴市") ){ return "绍兴"; }
        else  if (CityString.equals("金华市") ){ return "金华"; }
        else  if (CityString.equals("衢州市") ){ return "衢州"; }
        else  if (CityString.equals("舟山市") ){ return "舟山"; }
        else  if (CityString.equals("台州市") ){ return "台州"; }
        else  if (CityString.equals("丽水市") ){ return "丽水"; }
        else  if (CityString.equals("合肥市") ){ return "合肥"; }
        else  if (CityString.equals("芜湖市") ){ return "芜湖"; }
        else  if (CityString.equals("蚌埠市") ){ return "蚌埠"; }
        else  if (CityString.equals("淮南市") ){ return "淮南"; }
        else  if (CityString.equals("马鞍山市") ){ return "马鞍山"; }
        else  if (CityString.equals("淮北市") ){ return "淮北"; }
        else  if (CityString.equals("铜陵市") ){ return "铜陵"; }
        else  if (CityString.equals("安庆市") ){ return "安庆"; }
        else  if (CityString.equals("黄山市") ){ return "黄山"; }
        else  if (CityString.equals("滁州市") ){ return "滁州"; }
        else  if (CityString.equals("阜阳市") ){ return "阜阳"; }
        else  if (CityString.equals("宿州市") ){ return "宿州"; }
        else  if (CityString.equals("六安市") ){ return "六安"; }
        else  if (CityString.equals("亳州市") ){ return "亳州"; }
        else  if (CityString.equals("池州市") ){ return "池州"; }
        else  if (CityString.equals("宣城市") ){ return "宣城"; }
        else  if (CityString.equals("福州市") ){ return "福州"; }
        else  if (CityString.equals("厦门市") ){ return "厦门"; }
        else  if (CityString.equals("莆田市") ){ return "莆田"; }
        else  if (CityString.equals("三明市") ){ return "三明"; }
        else  if (CityString.equals("泉州市") ){ return "泉州"; }
        else  if (CityString.equals("漳州市") ){ return "漳州"; }
        else  if (CityString.equals("南平市") ){ return "南平"; }
        else  if (CityString.equals("龙岩市") ){ return "龙岩"; }
        else  if (CityString.equals("宁德市") ){ return "宁德"; }
        else  if (CityString.equals("南昌市") ){ return "南昌"; }
        else  if (CityString.equals("景德镇市") ){ return "景德镇"; }
        else  if (CityString.equals("萍乡市") ){ return "萍乡"; }
        else  if (CityString.equals("九江市") ){ return "九江"; }
        else  if (CityString.equals("新余市") ){ return "新余"; }
        else  if (CityString.equals("鹰潭市") ){ return "鹰潭"; }
        else  if (CityString.equals("赣州市") ){ return "赣州"; }
        else  if (CityString.equals("吉安市") ){ return "吉安"; }
        else  if (CityString.equals("宜春市") ){ return "宜春"; }
        else  if (CityString.equals("抚州市") ){ return "抚州"; }
        else  if (CityString.equals("上饶市") ){ return "上饶"; }
        else  if (CityString.equals("济南市") ){ return "济南"; }
        else  if (CityString.equals("青岛市") ){ return "青岛"; }
        else  if (CityString.equals("淄博市") ){ return "淄博"; }
        else  if (CityString.equals("枣庄市") ){ return "枣庄"; }
        else  if (CityString.equals("东营市") ){ return "东营"; }
        else  if (CityString.equals("烟台市") ){ return "烟台"; }
        else  if (CityString.equals("潍坊市") ){ return "潍坊"; }
        else  if (CityString.equals("济宁市") ){ return "济宁"; }
        else  if (CityString.equals("泰安市") ){ return "泰安"; }
        else  if (CityString.equals("威海市") ){ return "威海"; }
        else  if (CityString.equals("日照市") ){ return "日照"; }
        else  if (CityString.equals("临沂市") ){ return "临沂"; }
        else  if (CityString.equals("德州市") ){ return "德州"; }
        else  if (CityString.equals("聊城市") ){ return "聊城"; }
        else  if (CityString.equals("滨州市") ){ return "滨州"; }
        else  if (CityString.equals("菏泽市") ){ return "菏泽"; }
        else  if (CityString.equals("郑州市") ){ return "郑州"; }
        else  if (CityString.equals("开封市") ){ return "开封"; }
        else  if (CityString.equals("洛阳市") ){ return "洛阳"; }
        else  if (CityString.equals("平顶山市") ){ return "平顶山"; }
        else  if (CityString.equals("安阳市") ){ return "安阳"; }
        else  if (CityString.equals("鹤壁市") ){ return "鹤壁"; }
        else  if (CityString.equals("新乡市") ){ return "新乡"; }
        else  if (CityString.equals("焦作市") ){ return "焦作"; }
        else  if (CityString.equals("濮阳市") ){ return "濮阳"; }
        else  if (CityString.equals("许昌市") ){ return "许昌"; }
        else  if (CityString.equals("漯河市") ){ return "漯河"; }
        else  if (CityString.equals("三门峡市") ){ return "三门峡"; }
        else  if (CityString.equals("南阳市") ){ return "南阳"; }
        else  if (CityString.equals("商丘市") ){ return "商丘"; }
        else  if (CityString.equals("信阳市") ){ return "信阳"; }
        else  if (CityString.equals("周口市") ){ return "周口"; }
        else  if (CityString.equals("驻马店市") ){ return "驻马店"; }
        else  if (CityString.equals("济源市") ){ return "济源"; }
        else  if (CityString.equals("武汉市") ){ return "武汉"; }
        else  if (CityString.equals("黄石市") ){ return "黄石"; }
        else  if (CityString.equals("十堰市") ){ return "十堰"; }
        else  if (CityString.equals("宜昌市") ){ return "宜昌"; }
        else  if (CityString.equals("襄阳市") ){ return "襄阳"; }
        else  if (CityString.equals("鄂州市") ){ return "鄂州"; }
        else  if (CityString.equals("荆门市") ){ return "荆门"; }
        else  if (CityString.equals("孝感市") ){ return "孝感"; }
        else  if (CityString.equals("荆州市") ){ return "荆州"; }
        else  if (CityString.equals("黄冈市") ){ return "黄冈"; }
        else  if (CityString.equals("咸宁市") ){ return "咸宁"; }
        else  if (CityString.equals("随州市") ){ return "随州"; }
        else  if (CityString.equals("恩施土家族苗族自治州") ){ return "恩施"; }
        else  if (CityString.equals("仙桃市") ){ return "仙桃"; }
        else  if (CityString.equals("潜江市") ){ return "潜江"; }
        else  if (CityString.equals("天门市") ){ return "天门"; }
        else  if (CityString.equals("神农架林区") ){ return "神农架"; }
        else  if (CityString.equals("长沙市") ){ return "长沙"; }
        else  if (CityString.equals("株洲市") ){ return "株洲"; }
        else  if (CityString.equals("湘潭市") ){ return "湘潭"; }
        else  if (CityString.equals("衡阳市") ){ return "衡阳"; }
        else  if (CityString.equals("邵阳市") ){ return "邵阳"; }
        else  if (CityString.equals("岳阳市") ){ return "岳阳"; }
        else  if (CityString.equals("常德市") ){ return "常德"; }
        else  if (CityString.equals("张家界市") ){ return "张家界"; }
        else  if (CityString.equals("益阳市") ){ return "益阳"; }
        else  if (CityString.equals("郴州市") ){ return "郴州"; }
        else  if (CityString.equals("永州市") ){ return "永州"; }
        else  if (CityString.equals("怀化市") ){ return "怀化"; }
        else  if (CityString.equals("娄底市") ){ return "娄底"; }
        else  if (CityString.equals("湘西土家族苗族自治州") ){ return "湘西"; }
        else  if (CityString.equals("广州市") ){ return "广州"; }
        else  if (CityString.equals("韶关市") ){ return "韶关"; }
        else  if (CityString.equals("深圳市") ){ return "深圳"; }
        else  if (CityString.equals("珠海市") ){ return "珠海"; }
        else  if (CityString.equals("汕头市") ){ return "汕头"; }
        else  if (CityString.equals("佛山市") ){ return "佛山"; }
        else  if (CityString.equals("江门市") ){ return "江门"; }
        else  if (CityString.equals("湛江市") ){ return "湛江"; }
        else  if (CityString.equals("茂名市") ){ return "茂名"; }
        else  if (CityString.equals("肇庆市") ){ return "肇庆"; }
        else  if (CityString.equals("惠州市") ){ return "惠州"; }
        else  if (CityString.equals("梅州市") ){ return "梅州"; }
        else  if (CityString.equals("汕尾市") ){ return "汕尾"; }
        else  if (CityString.equals("河源市") ){ return "河源"; }
        else  if (CityString.equals("阳江市") ){ return "阳江"; }
        else  if (CityString.equals("清远市") ){ return "清远"; }
        else  if (CityString.equals("东莞市") ){ return "东莞"; }
        else  if (CityString.equals("中山市") ){ return "中山"; }
        else  if (CityString.equals("东沙群岛") ){ return "东沙群岛"; }
        else  if (CityString.equals("潮州市") ){ return "潮州"; }
        else  if (CityString.equals("揭阳市") ){ return "揭阳"; }
        else  if (CityString.equals("云浮市") ){ return "云浮"; }
        else  if (CityString.equals("南宁市") ){ return "南宁"; }
        else  if (CityString.equals("柳州市") ){ return "柳州"; }
        else  if (CityString.equals("桂林市") ){ return "桂林"; }
        else  if (CityString.equals("梧州市") ){ return "梧州"; }
        else  if (CityString.equals("北海市") ){ return "北海"; }
        else  if (CityString.equals("防城港市") ){ return "防城港"; }
        else  if (CityString.equals("钦州市") ){ return "钦州"; }
        else  if (CityString.equals("贵港市") ){ return "贵港"; }
        else  if (CityString.equals("玉林市") ){ return "玉林"; }
        else  if (CityString.equals("百色市") ){ return "百色"; }
        else  if (CityString.equals("贺州市") ){ return "贺州"; }
        else  if (CityString.equals("河池市") ){ return "河池"; }
        else  if (CityString.equals("来宾市") ){ return "来宾"; }
        else  if (CityString.equals("崇左市") ){ return "崇左"; }
        else  if (CityString.equals("涠洲岛") ){ return "涠洲岛"; }
        else  if (CityString.equals("海口市") ){ return "海口"; }
        else  if (CityString.equals("三亚市") ){ return "三亚"; }
        else  if (CityString.equals("三沙市") ){ return "三沙"; }
        else  if (CityString.equals("儋州市") ){ return "儋州"; }
        else  if (CityString.equals("五指山市") ){ return "五指山"; }
        else  if (CityString.equals("琼海市") ){ return "琼海"; }
        else  if (CityString.equals("文昌市") ){ return "文昌"; }
        else  if (CityString.equals("万宁市") ){ return "万宁"; }
        else  if (CityString.equals("东方市") ){ return "东方"; }
        else  if (CityString.equals("定安县") ){ return "定安县"; }
        else  if (CityString.equals("定安") ){ return "定安县"; }

        else  if (CityString.equals("屯昌县") ){ return "屯昌县"; }
        else  if (CityString.equals("澄迈县") ){ return "澄迈县"; }
        else  if (CityString.equals("澄迈") ){ return "澄迈县"; }

        else  if (CityString.equals("临高县") ){ return "临高县"; }
        else  if (CityString.equals("白沙黎族自治县") ){ return "白沙县"; }
        else  if (CityString.equals("白沙") ){ return "白沙县"; }

        else  if (CityString.equals("昌江黎族自治县") ){ return "昌江县"; }
        else  if (CityString.equals("乐东黎族自治县") ){ return "乐东县"; }
        else  if (CityString.equals("陵水黎族自治县") ){ return "陵水县"; }
        else  if (CityString.equals("陵水") ){ return "陵水县"; }
        else  if (CityString.equals("保亭黎族苗族自治县") ){ return "保亭县"; }
        else  if (CityString.equals("琼中黎族苗族自治县") ){ return "琼中县"; }
        else  if (CityString.equals("重庆市") ){ return "重庆"; }
        else  if (CityString.equals("成都市") ){ return "成都"; }
        else  if (CityString.equals("自贡市") ){ return "自贡"; }
        else  if (CityString.equals("攀枝花市") ){ return "攀枝花"; }
        else  if (CityString.equals("泸州市") ){ return "泸州"; }
        else  if (CityString.equals("德阳市") ){ return "德阳"; }
        else  if (CityString.equals("绵阳市") ){ return "绵阳"; }
        else  if (CityString.equals("广元市") ){ return "广元"; }
        else  if (CityString.equals("遂宁市") ){ return "遂宁"; }
        else  if (CityString.equals("内江市") ){ return "内江"; }
        else  if (CityString.equals("乐山市") ){ return "乐山"; }
        else  if (CityString.equals("南充市") ){ return "南充"; }
        else  if (CityString.equals("眉山市") ){ return "眉山"; }
        else  if (CityString.equals("宜宾市") ){ return "宜宾"; }
        else  if (CityString.equals("广安市") ){ return "广安"; }
        else  if (CityString.equals("达州市") ){ return "达州"; }
        else  if (CityString.equals("雅安市") ){ return "雅安"; }
        else  if (CityString.equals("巴中市") ){ return "巴中"; }
        else  if (CityString.equals("资阳市") ){ return "资阳"; }
        else  if (CityString.equals("阿坝藏族羌族自治州") ){ return "阿坝州"; }
        else  if (CityString.equals("甘孜藏族自治州") ){ return "甘孜州"; }
        else  if (CityString.equals("凉山彝族自治州") ){ return "凉山"; }
        else  if (CityString.equals("贵阳市") ){ return "贵阳"; }
        else  if (CityString.equals("六盘水市") ){ return "六盘水"; }
        else  if (CityString.equals("遵义市") ){ return "遵义"; }
        else  if (CityString.equals("安顺市") ){ return "安顺"; }
        else  if (CityString.equals("毕节市") ){ return "毕节"; }
        else  if (CityString.equals("铜仁市") ){ return "铜仁"; }
        else  if (CityString.equals("黔西南布依族苗族自治州") ){ return "黔西南"; }
        else  if (CityString.equals("黔东南苗族侗族自治州") ){ return "黔东南"; }
        else  if (CityString.equals("黔南布依族苗族自治州") ){ return "黔南"; }
        else  if (CityString.equals("昆明市") ){ return "昆明"; }
        else  if (CityString.equals("曲靖市") ){ return "曲靖"; }
        else  if (CityString.equals("玉溪市") ){ return "玉溪"; }
        else  if (CityString.equals("保山市") ){ return "保山"; }
        else  if (CityString.equals("昭通市") ){ return "昭通"; }
        else  if (CityString.equals("丽江市") ){ return "丽江"; }
        else  if (CityString.equals("普洱市") ){ return "普洱"; }
        else  if (CityString.equals("临沧市") ){ return "临沧"; }
        else  if (CityString.equals("楚雄彝族自治州") ){ return "楚雄"; }
        else  if (CityString.equals("红河哈尼族彝族自治州") ){ return "红河"; }
        else  if (CityString.equals("文山壮族苗族自治州") ){ return "文山"; }
        else  if (CityString.equals("西双版纳傣族自治州") ){ return "西双版纳"; }
        else  if (CityString.equals("大理白族自治州") ){ return "大理"; }
        else  if (CityString.equals("德宏傣族景颇族自治州") ){ return "德宏"; }
        else  if (CityString.equals("怒江傈僳族自治州") ){ return "怒江"; }
        else  if (CityString.equals("迪庆藏族自治州") ){ return "迪庆"; }
        else  if (CityString.equals("拉萨市") ){ return "拉萨"; }
        else  if (CityString.equals("日喀则市") ){ return "日喀则"; }
        else  if (CityString.equals("昌都市") ){ return "昌都"; }
        else  if (CityString.equals("林芝市") ){ return "林芝"; }
        else  if (CityString.equals("山南市") ){ return "山南"; }
        else  if (CityString.equals("那曲市") ){ return "那曲"; }
        else  if (CityString.equals("阿里地区") ){ return "阿里地区"; }
        else  if (CityString.equals("阿里") ){ return "阿里地区"; }
        else  if (CityString.equals("西安市") ){ return "西安"; }
        else  if (CityString.equals("铜川市") ){ return "铜川"; }
        else  if (CityString.equals("宝鸡市") ){ return "宝鸡"; }
        else  if (CityString.equals("咸阳市") ){ return "咸阳"; }
        else  if (CityString.equals("渭南市") ){ return "渭南"; }
        else  if (CityString.equals("延安市") ){ return "延安"; }
        else  if (CityString.equals("汉中市") ){ return "汉中"; }
        else  if (CityString.equals("榆林市") ){ return "榆林"; }
        else  if (CityString.equals("安康市") ){ return "安康"; }
        else  if (CityString.equals("商洛市") ){ return "商洛"; }
        else  if (CityString.equals("兰州市") ){ return "兰州"; }
        else  if (CityString.equals("嘉峪关市") ){ return "嘉峪关"; }
        else  if (CityString.equals("金昌市") ){ return "金昌"; }
        else  if (CityString.equals("白银市") ){ return "白银"; }
        else  if (CityString.equals("天水市") ){ return "天水"; }
        else  if (CityString.equals("武威市") ){ return "武威"; }
        else  if (CityString.equals("张掖市") ){ return "张掖"; }
        else  if (CityString.equals("平凉市") ){ return "平凉"; }
        else  if (CityString.equals("酒泉市") ){ return "酒泉"; }
        else  if (CityString.equals("庆阳市") ){ return "庆阳"; }
        else  if (CityString.equals("定西市") ){ return "定西"; }
        else  if (CityString.equals("陇南市") ){ return "陇南"; }
        else  if (CityString.equals("临夏回族自治州") ){ return "临夏"; }
        else  if (CityString.equals("甘南藏族自治州") ){ return "甘南"; }
        else  if (CityString.equals("西宁市") ){ return "西宁"; }
        else  if (CityString.equals("海东市") ){ return "海东"; }
        else  if (CityString.equals("海北藏族自治州") ){ return "海北州"; }
        else  if (CityString.equals("黄南藏族自治州") ){ return "黄南州"; }
        else  if (CityString.equals("海南藏族自治州") ){ return "海南"; }
        else  if (CityString.equals("果洛藏族自治州") ){ return "果洛"; }
        else  if (CityString.equals("玉树藏族自治州") ){ return "玉树"; }
        else  if (CityString.equals("海西蒙古族藏族自治州") ){ return "海西州"; }
        else  if (CityString.equals("银川市") ){ return "银川"; }
        else  if (CityString.equals("石嘴山市") ){ return "石嘴山"; }
        else  if (CityString.equals("吴忠市") ){ return "吴忠"; }
        else  if (CityString.equals("固原市") ){ return "固原"; }
        else  if (CityString.equals("中卫市") ){ return "中卫"; }
        else  if (CityString.equals("乌鲁木齐市") ){ return "乌鲁木齐"; }
        else  if (CityString.equals("克拉玛依市") ){ return "克拉玛依"; }
        else  if (CityString.equals("吐鲁番市") ){ return "吐鲁番"; }
        else  if (CityString.equals("哈密市") ){ return "哈密"; }
        else  if (CityString.equals("昌吉回族自治州") ){ return "昌吉"; }
        else  if (CityString.equals("博尔塔拉蒙古自治州") ){ return "博尔塔拉"; }
        else  if (CityString.equals("巴音郭楞蒙古自治州") ){ return "巴音郭楞"; }
        else  if (CityString.equals("阿克苏地区") ){ return "阿克苏地区"; }
        else  if (CityString.equals("阿克苏") ){ return "阿克苏地区"; }
        else  if (CityString.equals("克孜勒苏柯尔克孜自治州") ){ return "克州"; }
        else  if (CityString.equals("喀什地区") ){ return "喀什地区"; }
        else  if (CityString.equals("喀什") ){ return "喀什地区"; }
        else  if (CityString.equals("和田地区") ){ return "和田地区"; }
        else  if (CityString.equals("和田") ){ return "和田地区"; }
        else  if (CityString.equals("伊犁哈萨克自治州") ){ return "伊犁州"; }
        else  if (CityString.equals("塔城地区") ){ return "塔城地区"; }
        else  if (CityString.equals("塔城") ){ return "塔城地区"; }
        else  if (CityString.equals("阿勒泰地区") ){ return "阿勒泰地区"; }
        else  if (CityString.equals("阿勒泰") ){ return "阿勒泰地区"; }
        else  if (CityString.equals("石河子市") ){ return "石河子"; }
        else  if (CityString.equals("阿拉尔市") ){ return "阿拉尔"; }
        else  if (CityString.equals("图木舒克市") ){ return "图木舒克"; }
        else  if (CityString.equals("五家渠市") ){ return "五家渠"; }
        else  if (CityString.equals("北屯市") ){ return "北屯"; }
        else  if (CityString.equals("铁门关市") ){ return "铁门关"; }
        else  if (CityString.equals("双河市") ){ return "双河"; }
        else  if (CityString.equals("可克达拉市") ){ return "可克达拉"; }
        else  if (CityString.equals("昆玉市") ){ return "昆玉"; }
        else  if (CityString.equals("台湾省") ){ return "台湾"; }
        else  if (CityString.equals("台北市") ){ return "台北"; }
        else  if (CityString.equals("新北市") ){ return "新北"; }
        else  if (CityString.equals("桃园市") ){ return "桃园"; }
        else  if (CityString.equals("台中市") ){ return "台中"; }
        else  if (CityString.equals("台南市") ){ return "台南"; }
        else  if (CityString.equals("高雄市") ){ return "高雄"; }
        else  if (CityString.equals("基隆市") ){ return "基隆"; }
        else  if (CityString.equals("新竹市") ){ return "新竹"; }
        else  if (CityString.equals("嘉义市") ){ return "嘉义"; }
        else  if (CityString.equals("新竹县") ){ return "新竹县"; }
        else  if (CityString.equals("苗栗县") ){ return "苗栗县"; }
        else  if (CityString.equals("彰化县") ){ return "彰化县"; }
        else  if (CityString.equals("南投县") ){ return "南投县"; }
        else  if (CityString.equals("云林县") ){ return "云林县"; }
        else  if (CityString.equals("嘉义县") ){ return "嘉义县"; }
        else  if (CityString.equals("台东县") ){ return "台东县"; }
        else  if (CityString.equals("花莲县") ){ return "花莲县"; }
        else  if (CityString.equals("澎湖县") ){ return "澎湖县"; }
        else  if (CityString.equals("宜兰县") ){ return "宜兰县"; }
        else  if (CityString.equals("屏东县") ){ return "屏东县"; }
        else  if (CityString.equals("香港特别行政区") ){ return "香港"; }
        else  if (CityString.equals("澳门特别行政区") ){ return "澳门"; }
        else {return "";}
     }

    public String CityShorName2FullName(String CityString){
        if (CityString.equals("北京") ){ return "北京市"; }
        else  if (CityString.equals("天津") ){ return "天津市"; }
        else  if (CityString.equals("石家庄") ){ return "石家庄市"; }
        else  if (CityString.equals("唐山") ){ return "唐山市"; }
        else  if (CityString.equals("秦皇岛") ){ return "秦皇岛市"; }
        else  if (CityString.equals("邯郸") ){ return "邯郸市"; }
        else  if (CityString.equals("邢台") ){ return "邢台市"; }
        else  if (CityString.equals("保定") ){ return "保定市"; }
        else  if (CityString.equals("张家口") ){ return "张家口市"; }
        else  if (CityString.equals("承德") ){ return "承德市"; }
        else  if (CityString.equals("沧州") ){ return "沧州市"; }
        else  if (CityString.equals("廊坊") ){ return "廊坊市"; }
        else  if (CityString.equals("衡水") ){ return "衡水市"; }
        else  if (CityString.equals("太原") ){ return "太原市"; }
        else  if (CityString.equals("大同") ){ return "大同市"; }
        else  if (CityString.equals("阳泉") ){ return "阳泉市"; }
        else  if (CityString.equals("长治") ){ return "长治市"; }
        else  if (CityString.equals("晋城") ){ return "晋城市"; }
        else  if (CityString.equals("朔州") ){ return "朔州市"; }
        else  if (CityString.equals("晋中") ){ return "晋中市"; }
        else  if (CityString.equals("运城") ){ return "运城市"; }
        else  if (CityString.equals("忻州") ){ return "忻州市"; }
        else  if (CityString.equals("临汾") ){ return "临汾市"; }
        else  if (CityString.equals("吕梁") ){ return "吕梁市"; }
        else  if (CityString.equals("呼和浩特") ){ return "呼和浩特市"; }
        else  if (CityString.equals("包头") ){ return "包头市"; }
        else  if (CityString.equals("乌海") ){ return "乌海市"; }
        else  if (CityString.equals("赤峰") ){ return "赤峰市"; }
        else  if (CityString.equals("通辽") ){ return "通辽市"; }
        else  if (CityString.equals("鄂尔多斯") ){ return "鄂尔多斯市"; }
        else  if (CityString.equals("呼伦贝尔") ){ return "呼伦贝尔市"; }
        else  if (CityString.equals("巴彦淖尔") ){ return "巴彦淖尔市"; }
        else  if (CityString.equals("乌兰察布") ){ return "乌兰察布市"; }
        else  if (CityString.equals("兴安盟") ){ return "兴安盟"; }
        else  if (CityString.equals("锡林郭勒") ){ return "锡林郭勒盟"; }
        else  if (CityString.equals("阿拉善盟") ){ return "阿拉善盟"; }
        else  if (CityString.equals("沈阳") ){ return "沈阳市"; }
        else  if (CityString.equals("大连") ){ return "大连市"; }
        else  if (CityString.equals("鞍山") ){ return "鞍山市"; }
        else  if (CityString.equals("抚顺") ){ return "抚顺市"; }
        else  if (CityString.equals("本溪") ){ return "本溪市"; }
        else  if (CityString.equals("丹东") ){ return "丹东市"; }
        else  if (CityString.equals("锦州") ){ return "锦州市"; }
        else  if (CityString.equals("营口") ){ return "营口市"; }
        else  if (CityString.equals("阜新") ){ return "阜新市"; }
        else  if (CityString.equals("辽阳") ){ return "辽阳市"; }
        else  if (CityString.equals("盘锦") ){ return "盘锦市"; }
        else  if (CityString.equals("铁岭") ){ return "铁岭市"; }
        else  if (CityString.equals("朝阳") ){ return "朝阳市"; }
        else  if (CityString.equals("葫芦岛") ){ return "葫芦岛市"; }
        else  if (CityString.equals("长春") ){ return "长春市"; }
        else  if (CityString.equals("吉林") ){ return "吉林市"; }
        else  if (CityString.equals("四平") ){ return "四平市"; }
        else  if (CityString.equals("辽源") ){ return "辽源市"; }
        else  if (CityString.equals("通化") ){ return "通化市"; }
        else  if (CityString.equals("白山") ){ return "白山市"; }
        else  if (CityString.equals("松原") ){ return "松原市"; }
        else  if (CityString.equals("白城") ){ return "白城市"; }
        else  if (CityString.equals("延边") ){ return "延边朝鲜族自治州"; }
        else  if (CityString.equals("哈尔滨") ){ return "哈尔滨市"; }
        else  if (CityString.equals("齐齐哈尔") ){ return "齐齐哈尔市"; }
        else  if (CityString.equals("鸡西") ){ return "鸡西市"; }
        else  if (CityString.equals("鹤岗") ){ return "鹤岗市"; }
        else  if (CityString.equals("双鸭山") ){ return "双鸭山市"; }
        else  if (CityString.equals("大庆") ){ return "大庆市"; }
        else  if (CityString.equals("伊春") ){ return "伊春市"; }
        else  if (CityString.equals("佳木斯") ){ return "佳木斯市"; }
        else  if (CityString.equals("七台河") ){ return "七台河市"; }
        else  if (CityString.equals("牡丹江") ){ return "牡丹江市"; }
        else  if (CityString.equals("黑河") ){ return "黑河市"; }
        else  if (CityString.equals("绥化") ){ return "绥化市"; }
        else  if (CityString.equals("大兴安岭") ){ return "大兴安岭地区"; }
        else  if (CityString.equals("上海") ){ return "上海市"; }
        else  if (CityString.equals("南京") ){ return "南京市"; }
        else  if (CityString.equals("无锡") ){ return "无锡市"; }
        else  if (CityString.equals("徐州") ){ return "徐州市"; }
        else  if (CityString.equals("常州") ){ return "常州市"; }
        else  if (CityString.equals("苏州") ){ return "苏州市"; }
        else  if (CityString.equals("南通") ){ return "南通市"; }
        else  if (CityString.equals("连云港") ){ return "连云港市"; }
        else  if (CityString.equals("淮安") ){ return "淮安市"; }
        else  if (CityString.equals("盐城") ){ return "盐城市"; }
        else  if (CityString.equals("扬州") ){ return "扬州市"; }
        else  if (CityString.equals("镇江") ){ return "镇江市"; }
        else  if (CityString.equals("泰州") ){ return "泰州市"; }
        else  if (CityString.equals("宿迁") ){ return "宿迁市"; }
        else  if (CityString.equals("杭州") ){ return "杭州市"; }
        else  if (CityString.equals("宁波") ){ return "宁波市"; }
        else  if (CityString.equals("温州") ){ return "温州市"; }
        else  if (CityString.equals("嘉兴") ){ return "嘉兴市"; }
        else  if (CityString.equals("湖州") ){ return "湖州市"; }
        else  if (CityString.equals("绍兴") ){ return "绍兴市"; }
        else  if (CityString.equals("金华") ){ return "金华市"; }
        else  if (CityString.equals("衢州") ){ return "衢州市"; }
        else  if (CityString.equals("舟山") ){ return "舟山市"; }
        else  if (CityString.equals("台州") ){ return "台州市"; }
        else  if (CityString.equals("丽水") ){ return "丽水市"; }
        else  if (CityString.equals("合肥") ){ return "合肥市"; }
        else  if (CityString.equals("芜湖") ){ return "芜湖市"; }
        else  if (CityString.equals("蚌埠") ){ return "蚌埠市"; }
        else  if (CityString.equals("淮南") ){ return "淮南市"; }
        else  if (CityString.equals("马鞍山") ){ return "马鞍山市"; }
        else  if (CityString.equals("淮北") ){ return "淮北市"; }
        else  if (CityString.equals("铜陵") ){ return "铜陵市"; }
        else  if (CityString.equals("安庆") ){ return "安庆市"; }
        else  if (CityString.equals("黄山") ){ return "黄山市"; }
        else  if (CityString.equals("滁州") ){ return "滁州市"; }
        else  if (CityString.equals("阜阳") ){ return "阜阳市"; }
        else  if (CityString.equals("宿州") ){ return "宿州市"; }
        else  if (CityString.equals("六安") ){ return "六安市"; }
        else  if (CityString.equals("亳州") ){ return "亳州市"; }
        else  if (CityString.equals("池州") ){ return "池州市"; }
        else  if (CityString.equals("宣城") ){ return "宣城市"; }
        else  if (CityString.equals("福州") ){ return "福州市"; }
        else  if (CityString.equals("厦门") ){ return "厦门市"; }
        else  if (CityString.equals("莆田") ){ return "莆田市"; }
        else  if (CityString.equals("三明") ){ return "三明市"; }
        else  if (CityString.equals("泉州") ){ return "泉州市"; }
        else  if (CityString.equals("漳州") ){ return "漳州市"; }
        else  if (CityString.equals("南平") ){ return "南平市"; }
        else  if (CityString.equals("龙岩") ){ return "龙岩市"; }
        else  if (CityString.equals("宁德") ){ return "宁德市"; }
        else  if (CityString.equals("南昌") ){ return "南昌市"; }
        else  if (CityString.equals("景德镇") ){ return "景德镇市"; }
        else  if (CityString.equals("萍乡") ){ return "萍乡市"; }
        else  if (CityString.equals("九江") ){ return "九江市"; }
        else  if (CityString.equals("新余") ){ return "新余市"; }
        else  if (CityString.equals("鹰潭") ){ return "鹰潭市"; }
        else  if (CityString.equals("赣州") ){ return "赣州市"; }
        else  if (CityString.equals("吉安") ){ return "吉安市"; }
        else  if (CityString.equals("宜春") ){ return "宜春市"; }
        else  if (CityString.equals("抚州") ){ return "抚州市"; }
        else  if (CityString.equals("上饶") ){ return "上饶市"; }
        else  if (CityString.equals("济南") ){ return "济南市"; }
        else  if (CityString.equals("青岛") ){ return "青岛市"; }
        else  if (CityString.equals("淄博") ){ return "淄博市"; }
        else  if (CityString.equals("枣庄") ){ return "枣庄市"; }
        else  if (CityString.equals("东营") ){ return "东营市"; }
        else  if (CityString.equals("烟台") ){ return "烟台市"; }
        else  if (CityString.equals("潍坊") ){ return "潍坊市"; }
        else  if (CityString.equals("济宁") ){ return "济宁市"; }
        else  if (CityString.equals("泰安") ){ return "泰安市"; }
        else  if (CityString.equals("威海") ){ return "威海市"; }
        else  if (CityString.equals("日照") ){ return "日照市"; }
        else  if (CityString.equals("临沂") ){ return "临沂市"; }
        else  if (CityString.equals("德州") ){ return "德州市"; }
        else  if (CityString.equals("聊城") ){ return "聊城市"; }
        else  if (CityString.equals("滨州") ){ return "滨州市"; }
        else  if (CityString.equals("菏泽") ){ return "菏泽市"; }
        else  if (CityString.equals("郑州") ){ return "郑州市"; }
        else  if (CityString.equals("开封") ){ return "开封市"; }
        else  if (CityString.equals("洛阳") ){ return "洛阳市"; }
        else  if (CityString.equals("平顶山") ){ return "平顶山市"; }
        else  if (CityString.equals("安阳") ){ return "安阳市"; }
        else  if (CityString.equals("鹤壁") ){ return "鹤壁市"; }
        else  if (CityString.equals("新乡") ){ return "新乡市"; }
        else  if (CityString.equals("焦作") ){ return "焦作市"; }
        else  if (CityString.equals("濮阳") ){ return "濮阳市"; }
        else  if (CityString.equals("许昌") ){ return "许昌市"; }
        else  if (CityString.equals("漯河") ){ return "漯河市"; }
        else  if (CityString.equals("三门峡") ){ return "三门峡市"; }
        else  if (CityString.equals("南阳") ){ return "南阳市"; }
        else  if (CityString.equals("商丘") ){ return "商丘市"; }
        else  if (CityString.equals("信阳") ){ return "信阳市"; }
        else  if (CityString.equals("周口") ){ return "周口市"; }
        else  if (CityString.equals("驻马店") ){ return "驻马店市"; }
        else  if (CityString.equals("济源") ){ return "济源市"; }
        else  if (CityString.equals("武汉") ){ return "武汉市"; }
        else  if (CityString.equals("黄石") ){ return "黄石市"; }
        else  if (CityString.equals("十堰") ){ return "十堰市"; }
        else  if (CityString.equals("宜昌") ){ return "宜昌市"; }
        else  if (CityString.equals("襄阳") ){ return "襄阳市"; }
        else  if (CityString.equals("鄂州") ){ return "鄂州市"; }
        else  if (CityString.equals("荆门") ){ return "荆门市"; }
        else  if (CityString.equals("孝感") ){ return "孝感市"; }
        else  if (CityString.equals("荆州") ){ return "荆州市"; }
        else  if (CityString.equals("黄冈") ){ return "黄冈市"; }
        else  if (CityString.equals("咸宁") ){ return "咸宁市"; }
        else  if (CityString.equals("随州") ){ return "随州市"; }
        else  if (CityString.equals("恩施") ){ return "恩施土家族苗族自治州"; }
        else  if (CityString.equals("仙桃") ){ return "仙桃市"; }
        else  if (CityString.equals("潜江") ){ return "潜江市"; }
        else  if (CityString.equals("天门") ){ return "天门市"; }
        else  if (CityString.equals("神农架") ){ return "神农架林区"; }
        else  if (CityString.equals("长沙") ){ return "长沙市"; }
        else  if (CityString.equals("株洲") ){ return "株洲市"; }
        else  if (CityString.equals("湘潭") ){ return "湘潭市"; }
        else  if (CityString.equals("衡阳") ){ return "衡阳市"; }
        else  if (CityString.equals("邵阳") ){ return "邵阳市"; }
        else  if (CityString.equals("岳阳") ){ return "岳阳市"; }
        else  if (CityString.equals("常德") ){ return "常德市"; }
        else  if (CityString.equals("张家界") ){ return "张家界市"; }
        else  if (CityString.equals("益阳") ){ return "益阳市"; }
        else  if (CityString.equals("郴州") ){ return "郴州市"; }
        else  if (CityString.equals("永州") ){ return "永州市"; }
        else  if (CityString.equals("怀化") ){ return "怀化市"; }
        else  if (CityString.equals("娄底") ){ return "娄底市"; }
        else  if (CityString.equals("湘西") ){ return "湘西土家族苗族自治州"; }
        else  if (CityString.equals("广州") ){ return "广州市"; }
        else  if (CityString.equals("韶关") ){ return "韶关市"; }
        else  if (CityString.equals("深圳") ){ return "深圳市"; }
        else  if (CityString.equals("珠海") ){ return "珠海市"; }
        else  if (CityString.equals("汕头") ){ return "汕头市"; }
        else  if (CityString.equals("佛山") ){ return "佛山市"; }
        else  if (CityString.equals("江门") ){ return "江门市"; }
        else  if (CityString.equals("湛江") ){ return "湛江市"; }
        else  if (CityString.equals("茂名") ){ return "茂名市"; }
        else  if (CityString.equals("肇庆") ){ return "肇庆市"; }
        else  if (CityString.equals("惠州") ){ return "惠州市"; }
        else  if (CityString.equals("梅州") ){ return "梅州市"; }
        else  if (CityString.equals("汕尾") ){ return "汕尾市"; }
        else  if (CityString.equals("河源") ){ return "河源市"; }
        else  if (CityString.equals("阳江") ){ return "阳江市"; }
        else  if (CityString.equals("清远") ){ return "清远市"; }
        else  if (CityString.equals("东莞") ){ return "东莞市"; }
        else  if (CityString.equals("中山") ){ return "中山市"; }
        else  if (CityString.equals("东沙群岛") ){ return "东沙群岛"; }
        else  if (CityString.equals("潮州") ){ return "潮州市"; }
        else  if (CityString.equals("揭阳") ){ return "揭阳市"; }
        else  if (CityString.equals("云浮") ){ return "云浮市"; }
        else  if (CityString.equals("南宁") ){ return "南宁市"; }
        else  if (CityString.equals("柳州") ){ return "柳州市"; }
        else  if (CityString.equals("桂林") ){ return "桂林市"; }
        else  if (CityString.equals("梧州") ){ return "梧州市"; }
        else  if (CityString.equals("北海") ){ return "北海市"; }
        else  if (CityString.equals("防城港") ){ return "防城港市"; }
        else  if (CityString.equals("钦州") ){ return "钦州市"; }
        else  if (CityString.equals("贵港") ){ return "贵港市"; }
        else  if (CityString.equals("玉林") ){ return "玉林市"; }
        else  if (CityString.equals("百色") ){ return "百色市"; }
        else  if (CityString.equals("贺州") ){ return "贺州市"; }
        else  if (CityString.equals("河池") ){ return "河池市"; }
        else  if (CityString.equals("来宾") ){ return "来宾市"; }
        else  if (CityString.equals("崇左") ){ return "崇左市"; }
        else  if (CityString.equals("涠洲岛") ){ return "涠洲岛"; }
        else  if (CityString.equals("海口") ){ return "海口市"; }
        else  if (CityString.equals("三亚") ){ return "三亚市"; }
        else  if (CityString.equals("三沙") ){ return "三沙市"; }
        else  if (CityString.equals("儋州") ){ return "儋州市"; }
        else  if (CityString.equals("五指山") ){ return "五指山市"; }
        else  if (CityString.equals("琼海") ){ return "琼海市"; }
        else  if (CityString.equals("文昌") ){ return "文昌市"; }
        else  if (CityString.equals("万宁") ){ return "万宁市"; }
        else  if (CityString.equals("东方") ){ return "东方市"; }
        else  if (CityString.equals("定安县") ){ return "定安县"; }
        else  if (CityString.equals("定安") ){ return "定安县"; }
        else  if (CityString.equals("屯昌县") ){ return "屯昌县"; }
        else  if (CityString.equals("屯昌") ){ return "屯昌县"; }
        else  if (CityString.equals("澄迈县") ){ return "澄迈县"; }
        else  if (CityString.equals("澄迈") ){ return "澄迈县"; }

        else  if (CityString.equals("临高县") ){ return "临高县"; }
        else  if (CityString.equals("临高") ){ return "临高县"; }
        else  if (CityString.equals("白沙县") ){ return "白沙黎族自治县"; }
        else  if (CityString.equals("白沙") ){ return "白沙黎族自治县"; }

        else  if (CityString.equals("昌江县") ){ return "昌江黎族自治县"; }
        else  if (CityString.equals("昌江") ){ return "昌江黎族自治县"; }

        else  if (CityString.equals("乐东县") ){ return "乐东黎族自治县"; }
        else  if (CityString.equals("乐东") ){ return "乐东黎族自治县"; }
        else  if (CityString.equals("陵水县") ){ return "陵水黎族自治县"; }
        else  if (CityString.equals("陵水") ){ return "陵水黎族自治县"; }
        else  if (CityString.equals("保亭县") ){ return "保亭黎族苗族自治县"; }
        else  if (CityString.equals("保亭") ){ return "保亭黎族苗族自治县"; }
        else  if (CityString.equals("琼中县") ){ return "琼中黎族苗族自治县"; }
        else  if (CityString.equals("琼中") ){ return "琼中黎族苗族自治县"; }
        else  if (CityString.equals("重庆") ){ return "重庆市"; }
        else  if (CityString.equals("成都") ){ return "成都市"; }
        else  if (CityString.equals("自贡") ){ return "自贡市"; }
        else  if (CityString.equals("攀枝花") ){ return "攀枝花市"; }
        else  if (CityString.equals("泸州") ){ return "泸州市"; }
        else  if (CityString.equals("德阳") ){ return "德阳市"; }
        else  if (CityString.equals("绵阳") ){ return "绵阳市"; }
        else  if (CityString.equals("广元") ){ return "广元市"; }
        else  if (CityString.equals("遂宁") ){ return "遂宁市"; }
        else  if (CityString.equals("内江") ){ return "内江市"; }
        else  if (CityString.equals("乐山") ){ return "乐山市"; }
        else  if (CityString.equals("南充") ){ return "南充市"; }
        else  if (CityString.equals("眉山") ){ return "眉山市"; }
        else  if (CityString.equals("宜宾") ){ return "宜宾市"; }
        else  if (CityString.equals("广安") ){ return "广安市"; }
        else  if (CityString.equals("达州") ){ return "达州市"; }
        else  if (CityString.equals("雅安") ){ return "雅安市"; }
        else  if (CityString.equals("巴中") ){ return "巴中市"; }
        else  if (CityString.equals("资阳") ){ return "资阳市"; }
        else  if (CityString.equals("阿坝州") ){ return "阿坝藏族羌族自治州"; }
        else  if (CityString.equals("阿坝") ){ return "阿坝藏族羌族自治州"; }
        else  if (CityString.equals("甘孜州") ){ return "甘孜藏族自治州"; }
        else  if (CityString.equals("甘孜") ){ return "甘孜藏族自治州"; }

        else  if (CityString.equals("凉山") ){ return "凉山彝族自治州"; }
        else  if (CityString.equals("贵阳") ){ return "贵阳市"; }
        else  if (CityString.equals("六盘水") ){ return "六盘水市"; }
        else  if (CityString.equals("遵义") ){ return "遵义市"; }
        else  if (CityString.equals("安顺") ){ return "安顺市"; }
        else  if (CityString.equals("毕节") ){ return "毕节市"; }
        else  if (CityString.equals("铜仁") ){ return "铜仁市"; }
        else  if (CityString.equals("黔西南") ){ return "黔西南布依族苗族自治州"; }
        else  if (CityString.equals("黔东南") ){ return "黔东南苗族侗族自治州"; }
        else  if (CityString.equals("黔南") ){ return "黔南布依族苗族自治州"; }
        else  if (CityString.equals("昆明") ){ return "昆明市"; }
        else  if (CityString.equals("曲靖") ){ return "曲靖市"; }
        else  if (CityString.equals("玉溪") ){ return "玉溪市"; }
        else  if (CityString.equals("保山") ){ return "保山市"; }
        else  if (CityString.equals("昭通") ){ return "昭通市"; }
        else  if (CityString.equals("丽江") ){ return "丽江市"; }
        else  if (CityString.equals("普洱") ){ return "普洱市"; }
        else  if (CityString.equals("临沧") ){ return "临沧市"; }
        else  if (CityString.equals("楚雄") ){ return "楚雄彝族自治州"; }
        else  if (CityString.equals("红河") ){ return "红河哈尼族彝族自治州"; }
        else  if (CityString.equals("文山") ){ return "文山壮族苗族自治州"; }
        else  if (CityString.equals("西双版纳") ){ return "西双版纳傣族自治州"; }
        else  if (CityString.equals("大理") ){ return "大理白族自治州"; }
        else  if (CityString.equals("德宏") ){ return "德宏傣族景颇族自治州"; }
        else  if (CityString.equals("怒江") ){ return "怒江傈僳族自治州"; }
        else  if (CityString.equals("迪庆") ){ return "迪庆藏族自治州"; }
        else  if (CityString.equals("拉萨") ){ return "拉萨市"; }
        else  if (CityString.equals("日喀则") ){ return "日喀则市"; }
        else  if (CityString.equals("昌都") ){ return "昌都市"; }
        else  if (CityString.equals("林芝") ){ return "林芝市"; }
        else  if (CityString.equals("山南") ){ return "山南市"; }
        else  if (CityString.equals("那曲") ){ return "那曲市"; }
        else  if (CityString.equals("阿里地区") ){ return "阿里地区"; }
        else  if (CityString.equals("阿里") ){ return "阿里地区"; }
        else  if (CityString.equals("西安") ){ return "西安市"; }
        else  if (CityString.equals("铜川") ){ return "铜川市"; }
        else  if (CityString.equals("宝鸡") ){ return "宝鸡市"; }
        else  if (CityString.equals("咸阳") ){ return "咸阳市"; }
        else  if (CityString.equals("渭南") ){ return "渭南市"; }
        else  if (CityString.equals("延安") ){ return "延安市"; }
        else  if (CityString.equals("汉中") ){ return "汉中市"; }
        else  if (CityString.equals("榆林") ){ return "榆林市"; }
        else  if (CityString.equals("安康") ){ return "安康市"; }
        else  if (CityString.equals("商洛") ){ return "商洛市"; }
        else  if (CityString.equals("兰州") ){ return "兰州市"; }
        else  if (CityString.equals("嘉峪关") ){ return "嘉峪关市"; }
        else  if (CityString.equals("金昌") ){ return "金昌市"; }
        else  if (CityString.equals("白银") ){ return "白银市"; }
        else  if (CityString.equals("天水") ){ return "天水市"; }
        else  if (CityString.equals("武威") ){ return "武威市"; }
        else  if (CityString.equals("张掖") ){ return "张掖市"; }
        else  if (CityString.equals("平凉") ){ return "平凉市"; }
        else  if (CityString.equals("酒泉") ){ return "酒泉市"; }
        else  if (CityString.equals("庆阳") ){ return "庆阳市"; }
        else  if (CityString.equals("定西") ){ return "定西市"; }
        else  if (CityString.equals("陇南") ){ return "陇南市"; }
        else  if (CityString.equals("临夏") ){ return "临夏回族自治州"; }
        else  if (CityString.equals("甘南") ){ return "甘南藏族自治州"; }
        else  if (CityString.equals("西宁") ){ return "西宁市"; }
        else  if (CityString.equals("海东") ){ return "海东市"; }
        else  if (CityString.equals("海北州") ){ return "海北藏族自治州"; }
        else  if (CityString.equals("黄南州") ){ return "黄南藏族自治州"; }
        else  if (CityString.equals("海南") ){ return "海南藏族自治州"; }
        else  if (CityString.equals("果洛") ){ return "果洛藏族自治州"; }
        else  if (CityString.equals("玉树") ){ return "玉树藏族自治州"; }
        else  if (CityString.equals("海西州") ){ return "海西蒙古族藏族自治州"; }
        else  if (CityString.equals("海西") ){ return "海西蒙古族藏族自治州"; }
        else  if (CityString.equals("银川") ){ return "银川市"; }
        else  if (CityString.equals("石嘴山") ){ return "石嘴山市"; }
        else  if (CityString.equals("吴忠") ){ return "吴忠市"; }
        else  if (CityString.equals("固原") ){ return "固原市"; }
        else  if (CityString.equals("中卫") ){ return "中卫市"; }
        else  if (CityString.equals("乌鲁木齐") ){ return "乌鲁木齐市"; }
        else  if (CityString.equals("克拉玛依") ){ return "克拉玛依市"; }
        else  if (CityString.equals("吐鲁番") ){ return "吐鲁番市"; }
        else  if (CityString.equals("哈密") ){ return "哈密市"; }
        else  if (CityString.equals("昌吉") ){ return "昌吉回族自治州"; }
        else  if (CityString.equals("博尔塔拉") ){ return "博尔塔拉蒙古自治州"; }
        else  if (CityString.equals("巴音郭楞") ){ return "巴音郭楞蒙古自治州"; }
        else  if (CityString.equals("阿克苏地区") ){ return "阿克苏地区"; }
        else  if (CityString.equals("阿克苏") ){ return "阿克苏地区"; }
        else  if (CityString.equals("克州") ){ return "克孜勒苏柯尔克孜自治州"; }
        else  if (CityString.equals("克孜勒苏") ){ return "克孜勒苏柯尔克孜自治州"; }
        else  if (CityString.equals("喀什地区") ){ return "喀什地区"; }
        else  if (CityString.equals("喀什") ){ return "喀什地区"; }
        else  if (CityString.equals("和田地区") ){ return "和田地区"; }
        else  if (CityString.equals("伊犁州") ){ return "伊犁哈萨克自治州"; }
        else  if (CityString.equals("伊犁") ){ return "伊犁哈萨克自治州"; }

        else  if (CityString.equals("塔城地区") ){ return "塔城地区"; }
        else  if (CityString.equals("阿勒泰地区") ){ return "阿勒泰地区"; }
        else  if (CityString.equals("石河子") ){ return "石河子市"; }
        else  if (CityString.equals("阿拉尔") ){ return "阿拉尔市"; }
        else  if (CityString.equals("图木舒克") ){ return "图木舒克市"; }
        else  if (CityString.equals("五家渠") ){ return "五家渠市"; }
        else  if (CityString.equals("北屯") ){ return "北屯市"; }
        else  if (CityString.equals("铁门关") ){ return "铁门关市"; }
        else  if (CityString.equals("双河") ){ return "双河市"; }
        else  if (CityString.equals("可克达拉") ){ return "可克达拉市"; }
        else  if (CityString.equals("昆玉") ){ return "昆玉市"; }
        else  if (CityString.equals("台湾") ){ return "台湾省"; }
        else  if (CityString.equals("台北") ){ return "台北市"; }
        else  if (CityString.equals("新北") ){ return "新北市"; }
        else  if (CityString.equals("桃园") ){ return "桃园市"; }
        else  if (CityString.equals("台中") ){ return "台中市"; }
        else  if (CityString.equals("台南") ){ return "台南市"; }
        else  if (CityString.equals("高雄") ){ return "高雄市"; }
        else  if (CityString.equals("基隆") ){ return "基隆市"; }
        else  if (CityString.equals("新竹") ){ return "新竹市"; }
        else  if (CityString.equals("嘉义") ){ return "嘉义市"; }
        else  if (CityString.equals("新竹县") ){ return "新竹县"; }
        else  if (CityString.equals("苗栗县") ){ return "苗栗县"; }
        else  if (CityString.equals("彰化县") ){ return "彰化县"; }
        else  if (CityString.equals("南投县") ){ return "南投县"; }
        else  if (CityString.equals("云林县") ){ return "云林县"; }
        else  if (CityString.equals("嘉义县") ){ return "嘉义县"; }
        else  if (CityString.equals("台东县") ){ return "台东县"; }
        else  if (CityString.equals("花莲县") ){ return "花莲县"; }
        else  if (CityString.equals("澎湖县") ){ return "澎湖县"; }
        else  if (CityString.equals("宜兰县") ){ return "宜兰县"; }
        else  if (CityString.equals("屏东县") ){ return "屏东县"; }
        else  if (CityString.equals("香港") ){ return "香港特别行政区"; }
        else  if (CityString.equals("澳门") ){ return "澳门特别行政区"; }
        else  if (CityString.equals("澳门半岛") ){ return "澳门特别行政区"; }


        else  if (CityString.equals("延边朝鲜族") ){ return "延边朝鲜族自治州"; }
        else  if (CityString.equals("恩施土家族苗族") ){ return "恩施土家族苗族自治州"; }
        else  if (CityString.equals("湘西土家族苗族") ){ return "湘西土家族苗族自治州"; }
        else  if (CityString.equals("阿坝藏族羌族") ){ return "阿坝藏族羌族自治州"; }
        else  if (CityString.equals("甘孜藏族") ){ return "甘孜藏族自治州"; }
        else  if (CityString.equals("凉山彝族") ){ return "凉山彝族自治州"; }
        else  if (CityString.equals("黔西南布依族苗族") ){ return "黔西南布依族苗族自治州"; }
        else  if (CityString.equals("黔东南苗族侗族") ){ return "黔东南苗族侗族自治州"; }
        else  if (CityString.equals("黔南布依族苗族") ){ return "黔南布依族苗族自治州"; }
        else  if (CityString.equals("楚雄彝族") ){ return "楚雄彝族自治州"; }
        else  if (CityString.equals("红河哈尼族彝族") ){ return "红河哈尼族彝族自治州"; }
        else  if (CityString.equals("文山壮族苗族") ){ return "文山壮族苗族自治州"; }
        else  if (CityString.equals("西双版纳傣族") ){ return "西双版纳傣族自治州"; }
        else  if (CityString.equals("大理白族") ){ return "大理白族自治州"; }
        else  if (CityString.equals("德宏傣族景颇族") ){ return "德宏傣族景颇族自治州"; }
        else  if (CityString.equals("怒江傈僳族") ){ return "怒江傈僳族自治州"; }
        else  if (CityString.equals("迪庆藏族") ){ return "迪庆藏族自治州"; }
        else  if (CityString.equals("临夏回族") ){ return "临夏回族自治州"; }
        else  if (CityString.equals("甘南藏族") ){ return "甘南藏族自治州"; }
        else  if (CityString.equals("海北藏族") ){ return "海北藏族自治州"; }
        else  if (CityString.equals("海北") ){ return "海北藏族自治州"; }

        else  if (CityString.equals("黄南藏族") ){ return "黄南藏族自治州"; }
        else  if (CityString.equals("海南藏族") ){ return "海南藏族自治州"; }
        else  if (CityString.equals("果洛藏族") ){ return "果洛藏族自治州"; }
        else  if (CityString.equals("玉树藏族") ){ return "玉树藏族自治州"; }
        else  if (CityString.equals("海西蒙古族藏族") ){ return "海西蒙古族藏族自治州"; }
        else  if (CityString.equals("海西") ){ return "海西蒙古族藏族自治州"; }
        else  if (CityString.equals("昌吉回族") ){ return "昌吉回族自治州"; }
        else  if (CityString.equals("博尔塔拉蒙古") ){ return "博尔塔拉蒙古自治州"; }
        else  if (CityString.equals("巴音郭楞蒙古") ){ return "巴音郭楞蒙古自治州"; }
        else  if (CityString.equals("克孜勒苏柯尔克孜") ){ return "克孜勒苏柯尔克孜自治州"; }
        else  if (CityString.equals("伊犁哈萨克") ){ return "伊犁哈萨克自治州"; }
        else {
            return "";
        }
    }


    public String CityFullName2FullName(String CityString){
        if (CityString.equals("北京市") ){ return "北京市"; }
        else  if (CityString.equals("天津市") ){ return "天津市"; }
        else  if (CityString.equals("石家庄市") ){ return "石家庄市"; }
        else  if (CityString.equals("唐山市") ){ return "唐山市"; }
        else  if (CityString.equals("秦皇岛市") ){ return "秦皇岛市"; }
        else  if (CityString.equals("邯郸市") ){ return "邯郸市"; }
        else  if (CityString.equals("邢台市") ){ return "邢台市"; }
        else  if (CityString.equals("保定市") ){ return "保定市"; }
        else  if (CityString.equals("张家口市") ){ return "张家口市"; }
        else  if (CityString.equals("承德市") ){ return "承德市"; }
        else  if (CityString.equals("沧州市") ){ return "沧州市"; }
        else  if (CityString.equals("廊坊市") ){ return "廊坊市"; }
        else  if (CityString.equals("衡水市") ){ return "衡水市"; }
        else  if (CityString.equals("太原市") ){ return "太原市"; }
        else  if (CityString.equals("大同市") ){ return "大同市"; }
        else  if (CityString.equals("阳泉市") ){ return "阳泉市"; }
        else  if (CityString.equals("长治市") ){ return "长治市"; }
        else  if (CityString.equals("晋城市") ){ return "晋城市"; }
        else  if (CityString.equals("朔州市") ){ return "朔州市"; }
        else  if (CityString.equals("晋中市") ){ return "晋中市"; }
        else  if (CityString.equals("运城市") ){ return "运城市"; }
        else  if (CityString.equals("忻州市") ){ return "忻州市"; }
        else  if (CityString.equals("临汾市") ){ return "临汾市"; }
        else  if (CityString.equals("吕梁市") ){ return "吕梁市"; }
        else  if (CityString.equals("呼和浩特市") ){ return "呼和浩特市"; }
        else  if (CityString.equals("包头市") ){ return "包头市"; }
        else  if (CityString.equals("乌海市") ){ return "乌海市"; }
        else  if (CityString.equals("赤峰市") ){ return "赤峰市"; }
        else  if (CityString.equals("通辽市") ){ return "通辽市"; }
        else  if (CityString.equals("鄂尔多斯市") ){ return "鄂尔多斯市"; }
        else  if (CityString.equals("呼伦贝尔市") ){ return "呼伦贝尔市"; }
        else  if (CityString.equals("巴彦淖尔市") ){ return "巴彦淖尔市"; }
        else  if (CityString.equals("乌兰察布市") ){ return "乌兰察布市"; }
        else  if (CityString.equals("兴安盟") ){ return "兴安盟"; }
        else  if (CityString.equals("锡林郭勒盟") ){ return "锡林郭勒盟"; }
        else  if (CityString.equals("阿拉善盟") ){ return "阿拉善盟"; }
        else  if (CityString.equals("沈阳市") ){ return "沈阳市"; }
        else  if (CityString.equals("大连市") ){ return "大连市"; }
        else  if (CityString.equals("鞍山市") ){ return "鞍山市"; }
        else  if (CityString.equals("抚顺市") ){ return "抚顺市"; }
        else  if (CityString.equals("本溪市") ){ return "本溪市"; }
        else  if (CityString.equals("丹东市") ){ return "丹东市"; }
        else  if (CityString.equals("锦州市") ){ return "锦州市"; }
        else  if (CityString.equals("营口市") ){ return "营口市"; }
        else  if (CityString.equals("阜新市") ){ return "阜新市"; }
        else  if (CityString.equals("辽阳市") ){ return "辽阳市"; }
        else  if (CityString.equals("盘锦市") ){ return "盘锦市"; }
        else  if (CityString.equals("铁岭市") ){ return "铁岭市"; }
        else  if (CityString.equals("朝阳市") ){ return "朝阳市"; }
        else  if (CityString.equals("葫芦岛市") ){ return "葫芦岛市"; }
        else  if (CityString.equals("长春市") ){ return "长春市"; }
        else  if (CityString.equals("吉林市") ){ return "吉林市"; }
        else  if (CityString.equals("四平市") ){ return "四平市"; }
        else  if (CityString.equals("辽源市") ){ return "辽源市"; }
        else  if (CityString.equals("通化市") ){ return "通化市"; }
        else  if (CityString.equals("白山市") ){ return "白山市"; }
        else  if (CityString.equals("松原市") ){ return "松原市"; }
        else  if (CityString.equals("白城市") ){ return "白城市"; }
        else  if (CityString.equals("延边朝鲜族自治州") ){ return "延边朝鲜族自治州"; }
        else  if (CityString.equals("哈尔滨市") ){ return "哈尔滨市"; }
        else  if (CityString.equals("齐齐哈尔市") ){ return "齐齐哈尔市"; }
        else  if (CityString.equals("鸡西市") ){ return "鸡西市"; }
        else  if (CityString.equals("鹤岗市") ){ return "鹤岗市"; }
        else  if (CityString.equals("双鸭山市") ){ return "双鸭山市"; }
        else  if (CityString.equals("大庆市") ){ return "大庆市"; }
        else  if (CityString.equals("伊春市") ){ return "伊春市"; }
        else  if (CityString.equals("佳木斯市") ){ return "佳木斯市"; }
        else  if (CityString.equals("七台河市") ){ return "七台河市"; }
        else  if (CityString.equals("牡丹江市") ){ return "牡丹江市"; }
        else  if (CityString.equals("黑河市") ){ return "黑河市"; }
        else  if (CityString.equals("绥化市") ){ return "绥化市"; }
        else  if (CityString.equals("大兴安岭地区") ){ return "大兴安岭地区"; }
        else  if (CityString.equals("上海市") ){ return "上海市"; }
        else  if (CityString.equals("南京市") ){ return "南京市"; }
        else  if (CityString.equals("无锡市") ){ return "无锡市"; }
        else  if (CityString.equals("徐州市") ){ return "徐州市"; }
        else  if (CityString.equals("常州市") ){ return "常州市"; }
        else  if (CityString.equals("苏州市") ){ return "苏州市"; }
        else  if (CityString.equals("南通市") ){ return "南通市"; }
        else  if (CityString.equals("连云港市") ){ return "连云港市"; }
        else  if (CityString.equals("淮安市") ){ return "淮安市"; }
        else  if (CityString.equals("盐城市") ){ return "盐城市"; }
        else  if (CityString.equals("扬州市") ){ return "扬州市"; }
        else  if (CityString.equals("镇江市") ){ return "镇江市"; }
        else  if (CityString.equals("泰州市") ){ return "泰州市"; }
        else  if (CityString.equals("宿迁市") ){ return "宿迁市"; }
        else  if (CityString.equals("杭州市") ){ return "杭州市"; }
        else  if (CityString.equals("宁波市") ){ return "宁波市"; }
        else  if (CityString.equals("温州市") ){ return "温州市"; }
        else  if (CityString.equals("嘉兴市") ){ return "嘉兴市"; }
        else  if (CityString.equals("湖州市") ){ return "湖州市"; }
        else  if (CityString.equals("绍兴市") ){ return "绍兴市"; }
        else  if (CityString.equals("金华市") ){ return "金华市"; }
        else  if (CityString.equals("衢州市") ){ return "衢州市"; }
        else  if (CityString.equals("舟山市") ){ return "舟山市"; }
        else  if (CityString.equals("台州市") ){ return "台州市"; }
        else  if (CityString.equals("丽水市") ){ return "丽水市"; }
        else  if (CityString.equals("合肥市") ){ return "合肥市"; }
        else  if (CityString.equals("芜湖市") ){ return "芜湖市"; }
        else  if (CityString.equals("蚌埠市") ){ return "蚌埠市"; }
        else  if (CityString.equals("淮南市") ){ return "淮南市"; }
        else  if (CityString.equals("马鞍山市") ){ return "马鞍山市"; }
        else  if (CityString.equals("淮北市") ){ return "淮北市"; }
        else  if (CityString.equals("铜陵市") ){ return "铜陵市"; }
        else  if (CityString.equals("安庆市") ){ return "安庆市"; }
        else  if (CityString.equals("黄山市") ){ return "黄山市"; }
        else  if (CityString.equals("滁州市") ){ return "滁州市"; }
        else  if (CityString.equals("阜阳市") ){ return "阜阳市"; }
        else  if (CityString.equals("宿州市") ){ return "宿州市"; }
        else  if (CityString.equals("六安市") ){ return "六安市"; }
        else  if (CityString.equals("亳州市") ){ return "亳州市"; }
        else  if (CityString.equals("池州市") ){ return "池州市"; }
        else  if (CityString.equals("宣城市") ){ return "宣城市"; }
        else  if (CityString.equals("福州市") ){ return "福州市"; }
        else  if (CityString.equals("厦门市") ){ return "厦门市"; }
        else  if (CityString.equals("莆田市") ){ return "莆田市"; }
        else  if (CityString.equals("三明市") ){ return "三明市"; }
        else  if (CityString.equals("泉州市") ){ return "泉州市"; }
        else  if (CityString.equals("漳州市") ){ return "漳州市"; }
        else  if (CityString.equals("南平市") ){ return "南平市"; }
        else  if (CityString.equals("龙岩市") ){ return "龙岩市"; }
        else  if (CityString.equals("宁德市") ){ return "宁德市"; }
        else  if (CityString.equals("南昌市") ){ return "南昌市"; }
        else  if (CityString.equals("景德镇市") ){ return "景德镇市"; }
        else  if (CityString.equals("萍乡市") ){ return "萍乡市"; }
        else  if (CityString.equals("九江市") ){ return "九江市"; }
        else  if (CityString.equals("新余市") ){ return "新余市"; }
        else  if (CityString.equals("鹰潭市") ){ return "鹰潭市"; }
        else  if (CityString.equals("赣州市") ){ return "赣州市"; }
        else  if (CityString.equals("吉安市") ){ return "吉安市"; }
        else  if (CityString.equals("宜春市") ){ return "宜春市"; }
        else  if (CityString.equals("抚州市") ){ return "抚州市"; }
        else  if (CityString.equals("上饶市") ){ return "上饶市"; }
        else  if (CityString.equals("济南市") ){ return "济南市"; }
        else  if (CityString.equals("青岛市") ){ return "青岛市"; }
        else  if (CityString.equals("淄博市") ){ return "淄博市"; }
        else  if (CityString.equals("枣庄市") ){ return "枣庄市"; }
        else  if (CityString.equals("东营市") ){ return "东营市"; }
        else  if (CityString.equals("烟台市") ){ return "烟台市"; }
        else  if (CityString.equals("潍坊市") ){ return "潍坊市"; }
        else  if (CityString.equals("济宁市") ){ return "济宁市"; }
        else  if (CityString.equals("泰安市") ){ return "泰安市"; }
        else  if (CityString.equals("威海市") ){ return "威海市"; }
        else  if (CityString.equals("日照市") ){ return "日照市"; }
        else  if (CityString.equals("临沂市") ){ return "临沂市"; }
        else  if (CityString.equals("德州市") ){ return "德州市"; }
        else  if (CityString.equals("聊城市") ){ return "聊城市"; }
        else  if (CityString.equals("滨州市") ){ return "滨州市"; }
        else  if (CityString.equals("菏泽市") ){ return "菏泽市"; }
        else  if (CityString.equals("郑州市") ){ return "郑州市"; }
        else  if (CityString.equals("开封市") ){ return "开封市"; }
        else  if (CityString.equals("洛阳市") ){ return "洛阳市"; }
        else  if (CityString.equals("平顶山市") ){ return "平顶山市"; }
        else  if (CityString.equals("安阳市") ){ return "安阳市"; }
        else  if (CityString.equals("鹤壁市") ){ return "鹤壁市"; }
        else  if (CityString.equals("新乡市") ){ return "新乡市"; }
        else  if (CityString.equals("焦作市") ){ return "焦作市"; }
        else  if (CityString.equals("濮阳市") ){ return "濮阳市"; }
        else  if (CityString.equals("许昌市") ){ return "许昌市"; }
        else  if (CityString.equals("漯河市") ){ return "漯河市"; }
        else  if (CityString.equals("三门峡市") ){ return "三门峡市"; }
        else  if (CityString.equals("南阳市") ){ return "南阳市"; }
        else  if (CityString.equals("商丘市") ){ return "商丘市"; }
        else  if (CityString.equals("信阳市") ){ return "信阳市"; }
        else  if (CityString.equals("周口市") ){ return "周口市"; }
        else  if (CityString.equals("驻马店市") ){ return "驻马店市"; }
        else  if (CityString.equals("济源市") ){ return "济源市"; }
        else  if (CityString.equals("武汉市") ){ return "武汉市"; }
        else  if (CityString.equals("黄石市") ){ return "黄石市"; }
        else  if (CityString.equals("十堰市") ){ return "十堰市"; }
        else  if (CityString.equals("宜昌市") ){ return "宜昌市"; }
        else  if (CityString.equals("襄阳市") ){ return "襄阳市"; }
        else  if (CityString.equals("鄂州市") ){ return "鄂州市"; }
        else  if (CityString.equals("荆门市") ){ return "荆门市"; }
        else  if (CityString.equals("孝感市") ){ return "孝感市"; }
        else  if (CityString.equals("荆州市") ){ return "荆州市"; }
        else  if (CityString.equals("黄冈市") ){ return "黄冈市"; }
        else  if (CityString.equals("咸宁市") ){ return "咸宁市"; }
        else  if (CityString.equals("随州市") ){ return "随州市"; }
        else  if (CityString.equals("恩施土家族苗族自治州") ){ return "恩施土家族苗族自治州"; }
        else  if (CityString.equals("仙桃市") ){ return "仙桃市"; }
        else  if (CityString.equals("潜江市") ){ return "潜江市"; }
        else  if (CityString.equals("天门市") ){ return "天门市"; }
        else  if (CityString.equals("神农架林区") ){ return "神农架林区"; }
        else  if (CityString.equals("长沙市") ){ return "长沙市"; }
        else  if (CityString.equals("株洲市") ){ return "株洲市"; }
        else  if (CityString.equals("湘潭市") ){ return "湘潭市"; }
        else  if (CityString.equals("衡阳市") ){ return "衡阳市"; }
        else  if (CityString.equals("邵阳市") ){ return "邵阳市"; }
        else  if (CityString.equals("岳阳市") ){ return "岳阳市"; }
        else  if (CityString.equals("常德市") ){ return "常德市"; }
        else  if (CityString.equals("张家界市") ){ return "张家界市"; }
        else  if (CityString.equals("益阳市") ){ return "益阳市"; }
        else  if (CityString.equals("郴州市") ){ return "郴州市"; }
        else  if (CityString.equals("永州市") ){ return "永州市"; }
        else  if (CityString.equals("怀化市") ){ return "怀化市"; }
        else  if (CityString.equals("娄底市") ){ return "娄底市"; }
        else  if (CityString.equals("湘西土家族苗族自治州") ){ return "湘西土家族苗族自治州"; }
        else  if (CityString.equals("广州市") ){ return "广州市"; }
        else  if (CityString.equals("韶关市") ){ return "韶关市"; }
        else  if (CityString.equals("深圳市") ){ return "深圳市"; }
        else  if (CityString.equals("珠海市") ){ return "珠海市"; }
        else  if (CityString.equals("汕头市") ){ return "汕头市"; }
        else  if (CityString.equals("佛山市") ){ return "佛山市"; }
        else  if (CityString.equals("江门市") ){ return "江门市"; }
        else  if (CityString.equals("湛江市") ){ return "湛江市"; }
        else  if (CityString.equals("茂名市") ){ return "茂名市"; }
        else  if (CityString.equals("肇庆市") ){ return "肇庆市"; }
        else  if (CityString.equals("惠州市") ){ return "惠州市"; }
        else  if (CityString.equals("梅州市") ){ return "梅州市"; }
        else  if (CityString.equals("汕尾市") ){ return "汕尾市"; }
        else  if (CityString.equals("河源市") ){ return "河源市"; }
        else  if (CityString.equals("阳江市") ){ return "阳江市"; }
        else  if (CityString.equals("清远市") ){ return "清远市"; }
        else  if (CityString.equals("东莞市") ){ return "东莞市"; }
        else  if (CityString.equals("中山市") ){ return "中山市"; }
        else  if (CityString.equals("东沙群岛") ){ return "东沙群岛"; }
        else  if (CityString.equals("潮州市") ){ return "潮州市"; }
        else  if (CityString.equals("揭阳市") ){ return "揭阳市"; }
        else  if (CityString.equals("云浮市") ){ return "云浮市"; }
        else  if (CityString.equals("南宁市") ){ return "南宁市"; }
        else  if (CityString.equals("柳州市") ){ return "柳州市"; }
        else  if (CityString.equals("桂林市") ){ return "桂林市"; }
        else  if (CityString.equals("梧州市") ){ return "梧州市"; }
        else  if (CityString.equals("北海市") ){ return "北海市"; }
        else  if (CityString.equals("防城港市") ){ return "防城港市"; }
        else  if (CityString.equals("钦州市") ){ return "钦州市"; }
        else  if (CityString.equals("贵港市") ){ return "贵港市"; }
        else  if (CityString.equals("玉林市") ){ return "玉林市"; }
        else  if (CityString.equals("百色市") ){ return "百色市"; }
        else  if (CityString.equals("贺州市") ){ return "贺州市"; }
        else  if (CityString.equals("河池市") ){ return "河池市"; }
        else  if (CityString.equals("来宾市") ){ return "来宾市"; }
        else  if (CityString.equals("崇左市") ){ return "崇左市"; }
        else  if (CityString.equals("涠洲岛") ){ return "涠洲岛"; }
        else  if (CityString.equals("海口市") ){ return "海口市"; }
        else  if (CityString.equals("三亚市") ){ return "三亚市"; }
        else  if (CityString.equals("三沙市") ){ return "三沙市"; }
        else  if (CityString.equals("儋州市") ){ return "儋州市"; }
        else  if (CityString.equals("五指山市") ){ return "五指山市"; }
        else  if (CityString.equals("琼海市") ){ return "琼海市"; }
        else  if (CityString.equals("文昌市") ){ return "文昌市"; }
        else  if (CityString.equals("万宁市") ){ return "万宁市"; }
        else  if (CityString.equals("东方市") ){ return "东方市"; }
        else  if (CityString.equals("定安县") ){ return "定安县"; }
        else  if (CityString.equals("屯昌县") ){ return "屯昌县"; }
        else  if (CityString.equals("屯昌") ){ return "屯昌县"; }

        else  if (CityString.equals("澄迈县") ){ return "澄迈县"; }
        else  if (CityString.equals("临高县") ){ return "临高县"; }
        else  if (CityString.equals("白沙黎族自治县") ){ return "白沙黎族自治县"; }
        else  if (CityString.equals("昌江黎族自治县") ){ return "昌江黎族自治县"; }
        else  if (CityString.equals("昌江") ){ return "昌江黎族自治县"; }

        else  if (CityString.equals("乐东黎族自治县") ){ return "乐东黎族自治县"; }
        else  if (CityString.equals("陵水黎族自治县") ){ return "陵水黎族自治县"; }
        else  if (CityString.equals("陵水") ){ return "陵水黎族自治县"; }

        else  if (CityString.equals("保亭黎族苗族自治县") ){ return "保亭黎族苗族自治县"; }
        else  if (CityString.equals("琼中黎族苗族自治县") ){ return "琼中黎族苗族自治县"; }
        else  if (CityString.equals("重庆市") ){ return "重庆市"; }
        else  if (CityString.equals("成都市") ){ return "成都市"; }
        else  if (CityString.equals("自贡市") ){ return "自贡市"; }
        else  if (CityString.equals("攀枝花市") ){ return "攀枝花市"; }
        else  if (CityString.equals("泸州市") ){ return "泸州市"; }
        else  if (CityString.equals("德阳市") ){ return "德阳市"; }
        else  if (CityString.equals("绵阳市") ){ return "绵阳市"; }
        else  if (CityString.equals("广元市") ){ return "广元市"; }
        else  if (CityString.equals("遂宁市") ){ return "遂宁市"; }
        else  if (CityString.equals("内江市") ){ return "内江市"; }
        else  if (CityString.equals("乐山市") ){ return "乐山市"; }
        else  if (CityString.equals("南充市") ){ return "南充市"; }
        else  if (CityString.equals("眉山市") ){ return "眉山市"; }
        else  if (CityString.equals("宜宾市") ){ return "宜宾市"; }
        else  if (CityString.equals("广安市") ){ return "广安市"; }
        else  if (CityString.equals("达州市") ){ return "达州市"; }
        else  if (CityString.equals("雅安市") ){ return "雅安市"; }
        else  if (CityString.equals("巴中市") ){ return "巴中市"; }
        else  if (CityString.equals("资阳市") ){ return "资阳市"; }
        else  if (CityString.equals("阿坝藏族羌族自治州") ){ return "阿坝藏族羌族自治州"; }
        else  if (CityString.equals("甘孜藏族自治州") ){ return "甘孜藏族自治州"; }
        else  if (CityString.equals("凉山彝族自治州") ){ return "凉山彝族自治州"; }
        else  if (CityString.equals("贵阳市") ){ return "贵阳市"; }
        else  if (CityString.equals("六盘水市") ){ return "六盘水市"; }
        else  if (CityString.equals("遵义市") ){ return "遵义市"; }
        else  if (CityString.equals("安顺市") ){ return "安顺市"; }
        else  if (CityString.equals("毕节市") ){ return "毕节市"; }
        else  if (CityString.equals("铜仁市") ){ return "铜仁市"; }
        else  if (CityString.equals("黔西南布依族苗族自治州") ){ return "黔西南布依族苗族自治州"; }
        else  if (CityString.equals("黔东南苗族侗族自治州") ){ return "黔东南苗族侗族自治州"; }
        else  if (CityString.equals("黔南布依族苗族自治州") ){ return "黔南布依族苗族自治州"; }
        else  if (CityString.equals("昆明市") ){ return "昆明市"; }
        else  if (CityString.equals("曲靖市") ){ return "曲靖市"; }
        else  if (CityString.equals("玉溪市") ){ return "玉溪市"; }
        else  if (CityString.equals("保山市") ){ return "保山市"; }
        else  if (CityString.equals("昭通市") ){ return "昭通市"; }
        else  if (CityString.equals("丽江市") ){ return "丽江市"; }
        else  if (CityString.equals("普洱市") ){ return "普洱市"; }
        else  if (CityString.equals("临沧市") ){ return "临沧市"; }
        else  if (CityString.equals("楚雄彝族自治州") ){ return "楚雄彝族自治州"; }
        else  if (CityString.equals("红河哈尼族彝族自治州") ){ return "红河哈尼族彝族自治州"; }
        else  if (CityString.equals("文山壮族苗族自治州") ){ return "文山壮族苗族自治州"; }
        else  if (CityString.equals("西双版纳傣族自治州") ){ return "西双版纳傣族自治州"; }
        else  if (CityString.equals("大理白族自治州") ){ return "大理白族自治州"; }
        else  if (CityString.equals("德宏傣族景颇族自治州") ){ return "德宏傣族景颇族自治州"; }
        else  if (CityString.equals("怒江傈僳族自治州") ){ return "怒江傈僳族自治州"; }
        else  if (CityString.equals("迪庆藏族自治州") ){ return "迪庆藏族自治州"; }
        else  if (CityString.equals("拉萨市") ){ return "拉萨市"; }
        else  if (CityString.equals("日喀则市") ){ return "日喀则市"; }
        else  if (CityString.equals("昌都市") ){ return "昌都市"; }
        else  if (CityString.equals("林芝市") ){ return "林芝市"; }
        else  if (CityString.equals("山南市") ){ return "山南市"; }
        else  if (CityString.equals("那曲市") ){ return "那曲市"; }
        else  if (CityString.equals("阿里地区") ){ return "阿里地区"; }
        else  if (CityString.equals("阿里") ){ return "阿里地区"; }
        else  if (CityString.equals("西安市") ){ return "西安市"; }
        else  if (CityString.equals("铜川市") ){ return "铜川市"; }
        else  if (CityString.equals("宝鸡市") ){ return "宝鸡市"; }
        else  if (CityString.equals("咸阳市") ){ return "咸阳市"; }
        else  if (CityString.equals("渭南市") ){ return "渭南市"; }
        else  if (CityString.equals("延安市") ){ return "延安市"; }
        else  if (CityString.equals("汉中市") ){ return "汉中市"; }
        else  if (CityString.equals("榆林市") ){ return "榆林市"; }
        else  if (CityString.equals("安康市") ){ return "安康市"; }
        else  if (CityString.equals("商洛市") ){ return "商洛市"; }
        else  if (CityString.equals("兰州市") ){ return "兰州市"; }
        else  if (CityString.equals("嘉峪关市") ){ return "嘉峪关市"; }
        else  if (CityString.equals("金昌市") ){ return "金昌市"; }
        else  if (CityString.equals("白银市") ){ return "白银市"; }
        else  if (CityString.equals("天水市") ){ return "天水市"; }
        else  if (CityString.equals("武威市") ){ return "武威市"; }
        else  if (CityString.equals("张掖市") ){ return "张掖市"; }
        else  if (CityString.equals("平凉市") ){ return "平凉市"; }
        else  if (CityString.equals("酒泉市") ){ return "酒泉市"; }
        else  if (CityString.equals("庆阳市") ){ return "庆阳市"; }
        else  if (CityString.equals("定西市") ){ return "定西市"; }
        else  if (CityString.equals("陇南市") ){ return "陇南市"; }
        else  if (CityString.equals("临夏回族自治州") ){ return "临夏回族自治州"; }
        else  if (CityString.equals("甘南藏族自治州") ){ return "甘南藏族自治州"; }
        else  if (CityString.equals("西宁市") ){ return "西宁市"; }
        else  if (CityString.equals("海东市") ){ return "海东市"; }
        else  if (CityString.equals("海北藏族自治州") ){ return "海北藏族自治州"; }
        else  if (CityString.equals("黄南藏族自治州") ){ return "黄南藏族自治州"; }
        else  if (CityString.equals("海南藏族自治州") ){ return "海南藏族自治州"; }
        else  if (CityString.equals("果洛藏族自治州") ){ return "果洛藏族自治州"; }
        else  if (CityString.equals("玉树藏族自治州") ){ return "玉树藏族自治州"; }
        else  if (CityString.equals("海西蒙古族藏族自治州") ){ return "海西蒙古族藏族自治州"; }
        else  if (CityString.equals("海西") ){ return "海西蒙古族藏族自治州"; }

        else  if (CityString.equals("银川市") ){ return "银川市"; }
        else  if (CityString.equals("石嘴山市") ){ return "石嘴山市"; }
        else  if (CityString.equals("吴忠市") ){ return "吴忠市"; }
        else  if (CityString.equals("固原市") ){ return "固原市"; }
        else  if (CityString.equals("中卫市") ){ return "中卫市"; }
        else  if (CityString.equals("乌鲁木齐市") ){ return "乌鲁木齐市"; }
        else  if (CityString.equals("克拉玛依市") ){ return "克拉玛依市"; }
        else  if (CityString.equals("吐鲁番市") ){ return "吐鲁番市"; }
        else  if (CityString.equals("哈密市") ){ return "哈密市"; }
        else  if (CityString.equals("昌吉回族自治州") ){ return "昌吉回族自治州"; }
        else  if (CityString.equals("博尔塔拉蒙古自治州") ){ return "博尔塔拉蒙古自治州"; }
        else  if (CityString.equals("巴音郭楞蒙古自治州") ){ return "巴音郭楞蒙古自治州"; }
        else  if (CityString.equals("阿克苏地区") ){ return "阿克苏地区"; }
        else  if (CityString.equals("阿克苏") ){ return "阿克苏地区"; }
        else  if (CityString.equals("克孜勒苏柯尔克孜自治州") ){ return "克孜勒苏柯尔克孜自治州"; }
        else  if (CityString.equals("喀什地区") ){ return "喀什地区"; }
        else  if (CityString.equals("喀什") ){ return "喀什地区"; }
        else  if (CityString.equals("和田地区") ){ return "和田地区"; }
        else  if (CityString.equals("和田") ){ return "和田地区"; }
        else  if (CityString.equals("伊犁哈萨克自治州") ){ return "伊犁哈萨克自治州"; }
        else  if (CityString.equals("伊犁") ){ return "伊犁哈萨克自治州"; }

        else  if (CityString.equals("塔城地区") ){ return "塔城地区"; }
        else  if (CityString.equals("阿勒泰地区") ){ return "阿勒泰地区"; }
        else  if (CityString.equals("石河子市") ){ return "石河子市"; }
        else  if (CityString.equals("阿拉尔市") ){ return "阿拉尔市"; }
        else  if (CityString.equals("图木舒克市") ){ return "图木舒克市"; }
        else  if (CityString.equals("五家渠市") ){ return "五家渠市"; }
        else  if (CityString.equals("北屯市") ){ return "北屯市"; }
        else  if (CityString.equals("铁门关市") ){ return "铁门关市"; }
        else  if (CityString.equals("双河市") ){ return "双河市"; }
        else  if (CityString.equals("可克达拉市") ){ return "可克达拉市"; }
        else  if (CityString.equals("昆玉市") ){ return "昆玉市"; }
        else  if (CityString.equals("台湾省") ){ return "台湾省"; }
        else  if (CityString.equals("台北市") ){ return "台北市"; }
        else  if (CityString.equals("新北市") ){ return "新北市"; }
        else  if (CityString.equals("桃园市") ){ return "桃园市"; }
        else  if (CityString.equals("台中市") ){ return "台中市"; }
        else  if (CityString.equals("台南市") ){ return "台南市"; }
        else  if (CityString.equals("高雄市") ){ return "高雄市"; }
        else  if (CityString.equals("基隆市") ){ return "基隆市"; }
        else  if (CityString.equals("新竹市") ){ return "新竹市"; }
        else  if (CityString.equals("嘉义市") ){ return "嘉义市"; }
        else  if (CityString.equals("新竹县") ){ return "新竹县"; }
        else  if (CityString.equals("苗栗县") ){ return "苗栗县"; }
        else  if (CityString.equals("彰化县") ){ return "彰化县"; }
        else  if (CityString.equals("南投县") ){ return "南投县"; }
        else  if (CityString.equals("云林县") ){ return "云林县"; }
        else  if (CityString.equals("嘉义县") ){ return "嘉义县"; }
        else  if (CityString.equals("台东县") ){ return "台东县"; }
        else  if (CityString.equals("花莲县") ){ return "花莲县"; }
        else  if (CityString.equals("澎湖县") ){ return "澎湖县"; }
        else  if (CityString.equals("宜兰县") ){ return "宜兰县"; }
        else  if (CityString.equals("屏东县") ){ return "屏东县"; }
        else  if (CityString.equals("香港特别行政区") ){ return "香港特别行政区"; }
        else  if (CityString.equals("澳门特别行政区") ){ return "澳门特别行政区"; }
        else  if (CityString.equals("延边朝鲜族") ){ return "延边朝鲜族自治州"; }
        else  if (CityString.equals("恩施土家族苗族") ){ return "恩施土家族苗族自治州"; }
        else  if (CityString.equals("湘西土家族苗族") ){ return "湘西土家族苗族自治州"; }
        else  if (CityString.equals("阿坝藏族羌族") ){ return "阿坝藏族羌族自治州"; }
        else  if (CityString.equals("阿坝") ){ return "阿坝藏族羌族自治州"; }
        else  if (CityString.equals("甘孜藏族") ){ return "甘孜藏族自治州"; }
        else  if (CityString.equals("凉山彝族") ){ return "凉山彝族自治州"; }
        else  if (CityString.equals("黔西南布依族苗族") ){ return "黔西南布依族苗族自治州"; }
        else  if (CityString.equals("黔东南苗族侗族") ){ return "黔东南苗族侗族自治州"; }
        else  if (CityString.equals("黔南布依族苗族") ){ return "黔南布依族苗族自治州"; }
        else  if (CityString.equals("楚雄彝族") ){ return "楚雄彝族自治州"; }
        else  if (CityString.equals("红河哈尼族彝族") ){ return "红河哈尼族彝族自治州"; }
        else  if (CityString.equals("文山壮族苗族") ){ return "文山壮族苗族自治州"; }
        else  if (CityString.equals("西双版纳傣族") ){ return "西双版纳傣族自治州"; }
        else  if (CityString.equals("大理白族") ){ return "大理白族自治州"; }
        else  if (CityString.equals("德宏傣族景颇族") ){ return "德宏傣族景颇族自治州"; }
        else  if (CityString.equals("怒江傈僳族") ){ return "怒江傈僳族自治州"; }
        else  if (CityString.equals("迪庆藏族") ){ return "迪庆藏族自治州"; }
        else  if (CityString.equals("临夏回族") ){ return "临夏回族自治州"; }
        else  if (CityString.equals("甘南藏族") ){ return "甘南藏族自治州"; }
        else  if (CityString.equals("海北藏族") ){ return "海北藏族自治州"; }
        else  if (CityString.equals("黄南藏族") ){ return "黄南藏族自治州"; }
        else  if (CityString.equals("海南藏族") ){ return "海南藏族自治州"; }
        else  if (CityString.equals("果洛藏族") ){ return "果洛藏族自治州"; }
        else  if (CityString.equals("玉树藏族") ){ return "玉树藏族自治州"; }
        else  if (CityString.equals("海西蒙古族藏族") ){ return "海西蒙古族藏族自治州"; }
        else  if (CityString.equals("海西") ){ return "海西蒙古族藏族自治州"; }
        else  if (CityString.equals("昌吉回族") ){ return "昌吉回族自治州"; }
        else  if (CityString.equals("博尔塔拉蒙古") ){ return "博尔塔拉蒙古自治州"; }
        else  if (CityString.equals("巴音郭楞蒙古") ){ return "巴音郭楞蒙古自治州"; }
        else  if (CityString.equals("克孜勒苏柯尔克孜") ){ return "克孜勒苏柯尔克孜自治州"; }
        else  if (CityString.equals("伊犁哈萨克") ){ return "伊犁哈萨克自治州"; }

        else  if (CityString.equals("大兴安岭") ){ return "大兴安岭地区"; }
        else  if (CityString.equals("阿里") ){ return "阿里地区"; }
        else  if (CityString.equals("阿克苏") ){ return "阿克苏地区"; }
        else  if (CityString.equals("喀什") ){ return "喀什地区"; }
        else  if (CityString.equals("和田") ){ return "和田地区"; }
        else  if (CityString.equals("塔城") ){ return "塔城地区"; }
        else  if (CityString.equals("阿勒泰") ){ return "阿勒泰地区"; }

        else  if (CityString.equals("克孜勒苏") ){ return "克孜勒苏柯尔克孜自治州"; }
        else {return "";}

    }

    /*
    CityFormat("北京市","CtiyFullName2ShorName") 输出 北京

    CityFormat("北京","CityShorName2FullName") 输出 北京市

    CityFormat("北京","") 输出 北京市
    */


    public String evaluate(String CityString,String model) {
        try {
            if (CityString == null ){
                return "";
            }

            if (model == "CtiyFullName2ShorName") {
                return CtiyFullName2ShorName(CityString);
            } else if (model == "CityShorName2FullName") {
                return CityShorName2FullName(CityString);
            } else if (model == "" && (CityString.contains("市") ||
                    CityString.contains("县") ||
                    CityString.contains("地区") ||
                    CityString.contains("林区") ||
                    CityString.contains("特别行政区") ||
                    CityString.contains("自治州") ||
                    CityString.contains("盟") ||
                    CityString.contains("台湾省"))) {
                return CityFullName2FullName(CityString);
            } else return CityShorName2FullName(CityString);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }


    public String evaluate (String CityString){
        try {
            if (CityString == null ){
                return "";
            }

            if ((CityString.contains("市") ||
                    CityString.contains("县") ||
                    CityString.contains("地区") ||
                    CityString.contains("林区") ||
                    CityString.contains("特别行政区") ||
                    CityString.contains("自治州") ||
                    CityString.contains("盟") ||
                    CityString.contains("台湾省"))) {
                String resultName = CityFullName2FullName(CityString);
//                System.out.println("fullCtiyName--------CityFullName2FullName--  "+CityString+"------"+resultName);
                return resultName;
            } else {
                String resultName = CityShorName2FullName(CityString);
//                System.out.println("CityShorName2FullName--------CityShorName2FullName--  "+CityString+"------"+resultName);
                return resultName;
            }
        } catch (Exception e) {
//            System.out.println(e);
            e.printStackTrace();
            return "";
        }
    }

    public static void main(String[] args) {
        CityFormat udf_ = new CityFormat();
//        System.out.println(udf_.evaluate("cn.xiaochuankeji.tieba!@#!@最右!@#!@406070!@#!@com.coloros.apprecover!@#!@MDS Service!@#!@1!@#!@com.coloros.onekeylockscreen!@#!@一键锁屏!@#!@1000!@#!@cc.quanben.novel!@#!@全本免费阅读书城!@#!@36!@#!@com.qiyi.video!@#!@爱奇艺!@#!@81180!@#!@com.jifen.qukan!@#!@趣头条!@#!@30700000!@#!@com.imangi.templerun2!@#!@神庙逃亡2!@#!@4646!@#!@com.sankuai.meituan!@#!@美团!@#!@695!@#!@com.youku.phone!@#!@优酷视频!@#!@173!@#!@air.tv.douyu.android!@#!@斗鱼直播!@#!@10493002!@#!@com.ss.android.ugc.live!@#!@火山小视频!@#!@500!@#!@com.tencent.qqmusic!@#!@QQ音乐!@#!@901!@#!@com.nearme.play!@#!@OPPO小游戏!@#!@1310!@#!@com.ushaqi.zhuishushenqi!@#!@追书神器!@#!@4001!@#!@com.qihoo.browser!@#!@360浏览器!@#!@11026!@#!@com.duowan.mobile!@#!@YY!@#!@68363!@#!@com.tencent.reading!@#!@天天快报!@#!@4881!@#!@com.tencent.mm!@#!@微信!@#!@1360!@#!@com.duowan.kiwi!@#!@虎牙直播!@#!@20619!@#!@com.xunlei.downloadprovider!@#!@迅雷!@#!@11170!@#!@com.coloros.screenrecorder!@#!@屏幕录制!@#!@10021!@#!@com.baidu.searchbox!@#!@百度!@#!@46138752!@#!@com.wuba!@#!@58同城!@#!@81202!@#!@com.oppo.face.facetesttool!@#!@FaceTestTool!@#!@300!@#!@com.coloros.familyguard!@#!@远程守护!@#!@102!@#!@com.le123.ysdq!@#!@影视大全!@#!@1025!@#!@com.oppo.test.tool.gpu!@#!@oppoGPUTest!@#!@1!@#!@com.tencent.qqlive!@#!@腾讯视频!@#!@17674!@#!@com.babycloud.hanju!@#!@韩剧TV!@#!@4170!@#!@com.coloros.securityguard!@#!@安全事件!@#!@2!@#!@com.tencent.mtt!@#!@QQ浏览器!@#!@8934570!@#!@com.xunmeng.pinduoduo!@#!@拼多多!@#!@42901!@#!@com.tencent.weread!@#!@微信读书!@#!@10133547!@#!@com.oppo.qemonitor!@#!@AgeMonitor!@#!@1!@#!@tv.pps.mobile!@#!@爱奇艺PPS!@#!@80950!@#!@com.lemon.faceu!@#!@Faceu激萌!@#!@416!@#!@com.ss.android.article.lite!@#!@今日头条极速版!@#!@662!@#!@com.ss.android.article.news!@#!@今日头条!@#!@697!@#!@com.hunantv.imgo.activity!@#!@芒果TV!@#!@6101080!@#!@com.qihoo.haosou.subscribe.vertical.book!@#!@小书亭!@#!@454!@#!@com.UCMobile!@#!@UC浏览器!@#!@998!@#!@com.ss.android.ugc.aweme!@#!@抖音短视频!@#!@320!@#!@com.coloros.yoli!@#!@短视频!@#!@13200!@#!@com.coloros.digitalwellbeing!@#!@应用使用时间!@#!@2!@#!@com.coloros.colorfilestand!@#!@文件台!@#!@1100!@#!@com.qihoo.video!@#!@360影视大全!@#!@163!@#!@com.tencent.mobileqq!@#!@QQ!@#!@942!@#!@com.netease.newsreader.activity!@#!@网易新闻!@#!@927!@#!@com.kugou.android!@#!@酷狗音乐!@#!@9068!@#!@com.snda.wifilocating!@#!@WiFi万能钥匙!@#!@181107!@#!@com.baidu.searchbox.lite!@#!@百度极速版!@#!@20383104!@#!@com.coloros.operationtips!@#!@使用技巧!@#!@2010!@#!@com.coloros.oppopods!@#!@OppoPods!@#!@1100!@#!@com.baidu.BaiduMap!@#!@百度地图!@#!@892!@#!@com.coloros.personalassistant!@#!@Breeno 空间!@#!@10001!@#!@com.oppo.qetest!@#!@AgeTest!@#!@1!@#!@com.coloros.accegamesdk!@#!@游戏空间SDK!@#!@100110!@#!@com.tencent.news!@#!@腾讯新闻!@#!@5690!@#!@com.jingdong.app.mall!@#!@京东!@#!@62796!@#!@com.tencent.karaoke!@#!@全民K歌!@#!@203!@#!@com.cmcc.cmvideo!@#!@咪咕视频!@#!@25000500!@#!@com.wepie.snake.nearme.gamecenter!@#!@贪吃蛇大作战®!@#!@2142!@#!@com.autonavi.minimap!@#!@高德地图!@#!@6750!@#!@com.oppo.ohome!@#!@智能家居!@#!@1041!@#!@com.oppo.store!@#!@OPPO 商城!@#!@100002!@#!@com.cashtoutiao!@#!@惠头条!@#!@47!@#!@com.shuqi.controller!@#!@书旗小说!@#!@155!@#!@com.mianfeia.book!@#!@免费电子书!@#!@70!@#!@com.coloros.soundrecorder!@#!@录音!@#!@1511!@#!@com.sina.weibo!@#!@微博!@#!@3771!@#!@com.pokercity.bydrqp.nearme.gamecenter!@#!@波克捕鱼!@#!@478!@#!@com.tencent.tmgp.pubgmhd!@#!@绝地求生 刺激战场!@#!@5630!@#!@com.songheng.eastnews!@#!@东方头条!@#!@119!@#!@com.smile.gifmaker!@#!@快手!@#!@7176!@#!@com.baidu.haokan!@#!@好看视频!@#!@4661!@#!@com.kiloo.subwaysurf!@#!@地铁跑酷!@#!@2831!@#!@com.ss.android.article.video!@#!@西瓜视频!@#!@308!@#!@com.pfu.popstar!@#!@消消星星乐：最新版!@#!@8202!@#!@com.taobao.taobao!@#!@手机淘宝!@#!@216!@#!@com.coloros.favorite!@#!@自由收藏!@#!@10019!@#!@com.qq.reader!@#!@QQ阅读!@#!@118!@#!@com.netease.cloudmusic!@#!@网易云音乐!@#!@127!@#!@tv.danmaku.bili!@#!@哔哩哔哩!@#!@5332000!@#!@com.eg.android.AlipayGphone!@#!@支付宝!@#!@134!@#!@com.achievo.vipshop!@#!@唯品会!@#!@2992!@#!@com.mianfeizs.book!@#!@免费追书!@#!@70").toString());

//        String a =  udf_.evaluate("北京市","CtiyFullName2ShorName");
//        System.out.println(a);
//        String b =  udf_.evaluate("北京","CityShorName2FullName");
//        System.out.println(b);
//        String c =  udf_.evaluate("北京市","");
//        System.out.println(c);


        String a =  udf_.evaluate("博尔塔拉蒙古");
        if (a.equals("博尔塔拉蒙古自治州")){
            System.out.println("ok");
        };
        System.out.println(a);


        String a1 =  udf_.evaluate(null);

        System.out.println(a1);
        System.out.println("a1");
        if (a1.equals("博尔塔拉蒙古自治州")){
            System.out.println("ok");
        };
//        String b =  udf_.evaluate("北京");
//        System.out.println(b);
//        String c =  udf_.evaluate("北京市");
//        System.out.println(c);
    }
}
