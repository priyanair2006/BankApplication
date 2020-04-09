package com.bank.qa.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GetCurrenttimeStamp {
	
	
	public static String GetTimeStamp()
	{
		Date dt = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
		
		String datestr= format.format(dt);
		
		return datestr;
		
		
	}

}
