<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="modelo.*"%>

<%
	int idGrupo = Integer.parseInt(request.getParameter("idGrupo"));
	GrupoModelo grupoModelo = new GrupoModelo();

	Grupo grupo = grupoModelo.selectPorid(idGrupo);

	ArrayList<Grupo> grupos = (ArrayList<Grupo>) request.getAttribute("grupo");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<%
		
			out.print(grupo.getNombre() + " ");
			out.print(grupo.getTelefono() + "<br>");
		
	%>



</body>
</html>