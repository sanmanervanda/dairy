

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class retailerLogin
 */
@WebServlet("/retailerLogin")
public class retailerLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			int retailerLogin=Integer.parseInt(request.getParameter("retailerLogin"));
			String password=request.getParameter("password");
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/dairy","root","root");
			
			Statement stmt=con.createStatement();
			
			ResultSet rs=stmt.executeQuery("select * from login where loginID="+retailerLogin+" and loginPassword='"+password+"' having role='retailer'");
			
			if(rs.next()) {
				HttpSession session=request.getSession();
				session.setAttribute("retailerID", retailerLogin);
				response.sendRedirect("retailerHome.jsp");
			}
			else {
				response.sendRedirect("retailerLogin.jsp");
			}
				
		}
		catch(Exception e) {
			response.sendRedirect("retailerLogin.jsp");
		}
		
		
	}

}
