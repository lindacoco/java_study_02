package kr.or.yi.java_study_02.ch07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {  //p369
		//addList();
		
		List<Integer> arList = new ArrayList<>();
		arList.add(5);  //index가 0
		arList.add(3);  //1
		arList.add(4);  //2
		arList.add(1);  //3

		for(int i=0; i<arList.size(); i++) {
			int a = arList.get(i);
			System.out.println(a);   // 5341출력
		}
		
		
		ArrayList<String> strList = new ArrayList<String>();
		strList.add("이상원");
		strList.add("황태원");
		strList.add("권수진");
		strList.add("이상원");
		for(String name: strList) {
			System.out.println(name);
		}
		
		if (strList.contains("황태원")) {   //포함
			System.out.println("포함");
		}else {
			System.out.println("미포함");
		}
		
		int findIdx = strList.indexOf("황태원");
		System.out.println(findIdx);    //1출력
		
		int findIdx1 = strList.indexOf("장현서");   //-1 못찾아서
		System.out.println(findIdx1);
		
		
		int findIdx2 = strList.indexOf("이상원");   //0 중복허용하니까ㅣ
		System.out.println(findIdx2);
		
		int findIdx3 = strList.lastIndexOf("이상원");   //3출력 뒤에서부터 검색하니까.. 
		System.out.println(findIdx3);
		
		
		System.out.println(strList.isEmpty());   //false

//		strList.clear();     //클리어후
		System.out.println(strList.isEmpty());  //true
		System.out.println(strList);   //[이상원, 황태원, 권수진, 이상원]
		
		
		strList.remove(0);
//		strList.remove("이상원"); //해도 처음꺼 삭제됨 
		System.out.println(strList);  //[황태원, 권수진, 이상원]
		
		String[] a = new String[strList.size()]; //스트링 타입인거 알아 
		System.out.println(Arrays.toString(a)); //[null, null, null]
		strList.toArray(a);
		System.out.println(Arrays.toString(a)); //[황태원, 권수진, 이상원]  널이었다가 들어온 것
		
		
		ArrayList<String> aa  =new ArrayList<String>();
		
		
		
	}

	private static void addList() {
		List<Integer> arList = new ArrayList<>();  //ctl shift 0에 util의 list선택하면 오류없음 
		//ArrayList<Integer> arList = new ArrayList<>();
		System.out.println("arList.size():" +arList.size()); //arList.size():0
		//추가
		arList.add(5);
		System.out.println("arList.size():" +arList.size()); //arList.size():1
		for(int i =0; i<10; i++) {
		   arList.add(i); // i는 int인데 오토박싱되어 들어감
		
		}		
		System.out.println("arList.size():" +arList.size());  //arList.size():11
	    System.out.println(arList);         //[5, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
		arList.add(1, 10);
		System.out.println(arList);        //[5, 10, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
		
		ArrayList<Integer> subList = new ArrayList<Integer>();
		subList.add(20);
		subList.add(21);
		subList.add(22);
	    
		arList.addAll(subList);
		System.out.println(arList);         //[5, 10, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 20, 21, 22]
	}

}
