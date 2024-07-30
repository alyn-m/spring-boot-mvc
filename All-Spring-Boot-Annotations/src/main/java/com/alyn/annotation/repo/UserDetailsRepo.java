package com.alyn.annotation.repo;

import org.springframework.data.repository.CrudRepository;

import com.alyn.annotation.entity.UserDetailsNtt;

public interface UserDetailsRepo extends CrudRepository<UserDetailsNtt, Integer> {
	
	public UserDetailsNtt findByLoginId(String loginId);
	
}
