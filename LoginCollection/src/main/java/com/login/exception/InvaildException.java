package com.login.exception;

//custom Exception == userdefined Exception
public class InvaildException extends Exception {

	@Override
	public String getMessage() {
		return "Invalid User";
	}

}
