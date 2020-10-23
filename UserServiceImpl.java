/**
 * 
 */
package com.hcl.SpringRegistration.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.hcl.SpringRegistration.model.User;
import com.hcl.SpringRegistration.repository.UserDao;

/**
 * @author dharinishree.k
 *
 */
public class UserServiceImpl implements UserService{
	@Autowired
	UserDao userDao;
	@Override
	public boolean register(User usr) {
		userDao.register(usr);
		return false;
	}

}
