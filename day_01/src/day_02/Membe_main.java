package day_02;

public class Membe_main {

	public static void main(String[] args) {

		Member mb1 = new Member();
		Member mb2 = new Member("조종찬", "hhh");
		Member mb3 = new Member("조종찬", "hhh", "hhh2");		
		Member mb4 = new Member("조종찬", "hhh", "hhh2", 18);
		System.out.println(mb3.toString());
	}

}
