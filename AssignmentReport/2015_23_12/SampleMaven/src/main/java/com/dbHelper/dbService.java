package com.dbHelper;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.model.User;

@Service
public class dbService {
	
	 private static Logger log = Logger.getLogger(UserDbHelper.class);
		
	@Autowired
	UserDbHelper userDbHelper;
	
	//@Transactional
	public boolean insert(User user) {
		boolean flag = false;
	
		try {
			flag = userDbHelper.insert(user);
		} catch (Exception e) {
			  log.trace("Trace Message!");
		      log.debug("Debug Message!");
		      log.info("Info Message!");
		      log.warn("Warn Message!");
		      log.error("Error Message!");
		      log.fatal("Fatal Message!");
		}
		
		return flag;
	}
}
