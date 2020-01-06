package kr.or.yi.java_study_02.ch07.exam03;

import java.util.Scanner;

public class ExamMain {
 
	public static void main(String[] args) {
		StdMgnForHashMap sm = new StdMgnForHashMap();
		
		Scanner sc = new Scanner(System.in);
		int res;
		do {
			System.out.println("1. 학생목록, 2. 학생추가, 3. 학생 수정, 4. 학생 삭제, 5. 학생검색, 6. 종료");
			res = sc.nextInt();
			System.out.println(res);
			switch(res) {
			case 1:
				System.out.printf("%s%n", "학생목록");
				break;
			case 2:
				System.out.printf("%s%n", "학생추가");
				break;
			case 3:
				System.out.printf("%s%n", "학생 수정");
				break;
			case 4:
				System.out.printf("%s%n", "학생 삭제");
				break;
			case 5:
				System.out.printf("%s%n", "학생 검색");
				break;
			
			}
		}while(res < 6);
		System.out.println("학생관리 프로그램을 종료합니다.");
		sc.close();
	}



}
