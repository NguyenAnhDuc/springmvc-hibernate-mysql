package com.javacodegeeks.snippets.enterprise.dao;

import java.util.List;

import com.javacodegeeks.snippets.enterprise.model.Genre;

public interface GenreDAO {
	
		  void persistGenre(Genre genre);
		  
		  Genre findGenreById(int id);

		  Genre findGenreByTheMovieDbId(int theMovieDbId);
		  
		  void updateGenre(Genre genre);
		  
		  void deleteGenre(Genre genre);
		  
}
