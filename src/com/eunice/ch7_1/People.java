package com.eunice.ch7_1;

//부모클래스
public  class People {
	
	//다른 패키지에 있는 클래스가 다른 패키지의 클래스를 상속받을 때 public을 명시하지 않은 필드는 사용할 수 없다
	public String name;//이름
	public String ssn;//주민번호
	private String phone;//전화번호
	
	//생성자(자동완성하기->source->generate fields)
	public People(String name, String ssn) {
		
		this.name = name;
		this.ssn = ssn;
	}

//	public People() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
	public void printName() {
		System.out.println("이름 :"+ this.name);
	}
	
	
}
