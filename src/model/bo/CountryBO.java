
package model.bo;

import java.sql.SQLException;
import java.util.ArrayList;

import model.bean.Country;
import model.dao.CountryDAO;

/**
 *CountryBO
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
public class CountryBO {
	/**
	 * Get Method getListCountry of CountryDAO
	 * @return
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 * */
	public ArrayList<Country> getListCountry() throws SQLException, ClassNotFoundException {
		CountryDAO dao = new CountryDAO();
		return dao.getListCountry();
	}

}
