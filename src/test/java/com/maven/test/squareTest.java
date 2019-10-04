package com.maven.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class squareTest {

	@Test
	public void test() {
		JunitTesting test=new JunitTesting();
		int output =test.power(2,3);
		assertEquals(8,output);
	}

}
