package test.main;

import test.mypac.Car;

public class MainClass02 {
	public static void main(String[] args) {
		// car 클래스로 객체를 생성해서 참조값을 car1 이라는 car type 지역변수에 담기
		Car car1 = new Car();
		// car 클래스로 객체를 생성해서 참조값을 car2 라는 car type 지역변수에 담기
		Car car2 = new Car();
		
		//필드에 String type 의 참조값 대입하기
		car1.name="소나타";
		car2.name="그랜저";
		
		//메소드 호출하기
		car1.drive();
		car2.drive();
		
		boolean result = car1 == car2;
		
		
		//car2 에 들어 있는 참조값을 car3 라는 지역변수에 대입하기
		Car car3=car2;
		car3.drive();
		//동일객체(car2 와 car3 에 저장된 참조값이 같다) 임으로 true 이다
		boolean result2 = car2 == car3;
	}
}
