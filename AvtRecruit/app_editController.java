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

public class app_editController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		int a = Integer.parseInt(request.getParameter("a1"));
		String b = request.getParameter("b1");
		String c = request.getParameter("c1");
		String d = request.getParameter("d1");
		String e = request.getParameter("role");
		String f = request.getParameter("skill");
	
	    Recruitment_Model obj = new Recruitment_Model();
	    obj.setId(a);
	    obj.setName(b);
	    obj.setEmail(c);
	    obj.setExp(d);
	    obj.setRole(e);
	    obj.setSkill(f);
	    try {
	    	ResultSet rs;
	    	Connection con = dbconnection.dbConnect();
	    	Statement s = con.createStatement();
	    	PreparedStatement pst =  con.prepareStatement
	  				  ("update recruit set name=?, email=?, exp=?, role=?, skill=? where id= ?");
	    	
	    	pst.setString(1, obj.getName());
	    	pst.setString(2, obj.getEmail());
	    	pst.setString(3, obj.getExp());
	    	pst.setString(4, obj.getRole());
	    	pst.setString(5, obj.getSkill());
	    	pst.setInt(6, obj.getId());
       	   int i= pst.executeUpdate();
       	 if(i!=0)
  		  {
       		 pw.println("<form><input type=button value=Back! onclick=window.location='Recruitment_applicant.jsp'></form>");
       		pw.println("<br><h1>Record has been "
	           		+ "updated");
       		}
       	 else {
       		pw.println("<form><input type=button value=Back! onclick=window.location='Recruitment_applicant.jsp'></form>");
       		pw.println("<h1>Failed to update the data");
       	 }
	    }catch(Exception ex)
       {
       	ex.printStackTrace();
       }
	}

}
