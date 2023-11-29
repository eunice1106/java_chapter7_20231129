package com.eunice.ch7_1;

import test.Solider;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DmbCellPhone dmbCellPhone = new DmbCellPhone();
		
		//부모클래스에서 상속 받은 필드값을 초기화
		dmbCellPhone.model = "갤럭시폰";
		dmbCellPhone.color = "검정";
		
		//부모클래스 선언되어 있는 메소드 호출 가능
		dmbCellPhone.receiveVoice("여보세요");//부모클래스 선언되어 있는 메소드 호출 가능
		
		CameraCellPhone cameraCellPhone = new CameraCellPhone();
		
		cameraCellPhone.model = "아이폰";
		
		People people = new People("홍길동","880120-2839485");
//		People people2 = new People();
		
		Student student = new Student("이순신","990234-3854967");
		
		
		//student.phone부모클래스에서 private 접근 지정자로 지정된 필드는 자식클래스에서 불러올 수 없다
		Solider solider = new Solider("김유신", "021345-9847563");
		solider.name = "강감찬";
		
		people.printName();
		student.printName();
		solider.printName();
		
		
		//people부모클래스는 student자식클래스를 받아준다
		People people1 = new Student("강감찬","882290-3948573");
		People people2 = new Student("권율","901110-2148545");
	
	}

}
