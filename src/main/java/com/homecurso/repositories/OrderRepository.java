package com.homecurso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.homecurso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
