package com.dbHelper;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.User;

@Repository
public class UserDbHelper {
	
	@Autowired
	private SessionFactory sessionFactory;
	@Transactional
	public boolean insert(User user) {
		System.out.println("fbsb  = "+sessionFactory);
		
		Session session = sessionFactory.getCurrentSession();
		System.out.println("db"+ user);
		int i = (Integer) session.save(user);
		if(i!=0){
			return true;
		}
		else{
			return false;
		}
	}
}
