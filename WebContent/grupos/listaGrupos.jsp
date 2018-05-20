<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="modelo.*"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.Iterator"%>

<%
	GrupoModelo grupoModelo = new GrupoModelo();
	ArrayList<Grupo> grupos = grupoModelo.selectAll();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Grupos</title>
</head>
<body>
	<%
		Iterator<Grupo> i = grupos.iterator();
		Grupo grupo;
		while (i.hasNext()) {
			grupo = i.next();
	%>
	<a href="infoGrupos.jsp?idGrupo=<%=grupo.getIdGrupo()%>">
	<div><%=grupo.getNombre()%></div>
	<div><%=grupo.getTelefono()%></div>
	<%
		}
	%>
	
	<a href="Logout">Salir</a>
</body>
</html>