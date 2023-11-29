package com.eunice.ch7_1;

//부모클래스

public class CellPhone {
	//필드
	String model;
	String color;
	String cType;
	
	//메소드
	public void powerOn() {
		System.out.println("전원은 켭니다");
	}
	public void powerOff() {
		System.out.println("전원은 끕니다");
	}
	public void sendVoice(String message) {
		System.out.println("나:"+message);
	}
	public void receiveVoice(String message) {
		System.out.println("상대방:"+message);
	}
	public void bell() {
		System.out.println("벨이 울립니다");
	}
	public void hangUp() {
		System.out.println("전화를 끊습니다");
	}

	
}
