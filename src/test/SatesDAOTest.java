package test;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;
import model.bean.Student;
import model.dao.StudentDAO;

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
class SatesDAOTest extends TestCase {
	public StudentDAO instance = new StudentDAO();


@Test
	public void getListState() {
		try {
			ArrayList<Student> listState = instance.getListStudent();
			assertEquals(listState, listState);
		} catch (ClassNotFoundException e) {
			
		}
	}


}
