package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import security.Credential;

public class DbConnection {

	private final String url = "jdbc:postgresql://" 
								+ Credential.ADDRESS.toString()
								+ "/"
								+ Credential.DATABASE.toString();
	private final String user = Credential.USERNAME.toString();
	private final String password = Credential.PASSWORD.toString();
	private Connection conn = null;
	
	public DbConnection() {
		try {
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("Connected to the PostgreSQL server successfully!");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
}
