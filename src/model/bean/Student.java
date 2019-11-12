package model.bean;


/**
 *Student
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
public class Student {
	private String studentCode ;    //student code of table student
	private String firstName;		//firstName of table student
	private String lastName;		//lastName of table student
	private String title ;			//title of table student
	private int quantity;			//quantity of table student
	private String insitution;		//insitution of table student
	private String phone;			//phone  of table student
	private String email;			//email  of table student
	private String address;			//address  of table student
	private String city;			//city  of table student
	private String state;			//state  of table student
	private String zipCode;			//zipCode  of table student
	private String country;			//country  of table student
	private String systemName;		//systemName  of table student
	private String timePurchase;	//timePurchase  of table student
	private String place;			//place  of table student
	private String comment;			//comment  of table student
	
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
	 * @param quatity
	 */
	public void setQuantity(int quatity) {
		this.quantity = quatity;
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
	 * @return
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
	 * @return timePurchase
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
	 * @return
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
	 * 
	 */
	public Student() {
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
	public Student(String studentCode, String firstName, String lastName, String title, int quantity, String insitution,
			String phone, String email, String address, String city, String state, String zipCode, String country,
			String systemName, String timePurchase, String place, String comment) {
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
}
