package com.webservices.users.restfulwebservices;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDao {

	private static List<UserDetails> users = new ArrayList<>();
	
	static {
		users.add(new UserDetails(1,"adam","eve"));
		
			}
	
	public List<UserDetails> findAll()
	{
		return users;
	}
	
	
	public UserDetails findOne(int id)
	{
		for(UserDetails user:users)
		{
			if(user.getUserid()==id)
			{
				return user;
			}
		}
		return null;
	}
	
	public UserDetails updateUser(UserDetails userdetails)
	{
		for(UserDetails user:users)
		{
			if ( user.getUserid() == userdetails.getUserid())
			{
					user.setFirstname(userdetails.getFirstname());
					user.setLastname(userdetails.getLastname());
					return user;
			}
		}
		return null;
	}


	public UserDetails addUser(UserDetails userdetails) 
	{
		if(userdetails== null)
		{
			return null;
		}
		else
		{
			users.add(new UserDetails(userdetails.getUserid(),userdetails.getFirstname(),userdetails.getLastname()));
				
		}
		
		return null;
	}


}
