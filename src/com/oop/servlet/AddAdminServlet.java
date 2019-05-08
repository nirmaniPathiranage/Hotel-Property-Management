package com.oop.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop.model.Admin;
import com.oop.service.AdminDAO;

@WebServlet("/AddAdminServlet")

public class AddAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AddAdminServlet() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String adminID = request.getParameter("adminid");
		String adminName = request.getParameter("adminname");
		String address = request.getParameter("address");
		String emailAddress = request.getParameter("emailaddress");
		String contactNo = request.getParameter("contactno");
		String userName = request.getParameter("username");
		String passWord = request.getParameter("password");
		String task = request.getParameter("task");

		Admin admin = new Admin();

		admin.setAdminID(adminID);
		admin.setAdminName(adminName);
		admin.setAddress(address);
		admin.setEmailAddress(emailAddress);
		admin.setContactNo(contactNo);
		admin.setUserName(userName);
		admin.setPassWord(passWord);
		admin.setTask(task);

			int status = AdminDAO.add(admin);

			if (status > 0) {
				out.print("<p>Record added successfully!</p>");
				request.getRequestDispatcher("/index.jsp").include(request, response);
			} else {
				out.println("Sorry! unable to add record");
			}

		
		
		out.close();
	}

}
