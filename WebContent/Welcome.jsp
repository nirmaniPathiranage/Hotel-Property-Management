<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Registration</title>
<style>

.topnav a{
float:left;
color:#f2f2f2;
text-align:center;
padding:14px 16px;
text-decoration:none;
font-size:17px;
}

.topnav a:hover{
background-color:#ddd;
color:black;
}

.topnav a.active{
background-color:#4CAF50;
color:black;
}

footer {
   position:fixed;
   left:0px;
   bottom:0px;
   height:30px;
   width:100%;
   background:#999;
}

body{
	
	background:url('back.jpg'); 
	background-size: cover;
}

td{
	width:60%;	
	height:60px;
}

table#nat {
	width: 100%;
	background-color:lightblue;
}

</style>
</head>
<body>

<div class = "topnav" style="height:50px;>
<a class = "active"  href="HomePage.jsp">Home</a>
			<a href="AboutUs.jsp">About Us</a>
			<a href="Search.jsp">Search</a>
			<a href="Login.jsp">Book Now!!!</a>
			<a href="AdminLogin.jsp">Inventory Control</a>
			<a href="ContactUs.jsp">Contact Us</a>
			<font align:right>
			<a href="AdminLogin.jsp">Admin Login</a>
			<a href="Login.jsp">Guest Login</a>
			</font>
</div>
	<h2>
		<center>
			<font color="red">Registration is Successful!!!</font>
		</center>
	</h2>
	<br>
	<%
		String userName = request.getParameter("username");
		String passWord = request.getParameter("password");
		String fullName = request.getParameter("fullname");
		String NICno = request.getParameter("nicno");
		String emailAddress = request.getParameter("emailaddress");
		String streetAddress = request.getParameter("streetaddress");
		String contactNo = request.getParameter("contactno");
		String regDate = request.getParameter("regdate");
	%>
	<table id="nat" border="0" cellpadding = "3" style:width = "100%">
		<tr height="40px">
			<td><p style="font-size: larger">Set Username</td>
			<td><%=userName%></td>
		</tr>
		<tr height="40px">
			<td><p style="font-size: larger">Set Password</td>
			<td><%=passWord%></td>
		</tr>
		<tr height="40px">
			<td><p style="font-size: larger">Full Name</td>
			<td><%=fullName%></td>
		</tr>
		<tr height="40px">
			<td><p style="font-size: larger">NIC Number</td>
			<td><%=NICno%></td>
		</tr>
		<tr height="40px">
			<td><p style="font-size: larger">Email Address</td>
			<td><%=emailAddress%></td>
		</tr>
		<tr height="40px">
			<td><p style="font-size: larger">Street Address</td>
			<td><%=streetAddress%></td>
		</tr>
		<tr height="40px">
			<td><p style="font-size: larger">Contact Number</td>
			<td><%=contactNo%></td>
		</tr>
		<tr height="40px">
			<td><p style="font-size: larger">Registered Date</td>
			<td><%=regDate%></td>
		</tr>
	</table>
	<br>
	<br>
	<br> Please Login Here
	<a href='Login.jsp'>Go to Login</a>
	<br><br><br>
	<footer><div align="center" style ="background-color:#808080">All Rights Reserved@Hotel RoomPalace Pvt Ltd year 2018</footer>
</body>
</html>