package com.maven.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class squareTest {

	@Test
	public void test() {
		JunitTesting test=new JunitTesting();
		int output =test.square(25);
		assertEquals(625,output);
	}

}
