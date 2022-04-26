package repository;

import org.springframework.data.repository.CrudRepository;

import model.Studente;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface Repo extends CrudRepository<Studente, Integer> {

}