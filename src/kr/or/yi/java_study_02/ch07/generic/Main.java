package kr.or.yi.java_study_02.ch07.generic;

public class Main {

	public static <T> void func(T item){
		//제네릭메소드
		if(item instanceof String) {
		    System.out.println("문자");
		}
		if(item instanceof Integer) {
			System.out.println("정수");
		}
	}

	public static void main(String[] args) {
//		exam01();

//		generic_exam();
		
		Main.func("aaa"); //티가 스트링으로 바뀐다 
		Main.func(5); //인티저로 바뀐다
		
	}

	private static void generic_exam() {
		GStack<String> s = new GStack<String>();
		s.push("a");
		s.push("b");
		s.push("c");
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		
		
		
		GStack<Integer> si = new GStack<Integer>();
		si.push(5);
		si.push(3);
		si.push(1);
		System.out.println(si.pop());
		System.out.println(si.pop());
		System.out.println(si.pop());
	}

	private static void exam01() {
		MyStack st01 = new MyStack();
		st01.prnStack();
		st01.push("a");
		st01.prnStack();
		st01.push("b");
		st01.prnStack();
		st01.push("c");
		st01.prnStack();	
		
		
		//stack fisrt in last out
		//push a - b -c
		//pop c - b- a
		System.out.println(st01.pop());  //c
		System.out.println(st01.pop());  //b
		System.out.println(st01.pop());  //a
	}

}
