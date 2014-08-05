package com.fpt.ruby.model;

import java.sql.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "MOVIE")
public class Movie {

	@Id
	@Column (name = "ID", nullable = false)
	@GeneratedValue
	private int id;

	@Column(name = "original_title", nullable = false) private String original_title;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "movie_genre", 
			   joinColumns = {@JoinColumn(name="movie_id",nullable = false, updatable = false)},
			   inverseJoinColumns = {@JoinColumn(name = "genre_id",nullable = false, updatable = false)})
	private Set<Genre> genres;
	
	@Column(name = "adult", nullable = false) private boolean adult;
	@Column(name = "budget", nullable = false) private double budget;
	@Column(name = "homepage", nullable = false) private int homepage;
	@Column(name = "imdb_id", nullable = false) private String imdb_id;
	@Column(name = "popularity", nullable = false) private String popularity;
	
	@Column(name = "release_date", nullable = false) private Date release_date;
	@Column(name = "revenue", nullable = false) private double revenue;
	@Column(name = "runtime", nullable = false) private int runtime;
	@Column(name = "status", nullable = false) private String status;
	@Column(name = "overview", nullable = false) private String overview;
	@Column(name = "tagline", nullable = false) private String tagline;
	@Column(name = "title", nullable = false) private String title;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "movie_productioncountry", 
			   joinColumns = {@JoinColumn(name="movie_id",nullable = false, updatable = false)},
			   inverseJoinColumns = {@JoinColumn(name = "iso_3166_1",nullable = false, updatable = false)})
	private Set<Genre> production_countries;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "movie_spokenlanguage", 
			   joinColumns = {@JoinColumn(name="movie_id",nullable = false, updatable = false)},
			   inverseJoinColumns = {@JoinColumn(name = "iso_639_1",nullable = false, updatable = false)})
	private Set<Genre> spoken_languages;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "movie_productioncompany", 
			   joinColumns = {@JoinColumn(name="movie_id",nullable = false, updatable = false)},
			   inverseJoinColumns = {@JoinColumn(name = "genre_id",nullable = false, updatable = false)})
	private Set<Genre> production_companies;
	
	/*
	spoken_languages
	production_countries
	production_companies
*/

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOriginal_title() {
		return original_title;
	}

	public void setOriginal_title(String original_title) {
		this.original_title = original_title;
	}

	/*public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public int getImdb_id() {
		return imdb_id;
	}

	public void setImdb_id(int imdb_id) {
		this.imdb_id = imdb_id;
	}*/

	public Set<Genre> getGenres() {
		return genres;
	}

	public void setGenres(Set<Genre> genres) {
		this.genres = genres;
	}
}
