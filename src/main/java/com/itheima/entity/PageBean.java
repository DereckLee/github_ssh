package com.itheima.entity;

import java.util.List;

/**
 * 页面对象，封装每一页对象所有属性
 */
public class PageBean<T> {
    //第1组：由客户端用户提供的
    private int current;  //当前页
    private int size;  //每页大小

    //第2组：从数据库中查询出来的
    private List<T> data;  //每页的数据
    private int count;  //总记录数

    //第3组：由其它的属性计算出来的
    private int first; //首页
    private int previous; //上一页
    private int next; //下一页
    private int total; //总页数和末页

    public PageBean() {
    }

    /**
     * 添加了一个有4个参数的构造方法
     * @param current 当前页
     * @param size 每页大小
     * @param data 这页的数据
     * @param count 总记录数
     */
    public PageBean(int current, int size, List<T> data, int count) {
        this.current = current;
        this.size = size;
        this.data = data;
        this.count = count;
    }

    //所有的计算放在get方法中
    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    //获取第1页数据
    public int getFirst() {
        return 1;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    //获取上一页
    public int getPrevious() {
        //如果当前页大于1，上一页就等于当前页-1，否则返回1
        if (getCurrent() > 1) {
            return getCurrent() - 1;
        }
        else {
            return 1;
        }
    }

    public void setPrevious(int previous) {
        this.previous = previous;
    }

    //获取下一页的值
    public int getNext() {
        //如果当前页小于最后一页，下一页就等于当前页+1，否则返回最后一页的页数
        if (getCurrent() < getTotal()) {
            return getCurrent() + 1;
        }
        else {
            return getTotal();
        }
    }

    public void setNext(int next) {
        this.next = next;
    }

    /*
    计算总页数 = 总记录数 / 页大小
    结论：
    1. 如果能整除，计算结果就是页数
    2. 如果不能整除，计算结果加1
     */
    public int getTotal() {
        if(getCount() % getSize() == 0) {
            return getCount() / getSize();
        }
        else {
            return getCount() / getSize() + 1;
        }
    }

    public void setTotal(int total) {
        this.total = total;
    }

    //注：因为我们所有的计算放在get方法中，所以需要输出get方法的值才能看到正确的结果
    @Override
    public String toString() {
        return "PageBean{" +
                "current=" + getCurrent() +
                ", size=" + getSize() +
                ", data=" + getData() +
                ", count=" + getCount() +
                ", first=" + getFirst() +
                ", previous=" + getPrevious() +
                ", next=" + getNext() +
                ", total=" + getTotal() +
                '}';
    }
}
