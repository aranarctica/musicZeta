package controlador;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelo.*;

public class ListarGrupos extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		Grupo grupoLogin = (Grupo) session.getAttribute("grupoLogin");
		
		if (grupoLogin != null) {
			ArrayList<Grupo> grupos = new ArrayList<Grupo>();

			
			request.setAttribute("grupos", grupos);
			RequestDispatcher rd = request.getRequestDispatcher("listaGrupos.jsp");
			rd.forward(request, response);

		} else {
			RequestDispatcher rd = request.getRequestDispatcher("Index.html");
			rd.forward(request, response);
		}
	}

}
