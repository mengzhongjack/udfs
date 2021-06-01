import org.apache.hadoop.hive.ql.exec.UDF;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class UdfReloginInteral extends UDF {


    public String evaluate(String activeline) {


        try {
            String[] activeList = activeline.split(",");

            ArrayList interal_list = new ArrayList();

            for (int i = 0; i<activeList.length; i++){
                if (activeList[i].equals("1")){
                    for (int j = i+1; j<activeList.length; j++)
                        if (activeList[j].equals("1")) {

                            interal_list.add(j - i);
                            break;
                        } else {

                        }
                }
            }
            LinkedHashSet<Integer> hashSet = new LinkedHashSet<Integer>(interal_list);

            return hashSet.toString().replace("]","")
                    .replace("[","")
                    ;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }


    public static void main(String[] args) {
        UdfReloginInteral udf_ = new UdfReloginInteral();
//        System.out.println(udf_.evaluate("cn.xiaochuankeji.tieba!@#!@最右!@#!@406070!@#!@com.coloros.apprecover!@#!@MDS Service!@#!@1!@#!@com.coloros.onekeylockscreen!@#!@一键锁屏!@#!@1000!@#!@cc.quanben.novel!@#!@全本免费阅读书城!@#!@36!@#!@com.qiyi.video!@#!@爱奇艺!@#!@81180!@#!@com.jifen.qukan!@#!@趣头条!@#!@30700000!@#!@com.imangi.templerun2!@#!@神庙逃亡2!@#!@4646!@#!@com.sankuai.meituan!@#!@美团!@#!@695!@#!@com.youku.phone!@#!@优酷视频!@#!@173!@#!@air.tv.douyu.android!@#!@斗鱼直播!@#!@10493002!@#!@com.ss.android.ugc.live!@#!@火山小视频!@#!@500!@#!@com.tencent.qqmusic!@#!@QQ音乐!@#!@901!@#!@com.nearme.play!@#!@OPPO小游戏!@#!@1310!@#!@com.ushaqi.zhuishushenqi!@#!@追书神器!@#!@4001!@#!@com.qihoo.browser!@#!@360浏览器!@#!@11026!@#!@com.duowan.mobile!@#!@YY!@#!@68363!@#!@com.tencent.reading!@#!@天天快报!@#!@4881!@#!@com.tencent.mm!@#!@微信!@#!@1360!@#!@com.duowan.kiwi!@#!@虎牙直播!@#!@20619!@#!@com.xunlei.downloadprovider!@#!@迅雷!@#!@11170!@#!@com.coloros.screenrecorder!@#!@屏幕录制!@#!@10021!@#!@com.baidu.searchbox!@#!@百度!@#!@46138752!@#!@com.wuba!@#!@58同城!@#!@81202!@#!@com.oppo.face.facetesttool!@#!@FaceTestTool!@#!@300!@#!@com.coloros.familyguard!@#!@远程守护!@#!@102!@#!@com.le123.ysdq!@#!@影视大全!@#!@1025!@#!@com.oppo.test.tool.gpu!@#!@oppoGPUTest!@#!@1!@#!@com.tencent.qqlive!@#!@腾讯视频!@#!@17674!@#!@com.babycloud.hanju!@#!@韩剧TV!@#!@4170!@#!@com.coloros.securityguard!@#!@安全事件!@#!@2!@#!@com.tencent.mtt!@#!@QQ浏览器!@#!@8934570!@#!@com.xunmeng.pinduoduo!@#!@拼多多!@#!@42901!@#!@com.tencent.weread!@#!@微信读书!@#!@10133547!@#!@com.oppo.qemonitor!@#!@AgeMonitor!@#!@1!@#!@tv.pps.mobile!@#!@爱奇艺PPS!@#!@80950!@#!@com.lemon.faceu!@#!@Faceu激萌!@#!@416!@#!@com.ss.android.article.lite!@#!@今日头条极速版!@#!@662!@#!@com.ss.android.article.news!@#!@今日头条!@#!@697!@#!@com.hunantv.imgo.activity!@#!@芒果TV!@#!@6101080!@#!@com.qihoo.haosou.subscribe.vertical.book!@#!@小书亭!@#!@454!@#!@com.UCMobile!@#!@UC浏览器!@#!@998!@#!@com.ss.android.ugc.aweme!@#!@抖音短视频!@#!@320!@#!@com.coloros.yoli!@#!@短视频!@#!@13200!@#!@com.coloros.digitalwellbeing!@#!@应用使用时间!@#!@2!@#!@com.coloros.colorfilestand!@#!@文件台!@#!@1100!@#!@com.qihoo.video!@#!@360影视大全!@#!@163!@#!@com.tencent.mobileqq!@#!@QQ!@#!@942!@#!@com.netease.newsreader.activity!@#!@网易新闻!@#!@927!@#!@com.kugou.android!@#!@酷狗音乐!@#!@9068!@#!@com.snda.wifilocating!@#!@WiFi万能钥匙!@#!@181107!@#!@com.baidu.searchbox.lite!@#!@百度极速版!@#!@20383104!@#!@com.coloros.operationtips!@#!@使用技巧!@#!@2010!@#!@com.coloros.oppopods!@#!@OppoPods!@#!@1100!@#!@com.baidu.BaiduMap!@#!@百度地图!@#!@892!@#!@com.coloros.personalassistant!@#!@Breeno 空间!@#!@10001!@#!@com.oppo.qetest!@#!@AgeTest!@#!@1!@#!@com.coloros.accegamesdk!@#!@游戏空间SDK!@#!@100110!@#!@com.tencent.news!@#!@腾讯新闻!@#!@5690!@#!@com.jingdong.app.mall!@#!@京东!@#!@62796!@#!@com.tencent.karaoke!@#!@全民K歌!@#!@203!@#!@com.cmcc.cmvideo!@#!@咪咕视频!@#!@25000500!@#!@com.wepie.snake.nearme.gamecenter!@#!@贪吃蛇大作战®!@#!@2142!@#!@com.autonavi.minimap!@#!@高德地图!@#!@6750!@#!@com.oppo.ohome!@#!@智能家居!@#!@1041!@#!@com.oppo.store!@#!@OPPO 商城!@#!@100002!@#!@com.cashtoutiao!@#!@惠头条!@#!@47!@#!@com.shuqi.controller!@#!@书旗小说!@#!@155!@#!@com.mianfeia.book!@#!@免费电子书!@#!@70!@#!@com.coloros.soundrecorder!@#!@录音!@#!@1511!@#!@com.sina.weibo!@#!@微博!@#!@3771!@#!@com.pokercity.bydrqp.nearme.gamecenter!@#!@波克捕鱼!@#!@478!@#!@com.tencent.tmgp.pubgmhd!@#!@绝地求生 刺激战场!@#!@5630!@#!@com.songheng.eastnews!@#!@东方头条!@#!@119!@#!@com.smile.gifmaker!@#!@快手!@#!@7176!@#!@com.baidu.haokan!@#!@好看视频!@#!@4661!@#!@com.kiloo.subwaysurf!@#!@地铁跑酷!@#!@2831!@#!@com.ss.android.article.video!@#!@西瓜视频!@#!@308!@#!@com.pfu.popstar!@#!@消消星星乐：最新版!@#!@8202!@#!@com.taobao.taobao!@#!@手机淘宝!@#!@216!@#!@com.coloros.favorite!@#!@自由收藏!@#!@10019!@#!@com.qq.reader!@#!@QQ阅读!@#!@118!@#!@com.netease.cloudmusic!@#!@网易云音乐!@#!@127!@#!@tv.danmaku.bili!@#!@哔哩哔哩!@#!@5332000!@#!@com.eg.android.AlipayGphone!@#!@支付宝!@#!@134!@#!@com.achievo.vipshop!@#!@唯品会!@#!@2992!@#!@com.mianfeizs.book!@#!@免费追书!@#!@70").toString());

        String a =  udf_.evaluate("1,0,0,0,0,1,0,1,0,1,1,0,0,0");
        System.out.println(a);
    }




}