package com.homecurso.resoucers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.homecurso.entities.User;
/*Para especificar que é um controlador usamos a anotção @RestController
 * e o nome do recurso é dado pela anotação RequestMapping com o caminho do recurso ->(value ="/users") */
@RestController
@RequestMapping(value ="/users")
public class UserResoucer {

	
	/*Anotação para indicar que o método responde a uma requisição http*/
	@GetMapping
	public ResponseEntity<User> findAll(){
		
		User u = new User(1L,"Maria", "maria@gmail.com","999999", "1234");
		return ResponseEntity.ok().body(u);
	}
	
}
