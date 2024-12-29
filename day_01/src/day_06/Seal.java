package day_06;

public class Seal extends Animal implements Swimable {

	@Override
	public void sound() {
		System.out.println("삥삥");
	}

	@Override
	public void walk() {
		System.out.println("배로 걷기");
	}

	@Override
	public void eat() {
		System.out.println("생선 념");
	}

	@Override
	public void swim() {
		System.out.println("수영가능");
	}

}
