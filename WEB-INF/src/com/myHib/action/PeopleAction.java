package com.myHib.action;



import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.myHib.bean.People;

public class PeopleAction {
	
//	private SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	public static void main(String[] args) throws HibernateException {
		
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		People people = new People();
		people.setUsername("gf");
		people.setPassword("gf");
		
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		session.save(people);
		
		transaction.commit();
		
		session.close();
		
		sessionFactory.close();
	}

}
