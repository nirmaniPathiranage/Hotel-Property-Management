package com.oop.service;

import java.util.*;
import java.sql.*;

import com.oop.model.Room;
import com.oop.util.DBConnection;

public class RoomDAO {
	
	public static int add(Room room) {

		Connection con = null;
		PreparedStatement ps = null;

		int status = 0;

		try {

			con = DBConnection.createConnection();

			String query = "insert into room(roomNo, roomType, price, discount) values (?,?,?,?)";
			ps = con.prepareStatement(query);

			ps.setString(1, room.getRoomNo());
			ps.setString(2, room.getRoomType());
			ps.setDouble(3, room.getPrice());
			ps.setDouble(4, room.getDiscount());
			
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

	public static int update(Room room) {

		Connection con = null;
		PreparedStatement ps = null;

		int status = 0;

		try {

			con = DBConnection.createConnection();

			String query = "update room set roomType = ?, price = ?, discount = ? where roomNo=?";
			ps = con.prepareStatement(query);

			ps.setString(1, room.getRoomType());
			ps.setDouble(2, room.getPrice());
			ps.setDouble(3, room.getDiscount());
			ps.setString(4, room.getRoomNo());
			

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

	public static int delete(String roomNo) {

		Connection con = null;
		PreparedStatement ps = null;

		int status = 0;

		if (roomNo != null && !roomNo.isEmpty()) {

			try {

				con = DBConnection.createConnection();

				String query = "delete from room where roomNo=?";
				ps = con.prepareStatement(query);

				ps.setString(1, roomNo);

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

	public static Room getRoomById(String roomNo) {

		Room room = new Room();

		Connection con = null;
		PreparedStatement ps = null;

		try {

			con = DBConnection.createConnection();

			String query = "select * from room where roomNo=?";
			ps = con.prepareStatement(query);

			ps.setString(1, roomNo);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {

				room.setRoomNo(rs.getString(1));
				room.setRoomType(rs.getString(2));
				room.setPrice(rs.getDouble(3));
				room.setDiscount(rs.getDouble(4));
				
			}

			con.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		catch (Exception ex) {
			ex.printStackTrace();
		}

		return room;
	}

	public static List<Room> getAllRooms() {

		Connection con = null;
		PreparedStatement ps = null;

		List<Room> list = new ArrayList<Room>();

		try {

			con = DBConnection.createConnection();

			String query = "select * from room";
			ps = con.prepareStatement(query);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				Room room = new Room();

				room.setRoomNo(rs.getString(1));
				room.setRoomType(rs.getString(2));
				room.setPrice(rs.getDouble(3));
				room.setDiscount(rs.getDouble(4));
				

				list.add(room);
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
