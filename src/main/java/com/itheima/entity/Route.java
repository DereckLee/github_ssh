package com.itheima.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 旅游线路商品实体类
 */

public class Route implements Serializable {

    private Integer rid;//线路id，必输
    private String rname;//线路名称，必输
    private double price;//价格，必输
    private String routeIntroduce;//线路介绍
    private String rflag;   //是否上架，必输，0代表没有上架，1代表是上架
    private String rdate;   //上架时间
    private String isThemeTour;//是否主题旅游，必输，0代表不是，1代表是
    private Integer num;//收藏数量
    //应该由商家注册路线时提供
    private String rimage;//缩略图
    private String sourceId;//抓取数据的来源id

    //需要拼接外表tab_category（一对一）2tables
    private Integer cid;//所属分类，必输
    private Category category;//所属分类

    //路线的对应提供商家
    private Integer sid;//所属商家
    private Seller seller;//所属商家

    //路线相关的全部标图
    private List<RouteImg> routeImgList;


    public Route() {
    }

    public Route(Integer rid, String rname, double price, String routeIntroduce, String rflag, String rdate, String isThemeTour, Integer num, Integer cid, String rimage, Integer sid, String sourceId, Category category, Seller seller, List<RouteImg> routeImgList) {
        this.rid = rid;
        this.rname = rname;
        this.price = price;
        this.routeIntroduce = routeIntroduce;
        this.rflag = rflag;
        this.rdate = rdate;
        this.isThemeTour = isThemeTour;
        this.num = num;
        this.cid = cid;
        this.rimage = rimage;
        this.sid = sid;
        this.sourceId = sourceId;
        this.category = category;
        this.seller = seller;
        this.routeImgList = routeImgList;
    }

    /**
     * 获取
     * @return rid
     */
    public Integer getRid() {
        return rid;
    }

    /**
     * 设置
     * @param rid
     */
    public void setRid(Integer rid) {
        this.rid = rid;
    }

    /**
     * 获取
     * @return rname
     */
    public String getRname() {
        return rname;
    }

    /**
     * 设置
     * @param rname
     */
    public void setRname(String rname) {
        this.rname = rname;
    }

    /**
     * 获取
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * 获取
     * @return routeIntroduce
     */
    public String getRouteIntroduce() {
        return routeIntroduce;
    }

    /**
     * 设置
     * @param routeIntroduce
     */
    public void setRouteIntroduce(String routeIntroduce) {
        this.routeIntroduce = routeIntroduce;
    }

    /**
     * 获取
     * @return rflag
     */
    public String getRflag() {
        return rflag;
    }

    /**
     * 设置
     * @param rflag
     */
    public void setRflag(String rflag) {
        this.rflag = rflag;
    }

    /**
     * 获取
     * @return rdate
     */
    public String getRdate() {
        return rdate;
    }

    /**
     * 设置
     * @param rdate
     */
    public void setRdate(String rdate) {
        this.rdate = rdate;
    }

    /**
     * 获取
     * @return isThemeTour
     */
    public String getIsThemeTour() {
        return isThemeTour;
    }

    /**
     * 设置
     * @param isThemeTour
     */
    public void setIsThemeTour(String isThemeTour) {
        this.isThemeTour = isThemeTour;
    }

    /**
     * 获取
     * @return num
     */
    public Integer getNum() {
        return num;
    }

    /**
     * 设置
     * @param num
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * 获取
     * @return cid
     */
    public Integer getCid() {
        return cid;
    }

    /**
     * 设置
     * @param cid
     */
    public void setCid(Integer cid) {
        this.cid = cid;
    }

    /**
     * 获取
     * @return rimage
     */
    public String getRimage() {
        return rimage;
    }

    /**
     * 设置
     * @param rimage
     */
    public void setRimage(String rimage) {
        this.rimage = rimage;
    }

    /**
     * 获取
     * @return sid
     */
    public Integer getSid() {
        return sid;
    }

    /**
     * 设置
     * @param sid
     */
    public void setSid(Integer sid) {
        this.sid = sid;
    }

    /**
     * 获取
     * @return sourceId
     */
    public String getSourceId() {
        return sourceId;
    }

    /**
     * 设置
     * @param sourceId
     */
    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    /**
     * 获取
     * @return category
     */
    public Category getCategory() {
        return category;
    }

    /**
     * 设置
     * @param category
     */
    public void setCategory(Category category) {
        this.category = category;
    }

    /**
     * 获取
     * @return seller
     */
    public Seller getSeller() {
        return seller;
    }

    /**
     * 设置
     * @param seller
     */
    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    /**
     * 获取
     * @return routeImgList
     */
    public List<RouteImg> getRouteImgList() {
        return routeImgList;
    }

    /**
     * 设置
     * @param routeImgList
     */
    public void setRouteImgList(List<RouteImg> routeImgList) {
        this.routeImgList = routeImgList;
    }

    public String toString() {
        return "Route{rid = " + rid + ", rname = " + rname + ", price = " + price + ", routeIntroduce = " + routeIntroduce + ", rflag = " + rflag + ", rdate = " + rdate + ", isThemeTour = " + isThemeTour + ", num = " + num + ", cid = " + cid + ", rimage = " + rimage + ", sid = " + sid + ", sourceId = " + sourceId + ", category = " + category + ", seller = " + seller + ", routeImgList = " + routeImgList + "}";
    }
}
