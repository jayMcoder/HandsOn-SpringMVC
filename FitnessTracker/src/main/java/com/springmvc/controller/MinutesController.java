package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.model.Exercise;

@Controller
public class MinutesController {

	@RequestMapping(value = "/addminutes")
	public String addMinutes(@ModelAttribute ("exercise") Exercise exercise) {
		
		System.out.println("minutes " + exercise.getMinutes());
		
		return "redirect:addmoreminutes.html";
	}
	
	@RequestMapping(value = "/addmoreminutes")
	public String addMoreMinutes(@ModelAttribute ("exercise") Exercise exercise) {
		
		System.out.println("more minutes " + exercise.getMinutes());
		
		return "addMinutes";
	}
}
