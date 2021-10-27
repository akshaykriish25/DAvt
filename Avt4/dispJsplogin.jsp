<%
String a=request.getParameter("name");
String b=request.getParameter("pwd");
String c=request.getParameter("sex");
String d=request.getParameter("age");
String e[]=request.getParameterValues("lang");
String f=request.getParameter("inst");
out.println("<p>Name: "+a + "<br>Password: "+b+ "<br>Gender: "+c+ "<br>Age: "+d);
for(int i=0;i<e.length;i++)
{
	out.println("<p>Languages: "+e[i]);
}
out.println("<br>Instruction:"+f);
%>