package imnotaweeb;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Game {

	public static void main(String[] args) {
		Application.launch(GameStart.class, args);
	}
	


	public Game(String mode) throws FileNotFoundException {
		this.mode = mode;
		if (this.mode.equals("Easy")) {
			setEasy();
		} else if (this.mode.equals("Medium")) {
			setMedium();
		} else if (this.mode.equals("Hard")) {
			setHard();
		} else {
			setMedium();
		}
	}



	public static class GameStart extends Application {
		private GridPane rootPane;
		private ArrayList<Anime> animelist = new ArrayList<Anime>();
		private String mode;
		@Override
		public void start(Stage primaryStage) {
			// TODO Auto-generated method stub
			rootPane = new GridPane();
			primaryStage.setTitle("Ok");
			GridPane root = new GridPane();
			primaryStage.setScene(new Scene(root,750,750));
			primaryStage.show();
		}
		public Pane getPane() {
			return rootPane;
		}
		
		public void setEasy() {
			animelist.add(new Anime("TestE", "E"));
			System.out.println("easy set");
			String[] array = {"Easy"};
			

		}

		public ArrayList<Anime> getList() {
			return animelist;
		}
		

		
		public void setMedium() throws FileNotFoundException {
			Scanner reader = new Scanner(new File("src/imnotaweeb/animelist.txt"));
			ArrayList<String> urls = new ArrayList<String>();
			while (reader.hasNextLine()) {
				urls.add(reader.nextLine());
			}
			urls.remove(urls.size() - 1);
			ArrayList<Anime> result = new ArrayList<Anime>();
			for (String a : urls) {
				System.out.println(a);
			}
			System.out.println("med set");

		}

		public void setHard() {
			animelist.add(new Anime("TestH", "H"));
			System.out.println("hard set");
		}

	}
}