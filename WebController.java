package com.employeeproject;

import org.springframework.web.bind.annotation.RequestMapping;

public class WebController {
	   @RequestMapping(value = "/index")
	   public String index() {
	      return "index";
	   }
	}
