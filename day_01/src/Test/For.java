package Test;

public class For {

	public static void main(String[] args) {

		int sum = 0;
		
		for(int i = 1; i<5; i++) {
			for(int j = 3; j<6; j++) {
				sum += i+j;
			}
		}
		System.out.println(sum);
		
	}

}
