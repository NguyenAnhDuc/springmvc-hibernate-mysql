package com.fpt.ruby.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fpt.ruby.model.Movie;

@Repository("MovieDAO")
public class MovieDAOImpl implements MovieDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void persistMovie(Movie movie) {
		sessionFactory.getCurrentSession().persist(movie);
	}

	@Override
	public Movie findMovieById(int id) {
		return (Movie) sessionFactory.getCurrentSession().get(Movie.class, id);
	}

	@Override
	public Movie findMovieByTheMovieDbId(int theMovieDbId) {
		// TODO Auto-generated method stub
		return (Movie) sessionFactory.getCurrentSession().get(Movie.class, theMovieDbId);
	}
	
	@Override
	public void updateMovie(Movie Movie) {
		sessionFactory.getCurrentSession().update(Movie);

	}
	@Override
	public void deleteMovie(Movie movie) {
		sessionFactory.getCurrentSession().delete(movie);

	}

	

}