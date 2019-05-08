package com.oop.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop.service.RoomDAO;

@WebServlet("/DeleteRoomServlet")
public class DeleteRoomServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DeleteRoomServlet() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String roomNo = request.getParameter("roomNo");

		int i = RoomDAO.delete(roomNo);
		
		if(i!=0) {
			String msg = "Room No has been deleted succesfully! ";
			request.setAttribute("msg", msg);
			response.sendRedirect("ListRoomServlet");	
		}
		else {
			String msg = "Room No has not been deleted... ";
			request.setAttribute("msg", msg);
			response.sendRedirect("ListRoomServlet");
		}
		
		out.close();
	}

}
