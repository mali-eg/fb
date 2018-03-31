package com.fb.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize 
public class SignupRequest {

	private String userName;
	private String email;
	private String password;
	
	public SignupRequest() {}
	
	public SignupRequest(String userName, String password, String email) {
		this.userName = userName;
		this.password = password;
		this.email = email;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


	
	
}
