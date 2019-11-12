package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.log4j.Logger;


/**
 * DBconnect.java
 * 
 * Version 1.0
 * 
 * 12-07-2018
 * 
 * Modification
 * 
 * DATE			AUTHOR 		DESCRIPTIONS
 * --------------------------------- 
 * 12-07-2018   SonNPT		Create
 */
public class DBconnect {

	Connection con;
	String tenDatabase = "Mock2DB_SonNPT";
	String userDatabase = "sa";
	String passDatabase = "1234";
	//Define  logger log error
    static Logger logger = Logger.getLogger("DBconnect");

	/**
	 * get connect to Database
	 * @method getConnect
	 * @return Connection
	 * @throws ClassNotFoundException 
	 */ 
	public Connection getConnect() throws ClassNotFoundException {

		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con = DriverManager.getConnection(
					"jdbc:sqlserver://localhost:1433;databaseName="
							+ tenDatabase + "", "" + userDatabase + "", ""
							+ passDatabase + "");
		} catch (Exception e) {
			 StackTraceElement[] stractTrace = e.getStackTrace();
			 for(int i = 0; i < stractTrace.length; ++i) {
				 logger.warn(stractTrace[i].getClassName());
				 logger.warn(stractTrace[i].getFileName());
				 logger.warn(stractTrace[i].getLineNumber());
				 logger.warn(stractTrace[i].getMethodName());
			 }
			 throw new ClassNotFoundException();
		}

		return con;
	}

	/**
	 * disconnect database
	 * @method disConnectDB
	 * @return void
	 */
	public void disConnectDB() {
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				//log err
			}
		}
	}


}