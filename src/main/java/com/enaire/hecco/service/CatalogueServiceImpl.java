package com.enaire.hecco.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.enaire.hecco.dao.ICatalogueDAO;
import com.enaire.hecco.domain.Produit;
@Transactional
public class CatalogueServiceImpl implements ICatalogueService {
	private ICatalogueDAO dao;
	
	public void setDao(ICatalogueDAO dao) {
		this.dao = dao;
	}

	public void addProduit(Produit p) {
		dao.addProduit(p);		
	}

	public List<Produit> listProduits() {
		return dao.listProduits();
	}

	public Produit getProduit(String idP) {
		return dao.getProduit(idP);
	}

	public void updateProduit(Produit p) {
		dao.updateProduit(p);
	}

	public void deleteProduit(String idP) {
		dao.deleteProduit(idP);
	}

}
