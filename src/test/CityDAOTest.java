package test;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;
import model.bean.City;
import model.dao.CityDAO;

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
class CityDAOTest extends TestCase {
	public CityDAO instance = new CityDAO();


@Test
	public void getListState() {
	String countryCode = "Code1" ;
		try {
			ArrayList<City> listState = instance.getListCity(countryCode);
			assertEquals(listState, listState);
		} catch (ClassNotFoundException e) {
			
		}
	}


}
