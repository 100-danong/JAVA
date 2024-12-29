package Test;

public class StudentMain {

	public static void main(String[] args) {

		Student[] s = new Student[4];
		s[0] = new Student("학생1",17);
		s[1] = new Student("학생2",18);
		s[2] = new Student("학생3",19);
		s[3] = new Student("학생4",20);
		
		for(int i = 0; i<s.length; i++) {
			System.out.println(s[i].toString());
		}
		System.out.println("------------------2024------------------");
		
		for(int i = 0; i<s.length; i++) {
			s[i].setAge(s[i].getAge() + 1);
			System.out.println(s[i].toString());
		}
	}

}
