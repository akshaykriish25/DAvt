package Avts2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Disp_Data extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();
	     HttpSession session= request.getSession();
	     String a1= (String)session.getAttribute("FromAccount");
	     String a2= (String)session.getAttribute("ToAccount");
	     String a3= (String)session.getAttribute("ToBank");
	     String a4= (String)session.getAttribute("ToCustomer");
	     String a5= (String)session.getAttribute("ToBankBranch");
	     String a6= (String)session.getAttribute("Amount");
	     String a7= (String)session.getAttribute("TransferDate");
	     
	     out.println("<h1>From Account: "+a1);
	     out.println("<h1>To Account No: "+a2);
	     out.println("<h1>To Bank Name: "+a3);
	     out.println("<h1>To Customer Name: "+a4);
	     out.println("<h1>To Bank Branch Name: "+a5);
	     out.println("<h1>Amount: "+a6);
	     out.println("<h1>Transfer Date: "+a7);
	     
	     out.println("<form method=Post action=confirmTrans>");
	     out.println("<input type=button value=back onclick=\"history.back()\">");
	     out.println("<input type=submit value=Confirm>");
	}

}
