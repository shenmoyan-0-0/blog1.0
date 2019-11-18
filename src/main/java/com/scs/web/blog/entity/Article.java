package com.scs.web.blog.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Article {
    private long id;
    private String title;
    private String intro;
    private String cover;
    private Integer diamond;
    private String nickname;
    private Integer comments;
    private Integer likes;
    private LocalDateTime publishtime;
    private int userid;
    private int tpyeid;
    private String content;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public Integer getDiamond() {
        return diamond;
    }

    public void setDiamond(Integer diamond) {
        this.diamond = diamond;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getComments() {
        return comments;
    }

    public void setComments(Integer comments) {
        this.comments = comments;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public LocalDateTime getPublishtime() {
        return publishtime;
    }

    public void setPublishtime(LocalDateTime publishtime) {
        this.publishtime = publishtime;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getTpyeid() {
        return tpyeid;
    }

    public void setTpyeid(int tpyeid) {
        this.tpyeid = tpyeid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
