package com.enjoyCode;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public abstract class ExtractDataInfo {
	
		public abstract Pattern getExtractInfo(); // get the extracted data
		public abstract String getReportName(); // get the report name
		
	
		private String parse(String path) throws FileNotFoundException {
			File file = new File(path);
			//Pattern PHONE_PATTERN = Pattern.compile("^[0-9]*$");
			String out = "";
			Scanner input = new Scanner(file);
			
			if(input.hasNext()) {
				input.nextLine();
			}
			while(input.hasNext()) {
				String nextLine = input.nextLine();
				//Matcher matcher = PHONE_PATTERN.matcher(nextLine);
				Matcher matcher = getExtractInfo().matcher(nextLine);
				
				boolean matches = matcher.matches();
				if(matches) {
					out += nextLine + "\n";
				}
			}
			input.close();
			if(out == " ") {
				return "Empty file";
			}
			
			return out;
		
		}	
		
		public void prepareAndSendReport(String path) throws FileNotFoundException{
			System.out.println("Starting report "+ getReportName()+ " ...");
			String report = parse(path);
			System.out.println(report);
			System.out.println("sent report "+ getReportName());
			
		}
}
