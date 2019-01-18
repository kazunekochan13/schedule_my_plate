/**
 * 
 */
package backend;

import utility.Measurement;

/**
 * @author Safwah
 *
 */
public class Ingredient {

	private String name;
	private Float quantity;
	private Measurement unit;
	
	public Ingredient(String name, Float quantity, Measurement unit) {
		this.name = name;
		this.quantity = quantity;
		this.unit = unit;
	}
	
	public String getName() {
		return name;
	}
	
	public Float getQuantity() {
		return quantity;
	}
	
	public Measurement getMeasurement() {
		return unit;
	}
	
	public String toString() {
		return String.format("%.2f %s %s", quantity, unit.toString(), name);
	}
	
}
