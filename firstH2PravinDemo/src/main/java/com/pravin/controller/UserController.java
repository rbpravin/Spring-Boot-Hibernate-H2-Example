package com.pravin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pravin.domain.User;
import com.pravin.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService service;
	
	@GetMapping("/users")
	public List<User> getUsers()
	{
		return service.getUsers();
	}
	
	@GetMapping("/users/{id}")
	public User getUsersById(@PathVariable(value = "id")int userid)
	{
		return service.getUsersById(userid);
	}
	
	
	
	@GetMapping("/username/{name}")
	public List<User> getUsersByName(@PathVariable(value = "name")String uname)
	{
		return service.getUsersByName(uname);
	}
	
	@PostMapping(value = "/adduser",consumes = {"application/json"})
	public User addUser(@RequestBody User user)
	{
		return service.addUser(user);
	}
	
	@DeleteMapping("/users/{id}")
	public String deleteUserById(@PathVariable(value = "id")int userid)
	{
		User u=service.getUsersById(userid);
		
		return service.deleteUserById(u);
		
		
	}
	
//	@PutMapping("/users")
//	public User updateUser(@RequestBody User user)
//	{
//		return service.updateUser(user);
//	}
	
	@PutMapping("/users/{id}")
	public User updateUser(@PathVariable(value = "id") int userid,@RequestBody User user)
	{
		User u=service.getUsersById(userid);
		u.setId(user.getId());
		u.setName(user.getName());
		return service.updateUser(u);
	}
	
	
	
	
	
	
	
	
	@GetMapping("/count")
	public Long getCount()
	{
		return service.getCount();
	}

}
