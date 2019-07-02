package net.maximilianosantiago.rpg.model;

import java.util.Date;

public class Session {

	Long id;
	String description;
	Date createdDate;
	Date closeDate;
	
	public Session(Long id, String description, Date createdDate, Date closeDate) {
		this.id = id;
		this.description = description;
		this.createdDate = createdDate;
		this.closeDate = closeDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getCloseDate() {
		return closeDate;
	}

	public void setCloseDate(Date closeDate) {
		this.closeDate = closeDate;
	}
	
}
