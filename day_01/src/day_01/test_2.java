package day_01;

public class test_2 {

	public static void main(String[] args) {
		int[] i = new int[] {10, 20, 30};
		int sum = 0;
		
		for(int j = 0; j<i.length; j++) {
			sum += i[j];
		}
		
		System.out.println(sum);
	}

}
