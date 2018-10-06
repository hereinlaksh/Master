<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*"%>

<html>
<head>
<title>Insert title here</title>
</head>
<body>
Hi This is JSP file content<br>
<%="Today Date="+new Date()%><br>
<%="The param value="+request.getParameter("a") %>

</body>
</html>