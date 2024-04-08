package com.app.payloads;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginCredentials {
	
	
	@Email
	@Column(unique = true, nullable = false)
	private String email;

	private String password;

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

	@Override
	public String toString() {
		return "LoginCredentials [email=" + email + ", password=" + password + "]";
	}

	public LoginCredentials(@Email String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public LoginCredentials() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
