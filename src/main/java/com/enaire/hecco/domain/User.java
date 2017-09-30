package com.enaire.hecco.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * 
 * @author AlfayaFJ
 * Modela la entidad usuario.
 */

@Entity
@Table(name = "USERS")
@NamedQuery(name="Users.findAll", query="SELECT u FROM User u") 
public class User {

	
	@Id
	@Column(name = "ID")
	private Long id;
	
	
	@Column(name = "FULLNAME")
	private String fullName;


	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}


	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}


	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	
	

}
