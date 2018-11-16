

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
 * Servlet implementation class addSeller
 */
@WebServlet("/addSeller")
public class addSeller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		try {
			int sid=Integer.parseInt(request.getParameter("sellerID"));
			String sellerName=request.getParameter("sellerName");
			String address=request.getParameter("address");
			String aniCattle=request.getParameter("aniCattle");
			
			response.setContentType("text/html");
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/dairy","root","root");
			
			String SQL="insert into seller values(?,?,?,?)";
			
			PreparedStatement pstmt=con.prepareStatement(SQL);
			
			pstmt.setInt(1, sid);
			pstmt.setString(2, sellerName);
			pstmt.setString(3, address);
			pstmt.setString(4, aniCattle);
			
			pstmt.executeUpdate();
			
			response.sendRedirect("seller.jsp");
			
		}
		catch(Exception e) {
			response.sendRedirect("addSeller.jsp");
		}
	}

}
