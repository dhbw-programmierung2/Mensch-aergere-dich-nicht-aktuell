package launcher;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;


/**
 * Diese Klasse f�hrt den Controller aus
 * 
 * @author Luckas, Kim, Isabelle, Jonas
 * @version 1.0
 */
public class MainLauncher extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Launcher.fxml")); 
	        primaryStage.setTitle("Game Board"); 
	        primaryStage.setScene(new Scene(root, 750, 450)); 
	        primaryStage.show(); 
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
		public static void main(String[] args) {
		launch(args);
	}

}
