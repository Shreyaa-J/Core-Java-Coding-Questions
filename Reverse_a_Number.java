
public class Reverse_a_Number {
      public static void main(String[] args) {
    	  int number=12;
    	  int reverse = 0;
          for (; number > 0; number /= 10) {
              reverse = reverse * 10 + number % 10;
          }
          System.out.println("Reversed number: " + reverse);
	}
}
