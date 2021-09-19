package com.homecurso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.homecurso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
