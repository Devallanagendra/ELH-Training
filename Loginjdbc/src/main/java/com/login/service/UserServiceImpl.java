package com.login.service;

import java.util.Set;

import com.login.dao.LoginDaoImpl;
import com.login.dao.UserDao;
import com.login.exception.NumberException;
import com.login.model.User;
public class UserServiceImpl implements UserService {

	@Override
	public User checkCredentails(int userId, String password) throws NumberException {
		User userResult = null;
		if (String.valueOf(userId).length() > 5) {
			if (password.length() > 5) {
				UserDao userDao = new LoginDaoImpl();
				User user = userDao.checkLogin(userId, password);
				if (user.getUserId() == userId && user.getPassword().equals(password)) {
					userResult = user;
				} else {
					userResult = null;
				}
			} else {
				throw new NumberException("Password length should be greater than 5 characters");
			}

		} else {
			throw new NumberException("UserId length should be greater than 5 digits");
		}
		return userResult;
	}

}
