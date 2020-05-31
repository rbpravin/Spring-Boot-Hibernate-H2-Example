package com.pravin.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pravin.domain.User;
import com.pravin.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository repository;
	
	public List<User> getUsers()
	{
		return (List<User>) repository.findAll();
	}

	@Override
	public Long getCount() {
		// TODO Auto-generated method stub
		return repository.count();
	}

	public User getUsersById(int userid) {
		// TODO Auto-generated method stub
		return repository.findById(userid);
		
	}

	
	public List<User> getUsersByName(String uname) {
		// TODO Auto-generated method stub
		return repository.findByName(uname);
	}

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return repository.save(user);
	}

	

	
	  public String deleteUserById(User u) 
	  { 
		  repository.delete(u); 
		  return "Deleted Succesfully!!!"; 
	  }

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return repository.save(user);
	}
	 
	

	

	

	

	

}
