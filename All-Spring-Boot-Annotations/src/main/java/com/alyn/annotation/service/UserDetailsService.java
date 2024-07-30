package com.alyn.annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alyn.annotation.entity.UserDetailsNtt;
import com.alyn.annotation.model.UserDetailsModel;
import com.alyn.annotation.repo.UserDetailsRepo;

@Service
public class UserDetailsService {
	
	@Autowired
	private UserDetailsRepo userDetailsRepo;
	
	public boolean saveUserDetails(UserDetailsModel userDetailsModel){
		
		UserDetailsNtt userDetailsNtt = new UserDetailsNtt();
		userDetailsNtt.setFirstName(userDetailsModel.getFirstName());
		userDetailsNtt.setLastName(userDetailsModel.getLastName());
		userDetailsNtt.setCountry(userDetailsModel.getCountry());
		userDetailsNtt.setEmail(userDetailsModel.getEmail());
		userDetailsNtt.setGender(userDetailsModel.getGender());
		userDetailsNtt.setLoginId(userDetailsModel.getLoginId());
		userDetailsNtt.setPhoneNumber(userDetailsModel.getPhoneNumber());
		
		userDetailsNtt =  userDetailsRepo.save(userDetailsNtt);
		System.out.println("The DB entity is: "+userDetailsNtt.toString());
		
		if(userDetailsNtt.getUserId() <= 0) {
			return false;
		}
		return true;
	}
}