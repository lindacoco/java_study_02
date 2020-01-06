package kr.or.yi.java_study_02.ch06;

import java.util.Arrays;

public class Exam {

	static class Product {
		private String code;
		private String name;

		public Product(String code, String name) {
			this.code = code;
			this.name = name;
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Product() {
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return String.format("(%s, %s)", code, name);
		}

	}

	static class Sale {
		private int no;
		private String code;
		private int price;
		private int saleCnt;
		private int marginRate;

		public Sale() {
			// TODO Auto-generated constructor stub
		}

		public Sale(int no, String code, int price, int saleCnt, int marginRate) {
			this.no = no;
			this.code = code;
			this.price = price;
			this.saleCnt = saleCnt;
			this.marginRate = marginRate;
		}

		public int getNo() {
			return no;
		}

		public void setNo(int no) {
			this.no = no;
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public int getSaleCnt() {
			return saleCnt;
		}

		public void setSaleCnt(int saleCnt) {
			this.saleCnt = saleCnt;
		}

		public int getMarginRate() {
			return marginRate;
		}

		public void setMarginRate(int marginRate) {
			this.marginRate = marginRate;
		}

		@Override
		public String toString() {
			return String.format("[%s, %s, %s, %s, %s]", no, code, price, saleCnt,
					marginRate);
		}

	}

	public static void main(String[] args) {
		String[] productArr = { "A001,아메리카노", // code,name product는 클래스로 생성
				"A002,카푸치노", // Product p = new Product(code,name)
				"A003,헤이즐넛", "A004,에스프레소", "B001,딸기쉐이크", "B002,후르츠와인", "B003,팥빙수", "B004,아이스초코" };

		String[] saleArr = { "1,A001,4500,150,10", // no,code,price,saleCnt,marginRate 정수 문자 정수정수정수
				"2,A002,3800,140,15", "3,B001,5200,250,12", "4,B001,4300,110,11", };
		
		  Product[] pdtArrs = convert_to_Product(productArr);
//		  System.out.println(Arrays.toString(pdtArrs));
		 

		Sale[] saleArrs = convert_to_Sale(saleArr);
		for(Sale s : saleArrs) {
			System.out.println(s);
		}

	}

	private static Sale[] convert_to_Sale(String[] saleArr) {

		Sale[] sales = new Sale[saleArr.length];
		String[] saleArr2 = new String[saleArr.length];
		try {
			for (int i = 0; i < sales.length; i++) {
				saleArr2 = saleArr[i].split(",");
				
				sales[i] = new Sale();
				sales[i].setNo(Integer.parseInt(saleArr2[0]));
				sales[i].setCode(saleArr2[1]);
				sales[i].setPrice(Integer.parseInt(saleArr2[2]));
				sales[i].setSaleCnt(Integer.parseInt(saleArr2[3]));
				sales[i].setMarginRate(Integer.parseInt(saleArr2[4]));
			}
		}
		catch(NumberFormatException e) {
			
		}
		return sales;	
	}
	

	private static Product[] convert_to_Product(String[] productArr) {
		Product[] pdt = new Product[productArr.length];
		for(int i =0; i<pdt.length; i++) {
			String[] arr2= productArr[i].split(",");
			pdt[i] = new Product(
					  arr2[0],
					  arr2[1]
					);
			System.out.println(pdt[i]);
					
		}
		return pdt;
	}

}
