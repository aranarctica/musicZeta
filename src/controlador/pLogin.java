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
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("email");
		String contrasena = request.getParameter("contrasena");
		if (email.equals("zubiri") && (contrasena.equals("kaixo"))) {
			Promotor promotorLogin = new Promotor();
			promotorLogin.getEmail();
			HttpSession session = request.getSession();
			session.setAttribute("promotorLogin", promotorLogin);
			response.sendRedirect("/grupos/listaPromotores.jsp");

		} else {
			RequestDispatcher rd = request.getRequestDispatcher("Index.html");
			rd.forward(request, response);
		}
	}

}
