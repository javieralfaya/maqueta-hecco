package com.enaire.hecco.dao;
import java.util.List;

import com.enaire.hecco.domain.Produit;
public interface ICatalogueDAO {
  public void addProduit(Produit p);
  public List<Produit> listProduits();
  public Produit getProduit(String idP);
  public void updateProduit(Produit p);
  public void deleteProduit(String idP);
}
