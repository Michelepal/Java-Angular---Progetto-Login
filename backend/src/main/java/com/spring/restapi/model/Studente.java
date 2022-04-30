package com.spring.restapi.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="studenti2")
//@NamedQueries ({@NamedQuery (name
//= "studenti.findAll()", query = "SELECT * FROM studenti2")})
public class Studente {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable=false)

	private int id;
	@Column(name="user", nullable=false)
	private String user;
	@Column(name="password", nullable=false)
	private String password;
	@Column(name="matricola", nullable=false)
	private int matricola;
	@Column(name="nome", nullable=false)
	private String nome;
	@Column(name="anno", nullable=false)
	private int anno;
	
	public Studente() {}
	public Studente(int id, String user, String password, int matricola, String nome, int anno) {
		super();
		this.id = id;
		this.user = user;
		this.password = password;
		this.matricola = matricola;
		this.nome = nome;
		this.anno = anno;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getMatricola() {
		return matricola;
	}

	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}
}
