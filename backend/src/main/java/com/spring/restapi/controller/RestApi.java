package com.spring.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.restapi.model.Login;
import com.spring.restapi.model.Studente;
import com.spring.restapi.services.LoginDB;
import com.spring.restapi.services.StudentiDB;

@CrossOrigin(origins="*")
@RestController
@RequestMapping(path="/", method= {RequestMethod.GET, RequestMethod.POST})
public class RestApi {

	@Autowired
	private StudentiDB repository;
	@Autowired
	private LoginDB login;

	
	@GetMapping("/studenti") 
	@ResponseBody
	public List<Studente> getAllStudents() {

		return repository.getAllStudents();
	}
	
	@PostMapping("/login/entra")
	public boolean login(@RequestBody Login utente) {
		return login.login(utente);
	}
}
	


