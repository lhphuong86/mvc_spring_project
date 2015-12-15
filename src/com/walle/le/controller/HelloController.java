package com.walle.le.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



/**
 * 
 * @author walle86
 *
 */
@Controller
public class HelloController {


	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(ModelMap model){
		  //model.addAttribute("message", "Hello Spring MVC Framework!");
	      return "index";
	}
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String printTest(ModelMap model){
		  model.addAttribute("message", "Hello Spring MVC Framework!");
	      return "hello";
	}
}
