package br.ucsal.rpg.util;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
import java.sql.*;
//import org.postgresql.*;

public class ConnectionFactory {

	public Connection getConnection() {
		String conStr = "jdbc:postgresql://localhost:5432/rpg-ucsal";
		String usuario = "postgres";
		String senha = "admin";
		try {
			Class.forName("org.postgresql.Driver");
			return DriverManager.getConnection(conStr, usuario, senha);
		} catch (SQLException | ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
}