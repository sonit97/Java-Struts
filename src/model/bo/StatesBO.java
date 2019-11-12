package model.bo;

import java.util.ArrayList;

import model.bean.States;
import model.dao.StatesDAO;

/**
 *StatesBO
 *
 *date July 30, 2018
 *
 *version 1.0	
 *
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * -------------------------------------
 * July 30, 2018     SonNPT		 Create
 */
public class StatesBO {
	public ArrayList<States> getListStates() throws ClassNotFoundException {
		StatesDAO dao = new StatesDAO();
		return dao.getListStates();
		
		
	}

}
