package com.itheima.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 用户实体类：属于主表，被多表引用
 * 9 fields
 */

public class User implements Serializable {

    private Integer uid;//用户id
    private String username;//用户名，账号
    private String password;//密码
    private String telephone;//手机号
    private String nickname;//昵称
    private String sex;//男或女
    private String birthday;//出生日期
    private String email;//邮箱
    private String pic; // 头像

    private List<Address> addresses;

    //该用户的全部订单
    private List<Order> orders;


    public User() {
    }

    public User(Integer uid, String username, String password, String telephone, String nickname, String sex, String birthday, String email, String pic, List<Address> addresses, List<Order> orders) {
        this.uid = uid;
        this.username = username;
        this.password = password;
        this.telephone = telephone;
        this.nickname = nickname;
        this.sex = sex;
        this.birthday = birthday;
        this.email = email;
        this.pic = pic;
        this.addresses = addresses;
        this.orders = orders;
    }

    /**
     * 获取
     * @return uid
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * 设置
     * @param uid
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * 获取
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
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
     * @return nickname
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 设置
     * @param nickname
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * 获取
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 获取
     * @return birthday
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * 设置
     * @param birthday
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取
     * @return pic
     */
    public String getPic() {
        return pic;
    }

    /**
     * 设置
     * @param pic
     */
    public void setPic(String pic) {
        this.pic = pic;
    }

    /**
     * 获取
     * @return addresses
     */
    public List<Address> getAddresses() {
        return addresses;
    }

    /**
     * 设置
     * @param addresses
     */
    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    /**
     * 获取
     * @return orders
     */
    public List<Order> getOrders() {
        return orders;
    }

    /**
     * 设置
     * @param orders
     */
    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public String toString() {
        return "User{uid = " + uid + ", username = " + username + ", password = " + password + ", telephone = " + telephone + ", nickname = " + nickname + ", sex = " + sex + ", birthday = " + birthday + ", email = " + email + ", pic = " + pic + ", addresses = " + addresses + ", orders = " + orders + "}";
    }
}
