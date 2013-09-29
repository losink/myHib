package com.myHib.domain.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.myHib.bean.People;
import com.myHib.dao.UserDAO;
import com.myHib.domain.Login;

@Transactional
@Service
public class LoginImpl implements Login{

	@Resource
	private UserDAO userDao;
	
	@Override
	public boolean login(People user) {
		// TODO Auto-generated method stub
		
		return userDao.queryUser(user.getUsername(), user.getPassword()) == null? false : true;
	}

}
