package test.mypac;
/*
 *  Member 객체 하나에 회원의 번호, 이름, 주소 를 담기 위해 Member 클래스를 설계 하려고 한다.
 */
public class Member {
	//필드
	public int num;
	public String name;
	public String addr;
	//메소드
	public void showInfo() {
		// this는 바로 이 객체의 참조값을 가리킨다
		String info="번호는 "+this.num+" 이고 이름은 "+this.name+" 이고 주소는 "+addr+" 입니다.";
		System.out.println();
	}
}
