package com.myclass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/role")
public class RoleController {
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String index() {
		return "role/index";
	}
	
	@RequestMapping(value = "/add",method = RequestMethod.GET)
	public String add() {		
		return "role/add";
	}
	
	@RequestMapping(value = "edit", method = RequestMethod.GET)
	public String edit() {
		return "role/edit";
	}
}
