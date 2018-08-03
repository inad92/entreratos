package net.atos.apirest.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.atos.apirest.model.entity.CatalogEntity;

@Repository
public interface CatalogRepository extends JpaRepository <CatalogEntity, Serializable> {

	boolean existsByIdCatalog(Integer idCatalog);
	
	CatalogEntity findByIdCatalog(Integer catalogEntity);
	
}
