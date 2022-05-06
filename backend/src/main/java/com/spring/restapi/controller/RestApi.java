package com.spring.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.restapi.model.Studente;
import com.spring.restapi.services.StudentiDB;

@RestController

public class RestApi {

	@Autowired
	private StudentiDB repository;
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
//	@CrossOrigin(origins = "http://localhost:4200")
//	@RequestMapping(path = "/login", method = RequestMethod.POST)
//	public void login(@RequestBody HttpEntity<String> httpEntity) throws JsonMappingException, JsonProcessingException {
//	
//	}
}
