package com.it.company.admin.news.dao;

import com.it.company.admin.news.entity.Sort;
import com.it.company.core.anno.MyMapper;

/**
 * <p><p>
 * <describe></describe>
 *
 * @Author Bailey
 * @Email zhuwj@minstone.com.cn
 * @Date 2017/9/27 11:13
 * @Since jdk1.8
 * @Version 1.0.0
 */
@MyMapper
public interface SortDao {
    int insert(Sort sort);
}
