
public class Fibonacci_Series {
	
	public static void main(String args[]) {
		int a=0,b=1;
		int N=10;
		for(int i=1;i<=N;i++) {
			System.out.println(a);
			b=a+b;
			a=b-a;
		}

	}
}
