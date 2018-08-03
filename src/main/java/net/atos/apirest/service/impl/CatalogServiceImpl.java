package net.atos.apirest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.atos.apirest.model.converter.Converter;
import net.atos.apirest.model.entity.CatalogEntity;
import net.atos.apirest.model.request.CatalogRequest;
import net.atos.apirest.repository.CatalogRepository;
import net.atos.apirest.service.CatalogService;


@Service
public class CatalogServiceImpl implements CatalogService {
	
	@Autowired
	CatalogRepository catalogRepository;
	
	
	@Override
	public CatalogEntity createCatalog(CatalogRequest catalogRequest) throws Exception {
		if (catalogRepository.existsByIdCatalog(catalogRequest.getIdCatalog())) 
		  	throw new Exception("Existe_Usuario");
		else  
			return  catalogRepository.save(Converter.catalogRequestToCatalogEntity(catalogRequest));
	
	}
	
	
	@Override
	public List <CatalogEntity> findAll(){
		return catalogRepository.findAll();
	}
	
	@Override
	public CatalogEntity updateCatalog(CatalogRequest catalogRequest) throws Exception {	
		if(catalogRepository.existsByIdCatalog(catalogRequest.getIdCatalog())) {
			return catalogRepository.save(Converter.catalogRequestToCatalogEntity(catalogRequest));
		} else {
			throw new Exception("No_Existe_Usuario");
		}
		
	}
	
	@Override
	public void deleteCatalog(CatalogRequest catalogRequest) throws Exception {
		if (catalogRepository.existsByIdCatalog(catalogRequest.getIdCatalog())) {
			catalogRepository.delete(Converter.catalogRequestToCatalogEntity(catalogRequest));
		} else {
			throw new Exception("Error: No se puede eliminar un usuario porque no existe");
		}
	}
	

}
