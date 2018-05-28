<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="modelo.*"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.Iterator"%>
<%
	
ArrayList<Promotor> promotores = (ArrayList<Promotor>) request.getAttribute("promotor");
	PromotorModelo promotorModelo = new PromotorModelo();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Promotores</title>
</head>
<body>
	<%
	for (Promotor promotor : promotorModelo.selectAll()) {
		out.print(promotor.getNombre()+"<br>"); 
		out.print(promotor.getTelefono());
	
	%>
	
	<div>
<a href="verPromotor.jsp?idPromotor= <%= promotor.getIdPromotor()%>">Ver informacion del Promotor
</a>
</div>
	<%} %>
	 <a href="Logout">Salir</a>
</body>
</html>