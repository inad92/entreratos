package net.atos.apirest.model.request;

import java.io.Serializable;
import java.util.Date;

import net.atos.apirest.model.entity.CatalogEntity;

public class FormationRequest {
	
	Integer idFormation;
	Date dateFormation;
	Integer hoursPerDay;
	String commentsFormation;
	Integer idCatalog;
	

	public FormationRequest() {
		super();
	}

	public Integer getIdFormation() {
		return idFormation;
	}

	public void setIdFormation(Integer idFormation) {
		this.idFormation = idFormation;
	}

	public Date getDateFormation() {
		return dateFormation;
	}

	public void setDateFormation(Date dateFormation) {
		this.dateFormation = dateFormation;
	}

	

	public Integer getHoursPerDay() {
		return hoursPerDay;
	}

	public void setHoursPerDay(Integer hoursPerDay) {
		this.hoursPerDay = hoursPerDay;
	}

	public Integer getIdCatalog() {
		return idCatalog;
	}

	public void setIdCatalog(Integer idCatalog) {
		this.idCatalog = idCatalog;
	}
	
	public String getCommentsFormation() {
		return commentsFormation;
	}

	public void setCommentsFormation(String commentsFormation) {
		this.commentsFormation = commentsFormation;
	}
	
}
