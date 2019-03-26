import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class ColorTest {

	@Test
	public void testGetR() {
		Color color = Color.RED;
		Assert.assertEquals(255, color.getR());
	}

	@Test
	public void testGetB() {
		Color color = Color.BLUE;
		Assert.assertEquals(255, color.getB());
	}

	@Test
	public void testGetG() {
		Color color = Color.GREEN;
		Assert.assertEquals(255, color.getG());
	}

}
