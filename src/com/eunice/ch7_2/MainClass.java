package com.eunice.ch7_2;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent parent = new Parent();
		Child child = new Child();
		
		parent = child;//부모는 자식의 모든 것을 받아준다-> 업캐스팅 upcasting
		
		Parent parent1 = new Child();
		
		Child child1 = new Child();
		
		
		
		child = (Child) parent;//다운캐스팅 downcasting
		
		Child2 child2 = new Child2();
	
		
		
	}

}
