package model.bo;

import java.util.ArrayList;

import model.bean.Institution;
import model.dao.InstitutionDAO;

/**
 *InstitutionBO
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
public class InstitutionBO {
	/**
	 * Get data for Department Details page
	 * @method getListAddress
	 * @return ArrayList<Address>
	 * @throws ClassNotFoundException 
	 */ 
	public ArrayList<Institution> getListInstitution() throws ClassNotFoundException {
		InstitutionDAO dao = new InstitutionDAO();
		
		return dao.getListInstitution();
	}

}
