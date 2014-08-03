package com.javacodegeeks.snippets.enterprise.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MOVIE")
public class Movie {

	@Id
	@Column (name = "ID", nullable = false)
	@GeneratedValue
	private int id;

	@Column(name = "NAME", nullable = false) private String name;
	@Column(name = "AGE", nullable = false) private long age;
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

}
