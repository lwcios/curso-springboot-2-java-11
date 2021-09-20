package com.homecurso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.homecurso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>  {

	
	
	
}
