package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.apache.log4j.Logger;

import model.bean.Systems;

/**
 *SystemsDAO
 *
 *date Jul 30, 2018
 *
 *version 1.0	
 *
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * -------------------------------------
 * Jul 30, 2018     SonNPT		 Create
 */
public class SystemsDAO {
	
	static Logger logger = Logger.getLogger("SystemsDAO");
	
	/**
	 * Get list System for Student page
	 * @method getListSystem1
	 * @return ArrayList<Systems>
	 * @throws ClassNotFoundException
	 */ 
	public ArrayList<Systems> getListSystem1() throws ClassNotFoundException {
		ArrayList<Systems> listSystems = new ArrayList<>();
		Systems systemsObj = null;
		DBconnect dbConnect = new DBconnect();
		Connection con = dbConnect.getConnect();
		Statement st =null;
	
		try {
			//Select data form SYSTEMS 
			st = con.createStatement();
			String sql = "SELECT distinct SYSTEM_NAME FROM SYSTEMS";
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
				 systemsObj = new Systems();
				 systemsObj.setSystemName(rs.getString("SYSTEM_NAME"));				
				 listSystems.add(systemsObj);
				
			}
			
		} catch (SQLException e) {
			StackTraceElement[] stractTrace = e.getStackTrace();
			 for(int i = 0; i < stractTrace.length; ++i) {
				 logger.warn(stractTrace[i].getClassName());
				 logger.warn(stractTrace[i].getFileName());
				 logger.warn(stractTrace[i].getLineNumber());
				 logger.warn(stractTrace[i].getMethodName());
			 }
			 throw new ClassNotFoundException();
		} finally {
			dbConnect.disConnectDB();
		}
		return listSystems;	
	}
	
	/**
	 * Get list System2 when select System1 for Student page
	 * @method getListSystem2
	 * @return ArrayList<Systems>
	 * @throws ClassNotFoundException
	 */ 
	public ArrayList<Systems> getListSystem2(String systemName) throws ClassNotFoundException {
		ArrayList<Systems> listSystems1 = new ArrayList<>();
		Systems systemsObj1 = null;
		DBconnect dbConnect = new DBconnect();
		Connection con = dbConnect.getConnect();
		Statement st = null;
	
		try {
			//Select data form SYSTEMS 
			st = con.createStatement();
			String sql = "SELECT TIME_PURCHASE FROM SYSTEMS WHERE SYSTEM_NAME = '" + systemName + "'";
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
				systemsObj1 = new Systems(rs.getString("TIME_PURCHASE"));
				listSystems1.add(systemsObj1);				
			}
			
		} catch (SQLException e) {
			StackTraceElement[] stractTrace = e.getStackTrace();
			 for(int i = 0; i < stractTrace.length; ++i) {
				 logger.warn(stractTrace[i].getClassName());
				 logger.warn(stractTrace[i].getFileName());
				 logger.warn(stractTrace[i].getLineNumber());
				 logger.warn(stractTrace[i].getMethodName());
			 }
			 throw new ClassNotFoundException();
		} finally {
			dbConnect.disConnectDB();
		}
		return listSystems1;	
	}

}
