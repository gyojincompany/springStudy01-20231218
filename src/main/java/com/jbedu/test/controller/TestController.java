package com.jbedu.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	@RequestMapping(value = "/BlogHome.Naver")
	public String blogHome() {
		return "blogHome";
	}
	
	
	
	
}
