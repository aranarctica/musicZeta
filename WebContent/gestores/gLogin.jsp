<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="modelo.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login de Grupos</title>
</head>
<body>
<%
String email = request.getParameter("email");
String contrasena = request.getParameter("contrasena");
GrupoModelo grupoModelo = new GrupoModelo();
Grupo grupo = grupoModelo.selectEmailContrasena(email, contrasena);
if (grupo != null && contrasena.equals(grupo.getContrasena())) {
	session.setAttribute("grupo", grupo);
	response.sendRedirect("../promotores/listaPromotores.jsp");
} else {
}

%>
<form action="#" method="post">
<input type="text" name="email"value="Email">
<input type="password" name="contrasena"value="Contraseña">
<input type="submit" value="Login!">
</form>
<a href="../Index.html">Volver a Inicio</a>
</body>
</html>