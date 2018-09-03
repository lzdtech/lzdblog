package com.lzdtech.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;

import com.lzdtech.bean.AdminUser;
import com.lzdtech.service.AdminUserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


/**
 * 管理员用户Controller方法
 * 
 * @author lzdtech
 */

@Controller
public class AdminUserController {

	@Resource
	private AdminUserService adminUserService;

	/**
	 * 查询用户数据
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("/admin/adminlist")
	public String adminlist(Model model) {
		List<AdminUser> adminUsers = adminUserService.getAdminUserList();
		model.addAttribute("adminUsers", adminUsers);
		return "admin/adminlist";
	}

	/**
	 * 分页查询
	 * 
	 * @param page
	 * @param size
	 * @return
	 */
	@RequestMapping("/admin/adminpagelist")
	public ModelAndView adminpagelist(@RequestParam(value = "page", defaultValue = "0") Integer page,
			@RequestParam(value = "size", defaultValue = "5") Integer size) {
		Page<AdminUser> date = adminUserService.page(page, size);
		// 获取页面date数据
		Pageable pageable = date.getPageable();
		// 向页面传送数据
		ModelAndView modelAndView = new ModelAndView();
		/**
		 * setViewName 根据View的名称，和视图解析器，跳转到指定的页面。页面：视图解析器的前缀+view name +视图解析器的后缀名
		 * 跳转方式：转发
		 */
		modelAndView.setViewName("admin/adminpagelist");
		/**
		 * addObject 向前台传值，key value 形式
		 */
		modelAndView.addObject("date", date);
		// 获取分页页码
		modelAndView.addObject("PageNumber", pageable.getPageNumber());
		// 获取分页总数
		modelAndView.addObject("TotalPages", date.getTotalPages());

		modelAndView.addObject("localpage", date.getNumber());

		return modelAndView;
	}

	/**
	 * 添加用户页面
	 * 
	 * @return
	 */
	@GetMapping("/admin/admintoadd")
	public String admintoadd() {
		return "admin/admintoadd";
	}

	/**
	 * 添加用户数据功能
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/admin/adminadd", method = RequestMethod.POST)
	public String adminadd(HttpServletRequest request) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		AdminUser adminUser = new AdminUser();
		adminUser.setName(username);
		adminUser.setPwd(password);
		adminUserService.save(adminUser);
		return "redirect:/admin/adminpagelist";
	}

	/**
	 * 更新用户数据页面
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("/admin/adminedit")
	public String adminedit(Model model, long id) {
		AdminUser byId = adminUserService.findById(id);
		model.addAttribute("byId", byId);
		return "admin/adminedit";
	}

	/**
	 * 更新用户数据功能
	 * 
	 * @return
	 */
	@RequestMapping(value = "/admin/adminupdate")
	public String adminedit(AdminUser adminUser) {
		adminUserService.update(adminUser);
		return "redirect:/admin/adminpagelist";
	}

	/**
	 * 通过ID删除管理员
	 * 
	 * @param id
	 * @return
	 */
	@Transactional
	@RequestMapping(value = "/admin/admindelete")
	public String admindelete(@RequestParam long id) {
		adminUserService.delete(id);
		return "redirect:/admin/adminpagelist";
	}
}
