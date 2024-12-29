package day_01;

import java.util.Scanner;

public class score {

	public static void main(String[] args) {
		System.out.println("점수나 입력해라");
		Scanner scannerScore = new Scanner(System.in);
		int score = scannerScore.nextInt();
		
		if(score>=90) {
			System.out.println("A");
		}else if(score>=80) {
			System.out.println("B");
		}else if(score>=70) {
			System.out.println("C");
		}else {
			System.out.println("F");
		}

	}

}
