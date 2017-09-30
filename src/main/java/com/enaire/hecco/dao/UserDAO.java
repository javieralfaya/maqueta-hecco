package com.enaire.hecco.dao;

import java.util.List;

import com.enaire.hecco.domain.User;

public interface UserDAO {
	
	public List<User> getAllUsersFromJPQL();
	
	public List<User> getAllUsersFromCriteriaAPI();
	

}
