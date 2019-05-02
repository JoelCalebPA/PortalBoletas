package com.domain.portal.service;

import java.util.List;

import com.domain.portal.entity.User;

public interface UserService {
	
	void save(User user);

	User find(String email);
	
	List<User> list();
	
}
