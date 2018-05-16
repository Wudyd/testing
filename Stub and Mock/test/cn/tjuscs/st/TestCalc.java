package cn.tjuscs.st;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalc {

	@Test(expected=MyException.class)
	public void testAdd() {
		Calculate calc = new Calculate();
//		assertEquals(5, calc.add(2, 3));
		calc.testException(2);
	}
	
	

}
