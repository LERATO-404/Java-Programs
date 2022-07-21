
/*
	Leetcode Question
	
	For example, 2 is written as II in Roman numeral, just two ones added together. 
	12 is written as XII, which is simply X + II. 
	The number 27 is written as XXVII, which is XX + V + II.
	
	Symbol       	Value
	I       -->      1
	V       -->      5
	X       -->      10
	L       -->      50
	C       -->      100
	D       -->      500
	M       -->      1000

Roman numerals are usually written largest to smallest from left to right. 
However, the numeral for four is not IIII. Instead, the number four is written as IV. 
Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

	- I can be placed before V (5) and X (10) to make 4 and 9. 
	- X can be placed before L (50) and C (100) to make 40 and 90. 
	- C can be placed before D (500) and M (1000) to make 400 and 900.
	
	
Given a roman numeral, convert it to an integer.
*/


public class RomanToInteger{
	public static int convertRomanToInt(String romanSysmbol){
        int romanValue = 0;
        switch(romanSysmbol){
            case "I":
                romanValue = 1;
                break;
            case "V":
                romanValue = 5;
                break;
            case "X":
                romanValue = 10;
                break;
            case "L":
                romanValue = 50;
                break;
            case "C":
                romanValue = 100;
                break;
            case "D":
                romanValue = 500;
                break;
            case "M":
                romanValue = 1000;
                break;
            default:
                romanValue = 0;      
        }
        return romanValue;
    }
    
    public static int subTimeNumeral(String symbols){
        int subtractionValue = 0;
        if(symbols.contains("IV") || symbols.contains("IX")){
            subtractionValue += 1;
        }
        if(symbols.contains("XL") || symbols.contains("XC")){
            subtractionValue += 10;
        }
        if(symbols.contains("CD") || symbols.contains("CM")){
            subtractionValue += 100;
        }
        return subtractionValue;
    }
    
    public static int romanToInt(String s) {
        int subRomanNumeral = subTimeNumeral(s);
        String[] splitSymbols = s.split("");  
        int romanNumeral = 0;
        for(int i = 0; i < splitSymbols.length;i++){
            romanNumeral += convertRomanToInt(splitSymbols[i]); 
        }
        return romanNumeral-(2*subRomanNumeral);                   
    }
	
	public static void main(String[] args){
		String romanNumeral_1 = "III";
		String romanNumeral_2 = "LVIII";
		String romanNumeral_3 = "MCMXCIV";
		int romanNumberToInt_1 = romanToInt(romanNumeral_1);
		int romanNumberToInt_2 = romanToInt(romanNumeral_2);
		int romanNumberToInt_3 = romanToInt(romanNumeral_3);
		
		System.out.println("Roman numeral(s) "+romanNumeral_1+ " converted to a number equal "+romanNumberToInt_1); // Output  = 3
		System.out.println("Roman numeral(s) "+romanNumeral_2+ " converted to a number equal "+romanNumberToInt_2); // Output  = 58
		System.out.println("Roman numeral(s) "+romanNumeral_3+ " converted to a number equal "+romanNumberToInt_3); // Output  = 1994
	}
	
	
}