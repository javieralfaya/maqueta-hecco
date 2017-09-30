package com.enaire.hecco.service;

import com.enaire.hecco.dao.CatalogueDAOImpl;

public class ServiceSingleton {
  private static CatalogueServiceImpl service;
  static{
	  CatalogueDAOImpl dao=new CatalogueDAOImpl();
	  dao.initialisation();
	  service=new CatalogueServiceImpl();
	  service.setDao(dao);
  }
  public static ICatalogueService getService(){
	  return service;
  }
}
