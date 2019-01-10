/**
 * 
 */
package backend;

import java.util.ArrayList;

/**
 * @author Safwah @ www.safwah.codes
 *
 */
public class Recipe {

	private String name;
	private ArrayList<Ingredient> ingredients;
	private String instructions;
	
	public Recipe(String name, ArrayList<Ingredient> ingredients, String instructions) {
		this.name = name;
		this.ingredients = ingredients;
		this.instructions = instructions;
	}
	
	public String getName() {
		return name;
	}
	
	public ArrayList<Ingredient> getIngredients() {
		return ingredients;
	}
	
	public String getInstructions() {
		return instructions;
	}
	
	public String getIngredientsToString() {
		String output = "";
		for (Ingredient ingredient:ingredients) {
			output += ingredient.toString() + "/n";
		}
		return output;
	}
	
	public String toString() {
		String output = "";
		output += name + "/n";
		output += "Ingredients: /n" + getIngredientsToString();
		output += "Instructions: /n" + instructions;
		return output;
	}
	
}
