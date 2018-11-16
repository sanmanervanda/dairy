

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
/**
 * Servlet implementation class sellCustomer
 */
@WebServlet("/sellCustomer")
public class sellCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		try{
			int customerID=Integer.parseInt(request.getParameter("customerID"));
		String customerName=request.getParameter("customerName");
		String phno=request.getParameter("phno");
		String Address=request.getParameter("Address");
		int pid=Integer.parseInt(request.getParameter("pid"));
		int amt=Integer.parseInt(request.getParameter("amt"));
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/dairy","root","root");
		
		String sql="insert into sell values(?,?,?,?,?,?);";
		PreparedStatement pstmt=con.prepareStatement(sql);
		
		pstmt.setInt(1, customerID);
		pstmt.setString(2, customerName);
		pstmt.setString(3, phno);
		pstmt.setString(4, Address);
		pstmt.setInt(5, pid);
		pstmt.setInt(6, amt);
		
		pstmt.executeUpdate();
		
		response.sendRedirect("retailerHome.jsp");
		}
		catch(Exception e) {
			response.sendRedirect("sellRetailerProduct.jsp");
		}
		
	}

}
