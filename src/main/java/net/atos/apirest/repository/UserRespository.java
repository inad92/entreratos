package net.atos.apirest.repository;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.atos.apirest.model.entity.UserEntity;


@Repository
public interface UserRespository extends JpaRepository <UserEntity, Serializable> {
	
	boolean existsByUserDAS(String username);
	
	UserEntity findByUserDAS(String userDAS);
	
}
