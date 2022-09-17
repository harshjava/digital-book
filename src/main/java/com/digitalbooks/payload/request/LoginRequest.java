package com.digitalbooks.payload.request;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Table(name = "loginRequest")
public class LoginRequest {

	@NotBlank
	@Column(name = "username")
	private String username;

	@NotBlank
	@Column(name = "password")
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
