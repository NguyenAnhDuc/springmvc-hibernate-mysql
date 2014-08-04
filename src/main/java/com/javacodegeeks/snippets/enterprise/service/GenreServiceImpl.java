package com.javacodegeeks.snippets.enterprise.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javacodegeeks.snippets.enterprise.dao.GenreDAO;
import com.javacodegeeks.snippets.enterprise.model.Genre;

@Service("genreService")
public class GenreServiceImpl implements GenreService{

	@Autowired
	GenreDAO GenreDAO;
	
	@Override
	@Transactional
	public void persistGenre(Genre genre) {
		GenreDAO.persistGenre(genre);
		
	}

	@Override
	@Transactional
	public void updateGenre(Genre genre) {
		GenreDAO.updateGenre(genre);
		
	}
	
	

	@Override
	@Transactional
	public void deleteGenre(Genre genre) {
		GenreDAO.deleteGenre(genre);
		
	}
	
	@Override
	@Transactional
	public Genre findGenreById(int id) {
		return GenreDAO.findGenreById(id);
	}

	@Override
	@Transactional
	public Genre findGenreByTheMovieDbId(int theMovieDbId) {
		return GenreDAO.findGenreByTheMovieDbId(theMovieDbId);
	}

}
