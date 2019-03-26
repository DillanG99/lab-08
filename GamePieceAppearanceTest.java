import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class GamePieceAppearanceTest {

	@Test
	public void testGetColor() {
		GamePieceAppearance appearance = new GamePieceAppearance(Color.BLUE, Shape.RACECAR);
		Assert.assertEquals(Color.BLUE, appearance.getColor());
	}

	@Test
	public void testGetShape() {
		GamePieceAppearance appearance = new GamePieceAppearance(Color.BLUE, Shape.RACECAR);
		Assert.assertEquals(Shape.RACECAR, appearance.getShape());
	}

}
