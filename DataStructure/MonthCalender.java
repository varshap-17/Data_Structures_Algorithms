package bridgelabz;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MonthCalender {
	public final static String[] monthcalender = {  
			  "January",  
			  "February",  
			  "March",  
			  "April",  
			  "May",  
			  "June",  
			  "July",  
			  "August",  
			  "September",  
			  "October",  
			  "November",  
			  "December"  
			 };  
	public final static int daysinmonths[] = {  
			  31,  
			  28,  
			  31,  
			  30,  
			  31,  
			  30,  
			  31,  
			  31,  
			  30,  
			  31,  
			  30,  
			  31  
			 };
	private void displayMonth(int month, int year) {  
		  
		  int blankdays = 0;  
		  System.out.println("  " + monthcalender[month] + " " + year);  
		  
		  if (month < 0 || month > 11) {  
		   throw new IllegalArgumentException(  
		    "Month " + month + " It is not valid and must lie in between 0 and 11");  
		  }
		  GregorianCalendar cldr = new GregorianCalendar(year, month, 1);  
		  System.out.println("Sunday Monday Tuesday Wednesday Thursday Friday Saturday");  
		  
		  
		  blankdays = cldr.get(Calendar.DAY_OF_WEEK) - 1;  
		  int daysInMonth = daysinmonths[month];  
		  
		  if (cldr.isLeapYear(cldr.get(Calendar.YEAR)) && month == 1) {  
		  
		   ++daysInMonth;  
		  }  
		  
		  for (int i = 0; i < blankdays; i++) {  
		   System.out.print("   ");  
		  }  
		  
		  for (int i = 1; i <= daysInMonth; i++) {  
		  
		   if (i <= 9) {  
		    System.out.print(" ");  
		   }  
		   System.out.print(i);
		   if ((blankdays + i) % 7 == 0) {  
			    System.out.println();  
			   } else {  
			    System.out.print(" ");  
			   }  
			  }  
			 }  
			  
			 public static void main(String[] args) {  
			  
			  int mon, yr;  
			  MonthCalender moncldr = new MonthCalender();  
			  
			  if (args.length == 2) {  
			   moncldr.displayMonth(Integer.parseInt(args[0]) - 1, Integer.parseInt(args[1]));  
			  } else {  
			   Calendar todaycldr = Calendar.getInstance();  
			   moncldr.displayMonth(todaycldr.get(Calendar.MONTH), todaycldr.get(Calendar.YEAR));  
			  }  
			 }  
		  
}
