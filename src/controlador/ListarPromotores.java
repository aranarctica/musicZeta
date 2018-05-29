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

import modelo.Promotor;
import modelo.PromotorModelo;


public class ListarPromotores extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	HttpSession session = request.getSession();
	Promotor promotorLogin = (Promotor) session.getAttribute("promotorLogin");
	if(promotorLogin != null){
		ArrayList<Promotor> promotores = new ArrayList<Promotor>();
		PromotorModelo promotorModelo = new PromotorModelo();
		promotores = promotorModelo.selectAll();
		request.setAttribute("promotores", promotores);
		RequestDispatcher rd = request.getRequestDispatcher("promotores/listaPromotores.jsp");
		rd.forward(request, response);
	}else{
		RequestDispatcher rd = request.getRequestDispatcher("Index.html");
		rd.forward(request, response);
	}
	}

	

}
