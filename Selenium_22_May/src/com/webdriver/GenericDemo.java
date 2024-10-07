package com.webdriver;

import java.util.ArrayList;

/*
 * Generic : To generalize the collection into a specific type
 * 
 * ArrayList<Integer>
 * It will only take integer type of data
 */
public class GenericDemo {
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		
		a1.add(34);
		a1.add(new Integer(67));
//		a1.add(34.6f);
		System.out.println("Now value is :"+a1);
		System.out.println("Now size is :"+a1.size());
		
		a1.add(34);
		System.out.println("Now value is :"+a1);
		System.out.println("Now size is :"+a1.size());
	}
}