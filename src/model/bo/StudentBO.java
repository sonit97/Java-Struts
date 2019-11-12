package model.bo;

import java.util.ArrayList;

import model.bean.Student;
import model.dao.StudentDAO;

/**
 *StudentBO
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
public class StudentBO {
	
	public ArrayList<Student> getListSearchStudent(String institutiton,String state) throws ClassNotFoundException {
		StudentDAO dao=new StudentDAO();
		return dao.getListSearchStudent(institutiton, state);
	}

	public void deleteStudent(String maObj) throws ClassNotFoundException {
		StudentDAO dao=new StudentDAO();
		dao.deleteStudent(maObj);
		
	}
	
	public ArrayList<Student> getListStudent ( ) throws ClassNotFoundException{
		StudentDAO dao=new StudentDAO();
		return dao.getListStudent();
	}
	
	public void updateStudent(Student obj) throws ClassNotFoundException {
		StudentDAO dao=new StudentDAO();
		dao.updateStudent(obj);
	}
}
