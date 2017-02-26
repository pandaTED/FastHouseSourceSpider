package cn.panda.spider.fiveEight;

import cn.panda.util.ProxyIpUtil;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;

import java.util.Date;
import java.util.List;

/**
 * Created by lingj on 2017/2/23 0023.
 */
public class WapFiveEightSpider implements PageProcessor{

    private Site site = Site.me().
            setCharset("utf-8").
            setRetryTimes(3).
            setSleepTime(500).
            setTimeOut(10*1000).
            setCycleRetryTimes(5).
            addHeader("Referer", "http://ta.58.com/ershoufang").
            setUserAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/57.0.2987.37 Safari/537.36");



    public void process(Page page) {

    //=======Xpath========

        String titleXpath = "/html/head/title" ;       //标题
        String villageNameXpath = "" ; //小区名
        String priceXpath = "/html/body/div[1]/span/text()" ;       //价格
        String mpriceXpath = "" ;      //单价
        String housrTypeXpath = "" ;   //房屋类型
        String areaXpath = "" ;        //面积
        String floorXpath = "" ;       //所在楼层
        String allFloorXpath = "" ;    //全部楼层
        String propertyTypeXpath = "" ;    //产权类型
        String propertyYearXpath = "" ;    //产权年限
        String buildTypeXpath = "" ;       //建筑类型
        String buildYearXpath = "" ;       //建筑年代
        String cityAreaXpath = "/html/body/div[1]/a[7]/text()" ;        //城市区域
        String smallAreaXpath = "" ;       //所在小区域
        String addressXpath = "" ;         //地址
        String phoneXpath = "" ;           //手机号
        String contactXpath = "" ;         //联系人
        String descriptionXpath = "" ;     //描述
        String publishTimeXpath = "" ;     //发布时间
        String updateTimeXpath = "" ;      //更新时间

    //=======value=======

        String url = page.getUrl().toString();

        String hashstr;     //hash值，通过
        String onlyId;      //链接内地id
        String newOnlyId;   //新的onlyId
        String title;       //标题
        String villageName; //小区名
        String price;       //价格
        String mprice;      //单价
        String housrType;   //房屋类型
        String area;        //面积
        String floor;       //所在楼层
        String allFloor;    //全部楼层
        String propertyType;    //产权类型
        String propertyYear;    //产权年限
        String buildType;       //建筑类型
        String buildYear;       //建筑年代
        String cityArea;        //城市区域
        String smallArea;       //所在小区域
        String address;         //地址
        String phone;           //手机号
        String contact;         //联系人
        String description;     //描述
        String publishTime;     //发布时间
        String updateTime;      //更新时间
        Date addTime;           //添加时间

    //=====判断=======

        System.out.println(Thread.currentThread().getName());
        System.out.println(page.getUrl()+":status--->"+page.getStatusCode());
        System.out.println(page.getHtml());

        boolean flag = true;
        int i = 1;

        if(page.getHtml().toString().contains("请输入验证码")){

            flag = false;

            try {
                Thread.sleep(i*60*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            i++;
        }


    }

    public Site getSite() {

//        List<String[]> proxyPool = ProxyIpUtil.getAllProxyList();
//        site.setHttpProxyPool(proxyPool,false);

        return site;
    }

    public void spiderRun(String onlyId){

        String requestUrlTemp = "http://wap.58.com/ta/ershoufang/%s.shtml?device=wap";
        String requestUrl = String.format(requestUrlTemp,onlyId);
        Spider.create(new WapFiveEightSpider()).addUrl(requestUrl).thread(1).run();

    }


}
