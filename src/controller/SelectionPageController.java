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
		String output = "";
		output += plates.getSelectionModel().getSelectedItem();
		output += "\n";
		if (platesBreakfast.isSelected()) output += Meal.BREAKFAST.toString() + "\n";
		if (platesLunch.isSelected()) output += Meal.LUNCH.toString() + "\n";
		if (platesDinner.isSelected()) output += Meal.DINNER.toString() + "\n";
		if (platesSnacks.isSelected()) output += Meal.SNACKS.toString();
		controller.changeView1(output);
		
	}
	
	public void selectionPageLogic2(ResultsPageController controller) {
		controller.changeView1(singlePlates.getSelectionModel().getSelectedItem()); // CONTROLLER METHOD CALL WORKS!!!
	}

	public void changeSceneToResultsPage1(ActionEvent event) {
		FXMLLoader loader = new FXMLLoader(resultsPageURL);
		Parent resultsPageParent = null;
		try {
			resultsPageParent = loader.load();// This line is when the initialize() method in ResultsPageController is called so that getController() below does not return null
		} catch (IOException e) {
			e.printStackTrace();
		}
		ResultsPageController controller = loader.<ResultsPageController>getController();
		selectionPageLogic1(controller);
		Scene resultsPageScene = new Scene(resultsPageParent);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(resultsPageScene);
		window.show();
	}
	
	public void changeSceneToResultsPage2(ActionEvent event) {
		FXMLLoader loader = new FXMLLoader(resultsPageURL);
		Parent resultsPageParent = null;
		try {
			resultsPageParent = loader.load();// This line is when the initialize() method in ResultsPageController is called so that getController() below does not return null
		} catch (IOException e) {
			e.printStackTrace();
		}
		ResultsPageController controller = loader.<ResultsPageController>getController();
		selectionPageLogic2(controller);
		Scene resultsPageScene = new Scene(resultsPageParent);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(resultsPageScene);
		window.show();
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
