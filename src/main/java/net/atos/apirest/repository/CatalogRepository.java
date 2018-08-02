package net.atos.apirest.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.atos.apirest.model.entity.CatalogEntity;
import net.atos.apirest.model.entity.FormationEntity;
import net.atos.apirest.model.entity.UserEntity;
import net.atos.apirest.model.request.CatalogRequest;


@Repository
public interface CatalogRepository extends JpaRepository <CatalogEntity, Serializable> {

	boolean existsByIdCatalog(Integer idCatalog);
	
	CatalogEntity findByIdCatalog(Integer catalogEntity);
	
}
