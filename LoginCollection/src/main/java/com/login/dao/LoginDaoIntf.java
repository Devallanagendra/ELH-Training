package com.login.dao;

import com.login.exception.InvaildException;
import com.login.model.Login;

public interface LoginDaoIntf {

	//Login validateUser(int i, String pswd);

	Login validateUser(Login login) throws InvaildException;

}
