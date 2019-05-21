package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import db.DbConnection;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * 
 * @author Safwah
 *
 */
public class LandingPageController implements Initializable {

	/**
	 * 
	 * @param event
	 */
	public void changeSceneToSelectionPage(ActionEvent event) {
		try {
			Parent selectionPageParent = FXMLLoader.load(getClass().getResource("/xml/SelectionPage.fxml"));
			Scene selectionPageScene = new Scene(selectionPageParent);
			// this line gets the stage information
			Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
			window.setScene(selectionPageScene);
			window.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 */
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		DbConnection dbconn = new DbConnection();
	}

}
