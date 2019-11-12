package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.apache.log4j.Logger;

import model.bean.Country;

/**
 *CityDAO
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
public class CountryDAO {
		
	  static Logger logger = Logger.getLogger("CityDAO");
	
	/**
	 * Get list Country for Student page
	 * @method getListCountry
	 * @param 
	 * @return ArrayList<Country>
	 * @throws ClassNotFoundException
	 */ 
	public ArrayList<Country> getListCountry() throws ClassNotFoundException {
		//Define object listCountry
		ArrayList<Country> listCountry = new ArrayList<>();
		//Define object Country = null
		Country countryObj = null;
		//Define connect
		DBconnect dbConnect = new DBconnect();		
		Connection con = dbConnect.getConnect();
		//Define Statement = null 
		Statement st = null;
	
		try {
			//select data form COUNTRIES
			st = con.createStatement();
			String sql = "SELECT CODE,NAME ,CONTINENT FROM COUNTRIES";
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
				//Define Country
				countryObj = new Country(rs.getString("CODE"), rs.getString("NAME"), rs.getString("CONTINENT"));
				listCountry.add(countryObj);
				
			}
			
		} catch (SQLException e) {
			 //Define StackTraceElement log error
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
