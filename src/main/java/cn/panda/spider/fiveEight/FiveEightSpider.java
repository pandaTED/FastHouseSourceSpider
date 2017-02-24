package cn.panda.spider.fiveEight;

import cn.panda.ThreadJob.WapFiveEightThread;
import cn.panda.util.ProxyIpUtil;
import cn.panda.util.RedisUtil;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.proxy.SimpleProxyPool;
import us.codecraft.webmagic.scheduler.QueueScheduler;

import java.util.*;

/**
 * Created by lingj on 2017/2/21 0021.
 */
public class FiveEightSpider implements PageProcessor{

    private Site site = Site.me().
            setCharset("utf-8").
            setRetryTimes(3).
            setSleepTime(500).
            setTimeOut(10*1000).
            setCycleRetryTimes(5).
            addHeader("Referer", "http://ta.58.com/ershoufang").
            setUserAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/57.0.2987.37 Safari/537.36");

    private static List<String> wapHouseUrlList = new ArrayList<String>();


    public Site getSite() {

//        List<String[]> proxyPool = ProxyIpUtil.getAllProxyList();
//        site.setHttpProxyPool(proxyPool,false);

        return site;
    }


    public static Set<String> fiveEightHouseLink = new HashSet<String>();

    //链接的正则
    private String fiveEightLink = "http://ta.58.com/ershoufang/0/pn\\d+\\/";
    private String houseLink = "http://ta.58.com/ershoufang/\\w+.shtml";


    //爬虫的process
    public void process(Page page) {

     System.out.println(Thread.currentThread().getName());

      List<String> pageList =  page.getHtml().links().regex(fiveEightLink).all();
      pageList = new ArrayList<String>(new HashSet<String>(pageList));

      //请求页码
      page.addTargetRequests(pageList);

      List<String> fiveeightPage = page.getHtml().links().regex(houseLink).all();

      fiveEightHouseLink.addAll(new HashSet<String>(fiveeightPage));

      if(null != wapHouseUrlList && wapHouseUrlList.size() !=0){
          page.addTargetRequests(wapHouseUrlList);
      }

      try {
          wapHouseUrlList.remove(page.getUrl());
      }catch (Exception e){
          e.printStackTrace();
      }

    }


    //主入口
    public static void main(String[] args) {

        WapFiveEightSpider wapFiveEightSpider = new WapFiveEightSpider();

        Spider.create(new FiveEightSpider()).addUrl("http://ta.58.com/ershoufang/0/").thread(10).run();

        String requestUrlTemp = "http://wap.58.com/ta/ershoufang/%s.shtml?device=wap";

        Set<String> urlStrSet = new HashSet<String>();

        for(String url:fiveEightHouseLink){

            String newUrlStr = url.replace("http://ta.58.com/ershoufang/","").replace(".shtml","");
            urlStrSet.add(newUrlStr);
        }

        int i = 0;

        for(String str:urlStrSet){
            wapFiveEightSpider.spiderRun(str);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("i----->"+(i++));
        }

    }



    public static List<List<String>> toGroupList(List<String> list,Integer groupNum){
        List<List<String>> newList = new ArrayList<List<String>>();
        if(list.size() <= 0){
            return null;
        }else{
            if(groupNum <=0){
                newList.add(list);
                return newList;
            }else{
                Integer size = list.size()/groupNum;

                for(int i = 0;i<groupNum;i++){

                    if(i<groupNum-1){
                        newList.add(list.subList((i*size),(i+1)*size));
                    }else{
                        newList.add(list.subList((i*size),list.size()));
                    }
                }
            }
        }
        return newList;
    }



}
