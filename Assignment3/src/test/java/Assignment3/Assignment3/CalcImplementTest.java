package Assignment3.Assignment3;

import static org.mockito.Mockito.*;
import junit.framework.TestCase;

public class CalcImplementTest extends TestCase {
	
	CalcImplement obj;
	int a, b;

	protected void setUp() throws Exception {f
		obj = new CalcImplement();
		a = 5;
		b = 8;
		
		CalcInterface mockObj = mock(CalcInterface.class);
		when(mockObj.add(a, b)).thenReturn(a + b);
		obj.setIntObj(mockObj);

		when(mockObj.subtract(a, b)).thenReturn(a - b);
		obj.setIntObj(mockObj);
	
		when(mockObj.multiply(a, b)).thenReturn(a * b);
		obj.setIntObj(mockObj);
		
		when(mockObj.divide(a, b)).thenReturn((double) (a / b));
		obj.setIntObj(mockObj);
	}

	public void testAddTwoNums() {
		assertEquals(13, obj.addTwoNums(a, b));
	}

	public void testSubtractTwoNums() {
		assertEquals(-3, obj.subtractTwoNums(a, b));
	}

	public void testMultiplyTwoNums() {
		assertEquals(40, obj.multiplyTwoNums(a, b));
	}

	public void testDivideTwoNums() {
		assertEquals(0.0, obj.divideTwoNums(a, b));
	}
	
	protected void tearDown() throws Exception {
		obj = null;
		a = 0;
		b = 0;
	}
}
