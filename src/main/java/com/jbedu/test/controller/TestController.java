package com.jbedu.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	@RequestMapping(value = "/BlogHome.Naver")
	public String blogHome() {
		return "blogHome";
	}
	
	@RequestMapping(value = "/board/qna")
	public String qna() {
		return "board/qna";
	}
	
	@RequestMapping(value = "/board/question")
	public String question() {
		return "board/question";
	}
	
	@RequestMapping(value = "/board/answer")
	public String answer() {
		return "board/answer";
	}
	
	
}
