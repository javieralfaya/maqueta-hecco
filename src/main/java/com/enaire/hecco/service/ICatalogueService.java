package com.enaire.hecco.service;
import java.util.List;

import com.enaire.hecco.domain.Produit;
public interface ICatalogueService {
	  public void addProduit(Produit p);
	  public List<Produit> listProduits();
	  public Produit getProduit(String idP);
	  public void updateProduit(Produit p);
	  public void deleteProduit(String idP);
}
