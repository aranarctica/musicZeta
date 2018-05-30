<%@ page language="java" contentType="text/html; charset=ISO-8859-1">
	pageEncoding="ISO-8859-1"%>
<%@ page import="modelo.*"%>
<%@ page import="java.util.ArrayList"%>
<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core"%>

<%
	
ArrayList<Promotor> promotores = (ArrayList<Promotor>) request.getAttribute("promotores");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Promotores</title>
</head>
<body>
	<%
	for (Promotor promotor : promotores) {
		out.print(promotor.getNombre()+"<br>"); 
		out.print(promotor.getTelefono());
	
	%>
	
	<div>
<a href="verPromotores?idPromotor= <%= promotor.getIdPromotor()%>">Ver informacion del Promotor
</a>
</div>
	<%} %>
	<h1>Lista de promotores en JSTL</h1>
	<hr><br>
	<C:forEach items="${promotores}" var="promotor">
	${promotor.nombre}<br>
	<div>
	<a href="grupos/anadirPromotor.html">Añadir
	</a></div>
	</C:forEach>
	<body>
	 <a href="Logout">Salir</a>
</body>
</html>