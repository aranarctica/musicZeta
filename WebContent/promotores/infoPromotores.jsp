<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="modelo.*"%>
<%
	int idPromotor = Integer.parseInt(request.getParameter("idPromotor"));
	PromotorModelo promotorModelo = new PromotorModelo();
	Promotor promotor = promotorModelo.selectPorid(idPromotor);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Informacion del Promotor</title>
</head>
<body>
	<div><%=promotor.getNombre()%></div>
	<div><%=promotor.getApellido()%></div>
	<a href="Logout">Salir</a>
</body>
</html>