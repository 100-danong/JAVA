package day_01;

import java.util.Scanner;

public class Test_1 {

	public static void main(String[] args) {
		System.out.println("생성할 배열의 크기는? ");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		int[] arr = new int[i];
		int sum = 0;
		for(int j = 1; j < arr.length + 1; j++) {
		System.out.printf("배열에 초기화 시킬 %d번째 값을 입력하시오 : ", j);
		Scanner sc1 = new Scanner(System.in);
		int k = sc1.nextInt();
		
		sum+=k;
	}
		System.out.println("총합"+sum);
	}
}

