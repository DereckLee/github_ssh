package com.itheima.dao;

import com.itheima.entity.User;
import java.util.List;


/**
 * 可能得业务：（考虑到和order,address的映射关系）
 * 用户信息基本管理：
 * 1）查阅基础信息
 * 2）修改个人信息
 * 用户附加信息管理：
 * 1）address
 *  i.管理多条地址联系人信息（增删改查）
 * 2）odder(目的是管理 order item)
 *  i.下单，取消，追加（update，delete）
 *  ii.查阅所有订单
 *
 */
public interface UserMapper {


    List<User> selectAll();

    /**
     * 通过uid查询用户的基本信息和订单信息
     * @param id
     * @return
     */
    User getUserAndAddrById(Integer id);



}
