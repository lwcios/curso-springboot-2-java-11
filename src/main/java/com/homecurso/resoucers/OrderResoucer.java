package com.homecurso.resoucers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.homecurso.entities.Order;
import com.homecurso.services.OrderService;

/*Para especificar que é um controlador usamos a anotção @RestController
 * e o nome do recurso é dado pela anotação RequestMapping com o caminho do recurso ->(value ="/users") */
@RestController
@RequestMapping(value = "/orders")
public class OrderResoucer {

	@Autowired
	private OrderService service;

	/* Anotação para indicar que o método responde a uma requisição http */
	@GetMapping
	public ResponseEntity<List<Order>> findAll() {

		List<Order> list = service.findAll();

		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value ="/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id){
		Order user = service.findById(id);
		return ResponseEntity.ok().body(user);
		
	}

}
