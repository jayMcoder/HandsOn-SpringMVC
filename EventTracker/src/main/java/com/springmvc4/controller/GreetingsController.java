package com.springmvc4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetingsController {
	
	@RequestMapping(value = "/greeting")
	public String sayGreetings(Model model) {
		model.addAttribute("greeting", "Hello World");
		
		return "hello.jsp";
	}

}
