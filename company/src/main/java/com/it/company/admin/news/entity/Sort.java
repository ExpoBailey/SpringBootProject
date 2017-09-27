package com.it.company.admin.news.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * <p><p>
 * <describe></describe>
 *
 * @Author Bailey
 * @Email zhuwj@minstone.com.cn
 * @Date 2017/9/27 11:07
 * @Since jdk1.8
 * @Version 1.0.0
 */
public class Sort implements Serializable{
    private static final long serialVersionUID = -8558219169931880755L;
    private long sortId;
    private String name;

    public long getSortId() {
        return sortId;
    }

    public void setSortId(long sortId) {
        this.sortId = sortId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
