<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="modelo.*"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.Iterator"%>    
    
    
    <%
	int idPromotor = Integer.parseInt(request.getParameter("idPromotor"));
	PromotorModelo promotorModelo = new PromotorModelo();
	Promotor promotor = promotorModelo.selectPorid(idPromotor);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% out.print(promotor.getNombre()); %>
<% out.print(promotor.getApellido()); %>




</body>
</html>