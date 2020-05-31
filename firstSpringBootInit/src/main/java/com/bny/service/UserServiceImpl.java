package com.bny.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bny.dao.UserDao;
import com.bny.domain.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDao dao;
	
	public List<User> getUsers()
	{
		//List<User> list=new ArrayList<User>();
		//list.add(new User(1,"Pravin"));
		// list;
		return dao.getUsers();
	}

	
}
