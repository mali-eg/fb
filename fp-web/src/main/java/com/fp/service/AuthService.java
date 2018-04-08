package com.fp.service;

import org.springframework.stereotype.Service;

import com.fp.model.Token;

@Service
public interface AuthService {

	Token login(String userName, String password);
}
