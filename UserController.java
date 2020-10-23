/**
 * 
 */
package com.hcl.SpringRegistration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.SpringRegistration.model.User;
import com.hcl.SpringRegistration.service.UserService;

/**
 * @author dharinishree.k
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {
@Autowired
UserService userservice;
@RequestMapping("/registration",method=POST)
public ModelAndView add(@ModelAttribute User user) {
	if(userservice.register(user))
		new ModelAndView("Login Success!");
	else 
		new ModelAndView("Login Failed!");
}
@RequestMapping("/registration",method=GET)
public ModelAndView add1(@ModelAttribute User user) {
	return new ModelAndView("registration");
}
}
