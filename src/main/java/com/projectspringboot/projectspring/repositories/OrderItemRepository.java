package com.projectspringboot.projectspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectspringboot.projectspring.entities.OrderItem;
import com.projectspringboot.projectspring.entities.pk.OrderItemPK;

// a anotation aqui é opcional, porque está herdando do JpaRepository
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> { 
	
}
