package kr.or.yi.java_study_02.ch06;

import java.util.Arrays;
import java.util.Comparator;

public class object_Equals {

	public static void main(String[] args) {
//		do_equals();
		
		
		
		Student[] stdArr = {
				new Student(5,"장현서",80,80,70),
				new Student(3,"유경진",81,90,70),
				new Student(4,"권수진",82,100,70),
				new Student(2,"정아름",83,89,70),
				new Student(1,"김민수",84,69,70)
				
		};
		
//		prn_Object(stdArr[0]);
		
		
		
		
		
// binary(stdArr);
		
 lineUp(stdArr);
	
	}

	private static void prn_Object(Object obj) { 
		System.out.println(obj.getClass().getName());  //kr.or.yi.java_study_02.ch06.Student
		System.out.println(obj.getClass().getSimpleName());  //Student
		System.out.println(obj.getClass().hashCode()); //366712642
		
	}

	private static void binary(Student[] stdArr) {
		Arrays.sort(stdArr);
		prnStds(stdArr);
		Student findStd = new Student(1); //6하면 마이너스 값 -6.. 못찾았다는 말 
		int findIdx = Arrays.binarySearch(stdArr, findStd);
		System.out.println(findStd+ "의 위치는"+findIdx);
	}

	private static void lineUp(Student[] stdArr) {
		//학번순으로 정렬 (기본정렬) 
		prnStds(stdArr);
		Arrays.sort(stdArr);
		prnStds(stdArr);
		
		//기본정렬외 국어점수로 정렬
		Comparator<Student> korOrder = new Comparator<Student>() {
			
			@Override
			public int compare(Student o1, Student o2) {
				return o2.getKor()-o1.getKor(); //국어점수끼리 비교하겠다.
			}
		};
		
		
		Arrays.sort(stdArr, korOrder);
		System.out.println("국어점수");
		prnStds(stdArr);
		
		//영어점수로
		Comparator<Student> engOrder = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o2.getEng() - o1.getEng();
			}
			
			
		};
		Arrays.sort(stdArr, engOrder);
		System.out.println("영어점수");
		prnStds(stdArr);
	}

	private static void prnStds(Student[] stdArr) {
		for(Student s :stdArr) {
			System.out.println(s);
		}
		
	}

	private static void do_equals() {
		Student std01 = new Student(1,"이상원",90,90,90);
//		Student std02 = new Student(1,"이상원",90,90,90);
		Student findStd = new Student(1); //학번으로 비교
		
		
		
		//원래라면 레퍼런스 주소를 비교하기 때문에 false가 뜸 
//		if(std01.equals(std02)) { //해시코드 오버라이딩 후 같은학생으로 찍힘
//			System.out.println("같은학생");
//		}else {
//			System.out.println("다른학생");
//		}
		
		if(std01.equals(findStd)) { //해시코드 오버라이딩 후 같은학생으로 찍힘
			System.out.println("같은학생");
	      }else {
			System.out.println("다른학생");
		}
		System.out.println("std01 : " + std01.hashCode());
		System.out.println("std02 : " + findStd.hashCode());
	}

}
