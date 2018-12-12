package br.ucsal.rpg.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.ucsal.rpg.dao.ClasseDao;
import br.ucsal.rpg.dao.HistoriaDao;
import br.ucsal.rpg.dao.ItemDao;
import br.ucsal.rpg.dao.PersonagemDao;
import br.ucsal.rpg.dao.StatusDao;
import br.ucsal.rpg.dao.UsuarioDao;
import br.ucsal.rpg.model.Item;
import br.ucsal.rpg.model.Personagem;
import br.ucsal.rpg.model.Usuario;

@WebServlet("/CriarPersonagemServlet")
public class CriarPersonagemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CriarPersonagemServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Integer idUsuario = null;
		Personagem personagem = new Personagem();
		List<Item> itens = new ArrayList<Item>();
		PersonagemDao personagemDao = new PersonagemDao();
		ClasseDao classeDao = new ClasseDao();
		ItemDao itemDao = new ItemDao();
		StatusDao statusDao = new StatusDao();
		HistoriaDao historiaDao = new HistoriaDao();
		UsuarioDao usuarioDao = new UsuarioDao();
		List<Usuario> lista = usuarioDao.getLista();
		itens.add(0, itemDao.getLista().get(Integer.parseInt(request.getParameter("classe"))));
		personagem.setNome(request.getParameter("nome"));
		personagem.setClasse(classeDao.getLista().get(Integer.parseInt(request.getParameter("classe")) - 1));
		personagem.setClasseId(Integer.parseInt(request.getParameter("classe")));
		personagem.setItens(itens);
		personagem.setItemId(Integer.parseInt(request.getParameter("classe")));
		personagem.setStatus(statusDao.getLista().get(0));
		personagem.setHistoria(historiaDao.getLista().get(0));
		personagem.setUsuario(lista.get(0));
		for(int x=0; x < lista.size(); x++) {
			if(lista.get(x).getId().equals((Integer)session.getAttribute("id"))) {
				idUsuario = x;
				personagem.setUsuario(lista.get(idUsuario));
				personagem.getUsuario().setId((Integer)session.getAttribute("id"));
			}
		}	
		personagemDao.adiciona(personagem);
		request.setAttribute("personagem", personagem);
		request.getRequestDispatcher("perfil.jsp").forward(request, response);
	}

}
