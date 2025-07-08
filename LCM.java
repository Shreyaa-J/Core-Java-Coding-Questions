package com.basicpractice;

import java.util.Scanner;

public class LCM {
    
	 static int euclideanGCD(int a, int b) {
	        while (a != 0 && b != 0) {
	            if (a > b) {
	                a = a % b;
	            } else {
	                b = b % a;
	            }
	        }
	        return (a != 0) ? a : b;
	    }

	    static int findLCM(int a, int b) {
	        return (a * b) / euclideanGCD(a, b);
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter first number: ");
	        int a = sc.nextInt();

	        System.out.print("Enter second number: ");
	        int b = sc.nextInt();

	        System.out.println("LCM: " + findLCM(a, b));
	    }
}
