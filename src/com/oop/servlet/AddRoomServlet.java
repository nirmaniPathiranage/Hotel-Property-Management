package com.oop.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop.model.Room;
import com.oop.service.RoomDAO;

@WebServlet("/AddRoomServlet")

public class AddRoomServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AddRoomServlet() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String roomNo = request.getParameter("roomNo");
		String roomType = request.getParameter("roomType");
		Double price = Double.parseDouble(request.getParameter("price"));
		Double discount = Double.parseDouble(request.getParameter("discount"));
		

		Room room = new Room();

		room.setRoomNo(roomNo);
        room.setRoomType(roomType);
        room.setPrice(price);
        room.setDiscount(discount);
		
        
			int status = RoomDAO.add(room);

			if (status > 0) {
				out.print("<p>Record added successfully!</p>");
				request.getRequestDispatcher("/room.jsp").include(request, response);
			} else {
				out.println("Sorry! unable to add record");
			}

		
	
		out.close();
	}

}
