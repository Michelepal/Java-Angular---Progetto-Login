package com.spring.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.restapi.model.Login;

public interface LoginRepository extends JpaRepository<Login, Integer>{

}
