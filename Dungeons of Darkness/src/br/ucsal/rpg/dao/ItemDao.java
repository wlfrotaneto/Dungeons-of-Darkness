package br.ucsal.rpg.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.ucsal.rpg.model.Classe;
import br.ucsal.rpg.model.Item;
import br.ucsal.rpg.util.ConnectionFactory;

/*
	private Integer id;
	private String nome;
	private Integer dano;
	private Classe classe; 
*/

public class ItemDao {

	private Connection connection;

	public ItemDao() {
		this.connection = new ConnectionFactory().getConnection();
	}
	


public void adiciona(Item item) {
	String sql = "insert into itens " + "(id_classe, nome, dano)" + " values (?,?,?)";
	try {
		PreparedStatement stmt = connection.prepareStatement(sql);
		stmt.setInt(1, item.getClasse().getId());
		stmt.setString(2, item.getNome());
		stmt.setInt(3, item.getDano());
		stmt.execute();
		stmt.close();
	} catch (SQLException e) {
		throw new RuntimeException(e);
	}

}

public List<Item> getLista() {
	try {
		List<Item> lista_status = new ArrayList<Item>();
		String sql = "select * from itens";
		PreparedStatement stmt = this.connection.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			Item item = new Item();
			Classe c = new Classe();
			c.setId(rs.getInt("id_classe"));
			item.setClasse(c);
			item.setId(rs.getInt("id"));
			item.setNome(rs.getString("nome"));
			item.setDano(rs.getInt("dano"));
			lista_status.add(item);
		}
		rs.close();
		stmt.close();
		return lista_status;
	} catch (SQLException e) {
		throw new RuntimeException(e);
	}
}

public void altera(Item item) {
	String sql = "  update itens set id_classe=?, nome=?, dano=?, where id=?";
	try {
		PreparedStatement stmt = connection.prepareStatement(sql);
		stmt.setInt(1, item.getClasse().getId());
		stmt.setString(2, item.getNome());
		stmt.setInt(3, item.getDano());
		stmt.setInt(4, item.getId());
		stmt.execute();
		stmt.close();
	} catch (SQLException e) {
		throw new RuntimeException(e);
	}
}

public void remove(Item item) {
	try {
		PreparedStatement stmt = connection.prepareStatement("delete from itens where id=?");
		stmt.setLong(1, item.getId());
		stmt.execute();
		stmt.close();
	} catch (SQLException e) {
	  throw new RuntimeException(e);
	}
}
}
