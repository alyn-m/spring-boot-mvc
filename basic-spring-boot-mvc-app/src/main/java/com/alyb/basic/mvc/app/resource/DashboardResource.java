package com.alyb.basic.mvc.app.resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardResource {
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
}
