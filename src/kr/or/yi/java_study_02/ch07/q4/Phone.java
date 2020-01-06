package kr.or.yi.java_study_02.ch07.q4;

import java.util.HashMap;

public class Phone {
	
  	
  private String name;
  private String address;
  private String tel;
  private HashMap<String, String> nn = new HashMap<String, String>();
  
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	
	Phone other = (Phone) obj;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}
public Phone() {
	// TODO Auto-generated constructor stub
}
public Phone(String name, String address, String tel) {
	this.name = name;
	this.address = address;
	this.tel = tel;

}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
  
  
  
  
}
