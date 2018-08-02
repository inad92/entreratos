package net.atos.apirest.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;

import net.atos.apirest.model.entity.UserEntity;
import net.atos.apirest.model.request.UserRequest;
import net.atos.apirest.model.view.View;
import net.atos.apirest.service.UserService;

@RestController
 class UserController {

	@Autowired
	UserService userService;
	
	public UserController() {
		super();
	}
	
	@CrossOrigin(origins = "*")
	@PostMapping("users")
	public UserEntity createUser(@Valid @RequestBody final UserRequest userRequest) throws Exception {
		return userService.createUser(userRequest);	 
	}
	
	@CrossOrigin(origins = "*")
	@GetMapping("users")
	public List <UserEntity>  findAll(){
		return userService.findAll();
	}
	
	@CrossOrigin(origins = "*")
	@GetMapping("findUser")
	public UserEntity findUser(UserRequest userRequest) throws Exception{
		return userService.findUser(userRequest);
	}
	
	@CrossOrigin(origins = "*")
	@PutMapping("users")
	public UserEntity updateUser(@Valid @RequestBody final UserRequest userRequest) throws Exception {
		return userService.updateUser(userRequest);
	}
	
	@CrossOrigin(origins = "*")
	@DeleteMapping("users")
	public void deleteUser(@Valid @RequestBody final UserRequest userRequest) throws Exception {
		userService.deleteUser(userRequest);
	}
	
	@CrossOrigin(origins = "*")
	@PutMapping("addUserFormation")
	public void addUserFormation(@Valid @RequestBody final UserRequest userRequest) {
		userService.addUserFormation(userRequest);
	}
	
	@CrossOrigin(origins = "*")
	@PutMapping("delUserFormation")
	public void delUserFormation(@Valid @RequestBody final UserRequest userRequest) {
		userService.delUserFormation(userRequest);
	}
	
}
