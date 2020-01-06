package kr.or.yi.java_study_02.ch08;

import java.io.File;

public class File01 {

	public static void main(String[] args) {
   //      File file = new File("c:\\windows\\system.ini");
         File file =new File("c:\\windows\\","system.ini");
         System.out.println(file.isFile());
         System.out.println(file.getParent());
         System.out.println(file.getPath());
         System.out.println(file.getName());
 
        
         
	}

}
