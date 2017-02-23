package cn.panda.util;

import cn.panda.entity.Data;
import cn.panda.entity.ProxyIp;
import com.alibaba.fastjson.JSON;
import org.apache.http.HttpEntity;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lingj on 2017/2/23 0023.
 */
public class ProxyIpUtil {


        //返回代理entity的list
     public static  List<String[]> getAllProxyList(){

            String requesturl= "http://proxy.scumall.com:8080/proxyipcenter/av?num=500";


         List<String[]> proxyPool = new ArrayList<String[]>();

            CloseableHttpClient closeableHttpClient = HttpClients.createDefault();

            try {
                HttpGet httpGet = new HttpGet(requesturl);

                CloseableHttpResponse closeableHttpResponse = closeableHttpClient.execute(httpGet);
                try{
                    HttpEntity httpEntity = closeableHttpResponse.getEntity();

                    if(null != httpEntity){

                        String json = EntityUtils.toString(httpEntity);

                        Data data  = JSON.parseObject(json,Data.class);

                        List<ProxyIp> proxyIpList = data.getData().getData();

                        for(ProxyIp proxyIp:proxyIpList){

                            if(proxyIp.getSpeed()<= 1000){
                                proxyPool.add(new String[]{"","",proxyIp.getIp(),proxyIp.getPort().toString()});
                            }
                        }
                    }
                }finally {
                    closeableHttpResponse.close();
                }

            }catch (Exception e){
                e.printStackTrace();
            }finally {

                try{
                    closeableHttpClient.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }

         System.out.println("有"+proxyPool.size()+"条代理");

            return proxyPool;
    }


    public static void main(String[] args) {

            List<String[]> proxyList = getAllProxyList();

            for(String[] strArray:proxyList){
                System.out.println("ip--->"+strArray[2]+"-->port-->"+strArray[3]);
            }


    }


}
