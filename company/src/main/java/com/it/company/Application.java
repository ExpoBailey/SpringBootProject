package com.it.company;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * <p>项目启动类<p>
 * <describe></describe>
 * @Author Bailey
 * @Email zhuwj@minstone.com.cn
 * @Date 2017/9/27 9:40
 * @Since jdk1.8
 * @Version 1.0.0
 */
@SpringBootApplication
@EnableTransactionManagement
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
