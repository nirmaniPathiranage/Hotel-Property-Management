package com.oop.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop.model.Admin;
import com.oop.service.AdminDAO;

@WebServlet("/UpdateAdminServlet")

public class UpdateAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UpdateAdminServlet() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<h1>Update Admin</h1>");
       
		String adminID = request.getParameter("adminid");

		Admin admin = AdminDAO.getAdminById(adminID);

		out.print("<form action='UpdateAdminServlet2' method='post'>");
		out.print("<table>");
		out.print("<tr><td>Admin ID:</td><td><input type='hidden' name='adminid' value='" + admin.getAdminID()
				+ "'/></td></tr>");
		out.print("<tr><td>Admin Name:</td><td><input type='text' name='adminname' value='" + admin.getAdminName()
				+ "'/></td></tr>");
		out.print("<tr><td>Address:</td><td><input type='text' name='address' value='" + admin.getAddress()
				+ "'/></td></tr>");
		out.print("<tr><td>Email Address:</td><td><input type='email' name='emailaddress' value='"
				+ admin.getEmailAddress() + "'/></td></tr>");
		out.print("<tr><td>Contact No:</td><td><input type='text' name='contactno' value='" + admin.getContactNo()
				+ "'/></td></tr>");
		out.print("<tr><td>UserName:</td><td><input type='text' name='username' value='" + admin.getUserName()
				+ "'/></td></tr>");
		out.print("<tr><td>Password:</td><td><input type='password' name='password' value='" + admin.getPassWord()
				+ "'/></td></tr>");
		out.print("<tr><td>Task:</td><td><input type='text' name='task' value='" + admin.getTask() + "'/></td></tr>");

		out.print("<tr><td colspan='2'><input type='submit' value='Edit &amp; Save '/></td></tr>");
		out.print("</table>");
		out.print("</form>");

		out.close();
	}

}
