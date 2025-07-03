package string_practice;

import java.util.Scanner;

public class SeparateElements {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		String input=sc.nextLine();
		
		StringBuilder letters =new StringBuilder();
		StringBuilder digits = new StringBuilder();
		StringBuilder specialCharacters= new StringBuilder();
		
		for(int i=0; i<input.length();i++) {
			char ch= input.charAt(i);
			
			if(Character.isDigit(ch)) {
				digits.append(ch);
			}
			else if(Character.isAlphabetic(ch)) {
				letters.append(ch);
			}
			else {
				specialCharacters.append(ch);
			}
		}
		
		System.out.println("Letters : "+letters);
		System.out.println("Digits : "+digits);
        System.out.println("Special char : "+specialCharacters);		
	}

}
