package com.oop.servlet;

import java.io.IOException;
import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oop.model.Login;
import com.oop.service.AdminLoginDAO;

@WebServlet("/AdminLoginServlet")

public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AdminLoginServlet() {
		super();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		String userName = request.getParameter("username");
		String passWord = request.getParameter("password");

		Login log = new Login();

		log.setUserName(userName);
		log.setPassWord(passWord);

		AdminLoginDAO adminloginDao = new AdminLoginDAO();

		String userValidate = adminloginDao.authenticateUser(log);

		if (userValidate.equals("SUCCESS")) {

			HttpSession session = request.getSession();

			session.setAttribute("userName", userName);
			request.getRequestDispatcher("/AdminHome.jsp").forward(request, response);
		}

		else {

			request.setAttribute("errMessage", userValidate);
			request.getRequestDispatcher("/AdminLogin.jsp").forward(request, response);
		}
	}
}