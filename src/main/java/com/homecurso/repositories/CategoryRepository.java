package com.homecurso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.homecurso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
