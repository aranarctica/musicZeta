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
		
		
		PromotorModelo promotorModelo = new PromotorModelo();
		Promotor promotor = new Promotor();
		
		promotor = promotorModelo.selectEmailContrasena(email, contrasena);
		
		if (email.equals(promotor.getEmail()) && (contrasena.equals(promotor.getContrasena()))) {

			HttpSession session = request.getSession();
			session.setAttribute("promotorLogin", promotor);
			
			response.sendRedirect("ListarPromotores");

		} else {
			RequestDispatcher rd = request.getRequestDispatcher("Index.html");
			rd.forward(request, response);
		}
	}

}
