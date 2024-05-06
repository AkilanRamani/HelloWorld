package com.helloworld;

import java.util.Scanner;

public class CallbackExample1 {
	
	  public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException    //handling exceptions  
	    {  
	        //create an instance of the Scanner class to take user input  
	        Scanner sc = new Scanner(System.in);  
	        System.out.println("Enter the state name");  
	          
	        //get state name from the user  
	        String state = sc.next();  
	   
	        // store the state name in an object obj  
	        Class obj = Class.forName(state);  
	   
	        // Create a new object of the obj class that reference by the StateTax  
	        @SuppressWarnings("deprecation")
			StateTax refer = (StateTax)obj.newInstance();  
	   
	        //call the calculateTax() method by passing the reference of the StateTax  to calculate total tax  
	        calculateTax(refer);  
	    }  
	      
	    static void calculateTax(StateTax data)  
	    {  
	        //central tax will be same for all state  
	        double central_Tax = 3500.0;  
	   
	        // get the state_Tax for the user entered state and find the total tax  
	        double state_Tax = data.stateTax();  
	        double total_Tax = state_Tax + central_Tax;  
	   
	        // show the result   
	        System.out.println("The total Tax of the state is =" + total_Tax);  
	    }  
	 

}
