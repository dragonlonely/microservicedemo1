package com.dragon.springcloud.pojo;

import java.util.Date;

/**
 * @author Administrator
 * @Date 2018/12/12 14:31
 * @Classname User
 */
public class User {

    private Long id;
    private Date date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User(Long id) {
        this.id = id;
        this.date=new Date();
    }

    public User() {
    }
}
