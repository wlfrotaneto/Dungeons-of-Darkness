package br.ucsal.rpg.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.ucsal.rpg.model.Classe;
import br.ucsal.rpg.model.Historia;
import br.ucsal.rpg.model.Item;
import br.ucsal.rpg.model.Personagem;
import br.ucsal.rpg.model.Status;
import br.ucsal.rpg.model.Usuario;
import br.ucsal.rpg.util.ConnectionFactory;

public class PersonagemDao {

	private Connection connection;

	public PersonagemDao() {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void adiciona(Personagem personagem) {
		String sql = "insert into personagem " + "(nome, id_classe, id_itens, id_status, id_historia, id_usuario)" + " values (?,?,?,?,?,?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, personagem.getNome());
			stmt.setInt(2, personagem.getClasse().getId());
			stmt.setInt(3, personagem.getItens().get(0).getId());
			stmt.setInt(4, personagem.getStatus().getId());
			stmt.setInt(5, personagem.getHistoria().getId());
			stmt.setInt(6, personagem.getUsuario().getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public List<Personagem> getLista() {
		try {
			List<Personagem> personagens = new ArrayList<Personagem>();
			String sql = "select * from personagem join usuario on personagem.id_usuario = usuario.id";
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Personagem personagem = new Personagem();
				personagem.setId(rs.getInt("id"));
				personagem.setNome(rs.getString("nome"));
				Classe c = new Classe();
				c.setId(rs.getInt("id_classe"));
				personagem.setClasse(c);
				Item i = new Item();
				i.setId(rs.getInt("id_itens"));
				List<Item> listaItens = new ArrayList<>();
				listaItens.add(i);
				personagem.setItens(listaItens);
				//personagem.setItemId(rs.getInt("id_itens"));
				Status s = new Status();
				s.setId(rs.getInt("id_status"));
				personagem.setStatus(s);
				Historia h = new Historia();
				h.setId(rs.getInt("id_historia"));
				personagem.setHistoria(h);
				Usuario u = new Usuario();
				u.setId(rs.getInt("id_usuario"));
				personagem.setUsuario(u);
				personagens.add(personagem);
			}
			rs.close();
			stmt.close();
			return personagens;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void altera(Personagem personagem) {
		String sql = "update personagem set nome=?, id_classe=?, id_itens=?, id_status=?, id_historia=?, id_usuario=?, where id=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, personagem.getNome());
			stmt.setInt(2, personagem.getClasse().getId());
			stmt.setInt(3, personagem.getItens().get(0).getId());
			stmt.setInt(4, personagem.getStatus().getId());
			stmt.setInt(5, personagem.getHistoria().getId());
			stmt.setInt(6, personagem.getUsuario().getId());
			stmt.setInt(7, personagem.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void remove(Personagem personagem) {
		try {
			PreparedStatement stmt = connection.prepareStatement("delete from personagem where id=?");
			stmt.setLong(1, personagem.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
		  throw new RuntimeException(e);
		}
	}
	
}
