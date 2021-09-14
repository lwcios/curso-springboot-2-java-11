package com.homecurso.resoucers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.homecurso.entities.Category;
import com.homecurso.services.CategoryService;

/*Para especificar que é um controlador usamos a anotção @RestController
 * e o nome do recurso é dado pela anotação RequestMapping com o caminho do recurso ->(value ="/users") */
@RestController
@RequestMapping(value = "/categories")
public class CategoryResoucer {

	@Autowired
	private CategoryService service;

	/* Anotação para indicar que o método responde a uma requisição http */
	@GetMapping
	public ResponseEntity<List<Category>> findAll() {

		List<Category> list = service.findAll();

		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value ="/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id){
		Category user = service.findById(id);
		return ResponseEntity.ok().body(user);
		
	}

}
