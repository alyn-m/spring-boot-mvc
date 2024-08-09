package com.alyn.annotation.request.requestBody;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.alyn.annotation.constants.UrlConstants;
import com.alyn.annotation.entity.UserDetailsNtt;
import com.alyn.annotation.model.UserDetailsModel;
import com.alyn.annotation.service.UserDetailsService;

@RestController
public class RequestBodyUseCase {
	
	@Autowired
	private UserDetailsService userDetailsService;
	
	@PostMapping(UrlConstants.requestBody)
	public UserDetailsNtt storeUserDetails(@RequestBody UserDetailsModel userDtlMdl){
		System.out.println("We are in RequestBodyUseCase Resource:"+userDtlMdl.toString());
		return userDetailsService.saveUser(userDtlMdl);
	}
	
}
