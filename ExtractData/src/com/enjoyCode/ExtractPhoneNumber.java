package com.enjoyCode;

import java.util.regex.Pattern;

public class ExtractPhoneNumber extends ExtractDataInfo {
	
	private static final Pattern PHONE_PATTERN = Pattern.compile("^[0-9]*$");

	@Override
	public Pattern getExtractInfo() {
		// TODO Auto-generated method stub
		return PHONE_PATTERN;
	}

	@Override
	public String getReportName() {
		// TODO Auto-generated method stub
		return "Phone Number";
	}
	
		
}
