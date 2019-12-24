package imnotaweeb;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Test {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner reader = new Scanner(new File("src/imnotaweeb/animelist.txt"));
		ArrayList<URL> animelist = new ArrayList<URL>();
		while (reader.hasNextLine()) {
			animelist.add(new URL(reader.nextLine()));
		}
		animelist.remove(animelist.size() - 1);
		int j = 0;
		for (URL url : animelist) {
			System.out.println(j++ + " " + url.getUrl());
		}
		Document document;
		int i = 0;
		for (URL url : animelist) {
			try {
				document = Jsoup.connect(url.getUrl()).get();
				String title = document.title();
				url.setName(title);
				System.out.println(i++);
				System.out.println(url.getUrl());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		for (URL url : animelist) {
			System.out.println("1");
			System.out.println(url.getUrl());
			System.out.println(url.getName());
		}

	}

	static class URL {
		private String name;
		private String url;

		public URL(String name, String url) {
			this.name = name;
			this.url = url;
		}

		public URL(String url) {
			this.url = url;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getUrl() {
			return url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

	}
}
