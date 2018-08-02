package net.atos.apirest.service;

import java.util.List;

import net.atos.apirest.model.entity.UserEntity;
import net.atos.apirest.model.request.UserRequest;


public interface UserService {
	
	/**
	 * Método para crear usuario	
	 * @param userRequest
	 * @throws Exception 
	 */
	public UserEntity createUser(UserRequest userRequest) throws Exception;
	
	/**
	 * Método para buscar todos los ususarios
	 * @return
	 */
	public List <UserEntity> findAll();

	/**
	 * Método para actualizar usuario
	 * @param userRequest
	 * @return
	 * @throws Exception
	 */
	
	public UserEntity findUser(UserRequest userRequest) throws Exception;
	
	public UserEntity updateUser(UserRequest userRequest) throws Exception;

	/**
	 * Método para eliminar usuario
	 * @param userRequest
	 * @return
	 * @throws Exception
	 */
	public void deleteUser(UserRequest userRequest) throws Exception;
	
	public UserEntity addUserFormation(UserRequest userRequest) throws Exception;
	
	public UserEntity delUserFormation(UserRequest userRequest) throws Exception;

}
