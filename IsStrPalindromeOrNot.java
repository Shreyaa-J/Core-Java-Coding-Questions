package string_practice;

import java.util.Scanner;

public class IsStrPalindromeOrNot {
	
	public static boolean isPaindrome(String s) {
		int start=0;
		int end=s.length()-1;
		
		while(start<=end) {
			
			if(s.charAt(start)!=s.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
	     return true;
	}
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String : ");
		
		String str=sc.nextLine();
		
		if(isPaindrome(str)) {
			System.out.println("It's a Paindrome  ");
		}else {
			System.out.println("Not a Paindrome ");
		}
	}
}
