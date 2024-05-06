package com.helloworld;

import java.util.ArrayList;
import java.util.List;

public class ListTypeContacts {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Test");
		list.add("123");
		TestMainClass c = new TestMainClass();
		c.setContacts(list);
		System.out.println(c.getContacts());

	}

}
