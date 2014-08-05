package com.fpt.ruby.dao;

import com.fpt.ruby.model.Movie;

public interface MovieDAO {
	
		  void persistMovie(Movie movie);
		  
		  Movie findMovieById(int id);
		  
		  Movie findMovieByTheMovieDbId(int theMovieDbId);
		  
		  void updateMovie(Movie movie);
		  
		  void deleteMovie(Movie movie);
		  
}
