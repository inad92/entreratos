package net.atos.apirest.model.request;

import java.util.Date;

import javax.validation.constraints.Size;

public class FormationRequest {

	Integer idFormation;

	Date dateFormation;

	Integer hoursPerDay;

	@Size(min = 1, max = 255)
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
