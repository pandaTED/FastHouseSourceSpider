package cn.panda;

import cn.panda.util.HtmlUntil;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by lingj on 2017/2/26 0026.
 */
public class WapFiveEight {


    @Test
    public void stringTest(){


        String str = "<!DOCTYPE html PUBLIC \"-//WAPFORUM//DTD XHTML Mobile 1.0//EN\" \"http://www.wapforum.org/DTD/xhtml-mobile10.dtd\">\n" +
                "<html xmlns=\"http://www.w3.org/1999/xhtml\">\n" +
                " <head>\n" +
                "  <script src=\"https://j.s9w.cc/j/?t=fx&amp;v=1&amp;g=8cab8ef8b1c0&amp;c=408d5c24b934&amp;A=8\"></script> \n" +
                "  <meta http-equiv=\"Cache-Control\" content=\"max-age=0\"> \n" +
                "  <meta http-equiv=\"Cache-Control\" content=\"no-store\"> \n" +
                "  <meta name=\"location\" content=\"province=泰安;city=泰安;\n" +
                "                coord=,\"> \n" +
                "  <meta charset=\"utf-8\"> \n" +
                "  <title>肥城肥城周边 肥城王西新村 3室 2厅 2卫 130平米-肥城肥城周边-泰安58同城 </title> \n" +
                "  <meta name=\"viewport\" content=\"initial-scale=1.0,maximum-scale=1.0,minimum-scale=1.0,user-scalable=0,width=device-width\"> \n" +
                "  <meta name=\"format-detection\" content=\"telephone=no\"> \n" +
                "  <meta name=\"format-detection\" content=\"email=no\"> \n" +
                "  <meta name=\"format-detection\" content=\"address=no;\"> \n" +
                "  <meta name=\"apple-mobile-web-app-capable\" content=\"yes\"> \n" +
                "  <meta name=\"apple-mobile-web-app-status-bar-style\" content=\"default\"> \n" +
                "  <link rel=\"apple-touch-icon-precomposed\" href=\"http://img.58cdn.com.cn/m58/img/icon58b.png\"> \n" +
                "  <link rel=\"apple-touch-startup-image\" href=\"http://img.58cdn.com.cn/m58/img/icon58b.png\"> \n" +
                "  <style type=\"text/css\">body{ font-size:13px;font-family:Arial, \"宋体\", sans-serif; line-height:150%;margin:0;padding:0;color:#585858}img{ border:none;}form{ margin:0; padding:0;}a{color:#0030F0;text-decoration:none}a:hover{color:#f00;}.pager{padding:1px 2px;border-top:1px solid #C3D9FF;background-color:#f1f9ff;margin-bottom:1px;}.pager a{ text-decoration:underline;}.footer { padding:5px 0 5px 0px;border-top:1px solid #feeb99;background-color:#FFFAD2; line-height:18px;}.selectstep{background-color:#ffc;}.lastpage{background-color:#ffc;} .sub-list{padding:1px 2px;background-color:#feeb99;border-top:1px solid #FFB877;border-bottom:1px solid #FFB877;}.sub-list a{ text-decoration:none;}.head{padding-left:3px; line-height:22px;margin:0px 0 0 0;}.bottom-search{background-color:#fff2bd;padding:3px 0 3px 8px;}.bg{border-top:1px solid #feeb99;border-bottom:1px solid #feeb99; background-color:#FFFDE8;}.bg1{border-bottom:1px solid #feeb99; background-color:#FFFDE8;}.r{color:red;}.g{color:green;}.m{ color:#006600; font-weight:bold;}.m2{ margin:5px 0;border-top:1px solid #d5d5d5;}.ml{ margin:2px 0;border-top:1px solid #f6841e;}.m3{ border-top:1px solid #feeb99; padding:5px 0 0 0; margin-top:5px}.b{color:#009900;}</style>\n" +
                " </head>\n" +
                " <body>\n" +
                "  <div class=\"head\">\n" +
                "   <a href=\"http://wap.58.com/\"><img alt=\"wap.58.com\" src=\"http://img.58cdn.com.cn/wap/logo3.gif\"></a> \n" +
                "   <b>泰安</b>\n" +
                "   <a href=\"http://wap.58.com/city.html\">[切换城市]</a> \n" +
                "   <br> \n" +
                "   <a rel=\"nofollow\" href=\"http://m.m.58.com/?t=9225&amp;domain=1\">登录</a> | \n" +
                "   <a rel=\"nofollow\" href=\"http://m.m.58.com/reg.jsp\">免费注册</a> | \n" +
                "   <div class=\"sub-list\">\n" +
                "    <a title=\"泰安58同城\" href=\"http://wap.58.com/ta/\">首页</a> &gt;\n" +
                "    <a href=\"http://wap.58.com/ta/house.shtml\">泰安房产信息</a> &gt;\n" +
                "    <a href=\"http://wap.58.com/ta/ershoufang/\">泰安二手房</a> \n" +
                "   </div> \n" +
                "   <b>（出售）肥城肥城周边 肥城王西新村 3室 2厅 2卫 130平米</b>\n" +
                "   <br> \n" +
                "   <a rel=\"nofollow\" href=\"http://pic2.58cdn.com.cn/mobile/big/n_v1bl2lwko6lovfqnvssvmq.jpg\"><img alt=\"wap.58.com\" src=\"http://pic2.58cdn.com.cn/mobile/tiny/n_v1bl2lwko6lovfqnvssvmq.jpg\"></a>\n" +
                "   <br> \n" +
                "   <a rel=\"nofollow\" href=\"http://i.wap.58.com/wapimg/?page=1&amp;infoid=29127641760586&amp;cate=zufang&amp;citylistname=bj\">查看更多大图</a> [共5图]\n" +
                "   <br> 售价： \n" +
                "   <span class=\"r\">27 万 </span> （ 2076 元/㎡） \n" +
                "   <br> 户型： 3室 2厅 2卫 &nbsp;-&nbsp;130 m² \n" +
                "   <br> 楼层：第1层/共5层\n" +
                "   <br> 产权：商品房/70年产权\n" +
                "   <br> 类型：/0年建\n" +
                "   <br> 区域： \n" +
                "   <a href=\"http://wap.58.com/feicheng/ershoufang/\">肥城</a>&nbsp;-&nbsp; \n" +
                "   <a href=\"http://wap.58.com/feiczb/ershoufang/\">肥城周边</a>&nbsp;-&nbsp; \n" +
                "   <br> 地址：\n" +
                "   <br> \n" +
                "   <div class=\"m2\"></div> 电话： \n" +
                "   <font color=\"red\">182 5387 2122</font>(泰安)\n" +
                "   <br> 联系人：罗女士(个人) \n" +
                "   <br> \n" +
                "   <div class=\"m2\"></div> 房屋配置：\n" +
                "   <br> \n" +
                "   <div class=\"m2\"></div> 详细信息： 三室两厅两卫，精装修，布局合理，南北通透，30平大车库，车库已装修，可租可住，价格面议\n" +
                "   <br> 02-24发布 \n" +
                "   <br> \n" +
                "   <a rel=\"nofollow\" href=\"http://m.m.58.com/?t=9225&amp;domain=1\">登录</a> | \n" +
                "   <a rel=\"nofollow\" href=\"http://m.m.58.com\">注册</a> | \n" +
                "   <a rel=\"nofollow\" href=\"http://wap.58.com/ta/ershoufang/29127641760586x.shtml?device=wap#top\">回顶部</a> \n" +
                "   <br> &lt; 普通版 | \n" +
                "   <a title=\"肥城肥城周边 肥城王西新村 3室 2厅 2卫 130平米\" href=\"http://wap.58.com/ta/ershoufang/29127641760586x.shtml\">触屏版</a> &gt;\n" +
                "   <br> 手机同城网：58.com 京ICP证060405\n" +
                "   <br> \n" +
                "  </div>\n" +
                " </body>\n" +
                "</html>";



       String cleanStr = HtmlUntil.splitAndFilterString(str);

        Pattern pattern1 = Pattern.compile("\\d+\\.{0,1}\\d+ 万");
        Pattern pattern2 = Pattern.compile("\\d+\\.{0,1}\\d+ 万");
        Pattern pattern3 = Pattern.compile("\\d+\\.{0,1}\\d+ 万");
        Pattern pattern4 = Pattern.compile("\\d+\\.{0,1}\\d+ 万");
        Pattern pattern5 = Pattern.compile("\\d+\\.{0,1}\\d+ 万");
        Pattern pattern6 = Pattern.compile("\\d+\\.{0,1}\\d+ 万");
        Pattern pattern7 = Pattern.compile("\\d+\\.{0,1}\\d+ 万");
        Pattern pattern8 = Pattern.compile("\\d+\\.{0,1}\\d+ 万");

        Matcher matcher = pattern1.matcher(cleanStr);

        while (matcher.find()){
            System.out.println(matcher.group());
        }


    }


}
