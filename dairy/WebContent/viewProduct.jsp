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
<h2 align="center" style="color:white"> PRODUCT REPORT</h2></br>

<%@ page import="java.io.*" %>
<%@ page import="java.sql.*" %>

 <div align="center">
     <form method="post" style="color:white">
     <table border="2">
     <tr>
     	<td>Product ID</td>
     	<td>Product name</td>
     	<td>Fat</td>
     	<td>Buffalo</td>
     	<td>Cow</td>
     	<td>Quality</td>
     	<td>Validity</td>
     	<td>Manufactured Date</td>
     </tr>
     
     <%
     	try
     	{
     
     		Class.forName("com.mysql.jdbc.Driver");
     		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/dairy", "root","root");
     		CallableStatement stmt=con.prepareCall("call view_product");
     		ResultSet rs=stmt.executeQuery();
     		while(rs.next())
     		{
     	%>
     		<tr>
     			<td><%= rs.getInt(1) %></td>
     			<td><%= rs.getString(2) %></td>
     			<td><%= rs.getString(3) %></td>
     			<td><%= rs.getString(4) %></td>
     			<td><%= rs.getString(5) %></td>
     			<td><%= rs.getString(6) %></td>
     			<td><%= rs.getString(7) %></td>
     			<td><%= rs.getString(8) %></td>
     			     			
     		</tr>
     		<%} %>		
     </table>
     <%
     	rs.close();
     	stmt.close();
     	con.close();
     	}
     catch(Exception e){
    	 e.printStackTrace();
     }
     %>
     </form></br></br>
     <a href="product.jsp"><button>Back</button></a>
     
     </div>


</body>
</html>