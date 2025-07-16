package com.basicpractice;

import java.util.Scanner;

public class Armstrong {
  public static void main(String[] args) {
	int n,arm=0,rem;
	System.out.println("Enter Any Number : ");
	
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	int org=n;
	while(n>0) {
		rem=n%10;
		arm=(rem*rem*rem)+arm;
		n=n/10;
	}
	if(org==arm) {
		System.out.println("Armstrong Number");
	}
	else {
		System.out.println("Not Armstrong");
	}
}
}
