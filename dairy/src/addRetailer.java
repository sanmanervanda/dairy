

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class addRetailer
 */
@WebServlet("/addRetailer")
public class addRetailer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		
		
		try{
			
				
			String Rname=request.getParameter("Rname");
			int RID=Integer.parseInt(request.getParameter("RID"));
			int PID=Integer.parseInt(request.getParameter("PID"));
			int panNo=Integer.parseInt(request.getParameter("panNO"));
			int amt=Integer.parseInt(request.getParameter("amt"));
			String date=request.getParameter("date");
			
			
			response.setContentType("text/html"); 
			
			Class.forName("com.mysql.jdbc.Driver");
		
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/dairy","root","root");
		
			String SQL="insert into retailer values(?,?,?,?,?,?);";
		
			PreparedStatement pstmt=con.prepareStatement(SQL);
		
			pstmt.setString(1,Rname);
			pstmt.setInt(2,RID);
			pstmt.setInt(3,PID);
			pstmt.setInt(4,panNo);
			pstmt.setInt(5, amt);
			pstmt.setString(6, date);
			
			pstmt.executeUpdate();
			
		response.sendRedirect("retailer.jsp");
	}
		catch(Exception e) {
			response.sendRedirect("addRetailer.jsp");
		}

}
}
