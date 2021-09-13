package com.login.dao;

import com.login.model.User;

/**
 * 
 * @author devalla.nagendrababu
 *
 */
public interface UserDao {
	public abstract User checkLogin(int userId, String password);
}
