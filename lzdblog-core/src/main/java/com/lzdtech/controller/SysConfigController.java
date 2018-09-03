package com.lzdtech.controller;

import com.lzdtech.bean.SysConfig;
import com.lzdtech.service.impl.SysConfigService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;


@Controller
public class SysConfigController {

	@Resource
	private SysConfigService sysConfigService;

	/**
	 * 查询系统配置数据页面
	 * 
	 * @param model
	 * @return
	 */
//	@RequestMapping("/admin/config")
//	public String sysConfig(Model model) {
//		List<SysConfig> sysConfig = sysConfigService.getSysConfigList();
//		model.addAttribute("sysConfig", sysConfig);
//		return "admin/config";
//	}

	/**
	 * 更新用户数据页面
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("/admin/config")
	public String sysConfig(Model model) {
		long id = 1;
		SysConfig byId = sysConfigService.findById(id);
		model.addAttribute("byId", byId);
		return "admin/config";
	}

	/**
	 * 更新系统配置数据功能
	 * 
	 * @return
	 */
	@RequestMapping("/admin/configupdate")
	public String systemConfig(SysConfig sysConfig) {
		sysConfigService.save(sysConfig);
		return "redirect:/admin/config";
	}
}
