package com.spring.restapi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.restapi.model.Studente;
import com.spring.restapi.repository.UserRepository;

@Service
public class StudentiDB implements StudentiService {
	
	@Autowired
	private UserRepository repository;
	
	@Override
	public List<Studente> getAllStudents() {
		
		return (List<Studente>) repository.findAll();
		
	}
}
