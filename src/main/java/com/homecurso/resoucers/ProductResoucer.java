package com.homecurso.resoucers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.homecurso.entities.Product;
import com.homecurso.services.ProductService;

/*Para especificar que é um controlador usamos a anotção @RestController
 * e o nome do recurso é dado pela anotação RequestMapping com o caminho do recurso ->(value ="/users") */
@RestController
@RequestMapping(value = "/products")
public class ProductResoucer {

	@Autowired
	private ProductService service;

	/* Anotação para indicar que o método responde a uma requisição http */
	@GetMapping
	public ResponseEntity<List<Product>> findAll() {

		List<Product> list = service.findAll();

		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value ="/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id){
		Product user = service.findById(id);
		return ResponseEntity.ok().body(user);
		
	}

}
