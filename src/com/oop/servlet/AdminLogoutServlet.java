package com.oop.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/AdminLogoutServlet")

public class AdminLogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public AdminLogoutServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		HttpSession session = request.getSession(false);

		if (session != null) {
			session.invalidate();
			request.setAttribute("errMessage", "You have logged out successfully");
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/AdminLogin.jsp");
			requestDispatcher.forward(request, response);
			System.out.println("Logged out");

		}
	}
}