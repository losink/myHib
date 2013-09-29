package com.myHib.domain;

import com.myHib.bean.People;

public interface Regedit {
	
	void saveUser(People user) throws Exception;
	
	void updateUser(People user) throws Exception;
	
	void deleteUser(People user) throws Exception;

}
