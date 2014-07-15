package com.jrj.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello")
public class HelloAction {

	@RequestMapping("/abc")
	public ModelAndView sayHello(){
		
		return new ModelAndView("hello").addObject("wen", "qiang");
	}
}
