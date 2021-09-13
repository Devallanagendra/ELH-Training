package com.login.service;


import java.util.Set;

import com.login.exception.NumberException;
import com.login.model.User;

public interface UserService {
	public abstract User checkCredentails(int userId, String password) throws NumberException;

}
