package kr.or.yi.java_study_02.ch07.q7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Scholarship {
    Scanner sc = new Scanner (System.in);
	private String name;
	private double score;
	private HashMap<String, Double> nn = new HashMap<String, Double>();

	public double getScore() {
		return score;
	}

	public Scholarship(HashMap<String, Double> nn) {
		this.nn = nn;
	}
	
	public void setScore(double score) {
		this.score = score;
	}
	public void starting(String s) {
		System.out.println(s+ "관리시스템입니다");
		for(int i =0; i<5; i++) {
			System.out.print("이름과 학점>>");
		String name = sc.next();
		double score = sc.nextDouble();
		nn.put(name, score);	
		}
	}
    public Scholarship(double score) {
		this.score = score;
	}
	
    public void picOne() {
    	System.out.println("장학생 선발 학점 기준 입력");
    	double num = sc.nextDouble();	
    	
    	System.out.print("장학생명단:");
    	Set<String> keys = nn.keySet();
    	Iterator<String> it = keys.iterator();
    	
    	while(it.hasNext()) {
    		String name = it.next();
    		double score = nn.get(name);
    		if(score> num) {
    		System.out.print(name + " ");
    		}
    	}
    }
       
}
