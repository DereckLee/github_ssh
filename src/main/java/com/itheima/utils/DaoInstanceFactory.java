package com.itheima.utils;


import org.apache.ibatis.session.SqlSession;

import java.lang.reflect.Proxy;

/**
 * 应用动态代理，讲MyBatis生成的Mapper进一步包装；
 */
public class DaoInstanceFactory {


    public static <T> T getBeanMapper(Class<T> clazz) {

        return (T) Proxy.newProxyInstance(
                DaoInstanceFactory.class.getClassLoader(),

                new Class<?>[]{clazz},
                //InvocationHandler默认返回Object
                (proxy, method, args) -> {
                    SqlSession session = SqlSessionUtils.getSqlSession();
                    T mapper = session.getMapper(clazz);
                    //Mapper内方法正常由MyBatis生成的Mapper做
                    Object obj = method.invoke(mapper, args);
                    session.close();
                    return obj;
                }
        );


    }


}
