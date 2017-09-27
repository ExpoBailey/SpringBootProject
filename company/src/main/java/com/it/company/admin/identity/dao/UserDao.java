package com.it.company.admin.identity.dao;

import com.it.company.admin.identity.entity.User;
import com.it.company.core.anno.MyMapper;

/**
 * <p>用户Dao<p>
 * <describe></describe>
 * @Author Bailey
 * @Email zhuwj@minstone.com.cn
 * @Date 2017/9/27 10:18
 * @Since jdk1.8
 * @Version 1.0.0
 */
@MyMapper
public interface UserDao {
    User insert(User user);
}
