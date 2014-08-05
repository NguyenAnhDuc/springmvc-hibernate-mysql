package com.fpt.ruby;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fpt.ruby.model.Employee;
import com.fpt.ruby.model.Genre;
import com.fpt.ruby.model.Movie;
import com.fpt.ruby.service.EmployeeService;
import com.fpt.ruby.service.GenreService;
import com.fpt.ruby.service.MovieService;

public class App {

	public static void main(String[] args) {
		System.out.println("load context");
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		MovieService movieService = (MovieService) context.getBean("movieService");
		GenreService genreService = (GenreService) context.getBean("genreService");
		/*Movie movie = new Movie();
		movie.setOriginal_title("before sunset");
		Genre genre1 = new Genre("comedy", 123);
		Genre genre2 = new Genre("romance",12);
		Set<Genre> genres = new HashSet<Genre>();
		genres.add(genre1);
		genres.add(genre2);
		movie.setGenres(genres);
		movieService.persistMovie(movie);*/
		Genre genre = genreService.findGenreByTheMovieDbId(123);
		System.out.println(genre.getName());
		context.close();
	}

}
