package day_01;

import java.util.Calendar;

public class Switch {

	public static void main(String[] args) {
		
		int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
		String season ="";
		
		switch (month) {
		case 12: case 1: case 2:
			season = "겨울";
			
			break;
		case 3: case 4: case 5:
			season = "봄";
			break;
		case 6: case 7: case 8: 
			season = "여름";
			break;
		default:
			season = "가을";
			break;
		}
		System.out.println("지금은 "+month+"월이고, "+ season +"입니다.");
		
	}

}
