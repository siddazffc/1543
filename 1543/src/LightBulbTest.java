import static org.junit.Assert.*;

import org.junit.Test;

public class LightBulbTest {

	@Test
	public void test() {

		LightBulb lb= new LightBulb(50,"Blue","LED");
		int w=lb.getWattage();
		assertEquals(50,w);
		String t=lb.getColor();
		assertEquals("Blue",t);
		String m=lb.getType();
		assertEquals("LED",m);
	}

}
