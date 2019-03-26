import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class ShapeTest {

	@Test
	public void testToString() {
		Shape shape = Shape.BOOT;
		Assert.assertEquals("boot", shape.toString());
	}

}
