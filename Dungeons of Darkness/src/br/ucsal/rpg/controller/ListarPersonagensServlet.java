package br.ucsal.rpg.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.rpg.dao.PersonagemDao;
import br.ucsal.rpg.model.Personagem;

@WebServlet("/ListarPersonagensServlet")
public class ListarPersonagensServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ListarPersonagensServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Boolean lista = true;
		PersonagemDao dao = new PersonagemDao();  
		List<Personagem> personagens = dao.getLista();
		request.setAttribute("lista", lista);
		request.setAttribute("personagens", personagens); // ${personagens}
	    request.getRequestDispatcher("listadepersonagens.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Personagem> personagens = null;
		PersonagemDao dao = new PersonagemDao();
		personagens = dao.getLista();
		request.setAttribute("personagens", personagens);
		request.getRequestDispatcher("perfil.jsp").forward(request, response);
	}

}
