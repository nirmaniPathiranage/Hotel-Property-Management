package com.oop.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.oop.model.Login;
import com.oop.util.DBConnection;

public class LoginDAO {

	public String authenticateUser(Login log) {

		String userName = log.getUserName();
		String passWord = log.getPassWord();

		Connection con = null;
		Statement statement = null;
		ResultSet resultSet = null;

		String userNameDB = "";
		String passwordDB = "";

		try {
			con = DBConnection.createConnection();
			statement = con.createStatement();
			resultSet = statement.executeQuery("select userName,passWord from guestlogin");

			while (resultSet.next()) {
				userNameDB = resultSet.getString("userName");
				passwordDB = resultSet.getString("passWord");

				if (userName.equals(userNameDB) && passWord.equals(passwordDB)) {

					return "SUCCESS";

				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return "Invalid User Credentials !!! Try Again ...";

	}
}
