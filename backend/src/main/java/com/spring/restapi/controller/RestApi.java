package com.spring.restapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.restapi.model.Studente;
import com.spring.restapi.repository.UserRepository;


@Controller

public class RestApi {
	
	@Autowired
	private UserRepository repostudenti;
	
	@GetMapping("/")
	public @ResponseBody Iterable<Studente> getAllStudents() {
		return repostudenti.findAll();
	}
	

}
