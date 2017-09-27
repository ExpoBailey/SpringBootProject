package com.it.company.core.anno;

import java.lang.annotation.*;

/**
 * <p>MyMapper注解<p>
 * <describe>用于标注Mybatis持久层接口的注解</describe>
 * @Author Bailey
 * @Email zhuwj@minstone.com.cn
 * @Date 2017/9/27 10:11
 * @Since jdk1.8
 * @Version 1.0.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(value = {ElementType.TYPE})
@Documented
public @interface MyMapper {
}
