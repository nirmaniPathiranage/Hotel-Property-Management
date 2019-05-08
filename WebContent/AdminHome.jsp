<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Home Page</title>
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
	
	background:url('bg2.jpg'); 
	background-size: cover;
}

td{
	width:60%;	
	height:60px;
}


</style>
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
	<div style="text-align: right">
		<a href="LogoutServlet">Logout</a>
	</div>
	<br><br><br>
	<div>
	<center>
		<h2>
			<font style="color: blue">Login Successful !!!</font>
		</h2>
	</center>
	</div>
	<center>
		<h4>
			Welcome
			<%=session.getAttribute("userName")%>
		</h4>
	</center>
	<br><br><br><br><br><br>
<img src = "95188-200.png" height = "300px" width = "300px">
<a href = "index.jsp">Admin Management</a>
<img src = "ima.png" height = "300px" width = "300px">
<a href = "houseKeepMain.jsp">Housekeeping Management</a>
<img src = "warehouse-inventory-icon-6.png" height = "300px" width = "300px">
<a href = "welcomeInventory.jsp">Inventory Control</a>
<img src = "guide-hotel-room-management-access.jpg" height = "300px" width = "300px">
<a href = "room.jsp">Room Management</a>

<br><br><br><br><br><br>
	<br><br><br>
<footer><div align="center" style ="background-color:#808080">All Rights Reserved@Hotel RoomPalace Pvt Ltd year 2018</footer>

</body>
</html>