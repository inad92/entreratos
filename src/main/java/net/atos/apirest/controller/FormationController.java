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

import net.atos.apirest.model.entity.FormationEntity;
import net.atos.apirest.model.request.FormationRequest;
import net.atos.apirest.model.view.View;
import net.atos.apirest.service.FormationService;

@RestController
 class FormationController {

	@Autowired
	FormationService formationService;
	
	public FormationController() {
		super();
	}
	
	@CrossOrigin(origins = "*")
	@PostMapping("formations")
	@JsonView(View.Public.class)
	public FormationEntity createFormation(@Valid @RequestBody final FormationRequest formationRequest) throws Exception {
		return formationService.createFormation(formationRequest);	 
	}
	
	@CrossOrigin(origins = "*")
	@GetMapping("formations")
	@JsonView(View.Public.class)
	public List <FormationEntity>  findAll(){
		return formationService.findAll();
	}
	
	@CrossOrigin(origins = "*")
	@PutMapping("formations")
	@JsonView(View.Public.class)
	public FormationEntity updateFormation(@Valid @RequestBody final FormationRequest formationRequest) throws Exception {
		return formationService.updateFormation(formationRequest);
	}
	
	@CrossOrigin(origins = "*")
	@DeleteMapping("formations")
	@JsonView(View.Public.class)
	public void deleteFormation(@Valid @RequestBody final FormationRequest formationRequest) throws Exception {
		formationService.deleteFormation(formationRequest);
	}

}
