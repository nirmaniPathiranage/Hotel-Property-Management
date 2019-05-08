package com.oop.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.oop.model.Register;
import com.oop.util.DBConnection;

public class RegisterDAO {

	public String registerUser(Register reg) {

		String userName = reg.getUserName();
		String passWord = reg.getPassWord();
		String fullName = reg.getFullName();
		String NICno = reg.getNICno();
		String emailAddress = reg.getEmailAddress();
		String streetAddress = reg.getStreetAddress();
		String contactNo = reg.getContactNo();
		String regDate = reg.getRegDate();

		Connection con = null;
		PreparedStatement preparedStatement = null;

		try {
			con = DBConnection.createConnection();

			String query = "insert into guestlogin(id,userName,passWord,fullName,NICno,emailAddress,streetAddress,contactNo,regDate) values (NULL,?,?,?,?,?,?,?,?)";
			preparedStatement = con.prepareStatement(query);

			preparedStatement.setString(1, userName);
			preparedStatement.setString(2, passWord);
			preparedStatement.setString(3, fullName);
			preparedStatement.setString(4, NICno);
			preparedStatement.setString(5, emailAddress);
			preparedStatement.setString(6, streetAddress);
			preparedStatement.setString(7, contactNo);
			preparedStatement.setString(8, regDate);

			int i = preparedStatement.executeUpdate();
			if (i != 0)
				return "SUCCESS";
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "Oops.. Something went wrong there..!";
	}

}
