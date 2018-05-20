package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.*;



public class crearCuentaP extends HttpServlet {
       
   

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PromotorModelo promotorModelo = new PromotorModelo();
		String email = request.getParameter("email");
		String contrasena = request.getParameter("contrasena");
		String nombre = request.getParameter("nombre");
		String telefono = request.getParameter("telefono");
		String apellido = request.getParameter("apellido");
		String dni = request.getParameter("dni");
		Promotor promotor = new Promotor();
		promotor.setNombre(nombre);
		promotor.setApellido(apellido);
		promotor.setEmail(email);
		promotor.setTelefono(telefono);
		promotor.setContrasena(contrasena);
		promotor.setDni(dni);
		promotorModelo.insert(promotor);
		response.sendRedirect("Index.html");

	}

	

}
