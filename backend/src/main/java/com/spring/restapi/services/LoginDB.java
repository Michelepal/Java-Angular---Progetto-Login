package com.spring.restapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.restapi.model.Login;
import com.spring.restapi.repository.LogRepo;
import com.spring.restapi.repository.UserRepository;

@Service
public class LoginDB implements LoginService {

	@Autowired
	private UserRepository repository;
	@Autowired
	private LogRepo log;
	@Override
	
	public boolean login(Login login) {
	
		String username = login.getUsername();
		String password = login.getPassword();
		Login utente = log.findByUser(username);
		
		if (utente != null) {
			if (!utente.getUsername().equals(username) || !utente.getPassword().equals(password)) {
				return false;
			} else if (utente.getPassword().equals(password) && utente.getUsername().equals(username)) {
				return true;
			}
		}
		return false;
	}


}
