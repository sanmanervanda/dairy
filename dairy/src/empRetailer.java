

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class empRetailer
 */
@WebServlet("/empRetailer")
public class empRetailer extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			response.setContentType("text/html");
		int loginID=Integer.parseInt(request.getParameter("LoginID"));
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/dairy","root","root");
		PreparedStatement pstmt=con.prepareStatement("insert into login values(?,?,?,?)");
		
		pstmt.setInt(1, loginID);
		pstmt.setString(2, name);
		pstmt.setString(3, password);
		pstmt.setString(4,"retailer");
		pstmt.executeUpdate();
		
		response.sendRedirect("adminHome.jsp");
		}
		catch(Exception e) {
			response.sendRedirect("regRetailer.jsp");
		}
		
	}

}
