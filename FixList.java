package imnotaweeb;

import java.io.IOException;

import org.jsoup.Jsoup;

public class FixList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public static String getTitle(String url) throws IOException {
		return Jsoup.connect(url).get().title();
	}

}
