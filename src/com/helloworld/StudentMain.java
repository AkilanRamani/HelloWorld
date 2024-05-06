package com.helloworld;

import java.util.ArrayList;
import java.util.List;



public class StudentMain {
	public static void main(String[] args) {
		
		Student s1 = new Student(1,"akilan");
		
		Student s2 = new Student(1,"akilan");
		List<Student> s = new ArrayList<Student>();
		s.add(s2);
		s.add(s1);
		System.out.println(s);
		
	}

}
