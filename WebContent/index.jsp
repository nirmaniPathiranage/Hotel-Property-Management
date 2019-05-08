<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add New Admin</title>
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

</style>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/Property Management System/WebContent/js/script1.js"></script>
</head>
<body>
<div class = "topnav">
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

<div style="width:800px; margin:0 auto;" >

	<center>
		<h1>Add New Admin</h1>
	</center>
	  
	<form name="form" action="AddAdminServlet" method="post"
		onSubmit="return formValidate();">
		  
		<center>
			<table cellpadding="3" style="width: 50%">

				<tr height="40">
					<td><p style="font-size: larger">Admin ID:</td>
					<td><input type="text" name="adminid" placeholder="Admin ID" autocomplete="off" required/></td>
				</tr>
				<tr height="40">
					<td><p style="font-size: larger">Admin Name:</td>
					<td><input type="text" name="adminname"
						placeholder="Admin Name" autocomplete="off" required /></td>
				</tr>
				<tr height="40">
					<td><p style="font-size: larger">Address:</td>
					<td><input type="text" name="address" placeholder="Address" autocomplete="off" required/></td>
				</tr>
				<tr height="40">
					<td><p style="font-size: larger">Email Address:</td>
					<td><input type="email" name="emailaddress"
						placeholder="Email" autocomplete="off" required/></td>
				</tr>
				<tr height="40">
					<td><p style="font-size: larger">Contact No:</td>
					<td><input type="text" name="contactno"
						placeholder="Contact No" autocomplete="off" required/></td>
				</tr>
				<tr height="40">
					<td><p style="font-size: larger">
							UserName:<font color="red">* Enter the Admin Name</font></td>
					<td><input type="text" name="username"
						placeholder="Admin Name" autocomplete="off" required/></td>
				</tr>
				<tr height="40">
					<td><p style="font-size: larger">
							Password:<font color="red">* Enter the Admin NIC Number</font></td>
					<td><input type="password" name="password"
						placeholder="NIC Number" autocomplete="off" required/></td>
				</tr>
				<tr height="40">
					<td><p style="font-size: larger">Task:</td>
					<td><input list="status" name="task" placeholder="task"/></td>
					<datalist id="status"> <select required>
					<option>Admin Management</option>
					<option>Staff Member Management</option>
					<option>Housekeeping Management</option>
					<option>Inventory Management</option>
					<option>Room Details Management</option>
				</select> </datalist>
				</tr>
				<br>
				<table align="center">
					<tr>
						<td colspan="2"><input type="submit" value="Save Admin" /></td>
					</tr>
				</table>
			</table>
			  
		</center>
	</form>
	
	</div>
	     
	<br />  
	<a href="ListAdminServlet">view admins</a>
	<br><br><br>
<footer><div align="center" style ="background-color:#808080">All Rights Reserved@Hotel RoomPalace Pvt Ltd year 2018</footer>  

</body>
</html>