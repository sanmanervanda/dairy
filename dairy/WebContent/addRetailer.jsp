<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add retailer</title>
</head>
<body style="background-color:#3324D2">

<h1 align="center" style="color:white">DAIRY MANAGEMENT SYSTEM</h1>
<h2 align="center" style="color:white">ADD RETAILER</h2></br>

<center>
<form action="addRetailer" method="post">
</br>Retailer Name:<input type="text" name="Rname" required></br>
</br>Retailer ID:<input type="text" name="RID" required></br>
</br>Product ID:<input type="text" name="PID" required></br>
</br>Pan No:<input type="text" name="panNO" required></br>
</br>Amount:<input type="text" name="amt" required></br>
</br>Date:<input type="text" name="date" required></br>
</br><button>Submit</button>
</form>
</br></br>
<a href="retailer.jsp"><button>back</button></a>
</center>

</body>
</html>