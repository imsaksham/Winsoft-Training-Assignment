package com.winsoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String index() {
		
		System.out.println("Welcome to my page.");
		return "index";
	}
}
