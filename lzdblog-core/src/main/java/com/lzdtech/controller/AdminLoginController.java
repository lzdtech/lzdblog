package com.lzdtech.controller;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminLoginController {

	@RequestMapping(value = "/admin/login")
	public String login() {
		// 已登录用户再次访问登录界面时，跳转到index
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth instanceof AnonymousAuthenticationToken) {
			return "admin/login";
		} else {
			return "admin/index";
		}
	}
}
