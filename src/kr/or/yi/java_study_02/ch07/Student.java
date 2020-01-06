package kr.or.yi.java_study_02.ch07;

import java.util.Comparator;

public class Student implements Comparable<Student>{
  String name;
  int ban;
  int no;
  int kor;
  int eng;
  int math;
public Student() {
	// TODO Auto-generated constructor stub
}
public Student(String name, int ban, int no, int kor, int eng, int math) {
	this.name = name;
	this.ban = ban;
	this.no = no;
	this.kor = kor;
	this.eng = eng;
	this.math = math;
}
  
int getTotal() {
	return kor + eng +math;
	
}
 


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
float getAvg() {
	return (int)((getTotal()/3f) *10 +0.5)/10f;
}
@Override
public String toString() {
	return String.format("Student [name=%s, ban=%s, no=%s, kor=%s, eng=%s, math=%s]", name, ban, no, kor, eng, math);
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	Student other = (Student) obj;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}
@Override
public int compareTo(Student o) {
//	Comparator<Student> totalComp = new Comparator<Student>() {
//		@Override
//		public int compare(Student o1, Student o2) {
//			return o2.total()-o1.total();
//		}
	
	return this.hashCode()-o.hashCode();
}
  
  
}
