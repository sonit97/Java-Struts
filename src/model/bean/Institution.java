package model.bean;

/**
 *Institution
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
public class Institution {
	private String institutionCode ;
	private String institutionName;
	private String foundedDate;
	private String level ;
	
	/**
	 * @return institutionCode
	 */
	public String getInstitutionCode() {
		return institutionCode;
	}
	/**
	 * @param institutionCode
	 */
	public void setInstitutionCode(String institutionCode) {
		this.institutionCode = institutionCode;
	}
	
	/**
	 * @return institutionName
	 */
	public String getInstitutionName() {
		return institutionName;
	}
	
	/**
	 * @param institutionName
	 */
	public void setInstitutionName(String institutionName) {
		this.institutionName = institutionName;
	}
	
	/**
	 * @return foundedDate
	 */
	public String getFoundedDate() {
		return foundedDate;
	}
	
	/**
	 * @param foundedDate
	 */
	public void setFoundedDate(String foundedDate) {
		this.foundedDate = foundedDate;
	}
	
	/**
	 * @return level
	 */
	public String getLevel() {
		return level;
	}
	
	/**
	 * @param level
	 */
	public void setLevel(String level) {
		this.level = level;
	}
	
	/**
	 * @param institutionCode
	 * @param institutionName
	 * @param foundedDate
	 * @param level
	 */
	public Institution(String institutionCode, String institutionName, String foundedDate, String level) {
		super();
		this.institutionCode = institutionCode;
		this.institutionName = institutionName;
		this.foundedDate = foundedDate;
		this.level = level;
	}
	
	/**
	 * 
	 */
	public Institution() {
		super();
	}
	@Override
	public String toString() {
		return "Institution [institutionCode=" + institutionCode + ", institutionName=" + institutionName
				+ ", foundedDate=" + foundedDate + ", level=" + level + "]";
	}

}
