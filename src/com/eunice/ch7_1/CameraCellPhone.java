package com.eunice.ch7_1;

public class CameraCellPhone  extends CellPhone {
//extends 부모클래스명(상속받기)
	
	String camera;
	
	public void cameraOn() {
		System.out.println("카메라 켜기");
	}
	public void cameraOff() {
		System.out.println("카메라 끄기");
	}
	public void photo() {
		System.out.println("사진 찍기");
	}
	
	
	
}
