package com.itheima.entity;

import lombok.Data;

import java.io.Serializable;


public class Address implements Serializable {

    private Integer aid;

    private String contact;

    private String address;

    private String telephone;

    private String isdefault;

    private User user;


    public Address() {
    }

    public Address(Integer aid, String contact, String address, String telephone, String isdefault, User user) {
        this.aid = aid;
        this.contact = contact;
        this.address = address;
        this.telephone = telephone;
        this.isdefault = isdefault;
        this.user = user;
    }

    /**
     * 获取
     * @return aid
     */
    public Integer getAid() {
        return aid;
    }

    /**
     * 设置
     * @param aid
     */
    public void setAid(Integer aid) {
        this.aid = aid;
    }

    /**
     * 获取
     * @return contact
     */
    public String getContact() {
        return contact;
    }

    /**
     * 设置
     * @param contact
     */
    public void setContact(String contact) {
        this.contact = contact;
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
     * @return telephone
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * 设置
     * @param telephone
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * 获取
     * @return isdefault
     */
    public String getIsdefault() {
        return isdefault;
    }

    /**
     * 设置
     * @param isdefault
     */
    public void setIsdefault(String isdefault) {
        this.isdefault = isdefault;
    }

    /**
     * 获取
     * @return user
     */
    public User getUser() {
        return user;
    }

    /**
     * 设置
     * @param user
     */
    public void setUser(User user) {
        this.user = user;
    }

    public String toString() {
        return "Address{aid = " + aid + ", contact = " + contact + ", address = " + address + ", telephone = " + telephone + ", isdefault = " + isdefault + ", user = " + user + "}";
    }
}
