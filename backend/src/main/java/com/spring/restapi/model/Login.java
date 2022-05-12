package com.spring.restapi.model;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

public class Login {
	private String username;
	private String password;
	private boolean authenticated;
	
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
	public boolean isAuthenticated() {
		return authenticated;
	}
	
	public void setAuthenticated(InMemoryUserDetailsManager user) {
		
		UserDetails utente = user.loadUserByUsername(getUsername());
		if (utente != null) { 
			this.authenticated = true;
		} else {
			this.authenticated = false;
		}
		
		
	}

}
 