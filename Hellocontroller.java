package com.jsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Hellocontroller {
	@RequestMapping("hello")
	public ModelAndView hello() 
	{
		ModelAndView view=new ModelAndView("hellopage");
		view.addObject("hello","fourth mvc application");
		return view;
	}
	@RequestMapping("hello1")
	public ModelAndView hello1() 
	{
	ModelAndView view1=new ModelAndView("secondpage");
	view1.addObject("hello1","second page of application");
	return view1;
	}

}
