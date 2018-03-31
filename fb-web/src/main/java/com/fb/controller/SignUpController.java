package com.fb.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.fb.model.SignupRequest;
import com.fb.model.User;
import com.fb.service.SignUpService;

@RestController
@RequestMapping("/signup")
public class SignUpController {

	@Autowired
	private SignUpService signUpService;
	
	//Creates a new article
	@PostMapping("/")
	public ResponseEntity<Void> addArticle(@RequestBody SignupRequest req, UriComponentsBuilder builder) {

		User user = new User();
		BeanUtils.copyProperties(req, user);
		signUpService.signUp(user);
        HttpHeaders headers = new HttpHeaders();
        //headers.setLocation(builder.path("/user/{id}").buildAndExpand(user.getId().toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}
	
}
