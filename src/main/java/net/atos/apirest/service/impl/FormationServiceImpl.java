package net.atos.apirest.service.impl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.atos.apirest.model.converter.Converter;
import net.atos.apirest.model.entity.CatalogEntity;
import net.atos.apirest.model.entity.FormationEntity;
import net.atos.apirest.model.entity.UserEntity;
import net.atos.apirest.model.entity.FormationEntity;
import net.atos.apirest.model.request.CatalogRequest;
import net.atos.apirest.model.request.FormationRequest;
import net.atos.apirest.model.request.FormationRequest;
import net.atos.apirest.repository.CatalogRepository;
import net.atos.apirest.repository.FormationRespository;
import net.atos.apirest.repository.UserRespository;
import net.atos.apirest.service.FormationService;


@Service
public class FormationServiceImpl implements FormationService {
	
	@Autowired
	FormationRespository formationRepository;
	@Autowired
	CatalogRepository catalogRepository;
	
	
	CatalogEntity idCatalogEntity;

	
	@Override
	public FormationEntity createFormation(FormationRequest formationRequest) throws Exception {
		if (formationRepository.existsByIdFormation(formationRequest.getIdFormation())) {
			throw new Exception("Ya existe formación con esa ID");
		}  	
		else {
			if(catalogRepository.existsByIdCatalog(formationRequest.getIdCatalog())){
				idCatalogEntity = catalogRepository.findByIdCatalog(formationRequest.getIdCatalog());
				return  formationRepository.save(Converter.formationRequestToFormationEntity(formationRequest, idCatalogEntity));
			}
			else
			{
				throw new Exception("No existe id_catalog");
			}
		}
	
	}

	@Override
	public List <FormationEntity> findAll(){
		return formationRepository.findAll();
	}
	
	@Override
	public FormationEntity updateFormation(FormationRequest formationRequest) throws Exception {	
		if(formationRepository.existsByIdFormation(formationRequest.getIdFormation())) {
			idCatalogEntity = catalogRepository.findByIdCatalog(formationRequest.getIdCatalog());
			return formationRepository.save(Converter.formationRequestToFormationEntity(formationRequest, idCatalogEntity));
		} else {
			throw new Exception("No Existe Formacion");
		}
		
	}
	
	@Override
	public void deleteFormation(FormationRequest formationRequest) throws Exception {
		if (formationRepository.existsByIdFormation(formationRequest.getIdFormation())) {
			idCatalogEntity = catalogRepository.findByIdCatalog(formationRequest.getIdCatalog());
			formationRepository.delete(Converter.formationRequestToFormationEntity(formationRequest, idCatalogEntity));
		} else {
			throw new Exception("Error: No se puede eliminar un usuario porque no existe");
		}
	}
}
