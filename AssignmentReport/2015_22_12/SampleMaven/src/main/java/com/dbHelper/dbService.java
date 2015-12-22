package com.dbHelper;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.model.User;

@Service
public class dbService {
	
	

	//private SessionFactory sessionFactory = null;

	//@Transactional
	public boolean insert(User user) {
		boolean flag = false;
		UserFacade iUserFacade = new UserFacade();
		flag = iUserFacade.insert(user);
		
		//Transaction transaction = null;		
			/*System.out.println("in service "+ sessionFactory);
			session = sessionFactory.openSession();*/
			
			//sessionFactory = SessionFactoryUtil.getConfigurationInstance();
		//session = sessionFactory.openSession();
		//	transaction = session.beginTransaction();
			//System.out.println("aaaaaaaaaaaaaaaaaaaaaaaa"+ user);
			
	//		transaction.commit();
		
		return flag;
	}
}
