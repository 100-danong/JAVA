package day_01;

public class While {

	public static void main(String[] args) {
		
		int i = 1;
		while (i<=10) {
			i++;
			if(i % 2 == 1) {
				continue;
			}
			System.out.println(i);
			
		}

	}

}
