package com.projectspringboot.projectspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectspringboot.projectspring.entities.Category;


// a anotation aqui é opcional, porque está herdando do JpaRepository
public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
