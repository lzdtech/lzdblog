package com.lzdtech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminIndexController {

	@RequestMapping(value = { "/admin/index", "/admin" })
	public String AdminIndex() {
		return "admin/index";
	}
}
