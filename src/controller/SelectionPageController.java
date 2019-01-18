/**
 * 
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;
import utility.Meal;
import utility.Period;

/**
 * @author Safwah
 *
 */
public class SelectionPageController implements Initializable {

	private String resultsPageString = "/xml/ResultsPage.fxml";
	private URL resultsPageURL = getClass().getResource(resultsPageString);
	
	@FXML
	private ChoiceBox<String> plates;
	
	@FXML
	private CheckBox platesBreakfast;
	@FXML
	private CheckBox platesLunch;
	@FXML
	private CheckBox platesDinner;
	@FXML
	private CheckBox platesSnacks;
	
	@FXML
	private ChoiceBox<String> singlePlates;
	
	
	public void selectionPageLogic1(ResultsPageController controller) {
		
	}
	
	public void selectionPageLogic2(ResultsPageController controller) {
		
	}
	
	public void changeSceneToResultsPage(ActionEvent event, FXMLLoader loader) {
		try {
			Parent resultsPageParent = loader.load();
			Scene resultsPageScene = new Scene(resultsPageParent);
			// this line gets the stage information
			Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
			window.setScene(resultsPageScene);
			window.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

	public void changeSceneToResultsPage1(ActionEvent event) {
		// logic inserted here
		FXMLLoader loader = new FXMLLoader(resultsPageURL);
		ResultsPageController controller = loader.getController();
		selectionPageLogic1(controller);
		// logic ends here
		changeSceneToResultsPage(event, loader);
	}
	
	public void changeSceneToResultsPage2(ActionEvent event) {
		// logic inserted here
		FXMLLoader loader = new FXMLLoader(resultsPageURL);
		ResultsPageController controller = loader.getController();
		selectionPageLogic2(controller);
		// logic ends here
		changeSceneToResultsPage(event, loader);
	}
	
	/**
	 * 
	 */
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		plates.setItems(FXCollections.observableArrayList(
				Period.DAY.toString(), 
				Period.WEEK.toString()));
		plates.getSelectionModel().selectFirst();
		
		singlePlates.setItems(FXCollections.observableArrayList(
				Meal.BREAKFAST.toString(), 
				Meal.LUNCH.toString(), 
				Meal.DINNER.toString(), 
				Meal.SNACKS.toString()));
		singlePlates.getSelectionModel().selectFirst();
		
	}
	
	
	
}
