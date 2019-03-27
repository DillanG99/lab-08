import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * This class represents a board game being played with player pieces and locations
 * @author Dillan Gibbons
 *
 */
public class BoardGame {
	protected LinkedHashMap<String, GamePiece> playerPieces;
	protected LinkedHashMap<String, Location> playerLocations;

/**
 * Initializes the hashmaps for locations and pieces	
 */
public BoardGame() {
	this.playerPieces = new LinkedHashMap();
	this.playerLocations = new LinkedHashMap();
}
/**
 * adds a player to the game
 * @param playerName
 * @param gamePiece
 * @param initialLocation
 * @return
 */
public boolean addPlayer(String playerName, GamePiece gamePiece, Location initialLocation) {
	this.playerPieces.put(playerName, gamePiece);
	this.playerLocations.put(playerName, initialLocation);
	return true;
}

/**
 * gets the game piece being used by a specific player
 * @param playerName
 * @return the game piece being used
 */
public GamePiece getPlayerGamePiece(String playerName) {
	return this.playerPieces.get(playerName);
}

/**
 * gets the players name using a specific game piece
 * @param gamePiece
 * @return the game piece constant associated with the player name
 */
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
/**
 * Moves a single player to a new location
 * @param playerName
 * @param newLocation
 */
public void movePlayer(String playerName, Location newLocation) {
	this.playerLocations.replace(playerName, newLocation);
}

/**
 * Moves two players to new locations in the order of their priority
 * @param playerNames
 * @param newLocations
 * @return a string array sorted in the order the players were moved
 */
public String[] moveTwoPlayers(String[] playerNames, Location[] newLocations) {
	String[] players = new String[2];
	GamePiece first = GamePiece.movesFirst(this.playerPieces.get(playerNames[0]), this.playerPieces.get(playerNames[1]));
	if(first.equals(this.playerPieces.get(playerNames[0]))) {
		players[0] = playerNames[0];
		this.playerLocations.replace(playerNames[0], newLocations[0]);
	}
	else {
		players[0] = playerNames[1];
		this.playerLocations.replace(playerNames[1], newLocations[1]);
	}
	if(!first.equals(this.playerPieces.get(playerNames[1]))) {
		players[1] = playerNames[1];
		this.playerLocations.replace(playerNames[1], newLocations[1]);
	}
	else {
		players[1] = playerNames[0];
		this.playerLocations.replace(playerNames[0], newLocations[0]);
	}
	return players;
}
/**
 * gets the location of a single player
 * @param player
 * @return the players location
 */
public Location getPlayersLocation(String player) {
	return this.playerLocations.get(player);
}

/**
 * gets all players at a specific location
 * @param loc
 * @return an ArrayList of the players names at specified location
 */
public ArrayList<String> getPlayersAtLocation(Location loc) {
	Set<String> players = this.playerLocations.keySet();
	ArrayList<String> playersAtLoc = new ArrayList<String>();
	Iterator iter = players.iterator();
	if(this.playerLocations.containsValue(loc)) {
		while(iter.hasNext()) {
			String currPlayer = (String) iter.next();
			if(this.playerLocations.get(currPlayer).equals(loc)) {
				playersAtLoc.add(currPlayer);
			}
	}
		return playersAtLoc;
	}
	return null;
}
/**
 * gets all game pieces at a specified location
 * @param loc
 * @return an ArrayList of all game pieces at location
 */
public ArrayList<GamePiece> getGamePiecesAtLocation(Location loc) {
	ArrayList<String> playersAtLoc = this.getPlayersAtLocation(loc);
	ArrayList<GamePiece> pieces = new ArrayList<GamePiece>();
	Iterator iter = playersAtLoc.iterator();
	while(iter.hasNext()) {
		pieces.add(this.playerPieces.get(iter.next()));
	}
	return pieces;
}
/**
 * get the names of all players playing the game
 * @return a Set of the players participating
 */
public Set<String> getPlayers() {
	return this.playerPieces.keySet();
}
/**
 * get the locations of all players playing the game
 * @return a Set of the players locations
 */
public Set<Location> getPlayerLocations() {
	Set<Location> locations = new LinkedHashSet<Location>();
	Collection<Location> vals = this.playerLocations.values();
	for(Location l : vals) {
		locations.add(l);
	}
	return locations;
}
/**
 * gets the game pieces of all players playing the game
 * @return a Set of the game pieces being used
 */
public Set<GamePiece> getPlayerPieces() {
	Set<GamePiece> gamePieces = new LinkedHashSet<GamePiece>();
	Collection<GamePiece> vals = this.playerPieces.values();
	for(GamePiece g : vals) {
		gamePieces.add(g);
	}
	return gamePieces;
}
}
