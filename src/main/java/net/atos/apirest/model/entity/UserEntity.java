package net.atos.apirest.model.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;

import lombok.Data;
import net.atos.apirest.model.view.View;

@Data
@Entity
@Table(name="USERS")
public class UserEntity {

	@Id
	@Column
	@JsonView(View.Public.class)
	private String userDAS;
	
	@Column
	@JsonView(View.Public.class)
	private Integer userRole;
	
	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(name ="formation_user",
		joinColumns = @JoinColumn(name="user_DAS",referencedColumnName = "userDAS"),
		inverseJoinColumns = @JoinColumn(name="formation_id",
		referencedColumnName = "idFormation"))
	@JsonView(View.Public.class)
	private List<FormationEntity> formationEntities = new ArrayList<FormationEntity>();
	
	public UserEntity() {
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