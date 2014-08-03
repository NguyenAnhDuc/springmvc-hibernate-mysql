package com.javacodegeeks.snippets.enterprise.service;

import com.javacodegeeks.snippets.enterprise.model.Genre;

public interface GenreService {

	void persistGenre(Genre genre);

	Genre findGenreById(String id);

	void updateGenre(Genre genre);

	void deleteGenre(Genre genre);
}
