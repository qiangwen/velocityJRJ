package com.jrj.action;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/vm")
public class VmJRJ {

	@RequestMapping("/msgList")
	public ModelAndView messageList(){
		
		List<String> msg = new ArrayList<String>();
		msg.add("one");
		msg.add("two");
		msg.add("three");
		msg.add("four");
		msg.add("five");
		return new ModelAndView("msgList").addObject("msglist",msg);
		
	}
	
	@RequestMapping("/ifelse")
	public ModelAndView ifelse(){
		boolean condition = false;
		String name1 = "zhangsan";
		String name2 = "lisi";
		return new ModelAndView("ifelse").addObject("condition",condition).
				addObject("name1", name1).
				addObject("name2", name2);
		
	}
}
