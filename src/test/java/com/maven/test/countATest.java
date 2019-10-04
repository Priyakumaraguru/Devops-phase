package com.maven.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class countATest {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		int output= test.countA("aaab");
		assertEquals(4,output);
	}

}

