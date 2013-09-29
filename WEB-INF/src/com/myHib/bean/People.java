package com.myHib.bean;

public class People {
	
	private int id;
	private String username = null;
	private String password = null;
	
	public void setID(int id)
	{
		this.id = id;
	}
	
	public int getID()
	{
		return this.id;
	}
	
	public void setUsername(String username)
	{
		this.username = username;
	}
	
	public String getUsername()
	{
		return this.username;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	public String getPassword()
	{
		return this.password;
	}
	
	public People() 
	{
		super();
	}
	
	public People(String username, String password)
	{
		super();
		this.password = password;
		this.username = username;
	}

}




