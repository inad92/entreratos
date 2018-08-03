package net.atos.apirest.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonView;

@Entity
@Table(name="CATALOG")
public class CatalogEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idCatalog")
	Integer idCatalog;
	
	@Column(name="nameCatalog")
	String nameCatalog;
	
	@Column(name="plataformCatalog")
	String plataformCatalog;
	
	@Column(name="contentCatalog")
	String contentCatalog;
	
	@Column(name="durationCatalog")
	Integer durationCatalog;
	
	@Column(name="commentsCatalog")
	String commentsCatalog;
	
	public CatalogEntity() {
		super();
	}

	public Integer getIdCatalog() {
		return idCatalog;
	}

	public void setIdCatalog(Integer idCatalog) {
		this.idCatalog = idCatalog;
	}

	public String getNameCatalog() {
		return nameCatalog;
	}

	public void setNameCatalog(String nameCatalog) {
		this.nameCatalog = nameCatalog;
	}

	public String getPlataformCatalog() {
		return plataformCatalog;
	}

	public void setPlataformCatalog(String plataformCatalog) {
		this.plataformCatalog = plataformCatalog;
	}

	public String getContentCatalog() {
		return contentCatalog;
	}

	public void setContentCatalog(String contentCatalog) {
		this.contentCatalog = contentCatalog;
	}

	public Integer getDurationCatalog() {
		return durationCatalog;
	}

	public void setDurationCatalog(Integer durationCatalog) {
		this.durationCatalog = durationCatalog;
	}

	public String getCommentsCatalog() {
		return commentsCatalog;
	}

	public void setCommentsCatalog(String commentsCatalog) {
		this.commentsCatalog = commentsCatalog;
	}

}
