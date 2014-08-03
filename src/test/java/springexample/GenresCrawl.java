package springexample;

import org.json.JSONArray;
import org.json.JSONObject;

import com.fpt.qa.helper.HttpHelper;
import com.javacodegeeks.snippets.enterprise.model.Genre;
import com.javacodegeeks.snippets.enterprise.service.EmployeeService;
import com.javacodegeeks.snippets.enterprise.service.GenreService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GenresCrawl {
	public static void main(String[] args) throws Exception{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		GenreService genreService = (GenreService) context.getBean("genreService");
		String  jsonString = HttpHelper.sendGet("http://api.themoviedb.org/3/genre/movie/list?api_key=97081040da72479871eba2f996c0ea2d");
		JSONObject json = new JSONObject(jsonString);
		JSONArray genres = json.getJSONArray("genres");
		for (int i=0;i<genres.length();i++){
			JSONObject genreJSon = genres.getJSONObject(i);
			Genre genre = new Genre(genreJSon.getString("name"),genreJSon.getInt("id"));
			genreService.persistGenre(genre);
		}
		/*Genre genre = new Genre("test", 123);
		genreService.persistGenre(genre);*/
	}
}
