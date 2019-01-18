/**
 * 
 */
package utility;

/**
 * @author Safwah
 *
 */
public enum Measurement {
	GRAM ("g"), LITRE ("l");
	
	private final String name;
	Measurement(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
}
