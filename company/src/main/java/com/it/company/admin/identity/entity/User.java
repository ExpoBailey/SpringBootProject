package com.it.company.admin.identity.entity;

import lombok.Data;

/**
 * <p>用户<p>
 * <describe></describe>
 * @Author Bailey
 * @Email zhuwj@minstone.com.cn
 * @Date 2017/9/27 10:15
 * @Since jdk1.8
 * @Version 1.0.0
 */
@Data
public class User {

    private int id;

    private String userCode;

    private String userName;

    private String password;

    private String phone;

    private String age;

}
