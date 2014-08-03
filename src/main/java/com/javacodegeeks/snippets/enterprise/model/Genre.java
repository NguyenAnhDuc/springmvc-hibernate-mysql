package com.javacodegeeks.snippets.enterprise.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "GENRE")
public class Genre {

	@Id
	@Column (name = "ID", nullable = false)
	@GeneratedValue
	private int id;

	@Column(name = "NAME", nullable = false) private String name;
	@Column(name = "THEMOVIEDB_ID", nullable = false) private int themoviedb_id;
	public Genre(String name, int themoviedb_id){
		this.name = name;
		this.themoviedb_id = themoviedb_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getThemoviedb_id() {
		return themoviedb_id;
	}
	public void setThemoviedb_id(int themoviedb_id) {
		this.themoviedb_id = themoviedb_id;
	}
	
}
