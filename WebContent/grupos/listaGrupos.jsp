<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="modelo.*"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.Iterator"%>

<%
	ArrayList<Grupo> grupos = (ArrayList<Grupo>) request.getAttribute("grupo");
	GrupoModelo grupoModelo = new GrupoModelo();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Grupos</title>
</head>
<body>
	<%
		for (Grupo grupo : grupoModelo.selectAll()) {
			out.print(grupo.getNombre()+" ");
			out.print(grupo.getTelefono()+"<br>"); 
			
	%>
	<body>
<div>
<a method="get" href="verGrupos"<%=grupo.getIdGrupo()%>>Ver informacion del grupo
</a>
</div>
	<%} %>
		 
  <a href="../Logout">Salir</a>
</body>
</html>