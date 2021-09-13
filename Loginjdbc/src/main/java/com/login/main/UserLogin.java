package com.login.main;

import java.util.Scanner;

import com.login.exception.NumberException;
import com.login.model.User;
import com.login.service.UserService;
import com.login.service.UserServiceImpl;

/**
 * 
 * @author devalla.nagendrababu
 *
 */

public class UserLogin {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter UserId : ");
		int userId = scanner.nextInt();
		System.out.println("Enter Password : ");
		String password = scanner.next();

		UserService userService = new UserServiceImpl();
		User user;
		try {
			user = userService.checkCredentails(userId, password);
			if (user != null) {
				System.out.println("Welcome! " + user.getUserName());
			} else {
				System.out.println("Invalid User");
			}

		} catch (NumberException e) {
		System.err.println(e.getMessage());
		}

	}
}

	
