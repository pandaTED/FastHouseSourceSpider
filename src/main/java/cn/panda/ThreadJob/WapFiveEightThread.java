package cn.panda.ThreadJob;

import cn.panda.spider.fiveEight.WapFiveEightSpider;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by lingj on 2017/2/23 0023.
 */
public class WapFiveEightThread implements Runnable{

    private  volatile List<String> onlyIdList;

    public WapFiveEightThread(List<String> onlyIdList) {

        this.onlyIdList = onlyIdList;

    }

    WapFiveEightSpider wapFiveEightSpider = new WapFiveEightSpider();

    public void run() {

        for(String str:onlyIdList){
            wapFiveEightSpider.spiderRun(str);
        }

    }


    public void start(){
        run();
    }


}
