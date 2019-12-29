package imnotaweeb;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class LinkCheck {
	public static String getTitle(String url) throws IOException {
		return Jsoup.connect(url).get().title();
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("there");
		Scanner reader = new Scanner(new File("src/imnotaweeb/animelisttest.txt"));
		Scanner sc = new Scanner(System.in);
		ArrayList<String> urls = new ArrayList<String>();
		while(reader.hasNext()) {
			urls.add(reader.nextLine());
		}
		System.out.println("here");
		System.out.println(urls.size());
		ArrayList<String> titles = new ArrayList<String>();
		for(int i = 0; i < urls.size(); i++) {
			System.out.println(urls.get(i));
			Document document;
			String title = " ";
			try {
				document = Jsoup.connect(urls.get(i)).get();
				title = document.title();
				titles.add(title);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Invalid Link");
				titles.add("Invalid Link");
				continue;
			}

			
		}
		BufferedWriter writer = new BufferedWriter(new FileWriter("src/imnotaweeb/animelisttest.txt"));
		PrintWriter wr = new PrintWriter(writer);
		for (int i = 0; i < urls.size(); i++) {
			System.out.println("Anime URL: " + urls.get(i));
			System.out.println("Anime Name: " + titles.get(i));
			System.out.println("1 = Easy, 0 = Regular");
			String num = Integer.toString(sc.nextInt());
			System.out.println("Keep current title? (Y or N)");
			String res = sc.next();
			if(!res.equals("Y") && !res.equals("y")) {
				titles.set(i, sc.nextLine());
			}else {
				
			}
			
			wr.println(num + "/69/" + titles.get(i) + "/69/" + urls.get(i));
		}
		wr.close();
		System.out.println("done");
	}

}
