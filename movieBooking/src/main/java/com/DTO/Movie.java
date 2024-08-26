package com.DTO;

public class Movie {

	private String id;
	private String name;
	private String date;
	private Integer featured;
	private String duration;
	private String description;
	private String fkeyname;
	 
	@Override
	public String toString() {
		return "Movie [Id=" + id + ", name=" + name + ", date=" + date + ", featured=" + featured + ", duration="
				+ duration + ", description=" + description + ", fkeyname=" + fkeyname + "]";
	}
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Integer getFeatured() {
		return featured;
	}
	public void setFeatured(Integer featured) {
		this.featured = featured;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getFkeyname() {
		return fkeyname;
	}
	public void setFkeyname(String fkeyname) {
		this.fkeyname = fkeyname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
