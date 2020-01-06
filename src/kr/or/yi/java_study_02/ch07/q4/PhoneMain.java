package kr.or.yi.java_study_02.ch07.q4;

import java.util.Scanner;

public class PhoneMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Phone ss = new Phone();
		
		int res;
		
		do {
			System.out.println("1.삽입 , 2.삭제, 3.찾기, 4.전체보기, 5.종료");
		    res = sc.nextInt();
		    switch(res) {
		    case 1 :
		    	startOne(sc);
		    	break;
		    case 2 :
		    	break;
		    case 3 : 
		    	break;
		    case 4 :
		    	break;
		    case 5 :
		    	break;
		    }
		}while(res<6);
		System.out.println("전화번호 관리 프로그램을 종료합니다");
		sc.close();

	}

	private static void startOne(Scanner sc) {
		System.out.println("이름 주소 전화번호 입력하시오  ex)장현서 대구 0101111111");
		String name = sc.next();
		String address = sc.next();
		String tel = sc.next();
		
		
		
	}

}
