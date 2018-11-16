

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class adminLogin
 */
@WebServlet("/adminLogin")
public class adminLogin extends HttpServlet {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
try 	{
			
		response.setContentType("text/html");
			int LoginID=Integer.parseInt(request.getParameter("LoginID"));
			String password=request.getParameter("password");
		
			
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/dairy", "root","root");

			Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery("select * from login where loginID="+LoginID+" and loginPassword='"+password+"' having role='admin'");
			if(rs.next()) {
				response.sendRedirect("adminHome.jsp");
			}
			else {
				
				response.sendRedirect("adminLogin.jsp");
			}
			con.close();
		} catch (Exception e) {
			
			response.sendRedirect("adminLogin.jsp");
		}
	}

}
