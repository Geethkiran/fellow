package com.bridgelabz.basiccoreprograms;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.bridgelabz.customexceptions.UserDefinedException;
import com.bridgelabz.utils.InputUtility;
import com.bridgelabz.utils.LogUtility;
import com.bridgelabz.utils.Utility;

public class LeapYear {

	public static void main(String[] args) {
		LogUtility.setLogger(LeapYear.class.getName());
		Logger logger = LogUtility.getLogger();
		System.setProperty("log", LogUtility.FILEPATH);
		PropertyConfigurator.configure(LogUtility.CONFIGFILE);
		logger.info("logger name "+logger.getName());
		logger.warn("can cause NumberFormatException");
		System.out.println("enter year");
		int year= InputUtility.getInt();
		try {
			if (Utility.isYearLeapYear(year) == true) {
				System.out.println(year+ " is leap year");
			}else 
					System.out.println(year +" is not a leapyear");
		} catch (UserDefinedException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			logger.error(e);
		}
		}
	}