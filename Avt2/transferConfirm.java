package Avts2;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class transferConfirm extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String a1= request.getParameter("a1");
		String a2= request.getParameter("a2");
		String a3= request.getParameter("a3");
		String a4= request.getParameter("a4");
		String a5= request.getParameter("a5");
		String a6= request.getParameter("a6");
		String a7= request.getParameter("a7");
		HttpSession session= request.getSession();
		session.setAttribute("FromAccount", a1);
		session.setAttribute("ToAccount", a2);
		session.setAttribute("ToBank", a3);
		session.setAttribute("ToCustomer", a4);
		session.setAttribute("ToBankBranch", a5);
		session.setAttribute("Amount", a6);
		session.setAttribute("TransferDate", a7);
		ServletContext context= getServletContext();
		RequestDispatcher rd= context.
				getRequestDispatcher("/Disp_Data");
		rd.forward(request, response);

	}

}
