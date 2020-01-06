package kr.or.yi.java_study_02.ch08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CheckTimeFileOutputStrem {

	public static void main(String[] args) {
     
		try(FileOutputStream fout = new FileOutputStream("c:\\Temp\\test.dat");)
		{
			FileInputStream fin = null;
			fout.write(3);
			fout.write(5);
			fout.close();
		    fin = new FileInputStream("c:\\Temp\\test.dat");
		    int c=0;
		    c = fin.read();
		    System.out.print(c +" ");
		    c = fin.read();
		    System.out.println(c +" ");
		    
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("입출력 오류");
			e.printStackTrace();
		}
		
	}

}
