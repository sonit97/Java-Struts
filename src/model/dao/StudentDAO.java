package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import org.apache.log4j.Logger;

import model.bean.Student;

/**
 *StudentDAO
 *
 *date Jul 18, 2018
 *
 *version 1.0	
 *
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * -------------------------------------
 * Jul 18, 2018     SonNPT		 Create
 */
public class StudentDAO {
	
	static Logger logger = Logger.getLogger("StudentDAO");
	
	/** 
	 * Get list search Student for Student page
	 * @method getListSearchStudent
	 * @param institutiton,state
	 * @return ArrayList<Student>
	 * @throws ClassNotFoundException
	 */ 
	public ArrayList<Student> getListSearchStudent ( String institutiton ,String state) throws ClassNotFoundException{

		String sql = null;
		//Define Student
		Student studentObj = null;
		//Define listStudent
		ArrayList<Student> listStudent = new ArrayList<>();
		//Define DBconnect
		DBconnect dbConnect = new DBconnect();
		//Connect db
		Connection con = dbConnect.getConnect();
		PreparedStatement pstmt = null;
		ResultSet rs ;
	
		try {
			//select data form STUDENT_REG equal if
			if("".equals(institutiton) && "".equals(state) ) {
				sql = "SELECT STUDENT_CODE,Rtrim(FIRST_NAME) as FIRST_NAME,Rtrim(LAST_NAME) as LAST_NAME,"
						+ "Rtrim(TITLE) as TITLE,Rtrim(QUANTITY) as QUANTITY,Rtrim(INSTITUTION) as INSTITUTION,"
						+ "Rtrim(PHONE) as PHONE,Rtrim(EMAIL) as EMAIL, Rtrim(ADDRESS) as ADDRESS,Rtrim(CITY) as CITY,"
						+ "Rtrim(STATE) as STATE,Rtrim(ZIPCODE)as ZIPCODE,Rtrim(COUNTRY) as COUNTRY,"
						+ "Rtrim(SYSTEM_NAME) as SYSTEM_NAME,Rtrim(TIME_PURCHASE) as TIME_PURCHASE,"
						+ "Rtrim(PLACE) as PLACE,Rtrim(COMMENT) as COMMENT FROM STUDENT_REG";
				pstmt = con.prepareStatement(sql);
			} else if(!"".equals(institutiton) && "".equals(state)) {
				sql = "SELECT STUDENT_CODE,Rtrim(FIRST_NAME) as FIRST_NAME,Rtrim(LAST_NAME) as LAST_NAME,Rtrim(TITLE) as TITLE,"
						+ "Rtrim(QUANTITY) as QUANTITY,Rtrim(INSTITUTION) as INSTITUTION,Rtrim(PHONE) as PHONE,Rtrim(EMAIL) as EMAIL,"
						+ "Rtrim(ADDRESS) as ADDRESS,Rtrim(CITY) as CITY,Rtrim(STATE) as STATE,Rtrim(ZIPCODE)as ZIPCODE,"
						+ "Rtrim(COUNTRY) as COUNTRY,Rtrim(SYSTEM_NAME) as SYSTEM_NAME,Rtrim(TIME_PURCHASE) as TIME_PURCHASE,"
						+ "Rtrim(PLACE) as PLACE,Rtrim(COMMENT) as COMMENT  FROM STUDENT_REG WHERE INSTITUTION LIKE ?";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1,  institutiton);
				
			} else if("".equals(institutiton) && !"".equals(state) ) {
				sql = "SELECT STUDENT_CODE,Rtrim(FIRST_NAME) as FIRST_NAME,Rtrim(LAST_NAME) as LAST_NAME,Rtrim(TITLE) as TITLE,"
						+ "Rtrim(QUANTITY) as QUANTITY,Rtrim(INSTITUTION) as INSTITUTION,Rtrim(PHONE) as PHONE,Rtrim(EMAIL) as EMAIL,"
						+ "Rtrim(ADDRESS) as ADDRESS,Rtrim(CITY) as CITY,Rtrim(STATE) as STATE,Rtrim(ZIPCODE)as ZIPCODE,"
						+ "Rtrim(COUNTRY) as COUNTRY,Rtrim(SYSTEM_NAME) as SYSTEM_NAME,Rtrim(TIME_PURCHASE) as TIME_PURCHASE,"
						+ "Rtrim(PLACE) as PLACE,Rtrim(COMMENT) as COMMENT  FROM STUDENT_REG WHERE TITLE LIKE ?";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, state+"%" );
			} else if(!"".equals(institutiton) && !"".equals(state)) {
				sql = "SELECT STUDENT_CODE,Rtrim(FIRST_NAME) as FIRST_NAME,Rtrim(LAST_NAME) as LAST_NAME,Rtrim(TITLE) as TITLE,"
						+ "Rtrim(QUANTITY) as QUANTITY,Rtrim(INSTITUTION) as INSTITUTION,Rtrim(PHONE) as PHONE,Rtrim(EMAIL) as EMAIL,"
						+ "Rtrim(ADDRESS) as ADDRESS,Rtrim(CITY) as CITY,Rtrim(STATE) as STATE,Rtrim(ZIPCODE)as ZIPCODE,"
						+ "Rtrim(COUNTRY) as COUNTRY,Rtrim(SYSTEM_NAME) as SYSTEM_NAME,Rtrim(TIME_PURCHASE) as TIME_PURCHASE,"
						+ "Rtrim(PLACE) as PLACE,Rtrim(COMMENT) as COMMENT  FROM STUDENT_REG WHERE INSTITUTION LIKE ? AND TITLE LIKE ?";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1,institutiton);
				pstmt.setString(2,  state+"%" );
					
			}
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				studentObj = new Student(rs.getString("STUDENT_CODE"), rs.getString("FIRST_NAME"), 
						rs.getString("LAST_NAME"), rs.getString("TITLE"),rs.getInt("QUANTITY") ,
						rs.getString("INSTITUTION"), rs.getString("PHONE"), rs.getString("EMAIL"),
						rs.getString("ADDRESS"),rs.getString("CITY"), rs.getString("STATE"),
						rs.getString("ZIPCODE"), rs.getString("COUNTRY"), rs.getString("SYSTEM_NAME"),
						rs.getString("TIME_PURCHASE"), rs.getString("PLACE"), rs.getString("COMMENT"));
				listStudent.add(studentObj);
			}
			
		} catch (Exception e) {
			StackTraceElement[] stractTrace = e.getStackTrace();
			 for(int i = 0; i < stractTrace.length; ++i) {
				 logger.warn(stractTrace[i].getClassName());
				 logger.warn(stractTrace[i].getFileName());
				 logger.warn(stractTrace[i].getLineNumber());
				 logger.warn(stractTrace[i].getMethodName());
			 }
			 throw new ClassNotFoundException();
		} finally {
			dbConnect.disConnectDB();
		}
		return listStudent;
	}
	
	/**
	 * Delete object Student
	 * @method deleteStudent
	 * @param maObj
	 * @return 
	 * @throws ClassNotFoundException
	 */ 
	public void deleteStudent(String maObj) throws ClassNotFoundException{
			DBconnect dbConnect = new DBconnect();
			Connection con = dbConnect.getConnect();
		    try{
		    	//Delete data form STUDENT_REG 
		    	Statement st = con.createStatement();
		         String  sql="DELETE STUDENT_REG WHERE  STUDENT_CODE='" + maObj + "'";
		         st.execute(sql);
		    }catch(Exception e){
		    	StackTraceElement[] stractTrace = e.getStackTrace();
				 for(int i = 0; i < stractTrace.length; ++i) {
					 logger.warn(stractTrace[i].getClassName());
					 logger.warn(stractTrace[i].getFileName());
					 logger.warn(stractTrace[i].getLineNumber());
					 logger.warn(stractTrace[i].getMethodName());
				 }
				 throw new ClassNotFoundException();
		    }
		    finally {
				dbConnect.disConnectDB();
			}
		}
		
		/**
		 * Update data for Student page
		 * @method updateStudent
		 * @param obj
		 * @return
		 * @throws  ClassNotFoundException
		 */ 
		public void updateStudent(Student obj) throws ClassNotFoundException {
		    String sql="";
		    DBconnect dbConnect = new DBconnect();
		    Connection con = dbConnect.getConnect();
		    PreparedStatement pstmt ;
		    
		    try {
		    	//Update data form STUDENT_REG 
		        sql = "UPDATE STUDENT_REG SET FIRST_NAME = ?, LAST_NAME = ?, TITLE = ?, QUANTITY = ?,"
		        		+ " INSTITUTION = ?, PHONE = ?, EMAIL = ?, ADDRESS = ?, CITY = ?, STATE = ?, "
		        		+ "ZIPCODE = ?, COUNTRY = ?, SYSTEM_NAME = ?, TIME_PURCHASE = ?, PLACE = ?,"
		        		+ " COMMENT = ? WHERE STUDENT_CODE = ?";
		       
		        pstmt = con.prepareStatement(sql);
		        pstmt.setString(1, obj.getFirstName());
		        pstmt.setString(2, obj.getLastName());
		        pstmt.setString(3, obj.getTitle());
		        pstmt.setInt(4, obj.getQuantity());
		        pstmt.setString(5, obj.getInsitution());
		        pstmt.setString(6, obj.getPhone());
		        pstmt.setString(7, obj.getEmail());
		        pstmt.setString(8, obj.getAddress());
		        pstmt.setString(9, obj.getCity());
		        pstmt.setString(10, obj.getState());
		        pstmt.setString(11, obj.getZipCode());
		        pstmt.setString(12, obj.getCountry());
		        pstmt.setString(13, obj.getSystemName());
		        pstmt.setString(14, obj.getTimePurchase());
		        pstmt.setString(15, obj.getPlace());
		        pstmt.setString(16, obj.getComment());
		        pstmt.setString(17, obj.getStudentCode());
		        pstmt.executeUpdate();
		        
		    } catch (Exception e) {
		    	StackTraceElement[] stractTrace = e.getStackTrace();
				 for(int i = 0; i < stractTrace.length; ++i) {
					 logger.warn(stractTrace[i].getClassName());
					 logger.warn(stractTrace[i].getFileName());
					 logger.warn(stractTrace[i].getLineNumber());
					 logger.warn(stractTrace[i].getMethodName());
				 }
				 throw new ClassNotFoundException();
			} finally {
				dbConnect.disConnectDB();
			}
		} 
		
		/**
		 * Get list Student for Student page
		 * @method getListStudent
		 * @param 
		 * @return ArrayList<Student>
		 * @throws ClassNotFoundException
		 */ 
		public ArrayList<Student> getListStudent () throws ClassNotFoundException{
			String sql = null;
			Student studentObj = null;
			ArrayList<Student> listStudent = new ArrayList<>();
			DBconnect dbConnect = new DBconnect();
			Connection con = dbConnect.getConnect();
			PreparedStatement pstmt = null;
			ResultSet rs ;
				
			try {	
				//Select data form STUDENT_REG 
				sql = " SELECT STUDENT_CODE,FIRST_NAME,LAST_NAME,TITLE,QUANTITY,INSTITUTION,PHONE,EMAIL,ADDRESS,CITY,STATE,"
						+ "ZIPCODE,COUNTRY,SYSTEM_NAME,TIME_PURCHASE,PLACE,COMMENT FROM STUDENT_REG ";
				pstmt = con.prepareStatement(sql);				
				rs = pstmt.executeQuery();
				
				while(rs.next()) {	
					studentObj = new Student(rs.getString("STUDENT_CODE"), rs.getString("FIRST_NAME"),
							rs.getString("LAST_NAME"), rs.getString("TITLE"),rs.getInt("QUANTITY") ,
							rs.getString("INSTITUTION"), rs.getString("PHONE"), rs.getString("EMAIL"), 
							rs.getString("ADDRESS"),rs.getString("CITY"), rs.getString("STATE"),
							rs.getString("ZIPCODE"), rs.getString("COUNTRY"), rs.getString("SYSTEM_NAME"), 
							rs.getString("TIME_PURCHASE"), rs.getString("PLACE"), rs.getString("COMMENT"));
							listStudent.add(studentObj);
				}
				
			} catch (Exception e) {
				StackTraceElement[] stractTrace = e.getStackTrace();
				 for(int i = 0; i < stractTrace.length; ++i) {
					 logger.warn(stractTrace[i].getClassName());
					 logger.warn(stractTrace[i].getFileName());
					 logger.warn(stractTrace[i].getLineNumber());
					 logger.warn(stractTrace[i].getMethodName());
				 }
				 throw new ClassNotFoundException();
			} finally {
				dbConnect.disConnectDB();
			}
			return listStudent;
		}
}

