package com.bny.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.bny.domain.User;
import com.bny.mapper.UserMapper;

@Repository
public class UserDaoImpl extends JdbcDaoSupport implements UserDao{
	
	@Autowired
	public UserDaoImpl(DataSource dataSource) {
		setDataSource(dataSource);
	}
	
	JdbcTemplate jdbcTemplate;
	
	
	
	 public List<User> getUsers()
	 { 
		 
		 String sql = "Select * from users"; 
		 
		 //Object[] params = null;
		 //return getJdbcTemplate().query(sql,params, new UserMapper()); return return
		 
		 return jdbcTemplate.query(sql, new UserMapper()); 
		 
	 }
	 
}
	 
	  
	/*  public List<User> getUsers() {
	        return jdbcTemplate.query(
	                "Select * from users",
	                (rs, rowNum) ->
	                        new User(
	                                rs.getInt("id"),
	                                rs.getString("name")
	                                
	                        )
	        );*/
	    
	 

	/*
	 * public List<User> getUsers() { List<User> list=new ArrayList<User>();
	 * list.add(new User(1,"Pravin")); return list; }
	 */

