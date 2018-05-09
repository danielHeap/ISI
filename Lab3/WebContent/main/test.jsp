<%@ page language="java" contentType="text/html; charset=UFT-8" import="java.util.Date"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Aktualna data i czas</title>
</head>
<body>


    <% out.println(new Date()); %>

</body>
</html>



    <% String tmp = (String) request.getParameter("fname"); %>
    <% response.getWriter().append("Imię to "+tmp); %>