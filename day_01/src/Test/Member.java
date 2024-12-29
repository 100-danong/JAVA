package Test;

public class Member {

	String name;
	String id;
	String password;
	int age;

	public Member() {}
	
	public Member(String name, String id) {
		this(name, id, "", 0);
	}

	public Member(String name, String id, String password) {
		this(name, id, password, 0);
	}
	
	public Member(String name, String id, String password, int age) {
		this.name = name;
		this.id = id;
		this.password = password;
		this.age = age;
	}
	
	
}
