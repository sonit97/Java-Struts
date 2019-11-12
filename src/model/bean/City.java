
package model.bean;
/**
 *City
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
/**
 * @author PC
 *
 */
public class City {
	private String code ;
	private String country ;
	private String name ;
	
	
	/**
	 * @return code
	 */
	public String getCode() {
		return code;
	}
	
	/**
	 * @param code
	 */
	public void setCode(String code) {
		this.code = code;
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
	 * @return name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @param code
	 * @param country
	 * @param name
	 */
	public City(String code, String country, String name) {
		super();
		this.code = code;
		this.country = country;
		this.name = name;
	}
	
	/**
	 * 
	 */
	public City() {
		super();
	}
}
