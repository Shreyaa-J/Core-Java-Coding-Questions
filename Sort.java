package arrayex;

import java.util.Arrays;

public class Sort {
	public static void main(String[] args) {
		// Array using Sort Method
//		int a[]= {6,9,7,4,5};
//		Arrays.sort(a);
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
//		}
		int[] arr = { 5, 2, 6, 1, 3 };
		
		//Logic inside main method if we don't write separtate method
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i] > arr[j]) {
//					int temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
		Sort.arrSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void arrSort(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
	}

}
