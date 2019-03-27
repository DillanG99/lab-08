
public class Driver {
	public static void main(String[] args) {
		BoardGame b = new BoardGame();
		b.addPlayer("John", GamePiece.BLUE_BOOT, Location.BALLROOM);
		b.addPlayer("Alex", GamePiece.BLUE_RACER, Location.CONSERVATORY);
		String player = b.getPlayerWithGamePiece(GamePiece.BLUE_BOOT);
		b.movePlayer("John", Location.KITCHEN);
		b.movePlayer("Alex", Location.LOUNGE);
		b.moveTwoPlayers(new String[] {"John", "Alex"}, new Location[] {Location.DINING_ROOM, Location.LIBRARY});
		System.out.println(GamePiece.MAGENTA_RACER);
		System.out.println(Shape.BOOT);
	}
}
