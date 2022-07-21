package com.enjoyCode;

import java.util.regex.Pattern;

public class ExtractEmailAddress extends ExtractDataInfo {

	private static final Pattern EMAIL_PATTERN = 
		    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

	@Override
	public Pattern getExtractInfo() {
		// TODO Auto-generated method stub
		return EMAIL_PATTERN;
	}

	@Override
	public String getReportName() {
		// TODO Auto-generated method stub
		return "Email";
	}
		
}
