
package model.bean;
/**
 *Country
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
public class Country {
	private String code ;
	private String name ;
	private String continent ;
	
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
	 * @return continent
	 */
	public String getContinent() {
		return continent;
	}
	
	/**
	 * @param continent
	 */
	public void setContinent(String continent) {
		this.continent = continent;
	}
	
	/**
	 * @param code
	 * @param name
	 * @param continent
	 */
	public Country(String code, String name, String continent) {
		super();
		this.code = code;
		this.name = name;
		this.continent = continent;
	}
	
	/**
	 * 
	 */
	public Country() {
		super();
	}
}
