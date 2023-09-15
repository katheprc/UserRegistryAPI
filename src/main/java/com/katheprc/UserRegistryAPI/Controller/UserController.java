package com.katheprc.UserRegistryAPI.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.katheprc.UserRegistryAPI.Model.User;
import com.katheprc.UserRegistryAPI.Repository.UserRepository;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private UserRepository repository;
	
	
	@GetMapping("/Users")
	public List<User> allUsers(){
		return repository.findAll();
	}
	
	@GetMapping("/User/{name}")
	public List<User> findByName(@PathVariable("name") String name) {
		return repository.findByName(name);
	}
	
	@PostMapping("/User")
	public User createUser(@RequestBody User user) {
		return repository.save(user);
	}
	
	@PutMapping("/User/{id}")
	public User updateUser(@PathVariable int id ,@RequestBody User user) {
		return repository.save(user);
	}
	
	@DeleteMapping("/User/{id}")
	public void deleteUser(@PathVariable("id") Long id) {
		repository.deleteById(id);
	}
}

