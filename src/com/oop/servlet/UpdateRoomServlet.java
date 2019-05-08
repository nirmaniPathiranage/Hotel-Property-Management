package com.oop.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop.model.Room;
import com.oop.service.RoomDAO;

@WebServlet("/UpdateRoomServlet")

public class UpdateRoomServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UpdateRoomServlet() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<h1>Update Room Details</h1>");
       
		String roomNo = request.getParameter("roomNo");

		Room room = RoomDAO.getRoomById(roomNo);

		out.print("<form action='UpdateRoomServlet2' method='post'>");
		out.print("<table>");
		out.print("<tr><td>Room No:</td><td><input type='hidden' name='roomNo' value='" + room.getRoomNo()
				+ "'/></td></tr>");
		out.print("<tr><td>Room Type:</td><td><input type='text' name='roomType' value='" + room.getRoomType()
				+ "'/></td></tr>");
		out.print("<tr><td>Price:</td><td><input type='text' name='price' value='" + room.getPrice()
				+ "'/></td></tr>");
		out.print("<tr><td>Discount:</td><td><input type='text' name='discount' value='"
				+ room.getDiscount() + "'/></td></tr>");
		

		out.print("<tr><td colspan='2'><input type='submit' value='Edit &amp; Save '/></td></tr>");
		out.print("</table>");
		out.print("</form>");

		out.close();
	}

}
