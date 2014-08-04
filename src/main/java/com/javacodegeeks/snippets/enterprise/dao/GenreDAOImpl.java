package com.javacodegeeks.snippets.enterprise.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
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
	public Genre findGenreById(int id) {
		Session session = sessionFactory.getCurrentSession();
		System.out.println("tests Session Factory");
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

	@Override
	public Genre findGenreByTheMovieDbId(int theMovieDbId) {
		Criteria cr = sessionFactory.getCurrentSession().createCriteria(Genre.class);
		cr.add(Restrictions.eq("themoviedb_id", theMovieDbId));
		List results = cr.list();
		return (Genre)results.get(0);
	}

}