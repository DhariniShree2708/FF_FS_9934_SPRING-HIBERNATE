package com.hcl.springregistration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.springregistration.model.User;
import com.hcl.springregistration.service.UserService;

@Controller
@RequestMapping("/user")
public class UserControler {
	@Autowired
	UserService userService;

	@RequestMapping(value = "/registration", method = RequestMethod.POST)
	public ModelAndView add(@ModelAttribute User user) {
		if (userService.register(user))
			return new ModelAndView("loginSuccess");
		else
			return new ModelAndView("loginFailed");
	}

	@RequestMapping("/registration")
	public ModelAndView add() {
		return new ModelAndView("registration","user", new User());

	}
}