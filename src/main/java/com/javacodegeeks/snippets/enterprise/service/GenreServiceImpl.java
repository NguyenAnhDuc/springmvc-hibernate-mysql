package com.javacodegeeks.snippets.enterprise.service;

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
	public Genre findGenreById(String id) {
		return GenreDAO.findGenreById(id);
	}

	@Override
	@Transactional
	public void deleteGenre(Genre genre) {
		GenreDAO.deleteGenre(genre);
		
	}

}
