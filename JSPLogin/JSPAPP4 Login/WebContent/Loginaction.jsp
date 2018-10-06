<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<html>
<head>
<title>Insert title here</title>
</head>
<body>
<%!
String uname;
String pwd;
%>

<%
String uname=request.getParameter("uname");
String pwd=request.getParameter("pwd");
if (uname.equals("durga")&&pwd.equals("ratan"))
{
out.println("Login success");
}
else
{
out.println("Login Failed");	
}

%>

welcome User=<%=uname %>;

</body>
</html>