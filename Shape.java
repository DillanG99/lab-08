/**
 * represents the shapes of the game pieces
 * @author Dillan Gibbons
 *
 */
public enum Shape {
	THIMBLE, BOOT, RACECAR;
	
	/**
	 * returns the value of the Shape enum in lower case
	 */
	@Override
	public String toString() {
		return this.name().toLowerCase();
	}
}
