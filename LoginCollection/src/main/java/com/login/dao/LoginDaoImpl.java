package com.login.dao;

import com.login.exception.InvaildException;
import com.login.model.Login;

public class LoginDaoImpl implements LoginDaoIntf {

	public Login validateUser(Login login) throws InvaildException {
		if (login.getUserId() ==  543210 && (login.getPassword().equals("Nagendra"))) {

			login.setUserName(("Hcl  " + login.getUserId()));
		} else {
			throw new InvaildException();
		}
		return login;
	}

}