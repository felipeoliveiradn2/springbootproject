package com.projectspringboot.projectspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectspringboot.projectspring.entities.Order;

// a anotation aqui é opcional, porque está herdando do JpaRepository
public interface OrderRepository extends JpaRepository <Order, Long> {
	
}
