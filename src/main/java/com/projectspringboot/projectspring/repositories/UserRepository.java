package com.projectspringboot.projectspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectspringboot.projectspring.entities.User;

com.projectspringboot.projectspring.repositories;

public interface UserRepository extends JpaRepository<User, Long> {
	
	
	
}
