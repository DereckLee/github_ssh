package com.itheima.utils;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.ResourceBundle;

/**
 * 创建Jedis工具类
 */
public class JedisUtils {

    private static JedisPool pool;

    static {
        //读取src下的配置文件，得到ResourceBundle对象
        ResourceBundle bundle = ResourceBundle.getBundle("jedis");
        //得到所有的属性并且赋值
        String host = bundle.getString("host");
        //以下属性要转成整数类型
        int port = Integer.parseInt(bundle.getString("port"));
        int maxTotal = Integer.parseInt(bundle.getString("maxTotal"));
        int maxWaitMillis = Integer.parseInt(bundle.getString("maxWaitMillis"));
        //创建配置对象
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxWaitMillis(maxWaitMillis);
        config.setMaxTotal(maxTotal);
        //创建连接池对象
        pool = new JedisPool(config, host, port);
    }

    /**
     * 从连接池中得到Jedis连接对象
     */
    public static Jedis getJedis() {
        return pool.getResource();
    }
}
