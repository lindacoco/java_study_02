package kr.or.yi.java_study_02.ch06;

public class ClassWrapper {

	public static void main(String[] args) {
		Integer i = 31;  //autoboxing
		Integer i2 = Integer.valueOf(31);
		Integer i3 = new Integer(31);
		Integer i4 = Integer.valueOf("31");
		//다 같은 의미
		
		System.out.printf("%d %d %d %d %n",i, i2 , i3 , i4);
		
		System.out.println(Integer.bitCount(31)); //31을 이진수로 변환 후 1의 개수 //5
		System.out.println(i2.floatValue()); //실수형으로
		System.out.println(i2.doubleValue());  //31.0
		
		System.out.println(Integer.toHexString(31)); //31을 16진수로  1f
		System.out.println(Integer.toBinaryString(31)); //11111
		System.out.println(Integer.toOctalString(31)); //37
		
		
		System.out.println("====");
		String str = i2.toString();
		System.out.println(str);  //문자화된 31 출력
		
		
		
		System.out.println("----------------------------");
		
		char c1 ='4';
		char c2='F';
		
		if(Character.isDigit(c1)) { 	
			System.out.println(c1+"은 숫자");  				 //4은 숫자
		}
		if(Character.isAlphabetic(c2)) {
			System.out.println(c2+"는 영문자");  				 //F는 영문자
		}
		
		System.out.println(Integer.parseInt("-123"));		 //-123
		System.out.println(Integer.toHexString(28)); 		 //1c
		System.out.println(Integer.toBinaryString(28));		 //11100
		System.out.println(Integer.bitCount(28)); //3

		Double d = Double.valueOf(3.14); 
		System.out.println(d.toString());                	 //3.14
		System.out.println(Double.parseDouble("3.14"));  	 //3.14
		
		boolean b = (4>3);
		System.out.println(Boolean.toString(b));   //true
		System.out.println(Boolean.parseBoolean("false"));   //false 문법적으로 분석하다
				
		
		
		
	}
}
