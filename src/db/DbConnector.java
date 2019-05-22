package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import security.Credential;

/**
 * This is a Singleton Class as only one instance of it will be used in the system
 * @author Safwah with code excerpts from Chrisaoa
 *
 */
public class DbConnector {
	
	private static Connection instance = null;

	private static final String url = "jdbc:postgresql://" 
								+ Credential.ADDRESS.toString()
								+ "/"
								+ Credential.DATABASE.toString();
	private static final String user = Credential.USERNAME.toString();
	private static final String password = Credential.PASSWORD.toString();
	
	protected DbConnector() {}
	
	public static Connection getConnection() {
		if (instance == null) {
			System.out.println("Connecting to PostgreSQL database");
			try {
				instance = DriverManager.getConnection(url, user, password);
				System.out.println("Connection Successful!");
			} catch (SQLException e) {
				System.out.println("Connection failed");
				e.printStackTrace();
			}
		}
		return instance;
	}
	
}
