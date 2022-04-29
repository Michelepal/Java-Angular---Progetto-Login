package com.spring.restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.restapi.model.Studente;
import com.spring.restapi.repository.UserRepository;


@RestController

public class RestApi {
	
	@Autowired
	private UserRepository repostudenti;
	
	@GetMapping("/")
	@ResponseBody 
	public Iterable<Studente> getAllStudents() {
		return repostudenti.findAll();
	}
	

}
