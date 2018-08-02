package net.atos.apirest.service;



import java.util.List;

import net.atos.apirest.model.entity.FormationEntity;
import net.atos.apirest.model.request.FormationRequest;



public interface FormationService {

	public FormationEntity createFormation(FormationRequest formationRequest) throws Exception;

	public FormationEntity updateFormation(FormationRequest formationRequest) throws Exception;

	public void deleteFormation(FormationRequest formationRequest) throws Exception;

	public List<FormationEntity> findAll();

}
