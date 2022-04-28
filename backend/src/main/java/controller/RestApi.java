package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import model.Studente;
import repository.Repo;
import services.StudentiDB;


@RestController

public class RestApi {
	
	@Autowired
	private StudentiDB studenti;
	
	@GetMapping("/studenti")
	public @ResponseBody List<Studente> getAllStudents() {
		return studenti.getAllStudents();
	}
	

}
