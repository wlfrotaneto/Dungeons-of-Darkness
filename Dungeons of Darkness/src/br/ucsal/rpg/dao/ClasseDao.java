package br.ucsal.rpg.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.ucsal.rpg.model.Classe;
import br.ucsal.rpg.util.ConnectionFactory;

/*
	private Integer id;
	private String nome;
	private String buffs;
	private String atributos;
*/

public class ClasseDao {

	private Connection connection;

	public ClasseDao() {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void adiciona(Classe classe) {
		String sql = "insert into classe " + "(nome, buff_energia, buff_saude, atributos)" + " values (?,?,?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, classe.getNome());
			stmt.setInt(2, classe.getBuffEnergia());
			stmt.setInt(3, classe.getBuffSaude());
			stmt.setString(4, classe.getAtributos());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public List<Classe> getLista() {
		try {
			List<Classe> classes = new ArrayList<Classe>();
			String sql = "select * from classe";
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Classe classe = new Classe();
				classe.setId(rs.getInt("id"));
				classe.setNome(rs.getString("nome"));
				classe.setBuffEnergia(rs.getInt("buff_energia"));
				classe.setBuffSaude(rs.getInt("buff_saude"));
				classe.setAtributos(rs.getString("atributos"));
				classes.add(classe);
			}
			rs.close();
			stmt.close();
			return classes;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void altera(Classe classe) {
		String sql = "update classe set nome=?, buff_energia=?, buff_saude=?, atributos=?, where id=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, classe.getNome());
			stmt.setInt(2, classe.getBuffEnergia());
			stmt.setInt(3, classe.getBuffSaude());
			stmt.setString(4, classe.getAtributos());
			stmt.setInt(5, classe.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void remove(Classe classe) {
		try {
			PreparedStatement stmt = connection.prepareStatement("delete from classe where id=?");
			stmt.setLong(1, classe.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
		  throw new RuntimeException(e);
		}
	}	

}
