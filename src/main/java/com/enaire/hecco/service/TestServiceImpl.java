package com.enaire.hecco.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enaire.hecco.dao.UserDAO;
import com.enaire.hecco.domain.User;
@Service
public class TestServiceImpl implements TestService {
    
	@Autowired
	private UserDAO userDao;

	
	@Override
	public List<User> getAllUsersFromJPQL() {
		return userDao.getAllUsersFromJPQL();
	}

	@Override
	public List<User> getAllUsersFromCriteriaAPI() {
		return userDao.getAllUsersFromCriteriaAPI();
	}

}
