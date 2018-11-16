

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class addRetailer
 */
@WebServlet("/addProduct")
public class  addProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		
		
		try{
			
				
			int pdtID=Integer.parseInt(request.getParameter("pdtID"));
			String pdtName=request.getParameter("pdtName");
			String fat=request.getParameter("fat");
			String Buffalo=request.getParameter("Buffalo");
			String Cow=request.getParameter("Cow");
			String Quantity=request.getParameter("Quantity");
			String Validity=request.getParameter("Validity");
			String mDate=request.getParameter("mDate");
			
			response.setContentType("text/html"); 
			
			Class.forName("com.mysql.jdbc.Driver");
		
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/dairy","root","root");
			 	
		
			PreparedStatement pstmt=con.prepareStatement("insert into product values(?,?,?,?,?,?,?,?)");
		
			pstmt.setInt(1,pdtID);
			pstmt.setString(2,pdtName);
			pstmt.setString(3,fat);
			pstmt.setString(4,Buffalo);
			pstmt.setString(5,Cow);
			pstmt.setString(6,Quantity);
			pstmt.setString(7,Validity);
			pstmt.setString(8, mDate);
			
			pstmt.executeUpdate();
		
	
		
		response.sendRedirect("product.jsp");
	}
		catch(SQLException | ClassNotFoundException e) {
			response.sendRedirect("addProduct.jsp");
		}

}
}
