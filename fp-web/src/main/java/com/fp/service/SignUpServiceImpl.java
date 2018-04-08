package com.fp.service;

import org.springframework.stereotype.Service;

import com.fp.model.User;

@Service
public class SignUpServiceImpl implements SignUpService{

	public User signUp(User user) {
		return user;
	}

}
