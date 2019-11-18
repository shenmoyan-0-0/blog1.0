package com.scs.web.blog.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;


public class Student {
    private  Integer id;
    private  String username;
    private  String avatar;
    private  LocalDateTime createTime;
    private  String Introduce;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }



    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
    public String getIntroduce() {
        return Introduce;
    }

    public void setIntroduce(String Introduce) {
        this.Introduce = Introduce;
    }
}