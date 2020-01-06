package kr.or.yi.java_study_02.ch07.Exam01;

class Phone {
   private String name;
   private String tel;
public Phone() {
	// TODO Auto-generated constructor stub
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getTel() {
	return tel;
}
public void setTel(String tel) {
	this.tel = tel;
}
public Phone(String name, String tel) {
	this.name = name;
	this.tel = tel;
}
@Override
public String toString() {
	return String.format("Phone [name=%s, tel=%s]", name, tel);
}
   
   
   
}
