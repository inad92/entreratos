package net.atos.apirest.model.converter;

import java.util.List;

import net.atos.apirest.model.entity.CatalogEntity;
import net.atos.apirest.model.entity.FormationEntity;
import net.atos.apirest.model.entity.UserEntity;
import net.atos.apirest.model.request.CatalogRequest;
import net.atos.apirest.model.request.FormationRequest;
import net.atos.apirest.model.request.UserRequest;

public class Converter {

	public static UserEntity userRequestToUserEntity(UserRequest userRequest) {
		UserEntity userEntity = new UserEntity();
		userEntity.setUserDAS(userRequest.getUserDAS());
		userEntity.setUserRole(userRequest.getUserRole());
		userEntity.setFormationEntities(userRequest.getFormationEntities());
		return userEntity;
	}

	public static FormationEntity formationRequestToFormationEntity(FormationRequest formationRequest, CatalogEntity catalogEntity) {
		FormationEntity formationEntity = new FormationEntity();
		formationEntity.setIdFormation(formationRequest.getIdFormation());
		formationEntity.setDateFormation(formationRequest.getDateFormation());
		formationEntity.setHoursPerDay(formationRequest.getHoursPerDay());
		formationEntity.setCatalogEntity(catalogEntity);
		formationEntity.setCommentsFormation(formationRequest.getCommentsFormation());
		return formationEntity;
	}

	
	public static CatalogEntity catalogRequestToCatalogEntity(CatalogRequest catalogRequest) {
		CatalogEntity catalogEntity = new CatalogEntity();
		catalogEntity.setIdCatalog(catalogRequest.getIdCatalog());
		catalogEntity.setNameCatalog(catalogRequest.getNameCatalog());
		catalogEntity.setPlataformCatalog(catalogRequest.getPlataformCatalog());
		catalogEntity.setContentCatalog(catalogRequest.getContentCatalog());
		catalogEntity.setDurationCatalog(catalogRequest.getDurationCatalog());
		catalogEntity.setCommentsCatalog(catalogRequest.getCommentsCatalog());
		return catalogEntity;
	}
 

}
