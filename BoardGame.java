import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class BoardGame {
	protected LinkedHashMap<String, GamePiece> playerPieces;
	protected LinkedHashMap<String, Location> playerLocations;

public BoardGame() {
	this.playerPieces = new LinkedHashMap();
	this.playerLocations = new LinkedHashMap();
}
public boolean addPlayer(String playerName, GamePiece gamePiece, Location initialLocation) {
	this.playerPieces.put(playerName, gamePiece);
	this.playerLocations.put(playerName, initialLocation);
	return true;
}
public GamePiece getPlayerGamePiece(String playerName) {
	return this.playerPieces.get(playerName);
}
public String getPlayerWithGamePiece(GamePiece gamePiece) {
	Set<String> players = this.playerPieces.keySet();
	Iterator iter = players.iterator();
	while(iter.hasNext()) {
		String currPlayer = (String) iter.next();
		if(this.playerPieces.get(currPlayer).equals(gamePiece)) {
			return currPlayer;
		}
	}
	return null;
}
public void movePlayer(String playerName, Location newLocation) {
	this.playerLocations.replace(playerName, newLocation);
}
public String[] moveTwoPlayers(String[] playerNames, Location[] newLocations) {
	return null;
}
public Location getPlayersLocation(String player) {
	return this.playerLocations.get(player);
}
public ArrayList<String> getPlayersAtLocation(Location loc) {
	if(this.playerLocations.containsValue(loc)) {
		
	}
	return null;
}
public ArrayList<GamePiece> getGamePiecesAtLocation(Location loc) {
	return null;
}
public Set<String> getPlayers() {
	return null;
}
public Set<Location> getPlayerLocations() {
	Set<Location> locations = (Set<Location>) this.playerLocations.values();
	return locations;
}
public Set<GamePiece> getPlayerPieces() {
	Set<GamePiece> gamePieces = (Set<GamePiece>) this.playerPieces.values();
	return gamePieces;
}
}
