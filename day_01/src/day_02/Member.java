package day_02;

public class Member {

	
	

	@Override
	public String toString() {
		return "Member [name=" + name + ", id=" + id + ", pw=" + pw + ", age=" + age + "]";
	}

	Member() {
	}

	Member(String name, String id) {
		this(name, id, null, 0);
	}
	
	public Member(String name, String id, String pw) {
		this(name, id, pw, 0);
	}
	

	Member(String name, String id, String pw, int age) {
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.age = age;
	}

	String name;
	String id;
	String pw;
	int age;

}
