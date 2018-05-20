<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="modelo.*"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registro de Grupos</title>
</head>

<body>
<form action="../crearCuentaG" method="get">
<label for="nombre"><h2>Nombre</h2></label>
	<input type="text" name="nombre" placeholder="Nombre" value="asd"/>
	
<label for="telefono"><h2>Telefono</h2></label>
	<input type="text" name="telefono" placeholder="Telefono" value="45" />
	
<label for="integrantes"><h2>Integrantes</h2></label>
	<input type="text" name="integrantes" placeholder="Integrantes" value="1"/>

	<label for="email"><h2>Email</h2></label>
	<input type="text" name="email" placeholder="Email" value="asd@asd.com"/>

	<label for="contrasena"><h2>Contraseña</h2></label>
	<input type="password" name="contrasena" placeholder="Contraseña" value="a"/>
	<input type="submit" value="Registrate">
	</form>
	<a href="../Index.html">Volver a Inicio</a>
</body>
</html>