
public enum Color {
	RED(255, 0, 0), GREEN(0, 255, 0), BLUE(0, 0, 255), YELLOW(255, 255, 0), CYAN(0, 255, 255), MAGENTA(255, 0, 255);
	private int r;
	private int b;
	private int g;
	
	/**
	 * sets the value of r, g, and b based on the constant chosen.
	 * @param r
	 * @param g
	 * @param b
	 */
	private Color(int r, int g, int b) {
		this.r = r;
		this.b = b;
		this.g = g;
	}
	/**
	 * @return the value of r
	 */
	public int getR() {
		return this.r;
	}
	/**
	 * @return the value of b
	 */
	public int getB() {
		return this.b;
	}
	/**
	 * @return the value of g
	 */
	public int getG() {
		return this.g;
	}
}
