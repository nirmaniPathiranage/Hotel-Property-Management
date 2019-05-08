<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
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
<script
	type="${pageContext.request.contextPath}/Property Management System/WebContent/js/script.js"></script>
</head>
<body>

<div class = "topnav" style="height:50px;">
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


	<center>
		<h2 style="width: 100%; background-color: black; color: white;">Registration
			to the Hotel Management System</h2>
	</center>
	<form style="text-align: left;" name="form" action="RegisterServlet"
		method="post" onSubmit="return formValidate();">
		<table border="0" cellpadding="3" style="width: 100%">
			<font color="red">* These fields are required</font>
			<tr height="40px">
				<br>
				<br>
			<thead>
				<tr>
					<th colspan="2"><font color="blue">Enter Login Details
							Here</font></th>
				</tr>
			</thead>
			<td><p style="font-size: larger">Set Username *</td>
			<td><input type="text" name="username"
				placeholder="set username" class="box" autocomplete="off" required/></td>
			</tr>
			<tr height="40px">
				<td><p style="font-size: larger">Set Password *</td>
				<td><input type="password" name="password"
					placeholder="set password" class="box" autocomplete="off" required/></td>
			</tr>
			<tr height="40px">
				<td><p style="font-size: larger">Confirm Password *</td>
				<td><input type="password" name="confirmpassword"
					placeholder="confirm password" class="box" autocomplete="off" required/></td>
			</tr>
			<thead>
				<tr>
					<th colspan="2"><font color="blue">Enter Personal
							Details Here</font></th>
				</tr>
			</thead>
			<tr height="40px">
				<td><p style="font-size: larger">Full Name *</td>
				<td><input list="status" name="fullname"
					placeholder="full name" class="box" /></td>
				<datalist id="status"> <select required>
					<option>Mr.</option>
					<option>Mrs.</option>
					<option>Ms.</option>
				</select> </datalist>
				</td>
			</tr>
			<tr height="40px">
				<td><p style="font-size: larger">NIC Number *</td>
				<td><input type="text" name="nicno" placeholder="xxxxxxxxxV"
					class="box" autocomplete="off" required/></td>
			</tr>
			<tr height="40px">
				<td><p style="font-size: larger">Email Address *</td>
				<td><input type="email" name="emailaddress"
					placeholder="email address" class="box" autocomplete="off" required/></td>
			</tr>
			<tr height="40px">
				<td><p style="font-size: larger">Street Address</td>
				<td><input type="text" name="streetaddress"
					placeholder="street address" class="box" autocomplete="off" required /></td>
			</tr>
			<tr height="40px">
				<td><p style="font-size: larger">Contact Number *</td>
				<td><input type="text" name="contactno"
					placeholder="contact number" class="box" autocomplete="off" required /></td>
			</tr>
			<tr height="40px">
				<td><p style="font-size: larger">Registered Date</td>
				<td><input type="date" name="regdate" placeholder="yyyy-MM-dd"
					class="box" autocomplete="off" required /></td>
			</tr>
			<tr>
				<td><%=(request.getAttribute("errMessage") == null) ? "" : request.getAttribute("errMessage")%></td>
			</tr>
			<tr height="40px">
				<td><input type="submit" value="Register"></input></td>
				<td><input type="reset" value="Reset"></input></td>
			</tr>
			<tr>
				<td colspan="2"><center>
						Already registered!! <a href="Login.jsp">Login Here</a>
					</center></td>
			</tr>
		</table>
	</form>
</body><br><br><br>
<footer><div align="center" style ="background-color:#808080">All Rights Reserved@Hotel RoomPalace Pvt Ltd year 2018</footer>
</html>