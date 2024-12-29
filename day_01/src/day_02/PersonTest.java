package day_02;

public class PersonTest {

	public static void main(String[] args) {
		PersonVO PV = new PersonVO("조종찬", 18, 170, "남성");
		System.out.println("나의 프로필은?");
		System.out.println("이름은 "+PV.name+"입니다.");
		System.out.println("나이는 "+PV.age+"살입니다.");
		System.out.println("키는 "+PV.height+"입니다.");
		System.out.println("성별은 "+PV.gender+"입니다.");
		
		
	}

}
