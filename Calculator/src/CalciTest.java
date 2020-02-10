import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalciTest {
	Calci c;
    @Before
    public void init() {
    	c=new Calci();
    }
@Test
public void testAddition() {
	assertEquals(22,c.addition(10,12));
}

@Test
public void testSubtraction() {
	assertEquals(-2,c.subtraction(10,12));
}
@Test
public void testMultiplication() {
	assertEquals(120,c.multiplication(10, 12));
}
@Test
public void testDivision() {
	assertEquals(0,c.divison(10,12));
}

}
