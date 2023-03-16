package org.SRK.controller;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public ModelAndView home() {
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("Home.jsp");
		modelAndView.addObject("user", new ArrayList<>(Arrays.asList("Naruto","Luffy",1,2.0,"Zoro")));
		return modelAndView;
	}
}
