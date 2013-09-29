package com.myHib.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.myHib.bean.People;
import com.myHib.dao.UserDAO;

@Repository
public class UserDAOImpl implements UserDAO{
	
	@Resource
	private SessionFactory sessionFactory;
	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public People queryUser(String name, String password) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		List<People> users = getSession().createQuery("from User u where u.username=? and u.password=?")
				.setParameter(0,name)
				.setParameter(1,password)
				.list();
		if(users.size()!=0)
		{
			return users.get(0);
		}
		return null;
	}

	@Override
	public void insertUser(People user) throws Exception {
		// TODO Auto-generated method stub
		try{
			getSession().save(user);
		}catch(Exception e)
		{
			e.printStackTrace();
			throw new Exception("插入失败");
		}
	}

	@Override
	public void updateUser(People user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(People user) {
		// TODO Auto-generated method stub
		this.getSession().delete(user);
	}

}
