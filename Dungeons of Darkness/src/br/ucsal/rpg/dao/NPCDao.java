package br.ucsal.rpg.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.ucsal.rpg.model.NPC;
import br.ucsal.rpg.util.ConnectionFactory;

/*
 	private Integer id;
	private String nome;
	private Status status;
	private List<Item> itens;
 */

public class NPCDao {

	private Connection connection;

	public NPCDao() {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void adiciona(NPC npc) {
		String sql = "insert into NPC " + "(nome, id_status, id_item)" + " values (?,?,?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, npc.getNome());
			stmt.setInt(2, npc.getStatus().getId());
			stmt.setInt(3, npc.getItens().get(0).getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public List<NPC> getLista() {
		try {
			List<NPC> lista_status = new ArrayList<NPC>();
			String sql = "select * from NPC";
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				NPC npc = new NPC();
				npc.setId(rs.getInt("id"));
				npc.setNome(rs.getString("nome"));
				npc.setStatusId(rs.getInt("id_status"));
				npc.setItemId(rs.getInt("id_item"));
				lista_status.add(npc);
			}
			rs.close();
			stmt.close();
			return lista_status;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void altera(NPC npc) {
		String sql = "  update NPC set nome=?, id_status=?, id_item=?, where id=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, npc.getNome());
			stmt.setInt(2, npc.getStatus().getId());
			stmt.setInt(3, npc.getItens().get(0).getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void remove(NPC npc) {
		try {
			PreparedStatement stmt = connection.prepareStatement("delete from NPC where id=?");
			stmt.setLong(1, npc.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
		  throw new RuntimeException(e);
		}
	}
	
}
