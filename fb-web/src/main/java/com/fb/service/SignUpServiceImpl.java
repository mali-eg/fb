package com.fb.service;

import org.springframework.stereotype.Service;

import com.fb.model.User;

@Service
public class SignUpServiceImpl implements SignUpService{

	public User signUp(User user) {
		return user;
	}

}
