/**
 * 
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author Safwah
 *
 */
public class SelectionPageController implements Initializable {

	private String resultsPageURL = "/xml/ResultsPage.fxml";

	public void changeSceneToResultsPage(ActionEvent event) {
		try {
			Parent resultsPageParent = FXMLLoader.load(getClass().getResource(resultsPageURL));
			Scene resultsPageScene = new Scene(resultsPageParent);
			// this line gets the stage information
			Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
			window.setScene(resultsPageScene);
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
		
	}
	
	
	
}
