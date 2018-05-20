<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="modelo.*"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.Iterator"%>
<%
	PromotorModelo promotorModelo = new PromotorModelo();
	ArrayList<Promotor> promotores = promotorModelo.selectAll();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Promotores</title>
</head>
<body>
	<%
		Iterator<Promotor> i = promotores.iterator();
		Promotor promotor;

		while (i.hasNext()) {
			promotor = i.next();
	%>
	<a href="infoPromotores.jsp?idPromotor=<%=promotor.getIdPromotor()%>">
	<div><%=promotor.getNombre()%></div>
	<div><%=promotor.getApellido()%></div>
	<%
		}
	%>
	<a href="Logout">Salir</a>
</body>
</html>