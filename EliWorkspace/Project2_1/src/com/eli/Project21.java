package com.eli;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Project21 {

	public static void main(String[] args) {
		//get a calendar for today 
		GregorianCalendar g = new GregorianCalendar();
		g.add(Calendar.DAY_OF_MONTH, 100);
		int dayOfMonth = g.get(Calendar.DAY_OF_MONTH); 
        int month = g.get(Calendar.MONTH); 
        int year = g.get(Calendar.YEAR); 
        int weekday = g.get(Calendar.DAY_OF_WEEK);
        System.out.printf("A Hundred Days From Now Will Be %d/%d/%d which is the %d day of the week\n",month+1,dayOfMonth,year,weekday);   
        
        //create calendar for my birthday 
        GregorianCalendar b = new GregorianCalendar(1999, Calendar.SEPTEMBER ,21);
        int bday = b.get(Calendar.DAY_OF_WEEK);
        // find the name of the day
        String dayname;
        switch (bday)
        {
        case 1:
			dayname = "Sunday";
			break;
        case 2:
        	dayname = "Monday";
        break;
        case 3:
        	dayname = "Tuesday";
        	break;
        case 4:
        	dayname = "Wednesday";
        	break;
        case 5: 
        	dayname = "Thursday";
        	break;
        case 6: 
        	dayname = "Friday";
        	break;
        	default:
        		dayname = "Saturday";
        }
        
        System.out.printf("I was born on a %s\n", dayname);
        
        
        b.add(Calendar.DAY_OF_MONTH, 10000);
        int dayOfMonth1 = b.get(Calendar.DAY_OF_MONTH); 
        int month1 = b.get(Calendar.MONTH); 
        int year1 = b.get(Calendar.YEAR); 
        System.out.printf("Ten thousands days from my birthday will be %d/%d/%d\n",month1+1,dayOfMonth1,year1);   
        
	}

}
