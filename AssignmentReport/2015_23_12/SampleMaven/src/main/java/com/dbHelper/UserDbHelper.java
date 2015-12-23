package com.dbHelper;


import javax.sound.midi.MidiDevice.Info;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.User;

@Repository
public class UserDbHelper {
	
	 private static Logger log = Logger.getLogger(UserDbHelper.class);
	
	@Autowired
	private SessionFactory sessionFactory;
	@Transactional
	public boolean insert(User user) {
		
		int i=0;
		try {
			Session session = sessionFactory.getCurrentSession();

			i = (Integer) session.save(user);
		} catch (HibernateException e) {
			  log.trace("Trace Message!");
		      log.debug("Debug Message!");
		      log.info("Info Message!");
		      log.warn("Warn Message!");
		      log.error("Error Message!");
		      log.fatal("Fatal Message!");
		}
		if(i!=0){
			return true;
		}
		else{
			return false;
		}
	}
}
