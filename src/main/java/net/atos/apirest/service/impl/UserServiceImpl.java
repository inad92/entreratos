package net.atos.apirest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import net.atos.apirest.model.converter.Converter;
import net.atos.apirest.model.entity.UserEntity;
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

	@Override
	public UserEntity createUser(UserRequest userRequest) throws Exception {
		if (userRepository.existsByUserDAS(userRequest.getUserDAS())) {
			throw new Exception("Existe_Usuario");
		} else {
			return userRepository.save(Converter.userRequestToUserEntity(userRequest));
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
		if (userRepository.existsByUserDAS(userRequest.getUserDAS())) {
			return userRepository.save(Converter.userRequestToUserEntity(userRequest));
		} else {
			throw new Exception("No_Existe_Usuario");
		}
	}

	@Override
	public void deleteUser(UserRequest userRequest) throws Exception {
		if (userRepository.existsByUserDAS(userRequest.getUserDAS())) {
			userRepository.delete(Converter.userRequestToUserEntity(userRequest));
		} else {
			throw new Exception("Error: No se puede eliminar un usuario porque no existe");
		}
	}

}
