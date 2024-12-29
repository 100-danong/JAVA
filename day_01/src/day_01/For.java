package day_01;


public class For {

	public static void main(String[] args) {
		for (int i = 1; i < 6; i++) {
			for (int j = 5; j > 0; j--) {
				if (i < j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
		for (int k = 0; k < 6; k++) {
			for (int l = 5; l > k; l--) {
				System.out.print("*");
		}
			System.out.println("");
	}
}
}