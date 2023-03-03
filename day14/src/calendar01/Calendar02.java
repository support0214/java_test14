package calendar01;

import java.util.Calendar;

public class Calendar02 {

	public static void main(String[] args) {
		String[] week = {"일","월","화","수","목","금","토"};
		Calendar date1 = Calendar.getInstance();
		System.out.println(date1.get(Calendar.DAY_OF_WEEK)); 
		System.out.println(week[date1.get(Calendar.DAY_OF_WEEK)-1]);
		System.out.println(date1.get(Calendar.YEAR));
		
		// 월은 0 → 1월 
		date1.set(2022, 6, 8);
		System.out.println(date1.get(Calendar.YEAR));
		date1.set(2021, 3, 20, 7, 20, 53);
		System.out.println(date1.get(Calendar.HOUR));
		
		date1.set(Calendar.MONTH, Calendar.DECEMBER);
		System.out.println((date1.get(Calendar.MONTH)+1) + "월");
		date1.set(Calendar.HOUR_OF_DAY, 15);
		System.out.println(date1.get(Calendar.HOUR_OF_DAY)+ "시");
	}

}
