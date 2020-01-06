package kr.or.yi.java_study_02.ch07.Exam01;

import java.util.ArrayList;
import java.util.Scanner;

class PhoneBook {

	private int size;
//	private Phone[] phones;
	
	private ArrayList<Phone> phones;
	private Scanner sc;
	
	public PhoneBook() {
		this.size = size;
		this.phones = new ArrayList<Phone>();
		this.sc = new Scanner(System.in);
	}
	
	private void init() {
		System.out.println("인원수");
		this.size = sc.nextInt();
		//this.phones = new ArrayList<Phone>(size);
		
		//System.out.println(phones);
	}
	private void input() {
		String name;
		String tel;
		
		for(int i =0; i<size; i++) {
		System.out.print("이름과 전화번호 빈칸없이 입력 >>");
		name= sc.next();
		tel = sc.next();
		phones.add(new Phone(name,tel));

		}
		System.out.println("저장되었습니다.");
	}	
	public void run() {
    	init();
		input();
		String findName;
        String findTel;
		
		do {
			System.out.println("검색할 이름 >>");
			findName = sc.next();
            findTel = searchPhone(findName);
            if(findTel == null) {
            	if(findName.equals("그만"))break;
 //           	if(!findName.contentEquals("그만")) {
            	System.out.println(findName+"이 없습니다.");
  //          	}
            }else {
            	System.out.printf("%s의 번호는 %s입니다",findName,findTel);
            }
		}while(!findName.equals("그만"));
		sc.close();
		
	}

	private String searchPhone(String findName) {
		for(Phone p : phones) {
			if(p.getName().contentEquals(findName)) {
				return p.getTel();
			}
		}
		return null;
	}
	
	
}
