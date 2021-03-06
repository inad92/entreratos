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

import net.atos.apirest.model.entity.CatalogEntity;
import net.atos.apirest.model.request.CatalogRequest;
import net.atos.apirest.model.view.View;
import net.atos.apirest.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
 class CatalogController {

	@Autowired
	CatalogService catalogService;
	
	public CatalogController() {
		super();
	}
	
	@CrossOrigin(origins = "*")
	@PostMapping("catalogs")
	@JsonView(View.Public.class)
	public CatalogEntity createCatalog(@Valid @RequestBody final CatalogRequest catalogRequest) throws Exception {
		return catalogService.createCatalog(catalogRequest);	 
	}
	
	@CrossOrigin(origins = "*")
	@GetMapping("catalogs")
	@JsonView(View.Public.class)
	public List <CatalogEntity>  findAll(){
		return catalogService.findAll();
	}
	
	@CrossOrigin(origins = "*")
	@PutMapping("catalogs")
	@JsonView(View.Public.class)
	public CatalogEntity updateCatalog(@Valid @RequestBody final CatalogRequest catalogRequest) throws Exception {
		return catalogService.updateCatalog(catalogRequest);
	}
	
	@CrossOrigin(origins = "*")
	@DeleteMapping("catalogs")
	@JsonView(View.Public.class)
	public void deleteCatalog(@Valid @RequestBody final CatalogRequest catalogRequest) throws Exception {
		catalogService.deleteCatalog(catalogRequest);
	}

}
