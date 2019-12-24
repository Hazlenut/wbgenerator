package imnotaweeb;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class MainScreen extends Application{
	public static void main(String[] args) {
		
		launch(args);
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		String[] modes = {"Easy", "Medium", "Hard"};
		primaryStage.setTitle("Fuck Weebs");
		
        GridPane root = new GridPane();
        for(int i = 0; i <= 500; i += 250) {
        	root.getColumnConstraints().add(new ColumnConstraints(250));
        }
        for(int i = 0; i <= 625; i+=125) {
        	root.getRowConstraints().add(new RowConstraints(125));
        }
		Label title = new Label("Anime Opening Quiz");
		title.setFont(Font.font("Verdana", FontWeight.EXTRA_BOLD, 15));
		root.add(title, 1, 0);
		GridPane.setHalignment(title, HPos.CENTER);
		
		for (int i = 0; i < 3; i ++) {
			Button button = new Button(modes[i]);
			root.add(button, i, 1);
			GridPane.setHalignment(button, HPos.CENTER);
		}
        primaryStage.setScene(new Scene(root, 750, 750));
        primaryStage.show();
	}
}
