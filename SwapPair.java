package arrays_practice;

import java.util.Scanner;

public class SwapPair {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int array[]=new int[8];
		
		System.out.println("Enter Eight Elements : ");
		for(int i=0;i<8;i++) {
			array[i]=sc.nextInt();
		}
		
		for(int i=0;i<array.length;i+=2) {
			int temp=array[i];
			array[i]=array[i+1];
			array[i+1]=temp;
		}
		System.out.println("After Swapping in Pairs : ");
		for (int i : array) {
			System.out.println(i+" ");
		}



	}

}
