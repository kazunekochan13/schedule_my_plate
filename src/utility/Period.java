/**
 * 
 */
package utility;

/**
 * @author Safwah @ www.safwah.codes
 *
 */
public enum Period {

	DAY("Day"), WEEK("Week");
	
	private final String name;
	Period(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
	
}
