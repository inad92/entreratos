package net.atos.apirest.model.request;

import net.atos.apirest.model.entity.FormationEntity;
import net.atos.apirest.model.view.View;

import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonView;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

public class UserRequest {

	@Size(min = 7, max = 7)
	String userDAS;

	Integer userRole;

	List<FormationRequest> formationRequest = new ArrayList<FormationRequest>();

	// Constructores
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

	public List<FormationRequest> getFormationRequest() {
		return formationRequest;
	}

	public void setFormationRequest(List<FormationRequest> formationRequest) {
		this.formationRequest = formationRequest;
	}

}
