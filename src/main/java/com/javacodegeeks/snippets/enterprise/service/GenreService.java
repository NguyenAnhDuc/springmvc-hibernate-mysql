package com.javacodegeeks.snippets.enterprise.service;

import java.util.List;

import com.javacodegeeks.snippets.enterprise.model.Genre;

public interface GenreService {

	void persistGenre(Genre genre);

	Genre findGenreById(int id);

	Genre findGenreByTheMovieDbId(int id);

	void updateGenre(Genre genre);

	void deleteGenre(Genre genre);
}
