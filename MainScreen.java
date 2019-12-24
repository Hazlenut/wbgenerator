package imnotaweeb;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainScreen extends Application{
	public static void main(String[] args) {
		
		launch(args);
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.setTitle("Fuck Weebs");
		StackPane root = new StackPane();
		primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
	}
}
