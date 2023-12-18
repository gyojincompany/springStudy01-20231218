package com.jbedu.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@RequestMapping(value = "/qna")
	public String qna() {
		return "board/qna";
	}
	
	@RequestMapping(value = "/question")
	public String question() {
		return "board/question";
	}
	
	@RequestMapping(value = "/answer")
	public String answer() {
		return "board/answer";
	}
	
	@RequestMapping(value = "/visit")
	public String visit() {
		return "visit";
	}

}
