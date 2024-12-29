package day_04;

import java.util.Calendar;

public class Week_mine {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		Week today = null;
		
		switch(week) {
		case 1:
		today = Week.일;
		break;
		case 2:
			today = Week.월;
		break;
		case 3:
			today = Week.화;
		break;
		case 4:
			today = Week.수;
		break;
		case 5:
			today = Week.목;
		break;
		case 6:
			today = Week.금;
		break;
		case 7:
			today = Week.토;
		break;
		}
		System.out.println("오늘은 "+ today + "요일 입니다.");
	}

}
