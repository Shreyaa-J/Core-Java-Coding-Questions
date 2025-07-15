package arrayex;

public class SecondLargestAndSmallest {

	public static void main(String[] args) {
		int arr[] = { 4, 7, 1, 2, 9, 3 };
		int largest = arr[0], smallest = arr[0],seclargest=arr[0],secsmallest=arr[0];
		int n = arr.length;
		
		for (int i = 0; i < n; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}
		System.out.println("Largest Element : " + largest);
		for(int i=0;i<n;i++) {
			if(arr[i]>seclargest && arr[i]!=largest)
				seclargest=arr[i];
		}
		System.out.println("Second Largest element:"+seclargest);
		
		
		
		
		for (int i = 0; i < n; i++) {
			if (arr[i] < smallest) {
				smallest = arr[i];
			}
		}
		System.out.println("Smallest Element : " + smallest);
		for(int i=0;i<n;i++) {
			if(arr[i]<secsmallest && arr[i]!=smallest)
				secsmallest=arr[i];
		}
		System.out.println("Second Smallest element : "+secsmallest);

		
	}

}
