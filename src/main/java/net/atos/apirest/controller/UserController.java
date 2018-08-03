package net.atos.apirest.controller;

import net.atos.apirest.model.entity.UserEntity;
import net.atos.apirest.model.request.UserRequest;
import net.atos.apirest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

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

}

