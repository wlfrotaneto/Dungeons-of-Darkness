package br.ucsal.rpg.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.ucsal.rpg.model.Usuario;
import br.ucsal.rpg.util.ConnectionFactory;

/*
	private Integer id;
	private String usuario;
	private String senha;
	private String nome;
	private Integer idade;
	private String email;
	private Character sexo;
	private List<Personagem> personagens;
*/

/* 
	CREATE TABLE USUARIO (ID BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY, 
						USUARIO VARCHAR(50), 
						SENHA VARCHAR(50), 
						NOME VARCHAR(50), 
						IDADE INT, 
						EMAIL VARCHAR(50));
*/

public class UsuarioDao {

	private Connection connection;

	public UsuarioDao() {
		this.connection = new ConnectionFactory().getConnection();
	}

	public void adiciona(Usuario usuario) {
		String sql = "insert into usuario " + "(usuario, senha, nome, idade, email, sexo)" + " values (?,?,?,?,?,?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, usuario.getUsuario());
			stmt.setString(2, usuario.getSenha());
			stmt.setString(3, usuario.getNome());
			stmt.setInt(4, usuario.getIdade());
			stmt.setString(5, usuario.getEmail());
			stmt.setString(6, usuario.getSexo());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public List<Usuario> getLista() {
		try {
			List<Usuario> usuarios = new ArrayList<Usuario>();
			String sql = "select * from usuario";
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Usuario usuario = new Usuario();
				usuario.setId(rs.getInt("id"));
				usuario.setUsuario(rs.getString("usuario"));
				usuario.setSenha(rs.getString("senha"));
				usuario.setNome(rs.getString("nome"));
				usuario.setIdade(rs.getInt("idade"));
				usuario.setEmail(rs.getString("email"));
				usuario.setSexo(rs.getString("sexo"));
				usuarios.add(usuario);
			}
			rs.close();
			stmt.close();
			return usuarios;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void altera(Usuario usuario) {
		String sql = "update usuario set usuario=?, senha=?, nome=?, idade=?, email=?, sexo=?, where id=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, usuario.getUsuario());
			stmt.setString(2, usuario.getSenha());
			stmt.setString(3, usuario.getNome());
			stmt.setInt(4, usuario.getIdade());
			stmt.setString(5, usuario.getEmail());
			stmt.setString(6, usuario.getSexo());
			stmt.setInt(7, usuario.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void remove(Usuario usuario) {
		try {
			PreparedStatement stmt = connection.prepareStatement("delete from usuario where id=?");
			stmt.setLong(1, usuario.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
		  throw new RuntimeException(e);
		}
	}	
	
}
