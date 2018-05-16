<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="modelo.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registro de Promotores</title>
</head>
<%
	PromotorModelo promotorModelo = new PromotorModelo();
	String email = request.getParameter("email");
	String contrasena = request.getParameter("contrasena");
	String nombre = request.getParameter("nombre");
	String telefono = request.getParameter("telefono");
	String apellido = request.getParameter("apellido");
	String dni = request.getParameter("dni");
	Promotor promotor = new Promotor();
	promotor.setNombre(nombre);
	promotor.setEmail(email);
	promotor.setTelefono(telefono);
	promotor.setContrasena(contrasena);
	promotor.setDni(dni);
	promotorModelo.insert(promotor);
	
%>
<body>
<form action="#" method="post">
<label for="nombre"><h2>Nombre</h2></label>
	<input type="text" name="nombre" placeholder="Nombre" />
	
	<label for="apellido"><h2>Apellido</h2></label>
	<input type="text" name="apellido" placeholder="Apellido" />
	
	<label for="telefono"><h2>Telefono</h2></label>
	<input type="text" name="telefono" placeholder="Telefono" />
	
	<label for="dni"><h2>Dni</h2></label>
	<input type="text" name="dni" placeholder="Dni" />
	
	<label for="email"><h2>Email</h2></label>
	<input type="text" name="email" placeholder="Email" />

	<label for="contrasena"><h2>Contraseña</h2></label>
	<input type="password" name="contrasena" placeholder="Contraseña" />
	<input type="submit" value="Registrate">
	</form>
	<a href="../Index.html">Volver a Inicio</a>
</body>
</html>