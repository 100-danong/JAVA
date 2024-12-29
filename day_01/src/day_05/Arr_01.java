package day_05;

public class Arr_01 {

	public static void main(String[] args) {

		int[][] arr = new int[5][];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = new int[arr.length-i];
		}
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				arr[i][j] = (i+1)*(j+1);
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println("");
		}
	}

}
