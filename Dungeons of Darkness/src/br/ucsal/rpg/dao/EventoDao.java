package br.ucsal.rpg.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.ucsal.rpg.model.Evento;
import br.ucsal.rpg.util.ConnectionFactory;

/*
	private Integer id;
	private String nome;
	private NPC npc; 
*/

public class EventoDao {

	private Connection connection;

	public EventoDao() {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void adiciona(Evento evento) {
		String sql = "insert into Evento " + "(nome, id_npc)" + " values (?,?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, evento.getNome());
			stmt.setInt(2, evento.getNpc().getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public List<Evento> getLista() {
		try {
			List<Evento> lista_status = new ArrayList<Evento>();
			String sql = "select * from Evento";
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Evento evento = new Evento();
				evento.setId(rs.getInt("id"));
				evento.setNome(rs.getString("nome"));
				evento.setNpcId(rs.getInt("id_npc"));
				lista_status.add(evento);
			}
			rs.close();
			stmt.close();
			return lista_status;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void altera(Evento evento) {
		String sql = "  update Evento set nome=?, id_npc=?, where id=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, evento.getNome());
			stmt.setInt(2, evento.getNpc().getId());
			stmt.setInt(3, evento.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void remove(Evento evento) {
		try {
			PreparedStatement stmt = connection.prepareStatement("delete from Evento where id=?");
			stmt.setLong(1, evento.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
		  throw new RuntimeException(e);
		}
	}	
}
