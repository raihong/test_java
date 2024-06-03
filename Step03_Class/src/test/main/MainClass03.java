package test.main;

import test.mypac.Car;

public class MainClass03 {
	public static void main(String[] args) {
		// 객체를 생성하고 참조값을 한번도 사용하지 않고 버림
		new Car();
		
		// 객체를 생성하고 참조값을 한번 사용하고 버림 (1회용)
		new Car().drive();
		
		// 객체를 생성하고 참조값을 변수에 담아두고 
		Car c1=new Car();
		// 필요시에 여러번 사용할 수 있음
		c1.drive();
		c1.drive();
		
		Car c2=c1;
		c2.drive();
		
		// 자바에서 정석적으로 만드는 string class 문법
		String b = new String("kim");
		// string 타입은 자주씀으로 아래와 같이 편리한 문법을 자바에서 제공
		String a = "kimgura"; 
		
		
	}
}
