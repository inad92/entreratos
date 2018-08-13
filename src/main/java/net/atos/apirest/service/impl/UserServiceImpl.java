package net.atos.apirest.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import net.atos.apirest.model.converter.Converter;
import net.atos.apirest.model.entity.FormationEntity;
import net.atos.apirest.model.entity.UserEntity;
import net.atos.apirest.model.request.FormationRequest;
import net.atos.apirest.model.request.UserRequest;
import net.atos.apirest.repository.UserRespository;
import net.atos.apirest.repository.FormationRespository;
import net.atos.apirest.repository.UserRespository;
import net.atos.apirest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRespository userRepository;
	
	@Autowired
	FormationRespository formationRepository;

	@Override
	public UserEntity createUser(UserRequest userRequest) throws Exception {
		if (userRepository.existsByUserDAS(userRequest.getUserDAS())) {
			throw new Exception("Existe_Usuario");
		} else {
			List<FormationRequest> listFormationRequest = userRequest.getFormationRequest();
			List<FormationEntity> listFormationEntity = new ArrayList<FormationEntity>();
			for(int i = 0; i < listFormationRequest.size(); i++) 
			{
				FormationEntity formationEntity = new FormationEntity();
				FormationRequest formationRequest = listFormationRequest.get(i);
				formationEntity = formationRepository.findByIdFormation(formationRequest.getIdFormation());
				listFormationEntity.add(formationEntity);
			}
			return userRepository.save(Converter.userRequestToUserEntity(userRequest,listFormationEntity));
		}
	}

	@Override
	public List<UserEntity> findAll() {
		return userRepository.findAll();
	}

	@Override
	public UserEntity findUser(UserRequest userRequest) throws Exception {
		if (userRepository.existsByUserDAS(userRequest.getUserDAS())) {
			return userRepository.findByUserDAS(userRequest.getUserDAS());
		} else {
			throw new Exception("No_Existe_Usuario");
		}
	}

	@Override
	public UserEntity updateUser(UserRequest userRequest) throws Exception {
		System.out.println(userRequest.getUserDAS());
		if (userRepository.existsByUserDAS(userRequest.getUserDAS())) {
			List<FormationRequest> listFormationRequest = userRequest.getFormationRequest();
			List<FormationEntity> listFormationEntity = new ArrayList<FormationEntity>();
			for(int i = 0; i < listFormationRequest.size(); i++) 
			{
				FormationEntity formationEntity = new FormationEntity();
				FormationRequest formationRequest = listFormationRequest.get(i);
				formationEntity = formationRepository.findByIdFormation(formationRequest.getIdFormation());
				listFormationEntity.add(formationEntity);
			}
			return userRepository.save(Converter.userRequestToUserEntity(userRequest,listFormationEntity));
		} else {
			throw new Exception("No_Existe_Usuario");
		}
	}

	@Override
	public void deleteUser(UserRequest userRequest) throws Exception {
		if (userRepository.existsByUserDAS(userRequest.getUserDAS())) {
			List<FormationRequest> listFormationRequest = userRequest.getFormationRequest();
			List<FormationEntity> listFormationEntity = new ArrayList<FormationEntity>();
			for(int i = 0; i < listFormationRequest.size(); i++) 
			{
				FormationEntity formationEntity = new FormationEntity();
				FormationRequest formationRequest = listFormationRequest.get(i);
				formationEntity = formationRepository.findByIdFormation(formationRequest.getIdFormation());
				listFormationEntity.add(formationEntity);
			}
			userRepository.delete(Converter.userRequestToUserEntity(userRequest,listFormationEntity));
		} else {
			throw new Exception("Error: No se puede eliminar un usuario porque no existe");
		}
	}

}
