package model.bo;

import java.sql.SQLException;
import java.util.ArrayList;

import model.bean.City;
import model.dao.CityDAO;

/**
 *CityBO
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
public class CityBO {
	
	/**
	 * Get Method getListVendor of VendorDAO
	 * @return
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 * */
	public ArrayList<City> getListCity(String code) throws SQLException, ClassNotFoundException {
		CityDAO dao = new CityDAO();
		return dao.getListCity(code);
	}

}
