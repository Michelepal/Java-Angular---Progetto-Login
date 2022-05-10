package com.spring.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.restapi.model.Studente;
import com.spring.restapi.security.SecurityConfig;
import com.spring.restapi.services.StudentiDB;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path="/", method= {RequestMethod.GET, RequestMethod.POST})
public class RestApi {

	@Autowired
	private StudentiDB repository;
	private SecurityConfig config;
	
	@GetMapping("/studenti")
	@CrossOrigin(origins = "http://localhost:4200")
	@ResponseBody
	public List<Studente> getAllStudents() {

		return repository.getAllStudents();
	}
	
	@PostMapping("/login/entra")
	@CrossOrigin(origins = "http://localhost:4200")

	public String login(@RequestParam String user, @RequestParam String password) {
				
		return user + " "+ password;
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
