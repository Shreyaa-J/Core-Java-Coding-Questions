package com.stringexamples;
import java.util.Scanner;
public class CountVowelsAndConsonant {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter String :");
	
	String input=sc.nextLine().toLowerCase();
	
	int vowels=0,consonants=0;
	
    for (int i = 0; i < input.length(); i++) {
        char ch = input.charAt(i);

        if (Character.isLetter(ch)) {
            if ("aeiou".indexOf(ch) != -1) {
                vowels++;
            } else {
                consonants++;
            }
        }
    }
	System.out.println("Vowels: "+vowels);
	System.out.println("Consonants : "+consonants);
}
}
