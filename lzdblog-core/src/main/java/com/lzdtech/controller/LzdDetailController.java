package com.lzdtech.controller;

import javax.annotation.Resource;

import com.lzdtech.bean.LzdArticle;
import com.lzdtech.service.LzdArticleService;
import com.lzdtech.service.SystemConfigService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class LzdDetailController {

	@Resource
	private LzdArticleService lzdArticleService;

	@Resource
	private SystemConfigService systemConfigService;

	/**
	 * 更新用户数据页面
	 * 
	 * @param model
	 * @return
	 */
//	@RequestMapping(value = "/detail")
//	public ModelAndView detail(Model model, @RequestParam(value = "page", defaultValue = "0") Integer page,
//			@RequestParam(value = "size", defaultValue = "9") Integer size) {
//		long id = 1;
//		SysConfig byId = systemConfigService.findById(id);
//		model.addAttribute("byId", byId);
//		Page<LzdArticle> date = lzdArticleService.page(page, size);
//		// 获取页面date数据
//		Pageable pageable = date.getPageable();
//		// 向页面传送数据
//		ModelAndView modelAndView = new ModelAndView();
//		/**
//		 * setViewName 根据View的名称，和视图解析器，跳转到指定的页面。页面：视图解析器的前缀+view name +视图解析器的后缀名
//		 * 跳转方式：转发
//		 */
//		modelAndView.setViewName("detail");
//		/**
//		 * addObject 向前台传值，key value 形式
//		 */
//		modelAndView.addObject("date", date);
//		// 获取分页页码
//		modelAndView.addObject("PageNumber", pageable.getPageNumber());
//		// 获取分页总数
//		modelAndView.addObject("totalPages", date.getTotalPages());
//
//		modelAndView.addObject("localpage", date.getNumber());
//		return modelAndView;
//
//	}

	@RequestMapping(value = "/detail")
	public String detail(Model model, long id) {
		LzdArticle byId = lzdArticleService.findById(id);
		model.addAttribute("byId", byId);
		return "detail";

	}

}
