package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddString {

	@Test
	public void test() {
		jUnitFunction junitstring = new jUnitFunction();
		String result =  junitstring.addString("Manya", "Sharma");
		assertEquals ("ManyaSharma",result);
	}

}
