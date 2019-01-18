/**
 * 
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * @author Safwah
 *
 */
public class ResultsPageController implements Initializable {

	private String selectionPageURL = "/xml/SelectionPage.fxml";
	
	@FXML
	private TextArea view1;
	@FXML
	private TextArea view2InstructionList;
	@FXML
	private TextArea view2ShoppingList;
	@FXML
	private TextArea view3;
	
	public void changeView1(String recipe) {
		view1.setText(recipe);
	}

	public void changeSceneToSelectionPage(ActionEvent event) {
		try {
			Parent selectionPageParent = FXMLLoader.load(getClass().getResource(selectionPageURL));
			Scene selectionPageScene = new Scene(selectionPageParent);
			// this line gets the stage information
			Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
			window.setScene(selectionPageScene);
			window.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}

}
