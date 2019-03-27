
public enum GamePiece {
	RED_RACER(new GamePieceAppearance(Color.RED, Shape.RACECAR), 0),
	BLUE_RACER(new GamePieceAppearance(Color.BLUE, Shape.RACECAR), 2),
	MAGENTA_RACER(new GamePieceAppearance(Color.MAGENTA, Shape.RACECAR), 1),
	RED_THIMBLE(new GamePieceAppearance(Color.RED, Shape.THIMBLE), 10),
	BLUE_BOOT(new GamePieceAppearance(Color.BLUE, Shape.BOOT), 5),
	GREEN_BOOT(new GamePieceAppearance(Color.GREEN, Shape.BOOT), 8),
	YELLOW_BOOT(new GamePieceAppearance(Color.YELLOW, Shape.BOOT), 7);
	
	private GamePieceAppearance appearance;
	private int priority;
	
	/**
	 * Sets the value of appearance and priority based on the constant chosen
	 * @param appearance
	 * @param priority
	 */
	private GamePiece(GamePieceAppearance appearance, int priority) {
		this.appearance = appearance;
		this.priority = priority;
	}
	/**
	 * gets the color of the game piece
	 * @return the color of the game piece
	 */
	public Color getColor() {
		return this.appearance.getColor();
	}
	/**
	 * gets the shape of the game piece
	 * @return the shape of the game piece
	 */
	public Shape getShape() {
		return this.appearance.getShape();
	}
	/**
	 * Determines which game piece moves first. Pieces move in ascending order of priorities
	 * @param a
	 * @param b
	 * @return the game piece with the lowest priority
	 */
	public static GamePiece movesFirst(GamePiece a, GamePiece b) {
		if(a.priority < b.priority) {
			return a;
		}
		else {
			return b;
		}
	}
	/**
	 * returns a string of information about the game piece in the format "%s: a %s %s with priority %d"
	 * (1) the name of the value held in GamePiece. (2) the color of the game piece.
	 * (3) the shape of the game piece. (4) the priority of the game piece.
	 */
	public String toString() {
		return String.format("%s: a %s %s with priority %d", 
				this.name(), this.appearance.getColor(), this.appearance.getShape().toString().toUpperCase(), this.priority);
	}
}
