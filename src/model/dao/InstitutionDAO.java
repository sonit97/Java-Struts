package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.apache.log4j.Logger;

import model.bean.Institution;

/**
 *InstitutionDAO
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
public class InstitutionDAO {
	
	 static Logger logger = Logger.getLogger("InstitutionDAO");
	
	/**
	 * Get list Institution for Student page
	 * @method getListInstitution
	 * @param 
	 * @return ArrayList<Institution>
	 * @throws ClassNotFoundException 
	 */  
	public ArrayList<Institution> getListInstitution() throws ClassNotFoundException {
		//Define object listInstitution
		ArrayList<Institution> listInstitution = new ArrayList<>();
		//Define object listInstitution
		Institution institutionObj = null;
		//Define connect
		DBconnect dbConnect = new DBconnect();
		Connection con = dbConnect.getConnect();
		//Define Statement = null 
		Statement st = null;
	
		try {
			//select data form INSTITUTIONS
			st = con.createStatement();
			String sql = "SELECT Rtrim(INSTITUTION_CODE) as  INSTITUTION_CODE,Rtrim(INSTITUTION_NAME) as INSTITUTION_NAME  ,FOUNDED_DATE,[LEVEL] FROM INSTITUTIONS";
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				//Define Country set value
				institutionObj = new Institution(rs.getString("INSTITUTION_CODE"), rs.getString("INSTITUTION_NAME"), rs.getString("FOUNDED_DATE"), rs.getString("LEVEL"));
				listInstitution.add(institutionObj);
				
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
		return listInstitution;	
	}
}
