package com.lzdtech.controller;

import com.lzdtech.bean.LzdArticle;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;


@Controller
public class LzdArticleContent {

	@Resource
	private com.lzdtech.service.LzdArticleService LzdArticleService;

	@RequestMapping("/admin/article")
	public ModelAndView adminpagelist(@RequestParam(value = "page", defaultValue = "0") Integer page,
			@RequestParam(value = "size", defaultValue = "5") Integer size) {
		Page<LzdArticle> date = LzdArticleService.page(page, size);
		// 获取页面date数据
		Pageable pageable = date.getPageable();
		// 向页面传送数据
		ModelAndView modelAndView = new ModelAndView();
		/**
		 * setViewName 根据View的名称，和视图解析器，跳转到指定的页面。页面：视图解析器的前缀+view name +视图解析器的后缀名
		 * 跳转方式：转发
		 */
		modelAndView.setViewName("admin/article");
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

	/**
	 * 添加文章页面
	 * 
	 * @return
	 */
	@RequestMapping("/admin/add")
	public String articleadd() {
		return "admin/add";
	}

	@PostMapping("/admin/articlesubmit")
	public String ArticleSubmit(HttpServletRequest request) throws ParseException {
		String articlebg = request.getParameter("articlebg");
		String articlebrief = request.getParameter("articlebrief");
		String articlecontent = request.getParameter("articlecontent");
		String articletitile = request.getParameter("articletitile");
		String author = request.getParameter("author");
		String cover = request.getParameter("cover");
		// 获取到日期String类型
		String datetime = request.getParameter("datetime");
		// 进行String类型转换Date日期类型

		// Date dt = new SimpleDateFormat("yyyy-MM-dd").parse(datetime);

		LzdArticle lArticle = new LzdArticle();
		lArticle.setArticlebg(articlebg);
		lArticle.setArticlebrief(articlebrief);
		lArticle.setArticlecontent(articlecontent);
		lArticle.setArticletitile(articletitile);
		lArticle.setAuthor(author);
		lArticle.setCover(cover);
		lArticle.setDatetime(datetime);
		LzdArticleService.save(lArticle);
		return "redirect:/admin/article";
	}

	/**
	 * 更新用户数据页面
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("/admin/articleedit")
	public String articleedit(Model model, long id) {
		LzdArticle byId = LzdArticleService.findById(id);
		model.addAttribute("byId", byId);
		return "admin/edit";
	}

	/**
	 * 更新用户数据功能
	 * 
	 * @return
	 */
	@RequestMapping(value = "/admin/update")
	public String articleedit(LzdArticle lArticle) {
		LzdArticleService.update(lArticle);
		return "redirect:/admin/article";
	}

	@RequestMapping("/admin/articledelete")
	public String articledelete(long id) {
		LzdArticleService.delete(id);
		return "redirect:/admin/article";
	}

}
