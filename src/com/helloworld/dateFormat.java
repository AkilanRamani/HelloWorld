package com.helloworld;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class dateFormat {

	public static void main(String[] args) throws ParseException {
		
		String a = "12-09-2005";
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");  
		Date d = sdf.parse(a);
		System.out.println(d);
		String test = sdf.format(d);
		System.out.println(test);
		sdf.parse(a);
		System.out.println(d);
		
	}
}
