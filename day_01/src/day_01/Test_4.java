package day_01;

public class Test_4 {

	public static void main(String[] args) {
		
		String[][] arr = new String[5][];
		for(int i=0; i<arr.length; i++) {
			arr[i] = new String[i+1];
		}
		
		for(int i=0; i<arr.length ;i++){	
			for(int j=0;j<arr[i].length;j++){ 
				arr[i][j] = "*";
				System.out.print(arr[i][j]);
			}
			System.out.println("");
		} 
	}

}
