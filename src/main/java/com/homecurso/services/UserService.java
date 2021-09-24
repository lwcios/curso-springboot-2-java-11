package com.homecurso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homecurso.entities.User;
import com.homecurso.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public List<User> findAll() {
		return repository.findAll();
	}

	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);

		return obj.get();

	}

	public User insertUser(User obj) {

		return repository.save(obj);

	}
	
	public void deletUser(Long id) {
		
		repository.deleteById(id);
	}
	
	public User updateUser(Long id, User obj) {
		
		User entity = repository.getOne(id);
		updateData(entity,obj);
		return repository.save(entity);
		
	}

	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getName());
		entity.setPhone(obj.getPhone());
		
		
	}
	
	

}
