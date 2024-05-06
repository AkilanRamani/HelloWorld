package com.helloworld;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
Set<Integer> a = new HashSet<Integer>(); 
        
        // Adding all elements to List  
        a.addAll(Arrays.asList( 
            new Integer[] { 1, 3, 2, 4, 8, 9, 0 })); 
        
        System.out.println(a);
        
      // Again declaring object of Set class 
      // with reference to HashSet 
        HashSet<Integer> b = new HashSet<Integer>(); 
       
        b.addAll(Arrays.asList( 
           new Integer[] { 1, 3, 7, 5, 4, 0, 7, 5 })); 
  
          
        // To find union 
        HashSet<Integer> union = new HashSet<Integer>(a);
        System.out.println(union);
      
        union.addAll(b); 
        System.out.print("Union of the two Set"); 
        System.out.println(union); 
  
        // To find intersection 
        HashSet<Integer> intersection = new HashSet<Integer>(a); 
        intersection.retainAll(b); 
        System.out.print("Intersection of the two Set"); 
        System.out.println(intersection); 
  
        // To find the symmetric difference 
        HashSet<Integer> difference = new HashSet<Integer>(a); 
        difference.removeAll(b); 
        System.out.print("Difference of the two Set"); 
        System.out.println(difference); 
    } 

	}


