package springexample;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.hibernate.service.jta.platform.internal.JOnASJtaPlatform;
import org.json.JSONArray;
import org.json.JSONObject;
import com.fpt.qa.helper.*;
public class MovieCrawl {
	
	
	public static void testDiscover() throws Exception{
		String jsonString = HttpHelper.sendGet("http://api.themoviedb.org/3/discover/movie?api_key=97081040da72479871eba2f996c0ea2d&page=1001");
		JSONObject jsonArray = new JSONObject(jsonString);
		JSONArray results = jsonArray.getJSONArray("results");
		System.out.println(results.length());
		for (int i=0;i<results.length();i++) {
			JSONObject result = results.getJSONObject(i);
			System.out.println(result.get("original_title"));
		}
	}
	
	public static void testMovie() throws Exception{
		String jsonString = HttpHelper.sendGet("https://api.themoviedb.org/3/movie/100402?api_key=97081040da72479871eba2f996c0ea2d");
		JSONObject json = new JSONObject(jsonString);
		String[] keys = json.getNames(json);
		for (String key : keys){
			System.out.println(key);
		}
	}
	
	public static void crawlMovie(int theMovieId) throws Exception{
		String url = "https://api.themoviedb.org/3/movie/" +  theMovieId + "?api_key=97081040da72479871eba2f996c0ea2d";
		String jsonString = HttpHelper.sendGet(url);
		JSONObject json = new JSONObject(jsonString);
		String[] keys = json.getNames(json);
		
		for (String key : keys){
		}
	}
	
	public static void crawlPage(int page){
		
	}
	
	public static void crawlAll(int maxPage){
		for (int i=1;i<=maxPage;i++){
			crawlPage(i);
		}
	}
	
	public static void main(String[] args) throws Exception {
		testMovie();
		//testDiscover();
	}
}
