package com.alyn.annotation.request.modelAttribute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alyn.annotation.model.UserDetailsModel;
import com.alyn.annotation.service.UserDetailsService;

import jakarta.servlet.http.HttpServletResponse;

@org.springframework.stereotype.Controller
public class Controller {
	
	@Autowired
	private UserDetailsService userDetailsService; 
	
	@GetMapping("/registration")
	public String getRegistrationForm() {
		
		return "model-attribute";
	}
	
	@RequestMapping(value="/submit_registration",
			method = {RequestMethod.GET, RequestMethod.PUT})
	public String submitRegistrationForm(@ModelAttribute UserDetailsModel userInfoModel
			, HttpServletResponse response) {
		
		//response.setStatus(200);
		
		boolean result = userDetailsService.saveUserDetails(userInfoModel);
		//if(!result) return "failure";
		
		
		
		return getSuccessPage();
	}
	@GetMapping("success")
	public String getSuccessPage() {
		return "success";
	}
		
}
