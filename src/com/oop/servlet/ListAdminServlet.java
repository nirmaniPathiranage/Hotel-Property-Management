package com.oop.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop.model.Admin;
import com.oop.service.AdminDAO;

@WebServlet("/ListAdminServlet")

public class ListAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ListAdminServlet() {
		super();
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<a href='index.jsp'>Add New Admin</a>");
		out.println("<h1>Admin List</h1>");

		List<Admin> list = AdminDAO.getAllAdmins();

		out.print("<table border='1' width='100%'");
		out.print(
				"<tr><th>Admin ID</th><th>Admin Name</th><th>Address</th><th>Email Address</th><th>Contact No</th><th>UserName</th><th>Password</th><th>Task</th><th>Edit</th><th>Delete</th></tr>");

		for (Admin admin : list) {
			out.print("<tr><td>" + admin.getAdminID() + "</td><td>" + admin.getAdminName() + "</td><td>"
					+ admin.getAddress() + "</td><td>" + admin.getEmailAddress() + "</td><td>" + admin.getContactNo()
					+ "</td><td>" + admin.getUserName() + "</td><td>" + admin.getPassWord() + "</td><td>"
					+ admin.getTask() + "</td><td><a href='UpdateAdminServlet?adminid=" + admin.getAdminID()
					+ "'>edit</a></td><td><a href='DeleteAdminServlet?adminid=" + admin.getAdminID()
					+ "'>delete</a></td></tr>");
		}
		out.print("</table>");

		out.close();
	}
}
