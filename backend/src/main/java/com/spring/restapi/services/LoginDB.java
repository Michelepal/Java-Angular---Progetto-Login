package com.spring.restapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;

import com.spring.restapi.model.Login;
import com.spring.restapi.repository.LogRepo;
import com.spring.restapi.repository.UserRepository;

public class LoginDB implements LoginService {

	@Autowired
	private UserRepository repository;
	@Autowired
	private LogRepo log;
	@Override
	
	public boolean login(Login login) {
		Example<Login> utente = (Example<Login>) login;
		
		boolean utentesiste = log.exists(utente);
		return utentesiste;
	}


}
