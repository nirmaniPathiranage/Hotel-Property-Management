package com.oop.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop.model.Room;
import com.oop.service.RoomDAO;

@WebServlet("/ListRoomServlet")

public class ListRoomServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ListRoomServlet() {
		super();
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<a href='room.jsp'>Add New Room Details</a>");
		out.println("<h1>Room List</h1>");

		List<Room> list = RoomDAO.getAllRooms();

		out.print("<table border='1' width='100%'");
		out.print(
				"<tr><th>Room No</th><th>Room Type</th><th>Price</th><th>Discount in %</th><th>Edit</th><th>Delete</th></tr>");

		for (Room room : list) {
			out.print("<tr><td>" + room.getRoomNo() + "</td><td>" + room.getRoomType() + "</td><td>"
					+ room.getPrice() + "</td><td>" + room.getDiscount() + "</td><td><a href='UpdateRoomServlet?roomNo=" + room.getRoomNo()
					+ "'>edit</a></td><td><a href='DeleteRoomServlet?roomNo=" + room.getRoomNo()
					+ "'>delete</a></td></tr>");
		}
		out.print("</table>");

		out.close();
	}
}
