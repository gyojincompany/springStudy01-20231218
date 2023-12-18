package com.jbedu.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ModelController {
	
	@RequestMapping(value = "/memberinfo")
	public String memberinfo(Model model) {
		String id = "black";
		
		model.addAttribute("memberID", id);
		model.addAttribute("memberName", "김유신");
		model.addAttribute("memberAge", 31);
		
		return "memberInfo";
	}
	
	@RequestMapping(value = "/memberinfo2")
	public ModelAndView memberinfo2() {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("memberID", "white");
		mv.addObject("memberName", "이순신");
		mv.addObject("memberAge", 41);
		mv.setViewName("memberInfo");		
		return mv;
	}
	
}
