package com.oop.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop.service.AdminDAO;

@WebServlet("/DeleteAdminServlet")
public class DeleteAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DeleteAdminServlet() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String adminID = request.getParameter("adminid");

		int i = AdminDAO.delete(adminID);
		
		if(i!=0) {
			String msg = "Admin has been deleted succesfully! ";
			request.setAttribute("msg", msg);
			response.sendRedirect("ListAdminServlet");	
		}
		else {
			String msg = "Admin has not been deleted... ";
			request.setAttribute("msg", msg);
			response.sendRedirect("ListAdminServlet");
		}
		
		out.close();
	}

}
