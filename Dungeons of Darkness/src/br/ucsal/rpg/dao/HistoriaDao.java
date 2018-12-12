package br.ucsal.rpg.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.ucsal.rpg.model.Evento;
import br.ucsal.rpg.model.Historia;
import br.ucsal.rpg.util.ConnectionFactory;

/*
	private Integer id;
	private String texto;
	private Evento evento;
*/

public class HistoriaDao {

	private Connection connection;

	public HistoriaDao() {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void adiciona(Historia historia) {
		String sql = "insert into Historia " + "(texto, id_evento)" + " values (?,?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, historia.getTexto());
			stmt.setInt(2, historia.getEvento().getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public List<Historia> getLista() {
		try {
			List<Historia> lista_status = new ArrayList<Historia>();
			String sql = "select * from Historia";
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Historia historia = new Historia();
				Evento e = new Evento();
				e.setId(rs.getInt("id_evento"));
				historia.setEvento(e);
				historia.setId(rs.getInt("id"));
				historia.setTexto(rs.getString("texto"));
				lista_status.add(historia);
			}
			rs.close();
			stmt.close();
			return lista_status;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void altera(Historia historia) {
		String sql = "  update Historia set texto=?, id_evento=?, where id=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, historia.getTexto());
			stmt.setInt(2, historia.getEvento().getId());
			stmt.setInt(3, historia.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void remove(Historia historia) {
		try {
			PreparedStatement stmt = connection.prepareStatement("delete from Historia where id=?");
			stmt.setLong(1, historia.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
		  throw new RuntimeException(e);
		}
	}	
}
