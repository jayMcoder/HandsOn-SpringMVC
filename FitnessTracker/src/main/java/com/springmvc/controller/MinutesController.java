package com.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springmvc.model.Activity;
import com.springmvc.model.Exercise;
import com.springmvc.service.ExerciseService;

@Controller
public class MinutesController {
	
	@Autowired
	private ExerciseService exerciseService;

	@RequestMapping(value = "/addminutes")
	public String addMinutes(@ModelAttribute ("exercise") Exercise exercise) {
		
		System.out.println("minutes " + exercise.getMinutes());
		System.out.println("activity " + exercise.getActivity());
		
		// return "redirect:addmoreminutes.html";
		return "addMinutes";
	}
	
//	@RequestMapping(value = "/addmoreminutes")
//	public String addMoreMinutes(@ModelAttribute ("exercise") Exercise exercise) {
//		
//		System.out.println("more minutes " + exercise.getMinutes());
//		
//		return "addMinutes";
//	}
	
	
	@RequestMapping(value = "/activities", method = RequestMethod.GET)
	public @ResponseBody List<Activity> findAllActivities() {
		
		return exerciseService.findAllActivities();
		
	}
	
}
