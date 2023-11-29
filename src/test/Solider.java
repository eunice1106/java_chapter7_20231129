package test;

import com.eunice.ch7_1.People;
//자식클래스
public class Solider extends People {

	public Solider(String name, String ssn) {
		super(name, ssn);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void printName() {
		
		System.out.println("군인이름:"+this.name);
		
	}
}
