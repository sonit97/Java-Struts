package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.apache.log4j.Logger;

import model.bean.City;


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
public class CityDAO {
	
    static Logger logger = Logger.getLogger("CityDAO");
	
	/**
	 * Get list City when select Country for Student page
	 * @method getListCity
	 * @param code
	 * @return ArrayList<City>
	 * @throws ClassNotFoundException
	 */ 
	public ArrayList<City> getListCity(String code) throws ClassNotFoundException {
		//Define object listCity
		ArrayList<City> listCity = new ArrayList<>();
		//Define object City = null
		City cityObj = null;
		//Define connect
		DBconnect dbConnect = new DBconnect();
		Connection con = dbConnect.getConnect();
		//Define Statement = null 
		Statement st = null;
	
		try {
			//select data form CITIES
			st = con.createStatement();
			String sql = "SELECT CODE,COUNTRY ,NAME FROM CITIES WHERE CODE= '" + code + "'";
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
				//define object City
				cityObj = new City(rs.getString("CODE"), rs.getString("COUNTRY"), rs.getString("NAME"));
				listCity.add(cityObj);				
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
		return listCity;	
	}

}
