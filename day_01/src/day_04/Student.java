package day_04;

public class Student extends Person{

	final private int studentNum;

	public Student(String name, int age, int studentNum) {
		super(name, age);
		this.studentNum = studentNum;
	}
	
	@Override
	public void printInfo() {
		System.out.println("이름 : "+name+" 나이 : "+age+" 학번 : "+studentNum);
	}
	
	

}
