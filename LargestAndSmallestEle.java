package arrayex;

public class LargestAndSmallestEle {
	int arr[] = { 4, 7, 1, 2, 9, 3 };
	int largest = arr[0], smallest = arr[0];
	int n = arr.length;

	public void largestNo() {
		for (int i = 0; i < n; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}

		}
		System.out.println("Largest Element : " + largest);

	}

	public void SmallestNo() {
		for (int i = 0; i < n; i++) {
			if (arr[i] < smallest) {
				smallest = arr[i];
			}
		}
		System.out.println("Smallest Element : " + smallest);

	}

	public static void main(String args[]) {
		LargestAndSmallestEle a = new LargestAndSmallestEle();
		a.largestNo();
		a.SmallestNo();

	}

}
