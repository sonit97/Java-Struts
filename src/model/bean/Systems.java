
package model.bean;
/**
 *Systems
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
public class Systems {
	private String systemName ;
	private String timePurchase ;
	
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
	 * @param systemName
	 * @param timePurchase
	 */
	public Systems(String systemName, String timePurchase) {
		super();
		this.systemName = systemName;
		this.timePurchase = timePurchase;
	}
	
	/**
	 * @param timePurchase
	 */
	public Systems(String timePurchase) {
		super();
		this.timePurchase = timePurchase;
	}
	
	/**
	 * 
	 */
	public Systems() {
		super();
	}
}
