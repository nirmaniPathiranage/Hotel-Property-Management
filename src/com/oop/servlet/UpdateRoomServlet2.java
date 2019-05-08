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

@WebServlet("/UpdateRoomServlet2")

public class UpdateRoomServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UpdateRoomServlet2() {
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

		int status = RoomDAO.update(room);

		if (status > 0) {
			String msg = " Room details have been updated succesfully! ";
			request.setAttribute("msg", msg);
			response.sendRedirect("ListRoomServlet");

		} else {
			out.println("Sorry! unable to update record");
		}

		out.close();
	}
}
