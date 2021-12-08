<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.coforge.training.hibernateweb.UserDAO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Hibernate Demo</title>
</head>
<body>

<jsp:useBean id="userBean" class="com.coforge.training.hibernateweb.User">
</jsp:useBean>
<jsp:setProperty property="*" name="userBean"/>

<% 
int i= UserDAO.userRegister(userBean);
if(i>0)
out.print("user Successfully Regidtered");
%>
</body>
</html>