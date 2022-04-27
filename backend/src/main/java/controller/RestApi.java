package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import model.Studente;
import repository.Repo;


@RestController

public class RestApi {
	
	@Autowired
	private Repo repostudenti;
	
	@GetMapping("/studenti")
	public @ResponseBody Iterable<Studente> getAllStudents() {
		return repostudenti.findAll();
	}
	

}
