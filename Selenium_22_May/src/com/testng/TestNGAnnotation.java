package com.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotation {
	@BeforeTest
	public void beforeTest() {
		System.out.println("before Test");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before method");
	}
	
	@Test
	public void test() {
		System.out.println("This is first test");
	}
	
	@Test
	public void test1() {
		System.out.println("This is second test");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("after method");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}
}