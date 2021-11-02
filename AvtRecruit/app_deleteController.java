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

public class app_deleteController extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		int a = Integer.parseInt(request.getParameter("n1"));
		Recruitment_Model obj = new Recruitment_Model();
	    obj.setId(a);
	    try {
	    	ResultSet rs;
	    	Connection con = dbconnection.dbConnect();
	    	Statement s = con.createStatement();
	    	PreparedStatement pst =  con.prepareStatement
	  				  ("delete from recruit where id=?");
	    	pst.setInt(1, obj.getId());
	    	int i= pst.executeUpdate();
	       	 if(i!=0)
	  		  {
	       		 pw.println("<form><input type=button value=Back! onclick=window.location='Recruitment_applicant.jsp'></form>");
	       		pw.println("<br><h1>Record has been "
		           		+ "Deleted!");
	       		}
	       	 else {
	       		pw.println("<form><input type=button value=Back! onclick=window.location='Recruitment_applicant.jsp'></form>");
	       		pw.println("<h1>Failed to delete the data");
	       	 }
	    }catch(Exception ex)
	       {
	       	ex.printStackTrace();
	       }
	}

}
