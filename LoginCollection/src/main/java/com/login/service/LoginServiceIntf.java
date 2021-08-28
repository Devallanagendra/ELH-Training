package com.login.service;


import java.util.Set;

import com.login.exception.InvaildException;
import com.login.model.Login;

public interface LoginServiceIntf {

	//Login searchUser(String uId, String pswd);

	Login validateUser(Set<Login> loginObj) throws InvaildException;

}
