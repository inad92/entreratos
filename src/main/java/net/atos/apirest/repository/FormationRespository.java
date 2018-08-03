package net.atos.apirest.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.atos.apirest.model.entity.FormationEntity;

@Repository
public interface FormationRespository extends JpaRepository <FormationEntity, Serializable> {

	boolean existsByIdFormation(Integer idFormation);
	
	FormationEntity findByIdFormation(Integer idFormation);
	
}
