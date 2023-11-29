package com.eunice.ch7_1;

//자식클래스
public class Student extends People {
	
	String grade;//학년
	String studentNum;//학번

	public Student(String name, String ssn) {
		super(name, ssn);//부모 생성자 호출
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printName() {
		
		System.out.println("학생이름:"+this.name);
		
	}
	
	

}
