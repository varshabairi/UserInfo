package com.webservices.users.restfulwebservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {
	
	@Autowired
	private UserDao service;
	//GET ALL USERS
	@GetMapping("/user")
	public List<UserDetails> retrievAllUsers()
	{
		return service.findAll();
	}
	//GET ONE USER
	@GetMapping("/users/{Userid}")
	public UserDetails retrieveUser(@PathVariable int Userid)
	{
		return service.findOne(Userid);
	}
	//UPDATE A USER
	@PostMapping("/users")
	public void updateUser(@RequestBody UserDetails userdetails)
	{
		service.updateUser(userdetails);
	}
	
	//ADD A USER
	@PutMapping("/create")
	public void addUser(@RequestBody UserDetails userdetails)
	{
		 service.addUser(userdetails);
	}
	
}
