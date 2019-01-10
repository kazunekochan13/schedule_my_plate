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
	
	private final String unit;
	Measurement(String unit) {
		this.unit = unit;
	}
	
	public String unit() {
		return unit;
	}
}
