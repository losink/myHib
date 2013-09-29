package com.myHib.domain.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.myHib.bean.People;
import com.myHib.dao.UserDAO;
import com.myHib.domain.Regedit;

@Transactional
@Service
public class RegeditImpl implements Regedit {
	
	@Resource
	private UserDAO userDao;

	@Override
	public void saveUser(People user) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUser(People user) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(People user) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
