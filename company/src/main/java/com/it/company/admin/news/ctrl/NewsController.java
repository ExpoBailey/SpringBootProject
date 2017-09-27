package com.it.company.admin.news.ctrl;

import com.it.company.admin.news.entity.Sort;
import com.it.company.admin.news.service.INewsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.logging.Handler;

/**
 * <p><p>
 * <describe></describe>
 *
 * @Author Bailey
 * @Email zhuwj@minstone.com.cn
 * @Date 2017/9/27 11:05
 * @Since jdk1.8
 * @Version 1.0.0
 */
@RequestMapping("/news")
@Controller
public class NewsController {

    @Resource
    private INewsService newsService;

    @RequestMapping("/sort/form/1")
    public ModelAndView sortForm() {
        ModelAndView view = new ModelAndView("admin/news/sortForm");
        view.addObject("path", "http://localhost:8080/company");
        return view;
    }

    @PostMapping("/sort/add")
    @ResponseBody
    public Object addSort(Sort sort) {
        boolean success = newsService.insert(sort);
        HashMap<String, Object> map = new HashMap<>();
        map.put("success", success);
        return map;
    }
}
