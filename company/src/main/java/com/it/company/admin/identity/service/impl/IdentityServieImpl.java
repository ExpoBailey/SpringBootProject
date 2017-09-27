package com.it.company.admin.identity.service.impl;

import com.it.company.admin.identity.dao.UserDao;
import com.it.company.admin.identity.entity.User;
import com.it.company.admin.identity.service.IIdentityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p><p>
 * <describe></describe>
 *
 * @Author Bailey
 * @Email zhuwj@minstone.com.cn
 * @Date 2017/9/27 10:19
 * @Since jdk1.8
 * @Version 1.0.0
 */
@Service("identityService")
@Transactional
public class IdentityServieImpl implements IIdentityService {

    @Autowired
    private UserDao userDao;

    @Override
    public User insert(User user) {
        return userDao.insert(user);
    }
}
