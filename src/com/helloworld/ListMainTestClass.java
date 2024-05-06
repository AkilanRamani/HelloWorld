package com.helloworld;

import java.util.ArrayList;
import java.util.List;

public class ListMainTestClass {

	public static void main(String[] args) {
		
		
		TestMain test = new TestMain();
		List<String> address = new ArrayList<String>();
		address.add("Test");
		address.add("Address");
		test.setAddress(address);
		System.out.println(test.getAddress());
				
		
	}

}
