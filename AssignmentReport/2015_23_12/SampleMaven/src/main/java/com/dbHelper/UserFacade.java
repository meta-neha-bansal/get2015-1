package com.dbHelper;

import com.model.User;

public class UserFacade {

	public boolean insert(User user) {
		boolean flag = false;
		UserDbHelper userDbHelper = new UserDbHelper();
		flag = userDbHelper.insert(user);
		return flag;
		
	}
}
