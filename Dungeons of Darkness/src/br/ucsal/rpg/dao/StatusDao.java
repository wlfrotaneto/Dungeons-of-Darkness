package br.ucsal.rpg.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.ucsal.rpg.model.Status;
import br.ucsal.rpg.util.ConnectionFactory;

/*	
	private Integer id;
	private Integer saude;
	private Integer energia;
*/

/* 
	CREATE TABLE Status (
		ID BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY, 
		saude INTEGER, 
		energia INTEGER);
*/

public class StatusDao {
	private Connection connection;

	public StatusDao() {
		this.connection = new ConnectionFactory().getConnection();
	}

	public void adiciona(Status status) {
		String sql = "insert into Status " + "(saude, energia)" + " values (?,?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, status.getSaude());
			stmt.setInt(2, status.getEnergia());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public List<Status> getLista() {
		try {
			List<Status> lista_status = new ArrayList<Status>();
			String sql = "select * from Status";
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Status status = new Status();
				status.setId(rs.getInt("id"));
				status.setSaude(rs.getInt("saude"));
				status.setEnergia(rs.getInt("energia"));
				lista_status.add(status);
			}
			rs.close();
			stmt.close();
			return lista_status;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void altera(Status status) {
		String sql = "  update Status set saude=?, energia=?, where id=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, status.getSaude());
			stmt.setInt(2, status.getEnergia());
			stmt.setInt(3, status.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void remove(Status status) {
		try {
			PreparedStatement stmt = connection.prepareStatement("delete from Status where id=?");
			stmt.setLong(1, status.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
		  throw new RuntimeException(e);
		}
	}	
	
}
