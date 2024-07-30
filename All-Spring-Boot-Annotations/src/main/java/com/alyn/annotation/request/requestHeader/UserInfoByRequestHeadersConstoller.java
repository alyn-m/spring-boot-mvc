package com.alyn.annotation.request.requestHeader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.alyn.annotation.entity.UserDetailsNtt;
import com.alyn.annotation.repo.UserDetailsRepo;

@RestController
public class UserInfoByRequestHeadersConstoller {
	
	@Autowired
	UserDetailsRepo userDetailsRepo;
	
	@GetMapping("/user")
	public ResponseEntity<UserDetailsNtt> getUserLoginId(@RequestHeader("login-id") String loginId) {
		
		UserDetailsNtt userDetailsNtt = userDetailsRepo.findByLoginId(loginId);
		if(userDetailsNtt == null) return new ResponseEntity<UserDetailsNtt>(HttpStatusCode.valueOf(400));
		return ResponseEntity.ok(userDetailsNtt);
	}
	
}
