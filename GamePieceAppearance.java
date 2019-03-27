/**
 * Represents the appearance of a game piece using a shape and a color
 * @author Dillan Gibbons
 *
 */
public class GamePieceAppearance {
	private Color color;
	private Shape shape;
	
	/**
	 * sets the value of color and shape
	 * @param color
	 * @param shape
	 */
	public GamePieceAppearance(Color color, Shape shape) {
		this.color = color;
		this.shape = shape;
	}
	/**
	 * @return the value of color
	 */
	public Color getColor() {
		return this.color;
	}
	/**
	 * @return the value of shape
	 */
	public Shape getShape() {
		return this.shape;
	}
}
