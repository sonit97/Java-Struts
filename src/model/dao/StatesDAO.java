package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.apache.log4j.Logger;

import model.bean.States;

/**
 *StatesDAO
 *
 *date July 30, 2018
 *
 *version 1.0	
 *
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * -------------------------------------
 * July 30, 2018     SonNPT		 Create
 */
public class StatesDAO {
	
	static Logger logger = Logger.getLogger("StatesDAO");
	
	/**
	 * Get list States for Student page
	 * @method getListStates
	 * @param 
	 * @return ArrayList<States>
	 * @throws ClassNotFoundException 
	 */ 
	public ArrayList<States> getListStates() throws ClassNotFoundException {
		ArrayList<States> listCountry = new ArrayList<>();
		States statesObj = null;
		DBconnect dbConnect = new DBconnect();
		Connection con = dbConnect.getConnect();
		Statement st =null;
	
		try {
			//select data form STATES
			st = con.createStatement();
			String sql = "SELECT CODE,COUNTRY ,NAME FROM STATES";
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				statesObj = new States(rs.getString("CODE"), rs.getString("COUNTRY"), rs.getString("NAME"));
				listCountry.add(statesObj);
				
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
		return listCountry;	
	}
}
