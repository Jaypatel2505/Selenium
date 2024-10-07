package com.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JunitAnnotation {
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}
	@Before
	public void before() {
		System.out.println("Before Method");
	}
	@Test
	public void test1() {
		System.out.println("This is Test 1");
	}
	@Ignore
	@Test
	public void test2() {
		System.out.println("This is Test 2");
	}
	@After
	public void after() {
		System.out.println("After Method");
	}
}