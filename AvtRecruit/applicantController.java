package ServletTest;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class applicantController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		String a = request.getParameter("n1");
	
	    Recruitment_Model obj = new Recruitment_Model();
	    obj.setName(a);
	    try {
	    	 ResultSet rs;
	    	Connection con = dbconnection.dbConnect();
	    	Statement s = con.createStatement();
	    	PreparedStatement pst =  con.prepareStatement
	  				  ("select * from recruit where name=?");
	    	pst.setString(1, obj.getName());
       	   rs= pst.executeQuery();
       	 if(rs.next())
  		  {
       		 String a1= rs.getString("name");
       		 String b1= rs.getString("email");
       		 String c1= rs.getString("exp");
       		String d1= rs.getString("role");
       		String e1= rs.getString("skill");
       		 pw.println("<form><input type=button value=Back! onclick=history.back()></form>");
       		 pw.println("Name: "+a1+"<br>Email: "+b1+"<br>Experience: "+c1+"years"+"<br>Role: "+d1+"<br>Skill: "+e1);
  		  }
       	 else {
       		 pw.println("<form><input type=button value=Back! onclick=history.back()></form>");
       		 pw.println("<h1><font color=red>No records found.</font>");
       	 }
	    }catch(Exception e)
       {
       	e.printStackTrace();
       }
	}

}
