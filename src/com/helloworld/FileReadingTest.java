package com.helloworld;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReadingTest {

	public static void main(String[] args) throws IOException {
		
		/*File f = new File("C:\\Users\\akilan-18633\\Desktop\\File.txt");
		FileReader stream = new FileReader(f); // opening the File in the Read Mode So that the Text Content inside the File can be Read out,
	    BufferedReader reader = new BufferedReader(stream);// which is used For character Oriented input data From the Text File and Line by Line (Uisng the Read Line Method).
	   //String read = reader.readLine();
	   int a = reader.read();
	   while(a!=-1) {
		   
		   char b = (char)a;
		   System.out.print(b);  
		   
	   }
	   
	   reader.close();    
       stream.close();    
	  // System.out.println(read);
	} */
		
		  FileInputStream fr=new FileInputStream("C:\\Users\\akilan-18633\\Desktop\\File.txt");   
		  InputStreamReader r = new InputStreamReader(fr);// default character set is UTF-8
          BufferedReader br=new BufferedReader(r); 
          
  
          int i;    
          while((i=br.read())!=-1){  
          System.out.print((char)i);  
          }  
          br.close();    
          fr.close();    

}
}