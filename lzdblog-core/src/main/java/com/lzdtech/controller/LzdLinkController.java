package com.lzdtech.controller;

import com.lzdtech.bean.LzdLink;
import com.lzdtech.service.LzdLinkService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
public class LzdLinkController {

    @Resource
    private LzdLinkService lzdLinkService;

    @RequestMapping(value = "/links")
    public ModelAndView link(@RequestParam(value = "page", defaultValue = "0") Integer page,
                       @RequestParam(value = "size", defaultValue = "5") Integer size){
        Page<LzdLink> date = lzdLinkService.page(page, size);
        // 获取页面date数据
        Pageable pageable = date.getPageable();
        // 向页面传送数据
        ModelAndView modelAndView = new ModelAndView();
        /**
         * setViewName 根据View的名称，和视图解析器，跳转到指定的页面。页面：视图解析器的前缀+view name +视图解析器的后缀名
         * 跳转方式：转发
         */
        modelAndView.setViewName("links");
        /**
         * addObject 向前台传值，key value 形式
         */
        modelAndView.addObject("date", date);
        // 获取分页页码
        modelAndView.addObject("PageNumber", pageable.getPageNumber());
        // 获取分页总数
        modelAndView.addObject("totalPages", date.getTotalPages());

        modelAndView.addObject("localpage", date.getNumber());

        return modelAndView;
    }

}
