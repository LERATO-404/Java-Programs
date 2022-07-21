package com.enjoyCode;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws Exception {
		
		String path = "src/Data.txt";
		
		new ExtractEmailAddress().prepareAndSendReport(path); // Email report
		
		new ExtractPhoneNumber().prepareAndSendReport(path); // Phone number Report
	}

}
