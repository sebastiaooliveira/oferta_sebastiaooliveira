package br.com.smbrasilnet.persistencia.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {

	public static Connection getConnection() {
		
		try {
			return DriverManager.getConnection("jdbc:postgresql://localhost:5432/ofertaflex","postgres","postgres");
		} catch (SQLException e) {
			//relan�ando uma exce��o
			throw new RuntimeException(e);
		}
	}
	
	
	

}
