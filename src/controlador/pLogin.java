package controlador;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelo.*;

public class pLogin extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("email");
		String contrasena = request.getParameter("contrasena");
		
		Promotor promotor = new Promotor();
		PromotorModelo promotorModelo = new PromotorModelo();
		
		promotor = promotorModelo.selectEmailContrasena(email, contrasena);
		
		if (promotor.getEmail().equals(email) && (promotor.getContrasena().equals(contrasena))) {

			HttpSession session = request.getSession();
			session.setAttribute("promotor", promotor);
			
			response.sendRedirect("ListaPromotores");

		} else {
			RequestDispatcher rd = request.getRequestDispatcher("Index.html");
			rd.forward(request, response);
		}
	}

}
