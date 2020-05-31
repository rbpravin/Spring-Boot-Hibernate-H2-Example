package com.pravin.service;

import java.util.List;


import com.pravin.domain.User;

public interface UserService {
	
	
public List<User> getUsers();

public Long getCount();

public User getUsersById(int userid);

public List<User> getUsersByName(String uname);

public User addUser(User user);



public String deleteUserById(User u);

public User updateUser(User user);




}
