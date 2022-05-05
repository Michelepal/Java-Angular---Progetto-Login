package com.spring.restapi.controller;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.restapi.model.Studente;
import com.spring.restapi.repository.UserRepository;
import com.spring.restapi.services.LoginDB;
import com.spring.restapi.services.StudentiDB;


@RestController

public class RestApi {
	
	@Autowired
	private StudentiDB repository;
	@Autowired
	private LoginDB loginDB;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/studenti")
	@ResponseBody 
	public List<Studente> getAllStudents() {
		
		return repository.getAllStudents();
	}
	
//	@GetMapping({"/studenti", "/"})
//	public ModelAndView getAllStudents() {
//		
//		ModelAndView studenti = new ModelAndView("index.html");
//		studenti.addObject("studenti", repository.getAllStudents());
//		return studenti;
//		
//	}
//	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(path="/login", method=RequestMethod.POST)
	@ResponseBody
	public void login(String user, String password) {
		loginDB.login(user, password);
	}

}
