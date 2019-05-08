package com.oop.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop.model.Register;
import com.oop.service.RegisterDAO;

@WebServlet("/RegisterServlet")

public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegisterServlet() {
		super();
	}
	
	private int j = 0;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String userName = request.getParameter("username");
		String passWord = request.getParameter("password");
		String fullName = request.getParameter("fullname");
		String NICno = request.getParameter("nicno");
		String emailAddress = request.getParameter("emailaddress");
		String streetAddress = request.getParameter("streetaddress");
		String contactNo = request.getParameter("contactno");
		String regDate = request.getParameter("regdate");

		Register reg = new Register();

		reg.setUserName(userName);
		reg.setPassWord(passWord);
		reg.setFullName(fullName);
		reg.setNICno(NICno);
		reg.setEmailAddress(emailAddress);
		reg.setStreetAddress(streetAddress);
		reg.setContactNo(contactNo);
		reg.setRegDate(regDate);
		
		while (j == 0) {

			if (userName.equals(null) || userName == "" || passWord.equals(null) || passWord == ""
					|| fullName.equals(null) || fullName == "" || NICno.equals(null) || NICno == ""
					|| emailAddress.equals(null) || emailAddress == "" || streetAddress.equals(null) || streetAddress == ""
					|| contactNo.equals(null) || contactNo == "" || regDate.equals(null) || regDate == "") {
				request.setAttribute("msg", "Fields cannot be empty!");
				RequestDispatcher rd = request.getRequestDispatcher("/Register.jsp");
				rd.forward(request, response);
			}

		RegisterDAO regdao = new RegisterDAO();

		String userRegistered = regdao.registerUser(reg);

		if (userRegistered.equals("SUCCESS")) {
			request.getRequestDispatcher("/Welcome.jsp").forward(request, response);
		}

		else

		{
			request.setAttribute("errMessage", userRegistered);
			request.getRequestDispatcher("/Register.jsp").forward(request, response);
		}
		
		}
		String msg = "Guest ID is already registered in the System! ";
		request.setAttribute("msg", msg);
		RequestDispatcher rd = request.getRequestDispatcher("/Register.jsp");
		rd.forward(request, response);
		

	}

}
