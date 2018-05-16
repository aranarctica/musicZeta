<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="modelo.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login de Promotores</title>
</head>
<body>
<%
String email = request.getParameter("email");
String contrasena = request.getParameter("contrasena");
PromotorModelo promotorModelo = new PromotorModelo();
Promotor promotor = promotorModelo.selectEmailContrasena(email, contrasena);
if (promotor != null && contrasena.equals(promotor.getContrasena())) {
	session.setAttribute("promotor", promotor);
	response.sendRedirect("../grupos/listaGrupos.jsp");
} else {
}

%>
<form action="#" method="post">
<input type="text" name="email" placeholder="email" value="Email">
<input type="password" name="contrasena" placeholder="contrasena" value="Contraseña">
<input type="submit" value="Login!">
</form>
<a href="../Index.html">Volver a Inicio</a>
</body>
</html>