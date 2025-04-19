package com.example.demo.Service.Admin;

public class AuthResponse {
	private String token;
	private String message;
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getMessage() {
		return message;
	}
	public AuthResponse setMessage(String message) {
		this.message = message;
		return null;
	}
	public AuthResponse(String token, String message) {
		this.token = token;
		this.message = message;
	}
	
}
