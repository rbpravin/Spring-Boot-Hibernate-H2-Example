package com.bny.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bny.domain.User;

public class UserMapper implements RowMapper<User> {
	
	public User mapRow(ResultSet rs,int rowNum) throws SQLException{
		
		User user=new User();
		
		user.setId(rs.getInt("id"));
		user.setName(rs.getString("name"));
		
		//user.setId(rs.getInt(0));
		//user.setName(rs.getString(1));
		
		return user;
		
	}

}
