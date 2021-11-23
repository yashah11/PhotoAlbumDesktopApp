/**
 * @author Yash Shah
 * @author Aaron Argueta
 */
package photos;

import controller.LoginScreenController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Photos extends Application {

	/**
	 * starts application
	 * 
	 * @param mainStage
	 *            the main stage
	 */
	@Override
	public void start(Stage mainStage) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("/view/LoginScreen.fxml"));
			Pane root = (Pane) loader.load();
			Scene scene = new Scene(root);

			mainStage.setScene(scene);
			mainStage.setResizable(false);
			mainStage.setTitle("Photo Album Desktop Application");
			mainStage.show();

			LoginScreenController controller = loader.<LoginScreenController>getController();
			controller.start(mainStage);

		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	/**
	 * main method
	 * 
	 * @param args
	 *            command-line arguments
	 */
	public static void main(String[] args) {
		launch(args);
	}

}
