		package br.ucsal.rpg.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.rpg.dao.UsuarioDao;
import br.ucsal.rpg.model.Usuario;

@WebServlet("/CadastroServlet")
public class CadastroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CadastroServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UsuarioDao dao = new UsuarioDao();
		Usuario usuario = new Usuario();
		usuario.setUsuario(request.getParameter("usuario"));
		usuario.setSenha(request.getParameter("senha"));
		usuario.setNome(request.getParameter("nome"));
		usuario.setEmail(request.getParameter("email"));
		usuario.setIdade(Integer.parseInt(request.getParameter("idade")));
		usuario.setSexo(request.getParameter("sexo"));
		dao.adiciona(usuario);	
		request.setAttribute("usuario", usuario);
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}
}
