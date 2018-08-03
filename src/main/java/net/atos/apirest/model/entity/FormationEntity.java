package net.atos.apirest.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonView;

import net.atos.apirest.model.view.View;

@Entity
@Table(name="FORMATION")
public class FormationEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idFormation")
	Integer idFormation;
	
	@Column(name="dateFormation")
	Date dateFormation;
	
	@Column(name="hoursPerDay")
	Integer hoursPerDay;
	
	@Column(name="commentsFormation")
	String commentsFormation;
	
	@ManyToOne
	@JoinColumn(name = "idCatalog", referencedColumnName = "idCatalog")
	private CatalogEntity catalogEntity;
	
	public FormationEntity() {
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

	public CatalogEntity getCatalogEntity() {
		return catalogEntity;
	}

	public void setCatalogEntity(CatalogEntity catalogEntity) {
		this.catalogEntity = catalogEntity;
	}

	public String getCommentsFormation() {
		return commentsFormation;
	}

	public void setCommentsFormation(String commentsFormation) {
		this.commentsFormation = commentsFormation;
	}

}