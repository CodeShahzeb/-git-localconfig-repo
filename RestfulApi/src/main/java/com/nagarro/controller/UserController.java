package com.nagarro.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.entity.User;
import com.nagarro.repo.UserRepository;

@RestController
public class UserController {
   
	 @Autowired
	 private UserRepository userRepository;
	
	
	 @GetMapping("/users") 
	 public List<User> getAllUsers(){
	
		 return userRepository.findAll();
	  }
	 
	 @PostMapping("/users") 
	 public User createUser( @RequestBody User user){
	
		 return userRepository.save(user);
	  }
	
	 @GetMapping("/users/{id}") 
	 public Optional<User> getAllUsers(@PathVariable int id ){
	
		 return userRepository.findById(id);
	  
	 }
	 
	 @DeleteMapping("/users/{id}")
		public void deleteUser(@PathVariable int id) {
			userRepository.deleteById(id);
		}
	
	
	
}
