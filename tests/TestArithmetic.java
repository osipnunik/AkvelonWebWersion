import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import logic.ArrayHolder;
import logic.CalculateSequence;
import logic.CountInColumns;
import logic.CountInRows;
import logic.MaxSequance;

public class TestArithmetic {
	
	private static MaxSequance arC;
	private static MaxSequance arR;
	private static CalculateSequence calc;
	
	@BeforeClass
	public static void init() {
		arC = new CountInColumns(ArrayHolder.getArray());
		arR = new CountInRows(ArrayHolder.getArray());
		calc = new CalculateSequence();
	}

	@Test
	public void testCuontityOnLine() {
		Assert.assertEquals(arR.findMaxSiquenceOnLines(), 2);
	}

	@Test
	public void testCuontityOnRow() {
		Assert.assertTrue(arC.findMaxSiquenceOnLines() == 3);
	}
	
	@Test
	public void testSequance() {
		Assert.assertTrue(calc.getLongestSequence()==3);
	}

}
