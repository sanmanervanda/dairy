<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Seller</title>
</head>
<body style="background-color:#3324D2">

<h1 align="center" style="color:white">DAIRY MANAGEMENT SYSTEM</h1>
<h2 align="center" style="color:white"> NEW SELLER</h2></br>
<center>
<form action="addSeller" method="post">
<div style="color:white">
Seller ID:<input type="text" name="sellerID" required></br></br>
Seller Name:<input type="text" name="sellerName" required></br></br>
Address:<input type="text" name="address" required></br></br>
Ani_cattle:<input type="text" name="aniCattle" required></br></br>

<button>Submit</button>
</div>

</form>
</br></br>
<a href="seller.jsp"><button>back</button></a>
</center>
</body>
</html>