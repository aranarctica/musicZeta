package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.*;

public class AnadirGrupo extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		GrupoModelo grupoModelo = new GrupoModelo();
		String nombre = request.getParameter("nombre");
		String telefono = request.getParameter("telefono");
		String integrantes = request.getParameter("integrantes");
		String email = request.getParameter("email");

		Grupo grupo = new Grupo();
		grupo.setNombre(nombre);
		grupo.setTelefono(telefono);
		grupo.setIntegrantes(integrantes);
		grupo.setEmail(email);
		grupoModelo.anadir(grupo);
		response.sendRedirect("ListarGrupos");

	}
}