package com.oop.service;

import java.util.*;
import java.sql.*;

import com.oop.model.Admin;
import com.oop.util.DBConnection;

public class AdminDAO {

	public static int add(Admin admin) {

		Connection con = null;
		PreparedStatement ps = null;

		int status = 0;

		try {

			con = DBConnection.createConnection();

			String query = "insert into admin(adminID, adminName, address, emailAddress, contactNo, userName, passWord, task) values (?,?,?,?,?,?,?,?)";
			ps = con.prepareStatement(query);

			ps.setString(1, admin.getAdminID());
			ps.setString(2, admin.getAdminName());
			ps.setString(3, admin.getAddress());
			ps.setString(4, admin.getEmailAddress());
			ps.setString(5, admin.getContactNo());
			ps.setString(6, admin.getUserName());
			ps.setString(7, admin.getPassWord());
			ps.setString(8, admin.getTask());

			status = ps.executeUpdate();

			con.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		catch (Exception ex) {
			ex.printStackTrace();
		}

		return status;
	}

	public static int update(Admin admin) {

		Connection con = null;
		PreparedStatement ps = null;

		int status = 0;

		try {

			con = DBConnection.createConnection();

			String query = "update admin set adminName=?, address=?, emailAddress=?, contactNo=?, userName=?, passWord=?, task=? where adminID=?";
			ps = con.prepareStatement(query);

			ps.setString(1, admin.getAdminName());
			ps.setString(2, admin.getAddress());
			ps.setString(3, admin.getEmailAddress());
			ps.setString(4, admin.getContactNo());
			ps.setString(5, admin.getUserName());
			ps.setString(6, admin.getPassWord());
			ps.setString(7, admin.getTask());
			ps.setString(8, admin.getAdminID());

			status = ps.executeUpdate();

			con.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		catch (Exception ex) {
			ex.printStackTrace();
		}

		return status;
	}

	public static int delete(String adminID) {

		Connection con = null;
		PreparedStatement ps = null;

		int status = 0;

		if (adminID != null && !adminID.isEmpty()) {

			try {

				con = DBConnection.createConnection();

				String query = "delete from admin where adminID=?";
				ps = con.prepareStatement(query);

				ps.setString(1, adminID);

				status = ps.executeUpdate();

				con.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}

			catch (Exception e) {
				e.printStackTrace();
			}
		}
		return status;
	}

	public static Admin getAdminById(String adminID) {

		Admin admin = new Admin();

		Connection con = null;
		PreparedStatement ps = null;

		try {

			con = DBConnection.createConnection();

			String query = "select * from admin where adminID=?";
			ps = con.prepareStatement(query);

			ps.setString(1, adminID);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {

				admin.setAdminID(rs.getString(1));
				admin.setAdminName(rs.getString(2));
				admin.setAddress(rs.getString(3));
				admin.setEmailAddress(rs.getString(4));
				admin.setContactNo(rs.getString(5));
				admin.setUserName(rs.getString(6));
				admin.setPassWord(rs.getString(7));
				admin.setTask(rs.getString(8));
			}

			con.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		catch (Exception ex) {
			ex.printStackTrace();
		}

		return admin;
	}

	public static List<Admin> getAllAdmins() {

		Connection con = null;
		PreparedStatement ps = null;

		List<Admin> list = new ArrayList<Admin>();

		try {

			con = DBConnection.createConnection();

			String query = "select * from admin";
			ps = con.prepareStatement(query);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				Admin admin = new Admin();

				admin.setAdminID(rs.getString(1));
				admin.setAdminName(rs.getString(2));
				admin.setAddress(rs.getString(3));
				admin.setEmailAddress(rs.getString(4));
				admin.setContactNo(rs.getString(5));
				admin.setUserName(rs.getString(6));
				admin.setPassWord(rs.getString(7));
				admin.setTask(rs.getString(8));

				list.add(admin);
			}

			con.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return list;

	}

}
