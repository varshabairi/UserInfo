package com.webservices.users.restfulwebservices;

public class UserDetails {
	
		
	private Integer userid;
	private String firstname;
	private String lastname;
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getFirstname() {
		return firstname;
	}
	public UserDetails()
	{
		
	}
	
	public UserDetails(Integer userid, String firstname, String lastname) {
		super();
		this.userid = userid;
		this.firstname = firstname;
		this.lastname = lastname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	

}












