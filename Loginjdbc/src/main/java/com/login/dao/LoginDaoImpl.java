package com.login.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.login.model.User;

public class LoginDaoImpl implements UserDao{

	public User checkLogin(int userId, String password) {

	
			User user = null;
			Connection connection = JdbcConnection.getConnection();
			String sql = "select * from user where sapid = ? and password =?";
			PreparedStatement preparedStatement;
			try {
				preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setInt(1, userId);
				preparedStatement.setString(2, password);

				ResultSet resultSet = preparedStatement.executeQuery();
				user = new User();
				while (resultSet.next()) {
					user.setUserId(resultSet.getInt("sapid"));
					user.setUserName(resultSet.getString("username"));
					user.setPassword(resultSet.getString("password"));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

			return user;
		}

}