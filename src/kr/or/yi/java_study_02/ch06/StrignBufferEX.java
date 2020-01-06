package kr.or.yi.java_study_02.ch06;

public class StrignBufferEX {

	public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("This");  //p366
        
        sb.append(" is pencil");
        System.out.println(sb);    //This is pencil
         sb.insert(7, " my");
        System.out.println(sb);    //This is my pencil
        sb.replace(8, 10, "your");
        System.out.println(sb);    //This is your pencil
        sb.delete(8, 13);
        System.out.println(sb);    //This is pencil
        sb.setLength(4);
        System.out.println(sb);    //This
	}  
}
