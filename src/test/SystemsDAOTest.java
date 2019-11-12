package test;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;
import model.bean.Systems;
import model.dao.SystemsDAO;

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
class SystemsDAOTest extends TestCase {
	public SystemsDAO instance = new SystemsDAO();


@Test
	public void getListSystem1() {
		try {
			ArrayList<Systems> listSystem = instance.getListSystem1();
			assertEquals(listSystem, listSystem);
		} catch (ClassNotFoundException e) {
			
		}
	}

@Test
public void getListSystem2() {
	String sysName = "Sys1";
	try {
		ArrayList<Systems> listSystem1 = instance.getListSystem2(sysName);
		assertEquals(listSystem1, listSystem1);
	} catch (ClassNotFoundException e) {
		
	}
}


}
