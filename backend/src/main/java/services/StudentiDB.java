package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Studente;
import repository.Repo;

@Service
public class StudentiDB implements StudentiService {
	
	@Autowired
	private Repo repository;
	
	public List<Studente> getAllStudents() {
		return repository.findAll();
		
	}
}
