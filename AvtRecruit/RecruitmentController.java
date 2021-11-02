package ServletTest;

import java.sql.Statement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RecruitmentController extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		String a = request.getParameter("role");
	    String b = request.getParameter("skill");
	
	    Recruitment_Model obj = new Recruitment_Model();
	    obj.setRole(a);
	    obj.setSkill(b);
	    
	    try {
	    	 ResultSet rs;
	    	Connection con = dbconnection.dbConnect();
	    	Statement s = con.createStatement();
	    	PreparedStatement pst =  con.prepareStatement
	  				  ("select * from recruit where role=? and skill=?");
	    	pst.setString(1, obj.getRole());
        	pst.setString(2, obj.getSkill());
        	rs= pst.executeQuery();
        	/*if(rs.next()==false) {
        		pw.println("<form><input type=button value=Back! onclick=history.back()></form>");
        		pw.println("<h1>No records Found!");
        	}
        	else {*/
        	while(rs.next())           		
   		  {
        		 String a1= rs.getString("name");
        		 String b1= rs.getString("email");
        		 String c1= rs.getString("exp");
        		 pw.println("Name: "+a1+"<br>Email: "+b1+"<br>Experience: "+c1+"years<br><br>");
   		  }
        	 pw.println("<form><input type=button value=Back! onclick=history.back()></form>");
				/* } */
        	}catch(Exception e)
        {
        	e.printStackTrace();
        }
	}

}
