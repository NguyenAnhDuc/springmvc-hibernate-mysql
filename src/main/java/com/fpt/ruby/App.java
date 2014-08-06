package com.fpt.ruby;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fpt.ruby.model.Genre;
import com.fpt.ruby.model.Movie;
import com.fpt.ruby.model.ProductionCountry;
import com.fpt.ruby.service.GenreService;
import com.fpt.ruby.service.MovieService;

public class App {

	public static void main(String[] args) {
		System.out.println("load context");
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		MovieService movieService = (MovieService) context.getBean("movieService");
		GenreService genreService = (GenreService) context.getBean("genreService");
		Movie movie = new Movie();
		/*
		movie.setOriginal_title("before sunrise");
		Genre genre1 = new Genre("comedy", 123);
		Genre genre2 = new Genre("romance",12);
		Set<Genre> genres = new HashSet<Genre>();
		genres.add(genre1);
		genres.add(genre2);
		movie.setGenres(genres);*/
		
		
		/*Set<ProductionCountry> production_countries = new HashSet<ProductionCountry>();
		ProductionCountry productionCountry = new ProductionCountry();
		productionCountry.setIso_3166_1("12");
		productionCountry.setName("US");
		production_countries.add(productionCountry);
		movie.setProduction_countries(production_countries);*/
		movie.setOriginal_title("before sunrise");
		
		movieService.persistMovie(movie);
		
		System.out.println("+++ GET GENRES +++");
		Movie newMovie = movieService.getMovieByIdWithAllLazy(1);
		//Movie newMovie = movieService.findMovieById(2);
		System.out.println("Movie original title: " + newMovie.getOriginal_title());
		
		/*Set<Genre> genress = newMovie.getGenres();
		for (Genre genre : genress){
			System.out.println(genre.getName());
		}*/
		
		//Set<ProductionCompany> productionCompanies = newMovie.getProduction_companies();
		//System.out.println(newMovie.getProduction_companies().size());
		/*System.out.println);
		for (ProductionCompany productionCompany : productionCompanies){
			System.out.println(productionCompany.getName());
		}*/
		
		context.close();
	}

}
