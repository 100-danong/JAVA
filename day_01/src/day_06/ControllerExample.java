package day_06;

public class ControllerExample {

	public static void main(String[] args) {
		Controller c = new Controller();
		
		c.setService(new MemberService());
		c.service.Login();
		
		c.setService(new AdminService());
		c.service.Login();
	}
}