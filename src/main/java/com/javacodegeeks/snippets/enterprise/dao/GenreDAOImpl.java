package com.javacodegeeks.snippets.enterprise.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javacodegeeks.snippets.enterprise.model.Genre;

@Repository("genreDAO")
public class GenreDAOImpl implements GenreDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void persistGenre(Genre genre) {
		sessionFactory.getCurrentSession().persist(genre);
	}

	@Override
	public Genre findGenreById(String id) {
		return (Genre) sessionFactory.getCurrentSession().get(Genre.class, id);
	}

	@Override
	public void updateGenre(Genre genre) {
		sessionFactory.getCurrentSession().update(genre);

	}
	@Override
	public void deleteGenre(Genre genre) {
		sessionFactory.getCurrentSession().delete(genre);

	}

}