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
<h2 align="center" style="color:white"> RETAILER REPORT</h2></br>

<%@ page import="java.io.*" %>
<%@ page import="java.sql.*" %>

 <div align="center">
     <form method="post" style="color:white">
     <table border="2">
     <tr>
     	<td>Retailer Name</td>
     	<td>Retailer ID</td>
     	<td>Product ID</td>
     	<td>Pan No</td>
     	<td>Amount</td>
     	<td>date</td>
     </tr>
     
     <%
     	try
     	{
     		String SQL="select * from retailer";
     		Class.forName("com.mysql.jdbc.Driver");
     		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/dairy", "root","root");
     		Statement stmt=con.createStatement();
     		ResultSet rs=stmt.executeQuery(SQL);
     		while(rs.next())
     		{
     	%>
     		<tr>
     			<td><%= rs.getString(1) %></td>
     			<td><%= rs.getInt(2) %></td>
     			<td><%= rs.getInt(3) %></td>
     			<td><%= rs.getInt(4) %></td>
     			<td><%= rs.getInt(5) %></td>
     			<td><%= rs.getString(6) %></td>
     			
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
     <a href="retailer.jsp"><button>Back</button></a>
     
     </div>


</body>
</html>