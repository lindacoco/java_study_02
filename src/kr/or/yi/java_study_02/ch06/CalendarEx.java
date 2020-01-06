package kr.or.yi.java_study_02.ch06;

import java.util.Calendar;

public class CalendarEx {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		System.out.println("현재"+now);
		
		Calendar firstDate = Calendar.getInstance();
		firstDate.clear();
		firstDate.set(2016,11,25);
		
		firstDate.set(Calendar.HOUR_OF_DAY,20);
		firstDate.set(Calendar.MINUTE,30);
		printCalendar("처음 데이트한 날은",firstDate);
		
		
	}
	public static void printCalendar(String msg, Calendar cal) {
		
		
       int year = cal.get(Calendar.YEAR);
       int month = cal.get(Calendar.MONTH)+1;
       int day = cal.get(Calendar.DAY_OF_MONTH);
       int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
       int hour = cal.get(Calendar.HOUR);
       int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);
       int ampm = cal.get(Calendar.AM_PM);
       int minute = cal.get(Calendar.MINUTE);
       int second = cal.get(Calendar.MILLISECOND);
       int millisecond = cal.get(Calendar.MILLISECOND);
       System.out.printf("%s %d/ %d /%d ",msg,year,month,day);
       
       switch(dayOfWeek) {
       case Calendar.SUNDAY :System.out.print("일요일"); break;
       case Calendar.MONDAY :System.out.print("일요일"); break;
       case Calendar.TUESDAY :System.out.print("일요일"); break;
       case Calendar.WEDNESDAY :System.out.print("일요일"); break;
       case Calendar.THURSDAY :System.out.print("일요일"); break;
       case Calendar.FRIDAY :System.out.print("일요일"); break;
       case Calendar.SATURDAY :System.out.print("일요일"); break;
       }
       
       System.out.print("("+hourOfDay+"시) ");
       if(ampm == Calendar.AM) {
    	   System.out.print("오전");
       }else {
    	   System.out.print("오후");
       }
       System.out.printf("%d시 %d분 %d초 %d밀리초  ",hour,minute,second,millisecond);
	}

}
