package kr.or.yi.java_study_02.ch08;

import java.io.BufferedOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BufferedIOEx {

	public static void main(String[] args) {
       FileReader fin = null;
       
       int c;
       try( BufferedOutputStream out = new BufferedOutputStream(System.out,8);) {
    		fin =new FileReader("C:\\Temp\\test2.txt");
    	  
    	   while((c =fin.read()) != -1) {
    		   out.write(c);
    	   }
    	   
    	   new Scanner(System.in).nextLine();
    	   out.flush();
    //	   fin.close();
    	   out.close();
       }catch (IOException e) {
    	   e.printStackTrace();
       }
	}

}
