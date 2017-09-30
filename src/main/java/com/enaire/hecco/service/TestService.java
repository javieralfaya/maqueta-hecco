package com.enaire.hecco.service;

import java.util.List;

import com.enaire.hecco.domain.User;

/**
 * 
 * @author AlfayaFJ
 * Interface de prueba
 */

public interface TestService {
	
	public List<User>  getAllUsersFromJPQL();
	public List<User>  getAllUsersFromCriteriaAPI();
	
	

}
