package com.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dbHelper.dbService;
import com.model.User;

@Controller
public class SpringController {
	
	
	
	@Autowired
	dbService idbService;
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String user(Map<String, User> model) {
		
		//Map<String, Object> model = new HashMap<String, Object>();
		model.put("myuser", new User());
		//return new ModelAndView("index", model);
		return "index";
	}

	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	public String addStudent(@ModelAttribute("myuser") User user,
			ModelMap model) {
		
		System.out.println("in controller " + user);
		
		idbService.insert(user);
		model.addAttribute("name", user.getUserName());
		model.addAttribute("password", user.getPassWord());

		return "result";
	}
}
