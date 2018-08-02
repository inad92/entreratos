package net.atos.apirest.model.request;

import javax.annotation.Nullable;
import javax.validation.constraints.Size;

public class UserRequest {

	@Size(min=7, max=7)
	String userDAS;
	Integer userRole;
	Integer idFormation;
	
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

	public Integer getIdFormation() {
		return idFormation;
	}

	public void setIdFormation(Integer idFormation) {
		this.idFormation = idFormation;
	}
	
}
