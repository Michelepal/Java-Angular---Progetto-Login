package com.spring.restapi.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.spring.restapi.model.Login;
import com.spring.restapi.repository.LoginRepository;

@Service
public class LoginDB implements LoginService {

	@Autowired
	private LoginRepository repository;

	@Override
	public void login(Login utentelogin) {
		System.out.println(utentelogin);
		// TODO Auto-generated method stub
//		Login utente = new Login();
//		utente.setUser(user);
//		utente.setPassword(password);
		Example<Login> ut = (Example<Login>) utentelogin;
		Optional<Login> utenterepo = repository.findOne(ut);
		if (utenterepo.isPresent()) {

			
			if (utenterepo.equals(utentelogin)) {

				System.out.println("Utente Loggato");
			} else {

				System.out.println("Password Sbagliata!");
			}

		} else {
			System.out.println("Utente inesistente! Vuoi crearne uno?");
		}

	}

}
