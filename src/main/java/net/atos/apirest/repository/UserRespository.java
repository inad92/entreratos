package net.atos.apirest.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.atos.apirest.model.entity.UserEntity;

@Repository
public interface UserRespository extends JpaRepository <UserEntity, Serializable> {
	
	boolean existsByUserDAS(String username);
	
	UserEntity findByUserDAS(String userDAS);
	
}
