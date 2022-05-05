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
	public void login(String user, String password) {
		// TODO Auto-generated method stub
		Login utente = new Login();
		utente.setUser(user);
		utente.setPassword(password);
		Example<Login> ut = (Example<Login>) utente;
		if (repository.exists(ut)) {

			Optional<Login> utenterepo = repository.findOne(ut);
			if (utenterepo.get().getUser() == utente.getUser()
					&& utenterepo.get().getPassword() == utente.getPassword()) {

				System.out.println("Utente Loggato");
			} else {

				System.out.println("Password Sbagliata!");
			}

		} else {
			System.out.println("Utente inesistente! Vuoi crearne uno?");
		}

	}

}
