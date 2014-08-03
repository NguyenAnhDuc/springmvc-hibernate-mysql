package com.javacodegeeks.snippets.enterprise.dao;

import com.javacodegeeks.snippets.enterprise.model.Genre;

public interface GenreDAO {
	
		  void persistGenre(Genre genre);
		  
		  Genre findGenreById(String id);
		  
		  void updateGenre(Genre genre);
		  
		  void deleteGenre(Genre genre);
		  
}
