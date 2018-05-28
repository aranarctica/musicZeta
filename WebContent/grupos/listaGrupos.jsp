<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="modelo.*"%>
<%@ page import="java.util.ArrayList"%>

<%
	ArrayList<Grupo> grupos = (ArrayList<Grupo>) request.getAttribute("grupos");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Grupos</title>
</head>
<body>
	<%
		
		
		for (Grupo grupo : grupos) {
			out.print(grupo.getNombre()+" ");
			
			
	%>
	<body>
<div>
<a href="../verGrupos?idGrupo= <%= grupo.getIdGrupo()%>">Ver informacion del grupo
</a>
</div>
	<%} %>
		 
  <a href="../Logout">Salir</a>
</body>
</html>