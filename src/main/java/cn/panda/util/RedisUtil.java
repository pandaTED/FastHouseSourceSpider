package cn.panda.util;

import cn.panda.factory.JedisFactory;
import redis.clients.jedis.Jedis;

/**
 * Created by lingj on 2017/2/7 0007.
 */
public class RedisUtil {

        public  void  setValue(String key,String value){
            Jedis jedis = JedisFactory.getJedis();
            jedis.set(key,value);
            jedis.close();
        }

}
