package com.it.company.admin.news.service.impl;

import com.it.company.admin.news.dao.SortDao;
import com.it.company.admin.news.entity.Sort;
import com.it.company.admin.news.service.INewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p><p>
 * <describe></describe>
 *
 * @Author Bailey
 * @Email zhuwj@minstone.com.cn
 * @Date 2017/9/27 11:12
 * @Since jdk1.8
 * @Version 1.0.0
 */
@Service("newsService")
@Transactional
public class NewsServiceImpl implements INewsService {
    @Autowired
    private SortDao sortDao;


    @Override
    public boolean insert(Sort sort) {

        return sortDao.insert(sort) > 0;
    }
}
