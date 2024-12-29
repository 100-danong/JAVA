package day_01;

public class Test_3 {

	public static void main(String[] args) {
		
		int[][] arr = new int[4][4];
		for(int j = 0; j<arr[0].length; j++) {
			for(int k = 0; k<arr[1].length; k++) {
				arr[j][k] = j*arr[1].length+1+k;
				System.out.print(arr[j][k]);
			}
			System.out.println();
		}
	}

}
