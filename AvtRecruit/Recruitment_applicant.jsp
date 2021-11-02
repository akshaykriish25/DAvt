<body >
<input type="button" value="<-Back" onclick="window.location='recruitment_RequestView.jsp'" >
<input type="button" value="Add" onclick="window.location='app_add.jsp'" >
<input type="button" value="Edit" onclick="window.location='app_edit.jsp'" >
<input type="button" value="Delete" onclick="window.location='app_delete.jsp'" >
<h1>
<form name="form2" action="applicantController" method="post" 
>
Name:<input type="text" name="n1"><br><p>
<input type="submit" value="Search">
<input type="reset" value="Clear">
</form>

<%@page import="java.sql.*,ServletTest.dbconnection,
ServletTest.Recruitment_Model" %>
<%
try
{
 Connection con=dbconnection.dbConnect();
  Statement s = con.createStatement();
  ResultSet rs=s.executeQuery("select * from recruit");
  Recruitment_Model obj=new Recruitment_Model();
  out.println("<table border=6"
	  		+ "align=center bordercolor=red>"
	  		+ "<tr><th>Id</th><th>Name</th>"
	  		+ "<th>Email</th><th>Experience</th><th>Role</th><th>Skill</th></tr>");
	
				while(rs.next())
  	 	    {
					obj.setId(rs.getInt(1));
    	 	    	obj.setName(rs.getString(2));
					obj.setEmail(rs.getString(3));
					obj.setExp(rs.getString(4));
					obj.setRole(rs.getString(5));
					obj.setSkill(rs.getString(6));
					 out.println("<tr>");
			 	 	    out.println("<td>"+obj.getId());
			 	 	    out.println("<td>"+obj.getName());
			 	 	    out.println("<td>"+obj.getEmail());
			 	 	    out.println("<td>"+obj.getExp()); 
			 	 	  out.println("<td>"+obj.getRole());
			 	 	 out.println("<td>"+obj.getSkill());
			 	 	    out.println("</tr>"); 	 	
			 	 	    }
			 		  out.println("</table>");
			 	 	    rs.close();
			 	 	    s.close();
			 	 	    con.close(); 	
					
	
  	 	    }

catch(Exception e)
{
	  e.printStackTrace();

}
%>
</h1>
</body>