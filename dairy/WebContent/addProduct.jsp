<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Product</title>
</head>
<body style="background-color:#3324D2">

<h1 align="center" style="color:white">DAIRY MANAGEMENT SYSTEM</h1>
<h2 align="center" style="color:white"> NEW PRODUCT</h2></br>
<center>
<form action="addProduct" method="get">
<div style="color:white">
Product ID:<input type="text" name="pdtID" required></br></br>
Product Name:<input type="text" name="pdtName" requi\red></br></br>
Fat:<input type="text" name="fat" required></br></br>
Buffalo:<input type="text" name="Buffalo" required></br></br>
Cow:<input type="text" name="Cow" required></br></br>
Quantity:<input type="text" name="Quantity" required></br></br>
Validity:<input type="text" name="Validity" required></br></br>
Manufacture Date:<input type="text" name="mDate" required></br></br>

<button>Submit</button>
</div>
</form>
</center></br></br>
<center><a href="product.jsp"><button>back</button></a></center>
</body>
</html>