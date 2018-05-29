package controlador;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.*;

public class verGrupos extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
	
		int id = Integer.parseInt(request.getParameter("idGrupo"));
		GrupoModelo grupoModelo = new GrupoModelo();
		Grupo grupo = grupoModelo.selectPorid(id);
		request.setAttribute("grupo", grupo);
		RequestDispatcher rd = request.getRequestDispatcher("grupos/verGrupos.jsp");
		rd.forward(request, response);
	}

}

		