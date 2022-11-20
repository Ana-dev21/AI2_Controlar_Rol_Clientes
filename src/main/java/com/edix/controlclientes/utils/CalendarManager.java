package com.edix.controlclientes.utils;

import java.util.Calendar;
import java.util.Date;

 public class  CalendarManager {
	
	private static Calendar calendar;
	
	static {		
		calendar = Calendar.getInstance();		
	}
	
	public static Date getDate(int year, int month, int day) {
		calendar.set(year, month, day);
		return calendar.getTime();
		
	}
	

}
