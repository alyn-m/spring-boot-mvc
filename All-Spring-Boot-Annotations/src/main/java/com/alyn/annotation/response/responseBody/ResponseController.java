package com.alyn.annotation.response.responseBody;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alyn.annotation.entity.UserDetailsNtt;
import com.alyn.annotation.model.UserDetailsModel;
import com.alyn.annotation.service.UserDetailsService;

@RestController
public class ResponseController {
	
	@Autowired
	private UserDetailsService userDetailsService;
	
	@GetMapping("/response-body/{id}")
	@ResponseBody
	public UserDetailsNtt respondToThis(@PathVariable("id") String id) {
		
		return userDetailsService.getUserDetailsLoginId(id);
		
	}
	
}
