package controlador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelo.*;

public class gLogin extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// recibe parametros
		String email = request.getParameter("email");
		String contrasena = request.getParameter("contrasena");

		GrupoModelo grupoModelo = new GrupoModelo();
		Grupo grupo = new Grupo();

		grupo = grupoModelo.selectEmailContrasena(email, contrasena);

		// comprobar si coinciden
		if (email.equals(grupo.getEmail())  && (contrasena.equals(grupo.getContrasena()))) {

			// iniciar sesion
			HttpSession session = request.getSession();
			session.setAttribute("grupoLogin", grupo);
			// enviar a la pagina
			response.sendRedirect("ListarGrupos");
			// si no coincide
		} else {

			RequestDispatcher rd = request.getRequestDispatcher("Index.html");
			rd.forward(request, response);
		}

	}

}
