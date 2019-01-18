/**
 * 
 */
package utility;

/**
 * @author Safwah @ www.safwah.codes
 *
 */
public enum Meal {
	
	BREAKFAST("Breakfast"), LUNCH("Lunch"), DINNER("Dinner"), SNACKS("Snacks x2");
	
	private final String name;
	Meal(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
	
}
