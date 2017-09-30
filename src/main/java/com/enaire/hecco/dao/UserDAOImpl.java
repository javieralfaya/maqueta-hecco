package com.enaire.hecco.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.enaire.hecco.action.TestAction;
import com.enaire.hecco.domain.User;


@Component
public class UserDAOImpl implements UserDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	Logger logger=Logger.getLogger(UserDAOImpl.class);
	
	public List<User> getAllUsersFromJPQL() {
		
		Query aQuery=em.createQuery("select u from User u");
		
		TypedQuery<User> query = em.createNamedQuery("Users.findAll", User.class);
		
		List <User> aListUser = aQuery.getResultList();
		
		List <User> aListUserSecond = query.getResultList();
		
		logger.info("Ejecutada la query de usuarios");
		
		return aListUser;
		

	}

	@Override
	public List<User> getAllUsersFromCriteriaAPI() {
		 CriteriaBuilder cb = em.getCriteriaBuilder();
		 CriteriaQuery<User> q = cb.createQuery(User.class);
		 Root<User> c = q.from(User.class);
		 q.select(c);
		return (List<User>) q.select(c);
	}
	
	
	
	
	

}
