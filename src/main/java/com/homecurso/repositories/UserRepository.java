package com.homecurso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.homecurso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>  {

	
	
	
}
