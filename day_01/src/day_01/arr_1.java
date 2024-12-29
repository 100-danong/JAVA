package day_01;

public class arr_1 {

	public static void main(String[] args) {
		
		int[][] arr = new int[4][4];
		for(int i=0; i<arr[0].length; i++) {
			for(int j=0; j<arr[1].length; j++) {
				arr[i][j] = i*arr[1].length+1+j;
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println("");
		}
		
		System.out.printf("\n\n\n");
		int[][] rotatedArr = new int[4][4];
		int m = rotatedArr.length;
		
				for(int i = 0; i<rotatedArr.length; i++) {
					for(int j = 0; j<rotatedArr[i].length; j++) {
				rotatedArr[i][j] = arr[m-1-j][i];
				System.out.print(rotatedArr[i][j]+"\t");
			}
			System.out.println("");
		}
				
		
	}

}

