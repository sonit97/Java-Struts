package action;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;


import form.StudentForm;
import model.bean.Country;
import model.bean.Institution;
import model.bean.States;
import model.bean.Student;
import model.bean.Systems;
import model.bo.CountryBO;
import model.bo.InstitutionBO;
import model.bo.StatesBO;
import model.bo.StudentBO;
import model.bo.SystemsBO;

/**
 *StudentAction
 *
 *date Jul 30, 2018
 *
 *version 1.0	
 *
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * -------------------------------------
 * July 30, 2018     SonNPT		 Create
 */
public class StudentAction extends Action {
	
	// Variable constant button search
	static final String SEARCH = "検索(S)";
	
	// Variable constant button delete
	static final String DELETE = "削除(D)";
	
	// Variable constant button export
	static final String EXPORT = "エクスポート(E)";
	
	// Variable constant button update
	static final String UPDATE = "更新(U)";
	
	// Variable constant findForward screen list
	static final String SCREENSTUDENT = "screenStudent";
		
	// Variable constant findForward screen error
	static final String ERROR = "error";
	
	//Action execute business for Student
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response)  {
		
		try {
			request.setCharacterEncoding("UTF-8");
		

		String message = "";
		//Define objects StudentBO
		StudentBO studentBO = new StudentBO();
		//Define objects InstitutionBO
		InstitutionBO institutionBO = new InstitutionBO();	
		//Define objects InstitutionBO
		SystemsBO sysBo = new SystemsBO();
		//Define objects CountryBO
		CountryBO countryBO = new CountryBO();
		//Define objects StatesBO
		StatesBO statesBO = new StatesBO();
		//Define objects list Student
		ArrayList<Student> listStudent = null;
		//Define objects Systems get listSystem
		ArrayList<Systems> listSystems = sysBo.getListSystem();
		//Define objects States get ListStates
		ArrayList<States> listStates = statesBO.getListStates();
		//Define objects Institution get listInstitution
		ArrayList<Institution> listInstitution = institutionBO.getListInstitution();
		//Define objects Country get listCountry
		ArrayList<Country> listCountry = countryBO.getListCountry();
		StudentForm studentForm = (StudentForm)form;
		
		//Search student
		if (SEARCH.equalsIgnoreCase(studentForm.getSubmit())) {	
			//Define institution
			String institutiton = studentForm.getInsitution1();
			//Define title
			String title = studentForm.getTitle1();
			//Select list search
			listStudent = studentBO.getListSearchStudent(institutiton, title);				
			studentForm.setListStudent(listStudent);
			message = "[S3M0003E]：該当するデータが存在しません。";
			studentForm.setMessageSearch(message);
		}
		
		//Delete Student
		if (DELETE.equalsIgnoreCase(studentForm.getSubmit())) {
			//Define institution getInsitution from form
			String institutiton = studentForm.getInsitution();
			//Define title getTitle from form
			String title = studentForm.getTitle();	
			//Define studentCode getStudentCode from form
			String studentCode = studentForm.getStudentCode();
			System.out.println(studentCode);
			//Execute delete 
			studentBO.deleteStudent(studentCode);
			//Select list Student
			listStudent = studentBO.getListSearchStudent(institutiton, title);
			//Set list to Form
			studentForm.setListStudent(listStudent);
			message = "[CTC000080I] を削除しました。";
			studentForm.setMessageDelete(message);
			studentForm.setListMessage("Mess"); 
		}
		
		//Export file
		if (EXPORT.equalsIgnoreCase(studentForm.getSubmit())) {
			response.setContentType("application/vnd.ms-excel");
	        response.setHeader("Content-Disposition", "attachment; filename=Mock2.xlsx"); 
	        //Define title1 getTitle from form
	        String title1 = request.getParameter("titleeee");
			//Define XSSFWorkbook
			XSSFWorkbook workbook = new XSSFWorkbook();
			//Define institution
			String institutiton = studentForm.getInsitution();
			//Define sheet excel
			ArrayList<Student> list = studentBO.getListSearchStudent(institutiton, title1);
			for (int i = 0; i < list.size(); i++) {
				
				XSSFSheet sheet = workbook.createSheet("Student"+i);
				//Position the rows
				int rowNum = 0;
				Row rowMot = sheet.createRow(rowNum++);
				Row rowHai = sheet.createRow(rowNum++);
				Row rowBa = sheet.createRow(rowNum++);
				Row rowBon = sheet.createRow(rowNum++);
				Row rowNam = sheet.createRow(rowNum++);
				Row rowSau = sheet.createRow(rowNum++);
				Row rowBay = sheet.createRow(rowNum++);
				Row rowTam = sheet.createRow(rowNum++);
				Row rowChin = sheet.createRow(rowNum++);
				Row rowMuoi = sheet.createRow(rowNum++);
				Row rowMuoiMot = sheet.createRow(rowNum++);
				Row rowMuoiHai = sheet.createRow(rowNum++);
				
				//Position the Cell at row1
				Cell cellMotrowMot = rowMot.createCell(0);
				Cell cellHairowMot = rowMot.createCell(1);
				Cell cellBarowMot = rowMot.createCell(2);
				Cell cellBonrowMot = rowMot.createCell(3);
				cellMotrowMot.setCellValue("名");
				cellHairowMot.setCellValue(list.get(i).getFirstName());
				cellBarowMot.setCellValue("現在のシステム");
				cellBonrowMot.setCellValue(list.get(i).getSystemName());
				
				//Position the Cell at row2
				Cell cellMotrowHai = rowHai.createCell(0);
				Cell cellHairowHai = rowHai.createCell(1);
				Cell cellBarowHai = rowHai.createCell(2);
				Cell cellBonrowHai = rowHai.createCell(3);
				cellMotrowHai.setCellValue("姓");
				cellHairowHai.setCellValue(list.get(i).getLastName());
				cellBarowHai.setCellValue("購入の時間枠");
				cellBonrowHai.setCellValue(list.get(i).getTimePurchase());
				
				//Position the Cell at row3
				Cell cellMotrowBa = rowBa.createCell(0);
				Cell cellHairowBa = rowBa.createCell(1);
				Cell cellBarowBa = rowBa.createCell(2);
				Cell cellBonrowBa = rowBa.createCell(3);
				cellMotrowBa.setCellValue("タイトル");
				cellHairowBa.setCellValue(list.get(i).getTitle());
				cellBarowBa.setCellValue("どこで知りま");
				cellBonrowBa.setCellValue(list.get(i).getPlace());
				
				//Position the Cell at row4
				Cell cellMotrowBon = rowBon.createCell(0);
				Cell cellHairowBon = rowBon.createCell(1);
				cellMotrowBon.setCellValue("機関");
				cellHairowBon.setCellValue(list.get(i).getInsitution());
				
				//Position the Cell at row5
				Cell cellMotrowNam = rowNam.createCell(0);
				Cell cellHairowNam = rowNam.createCell(1);
				Cell cellBarowNam = rowNam.createCell(2);
				cellMotrowNam.setCellValue("学生の数");
				cellHairowNam.setCellValue(list.get(i).getQuantity());
				cellBarowNam.setCellValue("コメントや質問");
				
				//Position the Cell at row6
				Cell cellMotrowSau = rowSau.createCell(0);
				Cell cellHairowSau = rowSau.createCell(1);
				Cell cellBonrowSau = rowSau.createCell(3);
				cellMotrowSau.setCellValue("電話番号");
				cellHairowSau.setCellValue(list.get(i).getPhone());
				cellBonrowSau.setCellValue(list.get(i).getComment());
				
				//Position the Cell at row7
				Cell cellMotrowBay = rowBay.createCell(0);
				Cell cellHairowBay = rowBay.createCell(1);
				cellMotrowBay.setCellValue("Eメール");
				cellHairowBay.setCellValue(list.get(i).getEmail());
				
				//Position the Cell at row8
				Cell cellMotrowTam = rowTam.createCell(0);
				Cell cellHairowTam = rowTam.createCell(1);
				cellMotrowTam.setCellValue("住所");
				cellHairowTam.setCellValue(list.get(i).getAddress());
				
				//Position the Cell at row9
				Cell cellMotrowChin = rowChin.createCell(0);
				Cell cellHairowChin = rowChin.createCell(1);
				cellMotrowChin.setCellValue("国");
				cellHairowChin.setCellValue(list.get(i).getCountry());
				
				//Position the Cell at row10
				Cell cellMotrowMuoi = rowMuoi.createCell(0);
				Cell cellHairowMuoi = rowMuoi.createCell(1);
				cellMotrowMuoi.setCellValue("状態");
				cellHairowMuoi.setCellValue(list.get(i).getState());
				
				//Position the Cell at row11
				Cell cellMotrowMuoiMot = rowMuoiMot.createCell(0);
				Cell cellHairowMuoiMot = rowMuoiMot.createCell(1);
				cellMotrowMuoiMot.setCellValue("郵便番号");
				cellHairowMuoiMot.setCellValue(list.get(i).getZipCode());
				
				//Position the Cell at row12
				Cell cellMotrowMuoiHai = rowMuoiHai.createCell(0);
				Cell cellHairowMuoiHai = rowMuoiHai.createCell(1);
				cellMotrowMuoiHai.setCellValue("都市");
				cellHairowMuoiHai.setCellValue(list.get(i).getCity());
			
				//add row cell  file excel	
			}
			
			try {
				workbook.write(response.getOutputStream());
				workbook.close();
			} catch (FileNotFoundException e) {
				return mapping.findForward(ERROR);
			} catch (IOException e) {
				return mapping.findForward(ERROR);
			}	
		}
		
		//Update student
		if (UPDATE.equalsIgnoreCase(studentForm.getSubmit())) {
			//Define parameter title1 get data form
			String title1 = request.getParameter("titleeee");
			//Define parameter get data form
			String insitution1 = request.getParameter("inss");
			//Define variable studentCode
			String studentCode = studentForm.getStudentCode();
			//Define variable firstName
			String firstName = studentForm.getFirstName();
			//Define variable lastName
			String lastName = studentForm.getLastName();
			//Define variable title
			String title = studentForm.getTitle();
			//Define variable quantity
			int quantity = studentForm.getQuantity();
			//Define variable Institution
			String insitution = studentForm.getInsitution();
			//Define variable phone
			String phone = studentForm.getPhone();
			//Define variable email
			String email = studentForm.getEmail();
			//Define variable address
			String address = studentForm.getAddress();
			//Define variable city
			String city = studentForm.getCity();
			//Define variable state
			String state = studentForm.getState();
			//Define variable zipCode
			String zipCode = studentForm.getZipCode();
			//Define variable country
			String country = studentForm.getCountry();
			//Define variable systemName
			String systemName = studentForm.getSystemName();
			//Define variable timePurchase
			String timePurchase = studentForm.getTimePurchase();
			//Define variable place
			String place = studentForm.getPlace();
			//Define variable comment
			String comment = studentForm.getComment();		
			//Define value for Student
			Student stObj = new Student(studentCode, firstName, lastName, title, quantity, insitution, phone, email, address, city, state, zipCode, country, systemName, timePurchase, place, comment);
			studentBO.updateStudent(stObj);
			listStudent = studentBO.getListSearchStudent(insitution1, title1);				
			studentForm.setListStudent(listStudent);
			message = "[CTC000070I] を更新しました。";
			studentForm.setMessageUpdate(message);
			studentForm.setListMessage("Mess"); 
					
		}
		studentForm.setListStates(listStates);
		studentForm.setListSystems(listSystems);
		studentForm.setListCountry(listCountry);
		studentForm.setListInstitution(listInstitution);
		return mapping.findForward(SCREENSTUDENT);
		}catch (Exception e) {
			return mapping.findForward(ERROR);
		}
	}
}
