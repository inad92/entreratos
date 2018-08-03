package net.atos.apirest.service;

import java.util.List;

import net.atos.apirest.model.entity.CatalogEntity;
import net.atos.apirest.model.request.CatalogRequest;

public interface CatalogService {
	
	public CatalogEntity createCatalog(CatalogRequest catalogRequest) throws Exception;
	
	public CatalogEntity updateCatalog(CatalogRequest catalogRequest) throws Exception;

	public void deleteCatalog(CatalogRequest catalogRequest) throws Exception;

	public List<CatalogEntity> findAll();
	
}
