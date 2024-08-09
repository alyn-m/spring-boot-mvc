package com.alyn.annotation.request.pathVariable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.alyn.annotation.entity.UserDetailsNtt;
import com.alyn.annotation.repo.UserDetailsRepo;

@RestController
public class GetUserDetailsByPathVariable {
	
	@Autowired
	private UserDetailsRepo userDetailsRepo;
	
	@GetMapping("/user/{id}")
	public UserDetailsNtt getUserDetails(@PathVariable("id") String loginId) {
		UserDetailsNtt userDetailsNtt = userDetailsRepo.findByLoginId(loginId);
		System.out.println("Path Variable:"+loginId);
		return userDetailsNtt;
	}
	
}
