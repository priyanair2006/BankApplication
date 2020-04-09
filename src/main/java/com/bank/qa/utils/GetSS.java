package com.bank.qa.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.bank.qa.base.TestBase;

public class GetSS extends TestBase {
	
	public static String TakeScreenShot()
	{
		
		TakesScreenshot ss = (TakesScreenshot) driver;
		File source=   ss.getScreenshotAs(OutputType.FILE);

		String Path=(System.getProperty("user.dir")+"\\Screenshots\\"+"output_"+GetCurrenttimeStamp.GetTimeStamp()+".png");
		System.out.print("path"+Path);
		File destination = new File(Path);
		try {
			FileUtils.copyFile(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return Path;
	}

}
