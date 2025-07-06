package com.stringexamples;
import java.util.Scanner;
public class EmailCheck {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your email : ");
		String email=sc.nextLine().toLowerCase();
		
		if(email.contains("gmail")) {
			System.out.println("Email contains Gmail");
		}
		else if(email.contains("yahoo")) {
			System.out.println("Email contains Yahoo");
		}
		else {
			System.out.println("Not contain gmail And Yahoo");
		}
	}

}
