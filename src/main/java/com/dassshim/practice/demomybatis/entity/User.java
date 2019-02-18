package com.dassshim.practice.demomybatis.entity;

public class User {
	private int id ;
	private String userName;
	
	private String password;
	
	private String displayName;
	
	public User()
	{}
	public User(int id, String userName , String password , String displayName)
	{
		setId(id);
		setUserName(userName);
		setPassword(password);
		setDisplayName(displayName);
	}
	
	private User(String userName , String password)
	{
		setUserName(userName);
		setPassword(password);
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	private void setUserName(String userName) {
		this.userName = userName;
	}
	
	private void setPassword(String password) {
		this.password = password;
	}
	
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	
	
	public String getDisplayName() {
		return displayName;
	}
	public String getUserName() {
		return userName;
	}
	
	public String getPassword() {
		return password;
	}	
	

}
