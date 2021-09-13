package com.login.exception;

//custom Exception == userdefined Exception
public class NumberException extends Exception {

	private String message;

	public NumberException() {
		super();
	}

	public NumberException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String getMessage() {
		return this.message;
	}

}
