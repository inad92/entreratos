package net.atos.apirest.model.request;

import javax.validation.constraints.Size;

public class CatalogRequest {
	
	Integer idCatalog;
	
	@Size(min=1,max=255)
	String nameCatalog;
	
	@Size(min=1,max=255)
	String descriptionCatalog;
	
	Integer durationCatalog;
	
	@Size(min=1,max=255)
	String plataformCatalog;
	
	@Size(min=1,max=255)
	String contentCatalog;
	
	@Size(min=1,max=255)
	String commentsCatalog;
	
	public CatalogRequest() {
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

	public String getDescriptionCatalog() {
		return descriptionCatalog;
	}

	public void setDescriptionCatalog(String descriptionCatalog) {
		this.descriptionCatalog = descriptionCatalog;
	}

	public Integer getDurationCatalog() {
		return durationCatalog;
	}

	public void setDurationCatalog(Integer durationCatalog) {
		this.durationCatalog = durationCatalog;
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

	public String getCommentsCatalog() {
		return commentsCatalog;
	}

	public void setCommentsCatalog(String commentCatalog) {
		this.commentsCatalog = commentCatalog;
	}

}
