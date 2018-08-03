package net.atos.apirest.model.request;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nullable;
import javax.validation.constraints.Size;

import net.atos.apirest.model.entity.FormationEntity;

public class UserRequest {

	@Size(min=7, max=7)
	String userDAS;
	Integer userRole;
	List<FormationEntity> formationEntities = new ArrayList<FormationEntity>();
	
	//Constructores
	public UserRequest() {
		super();
	}

	public String getUserDAS() {
		return userDAS;
	}

	public void setUserDAS(String userDAS) {
		this.userDAS = userDAS;
	}

	public Integer getUserRole() {
		return userRole;
	}

	public void setUserRole(Integer userRole) {
		this.userRole = userRole;
	}

	public List<FormationEntity> getFormationEntities() {
		return formationEntities;
	}

	public void setFormationEntities(List<FormationEntity> formationEntities) {
		this.formationEntities = formationEntities;
	}
	
}
