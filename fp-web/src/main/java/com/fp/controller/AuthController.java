package com.fp.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fp.model.Credentials;
import com.fp.model.Token;
import com.fp.service.AuthService;

@RestController
@RequestMapping("/token")
public class AuthController {

	@Autowired
	private AuthService authService;
	
	@PostMapping
	public Token login(@RequestBody Credentials credentials) {
		 return authService.login(credentials.getUserName(), credentials.getPassword());
	}
}
