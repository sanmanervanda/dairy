<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:#3324D2">

<h1 align="center" style="color:white">DAIRY MANAGEMENT SYSTEM</h1>
<h2 align="center" style="color:white">SELL TO CUSTOMER</h2>



<div align="center">

<form action="sellCustomer" method="post">
CustomerID:<input type="text" name="customerID"></br></br>
Customer Name:<input type="text" name="customerName"></br></br>
Phone No:<input type="text" name="phno"></br></br>
Address:<input type="text" name="Address"></br></br>
Product ID:<input type="text" name="pid"></br></br>
Amount:<input type="text" name="amt"></br></br>
<button>Submit</button>
 </form>
 </br</br></br>
 <a href="retailerHome.jsp"><button>back</button></a>
</div>



</body>
</html>