package com.itheima.dao;

import com.itheima.entity.Route;

import java.util.List;

/**
 * 可能出现的业务性数据库操作：
 * 用户：
 * ##查阅
 * 1）某路线的订单来那个（popularity:具体对应到服务的人数）
 *
 * 业务操作
 *
 *
 * 旅游路线提供商：
 * 1）增加新路线，删除旧路线，更新某路线的信息，如价格等
 * 2）查阅自家最畅享的路线（标准：收藏数目，订单量，销售金额）（可以加入）
 *
 */
public interface RouteMapper {

    /**
     * 更新某路线的收藏数
     * @param id 要更新的路线的id
     * @param num 要变动的数量值
     * @return
     */
    Integer updateSubscription(Integer id,Integer num);

    /**
     * 通过路线id查询路线的信息
     * @param rid
     * @return
     */
    Route getFullRouteInfoById(Integer rid);

    /**
     * 通过类别id(cid)查询某类别下的全部旅行线路
     * @param cid 类别id
     * @return
     */
    List<Route> getFullRouteInfoByCid(Integer cid);

    /**
     * 通过注册商家id查询其所有信息所有的
     * @param sid
     * @return
     */
    List<Route> findRouteForSeller(Integer sid);

    /**
     * 查询所有路线的基本信息（包含route&img）
     * 可用于简单得页面显示
     * @return
     */
    List<Route> getBasicInfo();

}
