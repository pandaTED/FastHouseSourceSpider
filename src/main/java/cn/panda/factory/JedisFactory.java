package cn.panda.factory;

import redis.clients.jedis.Jedis;

/**
 * Created by lingj on 2017/2/7 0007.
 */
public class JedisFactory {


    public static Jedis jedis;

    public static Jedis getJedis(){
        if(null == jedis){
            jedis = new Jedis("localhost",6379);
        }else{
            return jedis;
        }

        return jedis;
    }

}
