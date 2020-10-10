package com.itheima.utils;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * 该类的目的是快速获取数据库的连接，
 * 而Mybatis中
 */

public class SqlSessionUtils {

    //for creating more SqlSession
    private static SqlSessionFactory factory;

    /**
     * 在加载类就初始化SqlSessionFactory，让其长住内存，便于取得多个SqlSession
     */
    static {
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        InputStream in =
                SqlSessionUtils.class.getResourceAsStream("/sqlMapConfig.xml");
        factory = builder.build(in);
    }

    /**
     * 该方法用于快速获得一个MyBatis的SqlSession连接（会话）
     *
     * @return SqlSession
     */
    public static SqlSession getSqlSession() {
        //自动提交事务打开
        SqlSession session = factory.openSession(true);
        return session;
    }


}
