package form;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import model.bean.Country;
import model.bean.Institution;
import model.bean.States;
import model.bean.Student;
import model.bean.Systems;


/**
 *StudentForm
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
public class StudentForm extends ActionForm{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<Student> listStudent ;
	private ArrayList<Institution> listInstitution ;
	private ArrayList<Country> listCountry ;
	private ArrayList<Systems> listSystems;
	private ArrayList<States> listStates;
	private String studentCode ; 
	private String firstName;
	private String lastName;
	private String title ;
	private int quantity;
	private String insitution;
	private String phone;
	private String email;
	private String address;
	private String city;
	private String state;
	private String zipCode;
	private String country;
	private String systemName;
	private String timePurchase;
	private String place;
	private String comment;
	private String submit;
	private String search;
	private String title1 ;
	private String insitution1;
	private String messageUpdate;
	private String messageDelete;
	private String messageSearch;
	private String listMessage;
		
	/**
	 * 
	 */
	public StudentForm() {
		super();
	}
	
	/**
	 * @param studentCode
	 * @param firstName
	 * @param lastName
	 * @param title
	 * @param quantity
	 * @param insitution
	 * @param phone
	 * @param email
	 * @param address
	 * @param city
	 * @param state
	 * @param zipCode
	 * @param country
	 * @param systemName
	 * @param timePurchase
	 * @param place
	 * @param comment
	 */
	public StudentForm(String studentCode, String firstName, String lastName, String title, int quantity,
			String insitution, String phone, String email, String address, String city, String state, String zipCode,
			String country, String systemName, String timePurchase, String place, String comment) {
		super();
		this.studentCode = studentCode;
		this.firstName = firstName;
		this.lastName = lastName;
		this.title = title;
		this.quantity = quantity;
		this.insitution = insitution;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.country = country;
		this.systemName = systemName;
		this.timePurchase = timePurchase;
		this.place = place;
		this.comment = comment;
	}
	
	  
	
	
	/**
	 * @return messageSearch
	 */
	public String getMessageSearch() {
		return messageSearch;
	}

	/**
	 * @param messageSearch
	 */
	public void setMessageSearch(String messageSearch) {
		this.messageSearch = messageSearch;
	}

	/**
	 * @return
	 */
	public String getMessageDelete() {
		return messageDelete;
	}

	/**
	 * @param messageDelete
	 */
	public void setMessageDelete(String messageDelete) {
		this.messageDelete = messageDelete;
	}

	/**
	 * @return listMessage
	 */
	public String getListMessage() {
		return listMessage;
	}

	/**
	 * @param listMessage
	 */
	public void setListMessage(String listMessage) {
		this.listMessage = listMessage;
	}

	/**
	 * @return messageUpdate
	 */
	public String getMessageUpdate() {
		return messageUpdate;
	}

	/**
	 * @param messageUpdate
	 */
	public void setMessageUpdate(String messageUpdate) {
		this.messageUpdate = messageUpdate;
	}

	/**
	 * @return current title1
	 */
	public String getTitle1() {
		return title1;
	}

	/**
	 * 
	 * @param title1 title1 to set 
	 */
	public void setTitle1(String title1) {
		this.title1 = title1;
	}

	/**
	 * @return listStates
	 */
	public ArrayList<States> getListStates() {
		return listStates;
	}

	/**
	 * @param listStates
	 */
	public void setListStates(ArrayList<States> listStates) {
		this.listStates = listStates;
	}

	/**
	 * @return listSystems
	 */
	public ArrayList<Systems> getListSystems() {
		return listSystems;
	}

	/**
	 * @param listSystems
	 */
	public void setListSystems(ArrayList<Systems> listSystems) {
		this.listSystems = listSystems;
	}

	/**
	 * @return listCountry
	 */
	public ArrayList<Country> getListCountry() {
		return listCountry;
	}

	/**
	 * @param listCountry
	 */
	public void setListCountry(ArrayList<Country> listCountry) {
		this.listCountry = listCountry;
	}

	/**
	 * @return address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	/**
	 * @return listStudent
	 */
	public ArrayList<Student> getListStudent() {
		return listStudent;
	}



	/**
	 * @param listStudent
	 */
	public void setListStudent(ArrayList<Student> listStudent) {
		this.listStudent = listStudent;
	}



	/**
	 * @return listInstitution
	 */
	public ArrayList<Institution> getListInstitution() {
		return listInstitution;
	}



	/**
	 * @param listInstitution
	 */
	public void setListInstitution(ArrayList<Institution> listInstitution) {
		this.listInstitution = listInstitution;
	}



	/**
	 * @return studentCode
	 */
	public String getStudentCode() {
		return studentCode;
	}



	/**
	 * @param studentCode
	 */
	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}



	/**
	 * @return firstName
	 */
	public String getFirstName() {
		return firstName;
	}



	/**
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	/**
	 * @return lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return insitution
	 */
	public String getInsitution() {
		return insitution;
	}

	/**
	 * @param insitution
	 */
	public void setInsitution(String insitution) {
		this.insitution = insitution;
	}

	/**
	 * @return phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return zipCode
	 */
	public String getZipCode() {
		return zipCode;
	}

	/**
	 * @param zipCode
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	/**
	 * @return country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return systemName
	 */
	public String getSystemName() {
		return systemName;
	}

	/**
	 * @param systemName
	 */
	public void setSystemName(String systemName) {
		this.systemName = systemName;
	}

	/**
	 * @return
	 */
	public String getTimePurchase() {
		return timePurchase;
	}

	/**
	 * @param timePurchase
	 */
	public void setTimePurchase(String timePurchase) {
		this.timePurchase = timePurchase;
	}

	/**
	 * @return place
	 */
	public String getPlace() {
		return place;
	}

	/**
	 * @param place
	 */
	public void setPlace(String place) {
		this.place = place;
	}

	/**
	 * @return comment
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * @param comment
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	/**
	 * @return
	 */
	public String getSubmit() {
		return submit;
	}

	/**
	 * @param submit
	 */
	public void setSubmit(String submit) {
		this.submit = submit;
	}

	/**
	 * @return search
	 */
	public String getSearch() {
		return search;
	}

	/**
	 * @param search
	 */
	public void setSearch(String search) {
		this.search = search;
	}
	
	

	/**
	 * @return
	 */
	public String getInsitution1() {
		return insitution1;
	}

	/**
	 * @param insitution1
	 */
	public void setInsitution1(String insitution1) {
		this.insitution1 = insitution1;
	}

	@Override
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
    }
}
