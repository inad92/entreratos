package net.atos.apirest.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.atos.apirest.model.converter.Converter;
import net.atos.apirest.model.entity.FormationEntity;
import net.atos.apirest.model.entity.UserEntity;
import net.atos.apirest.model.request.UserRequest;
import net.atos.apirest.repository.UserRespository;
import net.atos.apirest.repository.FormationRespository;
import net.atos.apirest.service.UserService;


@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRespository userRepository;
	@Autowired
	FormationRespository formationRespository;
	@Autowired 
	UserRespository userRespository;
	
	FormationEntity formationEntity;
	
	UserEntity userEntity;
	
	@Override
	public UserEntity createUser(UserRequest userRequest) throws Exception {
		if (userRepository.existsByUserDAS(userRequest.getUserDAS())) 
		  	throw new Exception("Existe_Usuario");
		else 
			formationEntity = formationRespository.findByIdFormation(userRequest.getIdFormation());
			return  userRepository.save(Converter.userRequestToUserEntity(userRequest,formationEntity));
	
	}
	
	
	@Override
	public List <UserEntity> findAll(){
		return userRepository.findAll();
	}
	
	@Override
	public UserEntity findUser(UserRequest userRequest) throws Exception {
		if(userRepository.existsByUserDAS(userRequest.getUserDAS()))
		{
			return userRepository.findByUserDAS(userRequest.getUserDAS());
		}
		else {
			throw new Exception("No_Existe_Usuario");
		}
	}
	
	@Override
	public UserEntity updateUser(UserRequest userRequest) throws Exception {	
		if(userRepository.existsByUserDAS(userRequest.getUserDAS())) {
			return userRepository.save(Converter.userRequestToUserEntity(userRequest,formationEntity));
		} else {
			throw new Exception("No_Existe_Usuario");
		}
		
	}
	
	@Override
	public void deleteUser(UserRequest userRequest) throws Exception {
		if (userRepository.existsByUserDAS(userRequest.getUserDAS())) {
			userRepository.delete(Converter.userRequestToUserEntity(userRequest,formationEntity));
		} else {
			throw new Exception("Error: No se puede eliminar un usuario porque no existe");
		}
	}
	
	@Override
	public void addUserFormation(UserRequest userRequest){
		formationEntity = formationRespository.findByIdFormation(userRequest.getIdFormation());
		userEntity = userRespository.findByUserDAS(userRequest.getUserDAS());
		userRepository.save(Converter.addFormationEntityToUserEntity(userEntity, formationEntity));
	}
	
	@Override
	public void delUserFormation(UserRequest userRequest){
		formationEntity = formationRespository.findByIdFormation(userRequest.getIdFormation());
		userEntity = userRespository.findByUserDAS(userRequest.getUserDAS());
		userRepository.save(Converter.deleteFormationEntityToUserEntity(userEntity, formationEntity));
	}
	

	

}
