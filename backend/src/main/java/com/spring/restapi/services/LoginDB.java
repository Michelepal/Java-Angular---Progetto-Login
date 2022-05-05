package com.spring.restapi.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.spring.restapi.model.Login;
import com.spring.restapi.repository.LoginRepository;

@Service
public class LoginDB implements LoginService {

	@Autowired
	private LoginRepository repository;
	
	@Autowired
	private JdbcTemplate jdbc;

	public String login(Login utentelogin) {
		System.out.println(utentelogin);
		
		String user = utentelogin.getUser();
		String password = utentelogin.getPassword();
		String ricerca = "SELECT * FROM login WHERE user=" + user;
		Login risultato = (Login) jdbc.queryForMap(ricerca);
		
		if (!risultato.getUser().equals(utentelogin.getUser())) {
			
			return "Utente non trovato";
		} else if (!risultato.getPassword().equals(utentelogin.getPassword())) { 
			return "Password Sbagliata";
		} else
			
		return "Utente Loggato!";
		
		
		
		// TODO Auto-generated method stub
//		Login utente = new Login();
//		utente.setUser(user);
//		utente.setPassword(password);
//		Example<Login> ut = (Example<Login>) utentelogin;
//		Optional<Login> utenterepo = repository.findOne(ut);
//		if (utenterepo.isPresent()) {
//
//			
//			if (utenterepo.equals(utentelogin)) {
//
//				System.out.println("Utente Loggato");
//				return true;
//			} else {
//
//				System.out.println("Password Sbagliata!");
//				return false;
//			}
//
//		} else {
//			System.out.println("Utente inesistente! Vuoi crearne uno?");
//			return false;
//		}
//
	}

}
