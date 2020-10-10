package com.itheima.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 商家实体类
 */

public class Seller implements Serializable {
    private Integer sid;//商家id
    private String sname;//商家名称
    private String consphone;//商家电话
    private String address;//商家地址

    //一个商家的全部路线
    private List<Route> routes;


    public Seller() {
    }

    public Seller(Integer sid, String sname, String consphone, String address, List<Route> routes) {
        this.sid = sid;
        this.sname = sname;
        this.consphone = consphone;
        this.address = address;
        this.routes = routes;
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
     * @return sname
     */
    public String getSname() {
        return sname;
    }

    /**
     * 设置
     * @param sname
     */
    public void setSname(String sname) {
        this.sname = sname;
    }

    /**
     * 获取
     * @return consphone
     */
    public String getConsphone() {
        return consphone;
    }

    /**
     * 设置
     * @param consphone
     */
    public void setConsphone(String consphone) {
        this.consphone = consphone;
    }

    /**
     * 获取
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取
     * @return routes
     */
    public List<Route> getRoutes() {
        return routes;
    }

    /**
     * 设置
     * @param routes
     */
    public void setRoutes(List<Route> routes) {
        this.routes = routes;
    }

    public String toString() {
        return "Seller{sid = " + sid + ", sname = " + sname + ", consphone = " + consphone + ", address = " + address + ", routes = " + routes + "}";
    }
}
