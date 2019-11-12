
package model.bo;

import java.sql.SQLException;
import java.util.ArrayList;

import model.bean.Systems;
import model.dao.SystemsDAO;

/**
 *SystemsBO
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
public class SystemsBO {
	/**
	 * Get Method getListVendor of 
	 * @return
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 * */
	public ArrayList<Systems> getListSystem() throws SQLException, ClassNotFoundException {
		SystemsDAO dao = new SystemsDAO();
		return dao.getListSystem1();
	}
	/**
	 * Get Method getListVendor of 
	 * @return
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 * */
	public ArrayList<Systems> getListSystem1(String systeName) throws SQLException, ClassNotFoundException {
		SystemsDAO dao = new SystemsDAO();
		return dao.getListSystem2(systeName);
	}

}
