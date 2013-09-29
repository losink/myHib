package com.myHib.dao;

import com.myHib.bean.People;

public interface UserDAO {
	
	People queryUser(String name,String password);
	
	void insertUser(People user) throws Exception;
	
	void updateUser(People user);
	
	void deleteUser(People user);

}
