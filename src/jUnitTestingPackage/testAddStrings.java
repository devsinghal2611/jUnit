package jUnitTestingPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddStrings {

	@Test
	public void test() {
		jUnitFunction junitString = new jUnitFunction();
		String result = junitString.addStrings("capstone", "project");
		assertEquals("capstoneproject", result);
	}

}
