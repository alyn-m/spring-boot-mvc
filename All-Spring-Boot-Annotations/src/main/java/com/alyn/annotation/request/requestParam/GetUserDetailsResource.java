package com.alyn.annotation.request.requestParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alyn.annotation.entity.UserDetailsNtt;
import com.alyn.annotation.repo.UserDetailsRepo;

@RestController
public class GetUserDetailsResource {
	
	@Autowired
	private UserDetailsRepo userDetailsRepo;
	
	@GetMapping("/user/details")
	public UserDetailsNtt getUserDetailsUsingReqParam(@RequestParam("loginid") String loginid) {
		UserDetailsNtt userDetailsNtt = userDetailsRepo.findByLoginId(loginid);
		
		return userDetailsNtt;
	}
	
}
