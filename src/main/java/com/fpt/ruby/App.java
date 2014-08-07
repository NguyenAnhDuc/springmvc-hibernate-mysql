package com.fpt.ruby;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fpt.ruby.model.Genre;
import com.fpt.ruby.model.Movie;
import com.fpt.ruby.model.ProductionCountry;
import com.fpt.ruby.model.SpokenLanguage;
import com.fpt.ruby.service.GenreService;
import com.fpt.ruby.service.MovieService;
import com.fpt.ruby.service.SpokenLanguageService;

public class App {

	public static void main(String[] args) {
		System.out.println("load context");
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		MovieService movieService = (MovieService) context.getBean("movieService");
		GenreService genreService = (GenreService) context.getBean("genreService");
		SpokenLanguageService spokenLanguageService = (SpokenLanguageService) context.getBean("spokenLanguageService");
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
		productionCountry.setIso_3166_1("1233");
		productionCountry.setName("UK");
		production_countries.add(productionCountry);
		movie.setProduction_countries(production_countries);
		movie.setOriginal_title("before sunrise");*/
		
		/*Set<SpokenLanguage> spoken_languages = new HashSet<SpokenLanguage>();
		SpokenLanguage spokenLanguage = new SpokenLanguage();
		spokenLanguage.setIso_639_1("123");
		spokenLanguage.setName("Vietnamese");
		spoken_languages.add(spokenLanguage);
		movie.setSpoken_languages(spoken_languages);
		movieService.persistMovie(movie);
		movie.setAdult(true);*/
		//String date = "2014-03-21";
		//Date date = new Date(2014, 3, 3);
		//movie.setRelease_date(date);
		
		/*Genre genre = genreService.findGenreById(12);
		Set<Genre> genres = new HashSet<Genre>();
		genres.add(genre);
		movieService.persistMovie(movie);
		movie.setGenres(genres);
		movieService.updateMovie(movie);*/
		
		//Movie newMovie = movieService.getMovieByIdWithAllLazy(25);
		//Movie newMovie = movieService.findMovieById(2);
		//System.out.println("Movie original title: " + newMovie.getOriginal_title());
		//System.out.println("Adult: " + newMovie.isAdult());
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
		SpokenLanguage spokenLanguage = spokenLanguageService.findSpokenLanguageByIso_639_1("fr");
		System.out.println(spokenLanguage.getName());
		
		context.close();
	}

}
