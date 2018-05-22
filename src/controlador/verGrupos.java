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
		int idGrupo = Integer.parseInt(request.getParameter("idGrupo"));
		ArrayList<Grupo> grupos = new ArrayList<Grupo>();
		GrupoModelo grupoModelo = new GrupoModelo();
		Grupo grupo = grupoModelo.selectPorid(idGrupo);
		grupo.getNombre();
		grupo.getTelefono();
		grupo.getEmail();
		grupo.getIntegrantes();
		request.setAttribute("grupos", grupo);
		RequestDispatcher rd = request.getRequestDispatcher("verGrupos.jsp");
		rd.forward(request, response);
	}

}
