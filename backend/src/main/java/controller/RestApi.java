package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import model.Studente;
import repository.Repo;
import services.StudentiDB;


@Controller

public class RestApi {
	
	@Autowired
	private StudentiDB studenti;
	
	@GetMapping("/")
	@ResponseBody 
	public List<Studente> getAllStudents() {
		return studenti.getAllStudents();
	}
	

}
