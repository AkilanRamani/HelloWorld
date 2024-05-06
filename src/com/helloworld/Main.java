package com.helloworld;

public class Main {

	public static void main(String args[]){  
		  try{  
		  Class<?> c=Class.forName("Simple");  
		  @SuppressWarnings("deprecation")
		Simple s=(Simple)c.newInstance();  
		  s.message();  
		  
		  }catch(Exception e){System.out.println(e);}  
		  
	}

}
