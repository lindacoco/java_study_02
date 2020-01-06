package kr.or.yi.java_study_02.ch08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReaderEx {

	public static void main(String[] args) throws IOException {
		//fileReaderEx();
		//readEx02();
		
		System.out.println(System.getProperty("user.dir")); //D:\workspace\workspace_java\java_study_02
		
		String filePath = System.getProperty("user.dir")+ "\\data\\department.txt";
		System.out.println(filePath);
		
		readFile("department.txt");
		readFile("employee.txt");
		
		
		readFileInputStream("department.txt");
		
		

	}

	private static void readFileInputStream(String fileName) {
		String filePath = System.getProperty("user.dir")+ "\\data\\" + fileName ;
		File file = new File(filePath);
		try(FileInputStream fis = new FileInputStream(file);
				InputStreamReader isr = new InputStreamReader(fis, "UTF8") ){ //인코딩이 틀림
			int c;
			while((c = isr.read()) != -1) {
				System.out.print((char)c);
			}
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void readFile(String fileName) {
		String filePath = System.getProperty("user.dir")+ "\\data\\" + fileName ;
		File file = new File(filePath);
		
		//try catch resource문장 - 자동으로 close호출한다 수도꼭지 잠그는걸 미연에 방지해준다. 
		//closable 인터페이스를 구현한 클래스만 가능
		try (FileReader fr = new FileReader(file);){ //자동호출된다 close
			int c;
			while(( c = fr.read()) != -1){ //배열의 끝이 아니라면 넣어준다
				System.out.print((char)c);
			}
			System.out.println("Encoding: " +fr.getEncoding());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

	private static void readEx02() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("C:\\Windows\\system.ini");  //JVM에 던짐 너가처리해죰
		//FileNotFoundException
		int c;
		while ( (c =fr.read()) != -1) {  //main(String[] args) throws IOException로 바뀜 
			System.out.print((char)c);
		}
	}

	private static void fileReaderEx() {
		try {
			readEx02();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("해당 파일이 존재하지 않음 ");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("파일 읽는 도중에 문제 발생 ");
		}
	}

}
