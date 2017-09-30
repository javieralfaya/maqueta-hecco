package com.enaire.hecco.action;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.enaire.hecco.domain.User;
import com.enaire.hecco.service.TestService;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 
 * @author AlfayaFJ
 * Action para test
 *
 */
public class TestAction extends ActionSupport {

	private static final long serialVersionUID = 1262304416972186622L;
	@Autowired
	private TestService testService;
	Logger logger=Logger.getLogger(TestAction.class);
  
	/**
	 * Método de test para ejecución de consulta en JPA con una JPQL.
	 * @return String SUCCESS
	 */
	public String listUser() {
		List<User> aListUser = new ArrayList<User>();
		aListUser = testService.getAllUsersFromJPQL();

		return SUCCESS;
	}
	
	/**
	 * Método de test para ejecución de consulta en JPA con el PI de criteria.
	 * @return
	 */
	public String listUserFromCriteria() {
		List<User> aListUser = new ArrayList<User>();
		aListUser = testService.getAllUsersFromCriteriaAPI();
		return SUCCESS;
	}

}
