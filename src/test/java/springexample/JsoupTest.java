package springexample;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupTest {
	public static void main(String[] args) throws Exception {
		Document doc = Jsoup.connect("http://phimchieurap.vn/lich-chieu/ha-noi/rap/platinum-garden-mall?date=0").timeout(100000).get();
		Elements newsHeadlines = doc.select("#ShowtimeItemResult");
		for (Element element : newsHeadlines) {
			Element headElement =  element.getElementsByClass("head").first();
			//System.out.print(headElement.select("span").select("a").last().text());
			Elements btnDigitalElenments = element.select("#BoxTime").first()
												  .select(".TimesContent").first()
												  .select(".content").first()
												  .select(".bntDigital");
			for (Element element2 : btnDigitalElenments) {
				System.out.print(" " + element2.select("span").first().text());
				
			}
			
			System.out.println();
		}
		
		
		
		
		
		
		
	}
}
