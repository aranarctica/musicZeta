package controlador;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Grupo;
import modelo.GrupoModelo;
import modelo.Promotor;
import modelo.PromotorModelo;

/**
 * Servlet implementation class verPromotores
 */

public class verPromotores extends HttpServlet {
	
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("idPromotor"));
		PromotorModelo promotorModelo = new PromotorModelo();
		Promotor promotor = promotorModelo.selectPorid(id);
		request.setAttribute("promotor", promotor);
		RequestDispatcher rd = request.getRequestDispatcher("promotores/verPromotor.jsp");
		rd.forward(request, response);
	}

	

}
