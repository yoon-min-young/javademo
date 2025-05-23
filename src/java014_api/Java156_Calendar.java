package java014_api;

import java.util.Calendar;


//2025년 5월의 마지막일과 요일을 구하는 프로그램을 구현하세요.
//[출력결과]
//2025-5-31 토요일
public class Java156_Calendar {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		int lastDate = cal.getActualMaximum(Calendar.DATE);
		System.out.println(lastDate);
		
		cal.set(Calendar.DATE, lastDate);		
		int weekday = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(weekday);
		
		char weekName = ' ';
		
		switch(weekday) {
		case 1 : weekName='일'; break;
		case 2 : weekName='월'; break;		
		case 3 : weekName='화'; break;
		case 4 : weekName='수'; break;
		case 5 : weekName='목'; break;
		case 6 : weekName='금'; break;
		case 7 : weekName='토'; break;		
		}
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) +1;
		System.out.printf("%d-%d-%d %c요일\n", year,month, lastDate, weekName);

	}//end main()

}//end class
