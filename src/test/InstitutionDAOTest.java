package test;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;
import model.bean.Institution;
import model.dao.InstitutionDAO;

/*
 *@author HCD-Fresher076
 *
 *date Aug 9, 2018
 *
 *version 1.0	
 *
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * -------------------------------------
 * Aug 9, 2018     SonNPT		 Create
 */
class InstitutionDAOTest extends TestCase {
	public InstitutionDAO instance = new InstitutionDAO();


@Test
	public void getListState() {
		try {
			ArrayList<Institution> listState = instance.getListInstitution();
			assertEquals(listState, listState);
		} catch (ClassNotFoundException e) {
			
		}
	}


}
