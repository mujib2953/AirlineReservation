package com.mujib.airline.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	
	@RequestMapping("/showReg")
	public String showRegistartionPage() {
		return "login/registerUser";
	}
	
}
