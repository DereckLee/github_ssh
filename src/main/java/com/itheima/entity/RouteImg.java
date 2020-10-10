package com.itheima.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 旅游线路图片实体类
 */

public class RouteImg implements Serializable {

    private Integer rgid;//商品图片id
    private Integer rid;//旅游商品id
    private String bigPic;//详情商品大图
    private String smallPic;//详情商品小图


    public RouteImg() {
    }

    public RouteImg(Integer rgid, Integer rid, String bigPic, String smallPic) {
        this.rgid = rgid;
        this.rid = rid;
        this.bigPic = bigPic;
        this.smallPic = smallPic;
    }

    /**
     * 获取
     * @return rgid
     */
    public Integer getRgid() {
        return rgid;
    }

    /**
     * 设置
     * @param rgid
     */
    public void setRgid(Integer rgid) {
        this.rgid = rgid;
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
     * @return bigPic
     */
    public String getBigPic() {
        return bigPic;
    }

    /**
     * 设置
     * @param bigPic
     */
    public void setBigPic(String bigPic) {
        this.bigPic = bigPic;
    }

    /**
     * 获取
     * @return smallPic
     */
    public String getSmallPic() {
        return smallPic;
    }

    /**
     * 设置
     * @param smallPic
     */
    public void setSmallPic(String smallPic) {
        this.smallPic = smallPic;
    }

    public String toString() {
        return "RouteImg{rgid = " + rgid + ", rid = " + rid + ", bigPic = " + bigPic + ", smallPic = " + smallPic + "}";
    }
}
