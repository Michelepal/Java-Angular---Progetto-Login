package com.spring.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configurers.provisioning.InMemoryUserDetailsManagerConfigurer;
import org.springframework.security.config.authentication.AuthenticationProviderBeanDefinitionParser;
import org.springframework.security.core.userdetails.AuthenticationUserDetailsService;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.restapi.model.Studente;
import com.spring.restapi.services.StudentiDB;

@CrossOrigin(origins="*")
@RestController
@RequestMapping(path="/", method= {RequestMethod.GET, RequestMethod.POST})
public class RestApi {

	@Autowired
	private StudentiDB repository;

	
	@GetMapping("/studenti")
	@ResponseBody
	public List<Studente> getAllStudents() {

		return repository.getAllStudents();
	}
	
	@PostMapping("/login/entra")

	public String login(@RequestParam String username, @RequestParam String password) {
		
		
		
		return username + " "+ password;
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
