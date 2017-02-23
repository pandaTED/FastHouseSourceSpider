package cn.panda.spider.fiveEight;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;

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
        System.out.println("--->"+Thread.currentThread().getName());
        System.out.println(page.getUrl()+":status--->"+page.getStatusCode());
    }

    public Site getSite() {
        return site ;
    }

    public void spiderRun(String onlyId){

        String requestUrlTemp = "http://wap.58.com/ta/ershoufang/%s.shtml?device=wap";
        String requestUrl = String.format(requestUrlTemp,onlyId);
        Spider.create(new WapFiveEightSpider()).addUrl(requestUrl).thread(1).run();

    }


}
