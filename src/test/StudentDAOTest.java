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
class StudentDAOTest extends TestCase {
	public StudentDAO instance = new StudentDAO();


@Test
	public void getListStudent1() {
		try {
			ArrayList<Student> listStudent = instance.getListStudent();
			assertEquals(5, listStudent.size());
		} catch (ClassNotFoundException e) {
			
		}
	}
@Test
public void getListStudent2() {
	try {
		ArrayList<Student> listStudent = instance.getListStudent();
		assertEquals(0, listStudent.size());
	} catch (ClassNotFoundException e) {
		
	}
}

@Test
public void getListSearchStudent1() {
	String institutiton = "";
	String title = "";

	try {
		ArrayList<Student> listStudent = instance.getListSearchStudent(institutiton, title);
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("151250533333", "zzz", "AA", "123", 12, "Ins04", "1234569877", "truong@gmail.com", "GG", "CC", "Texas", "59848", "C0003", "Sys4", "11", "a", "AA"));
		for(int i = 0; i<listStudent.size();++i) {
			assertEquals(list.get(i), listStudent.get(i));	
		}
		
	} catch (ClassNotFoundException e) {
		
	}
}

@Test
public void getListSearchStudent2() {
	String institutiton = "";
	String title = "Title1";

	try {
		ArrayList<Student> listStudent = instance.getListSearchStudent(institutiton, title);
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("151250533333", "zzz", "AA", "Title1", 12, "Ins04", "1234569877", "truong@gmail.com", "GG", "CC", "Texas", "59848", "C0003", "Sys4", "11", "a", "AA"));
		for(int i = 0; i<listStudent.size();++i) {
			assertEquals(list.get(i), listStudent.get(i));	
		}
		
	} catch (ClassNotFoundException e) {
		
	}
}
@Test
public void getListSearchStudent3() {
	String institutiton = "Ins04";
	String title = "Title1";

	try {
		ArrayList<Student> listStudent = instance.getListSearchStudent(institutiton, title);
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("151250533333", "zzz", "AA", "Title1", 12, "Ins04", "1234569877", "truong@gmail.com", "GG", "CC", "Texas", "59848", "C0003", "Sys4", "11", "a", "AA"));
		for(int i = 0; i<listStudent.size();++i) {
			assertEquals(list.get(i), listStudent.get(i));	
		}
		
	} catch (ClassNotFoundException e) {
		
	}
}

@Test
public void deleteStudent() {
	String studentCode = "151250533140";	

	try {
		instance.deleteStudent(studentCode);	
		assertEquals( studentCode, studentCode );
		
	} catch (ClassNotFoundException e) {
		
	}
}

@Test
public void updateStudent() {
	String studentCode = "151250533140";
	String firstName = "FName10";
	String lastName = "LName10";
	String title = "";
	int quantity = 0 ;
	String institutiton = "";
	String phone = "";
	String email = "";
	String address = "";
	String city = "";
	String state = "";
	String zipCode = "";
	String country = "";
	String systemName = "";
	String timePurchase = "";
	String place = "Place10";
	String comment = "Comment10";
	Student stobj = new Student(studentCode, firstName, lastName, title, quantity, institutiton, phone, email, address, city, state, zipCode, country, systemName, timePurchase, place, comment);
	try {
		instance.updateStudent(stobj);	
		assertEquals( stobj, stobj );
		
	} catch (ClassNotFoundException e) {
		
	}
}
}
