package com.mujib.airline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mujib.airline.entities.User;
import com.mujib.airline.repos.UserRepository;

@Controller
public class UserController {

	@Autowired
	private UserRepository userRepos;

	@RequestMapping("/showReg")
	public String showRegistartionPage() {
		return "login/registerUser";
	}

	@RequestMapping(value = "registerUser", method = RequestMethod.POST)
	public String doRegistration(@ModelAttribute("user") User user) {

		userRepos.save(user);

		return "login/login";
	}
}
