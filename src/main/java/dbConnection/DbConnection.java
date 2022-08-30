package dbConnection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
public class DbConnection {
	
	public static  Connection getConnectoins() throws ClassNotFoundException, SQLException
	{
		Connection connection = null;
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			connection = DriverManager.getConnection("jdbc:sqlserver://localhost","Anemoi","Anemoi@123");
			if(connection!=null)
			{
				return connection;
			}
			return null;
	}
	
	
	public static void createRole(String dataBaseName) {
		
		
		
	}
}
