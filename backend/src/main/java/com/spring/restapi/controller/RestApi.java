package com.spring.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.restapi.model.Studente;
import com.spring.restapi.repository.UserRepository;
import com.spring.restapi.services.StudentiDB;


@RestController

public class RestApi {
	
	@Autowired
	private StudentiDB repository;
	
	@GetMapping("/")
	@ResponseBody 
	public List<Studente> getAllStudents() {
		List<Studente> studenti = repository.getAllStudents();
		return studenti;
	}
	

}
