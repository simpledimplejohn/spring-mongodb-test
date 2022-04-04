package com.revature.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.User;
import com.revature.repository.UserRepository;

@RestController
@RequestMapping("User")
public class UserController {
	
	@Autowired
	private UserRepository userRepo;
	
	@PostMapping("/addUser")
	public User saveUser(@RequestBody User user) {
		return userRepo.save(user);
		
	}
	
	@GetMapping("/")
	public List<User> getUsers() {
		return userRepo.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<User> getUserById(@PathVariable int id) {
		return userRepo.findById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteById(@PathVariable int id) {
		userRepo.deleteById(id);
		return "deleted user id: " + id;
	}
	
	
}
