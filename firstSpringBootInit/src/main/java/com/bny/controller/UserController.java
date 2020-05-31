package com.bny.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bny.domain.User;
import com.bny.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService service;
	
	
	  @RequestMapping(value = "/users",method = RequestMethod.GET)
	  public List<User> getUsers() 
	  { 
		  return service.getUsers(); 
		  
	  }
	 
	
	/*@RequestMapping(value = "/users",method = RequestMethod.GET)
	public String getUsers()
	{
		return "Successful Successful";
	}
	*/
	
	@RequestMapping(value = "/error",method = RequestMethod.GET)
	public String getError()
	{
		return "Failed Successful";
	}
	
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String getFailed()
	{
		return "Totally Failed";
	}


}
