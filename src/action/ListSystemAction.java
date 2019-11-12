package action;

import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import model.bean.Systems;
import model.bo.SystemsBO;

/**
 *ListSystemAction
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
public class ListSystemAction extends Action{
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		String remittanceItemCode = (String)request.getParameter("idSystem");	
		System.out.println(remittanceItemCode);
		//Define obj SysstemsBO
		SystemsBO sysBO = new SystemsBO();
		//Get list ListSystem
		ArrayList<Systems> listSystems = sysBO.getListSystem1(remittanceItemCode);
		
		String optionSystems = "";
		//Define PrintWriter
		PrintWriter out = response.getWriter();
		int size = listSystems.size();
		
		for(int i = 0 ; i < size ; i++) {
			optionSystems = "<option value = " + listSystems.get(i).getTimePurchase() + "> " + listSystems.get(i).getTimePurchase() + "</option>";
			out.print(optionSystems);
		}
	  
	    response.setContentType("text/text;charset=utf-8");
	    response.setHeader("cache-control", "no-cache");
		
		return null;
	}
}
