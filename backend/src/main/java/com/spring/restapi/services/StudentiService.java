package com.spring.restapi.services;


import org.springframework.stereotype.Service;

import com.spring.restapi.model.Studente;

@Service

public interface StudentiService {
	
	public Iterable<Studente> getAllStudents();
}
