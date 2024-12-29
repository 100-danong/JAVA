package day_02;

public class minus {
	
	
	
	minus(){
		System.out.println("계산기가 생성되었습니다.");
	}
	
	double sum (int num1, double num2) {
		return num1+num2;
	}
	
	double minus (int num1, double num2) {
		return num1-num2;
	}
	int avg (int ... nums) {
		int sum = 0;
		
		for(int i = 0; i<nums.length; i++) {
			sum+=nums[i];
		}
		return sum / nums.length;
	}
	double multiply(double i, double j) {
		return i*j;
	}
	
	double div (int i, int j) {
		return i/j;
	}
	double div (int i, double j) {
		return i/j;
	}
	double div (double i, int j) {
		return i/j;
	}
	double div (double i, double j) {
		return i/j;
	}
}
