package com.app.payloads;

import lombok.Data;

@Data
public class JWTAuthResponse {
	private String token;
	
	private UserDTO user;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public UserDTO getUser() {
		return user;
	}

	public void setUser(UserDTO user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "JWTAuthResponse [token=" + token + ", user=" + user + "]";
	}

	public JWTAuthResponse(String token, UserDTO user) {
		super();
		this.token = token;
		this.user = user;
	}

	public JWTAuthResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}