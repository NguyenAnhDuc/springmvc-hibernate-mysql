package com.javacodegeeks.snippets.enterprise.model;

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
	/*@Column(name = "title", nullable = false) private String title;
	@Column(name = "overview", nullable = false) private String overview;
	@Column(name = "imdb_id", nullable = false) private int imdb_id;*/
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "movie_genre", 
			   joinColumns = {@JoinColumn(name="movie_id",nullable = false, updatable = false)},
			   inverseJoinColumns = {@JoinColumn(name = "genre_id",nullable = false, updatable = false)})
	private Set<Genre> genres;
	/*budget
	vote_average
	backdrop_path
	genres
	status
	runtime
	spoken_languages
	adult
	homepage
	id
	production_countries
	title
	overview
	production_companies
	belongs_to_collection
	imdb_id
	release_date
	original_title
	vote_count
	poster_path
	tagline
	revenue
	popularity
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
