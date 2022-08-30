package dbConnection;

import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//import org.hibernate.annotations.common.util.impl.LoggerFactory;
//import org.slf4j.Logger;

public class MSSQLServerInstance {

//	Logger logger = LoggerFactory.getLogger(MSSQLServerInstance.class);

	private static boolean isDBExist(String databaseName) throws SQLException, ClassNotFoundException {
		Connection connection = null;
		ResultSet restuletSet = null;
		try {

			connection = DbConnection.getConnectoins();

			restuletSet = connection.getMetaData().getCatalogs();
			while (restuletSet.next()) {
				String currentDBName = restuletSet.getString(1);
				if (currentDBName.contentEquals(databaseName)) {

					return true;
				}
			}
		} finally {

		}
		return false;
	}

	/**
	 * This method is used to create the database if it is not exists.
	 * 
	 * @param dataBaseName to be created
	 * @param tenantId     the tenantId key.
	 * @throws MSSqlServerException if unable to create database.
	 */
	public static void createDataBases(String dataBaseName) {
		Connection connection = null;
		Statement statment = null;
		try {
			boolean isDbExist = isDBExist(dataBaseName);
			if (!isDbExist) {
				connection = DbConnection.getConnectoins();
				statment = connection.createStatement();
				statment.executeUpdate("CREATE DATABASE" + dataBaseName);
				DbConnection.createRole(dataBaseName);

			} else {
				System.out.println("Database is exist here is next log");
			}
		} catch (Exception e) {
		} finally {
		}
	}

}
