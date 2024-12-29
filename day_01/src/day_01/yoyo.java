package day_01;

import java.util.Calendar;

public class yoyo {

	public static void main(String[] args) {
		
		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		int Minute = Calendar.getInstance().get(Calendar.MINUTE);
		int second = Calendar.getInstance().get(Calendar.SECOND);
		String ampm = (hour>=12)? "오후":"오전";
		System.out.printf("지금 시간은 %s %d시 %d분 %d초 입니다.", ampm, hour, Minute, second);
	}

}
