
package action;

import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import model.bean.City;
import model.bo.CityBO;


/**
 * ListCityAction
 *
 * date Jul 30, 2018
 *
 * version 1.0	
 *
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * -------------------------------------
 * Jul 30, 2018     SonNPT		 Create
 */
public class ListCityAction extends Action {
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request,
			HttpServletResponse response) {
		try {
		/**
		 * getParameter
		 * listVendor
		 */
		String remittanceItemCode = (String)request.getParameter("idCountry");
		System.out.println(remittanceItemCode);
		//Define obj venBO
		CityBO venBO = new CityBO();
		//Get lisst city
		ArrayList<City> listCity = venBO.getListCity(remittanceItemCode);
		
		String optionVendor = "";
		//Define PrintWriter
		PrintWriter out = response.getWriter();
		int size = listCity.size();
		
		for(int i = 0 ; i < size ; i++) {
			optionVendor = "<option value = " + listCity.get(i).getName() + "> "+
					listCity.get(i).getName()+
					"</option>";
			out.print(optionVendor);
		}
	  
	    response.setContentType("text/text;charset = utf-8");
	    response.setHeader("cache-control", "no-cache");
		
		return null;
		}catch (Exception e) {
			return mapping.findForward("error");
		}
	}
	
}