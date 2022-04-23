package jUnitTestingPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testaddnumbers {

	@Test
	public void test() {
		
		jUnitFunction junit = new jUnitFunction();
		int result = junit.addNumbers(101, 200);
		assertEquals (300, result);
				
	}

}
