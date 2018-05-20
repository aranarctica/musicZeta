package controlador;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.*;


public class crearCuentaG  extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		GrupoModelo grupoModelo = new GrupoModelo();
		String email = request.getParameter("email");
		String contrasena = request.getParameter("contrasena");
		String nombre = request.getParameter("nombre");
		String telefono = request.getParameter("telefono");
		String integrantes = request.getParameter("integrantes");
		Grupo grupo = new Grupo();
		grupo.setNombre(nombre);
		grupo.setEmail(email);
		grupo.setTelefono(telefono);
		grupo.setContrasena(contrasena);
		grupo.setIntegrantes(integrantes);
		grupoModelo.insert(grupo);
		response.sendRedirect("Index.html");
	}
	

	
	
}
