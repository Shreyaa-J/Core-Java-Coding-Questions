
public class CheckPalindromeDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=121;
		int originalno = number, reverse = 0;
        do {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        } while (number > 0);
        if (originalno == reverse)
            System.out.println(originalno + " is a Palindrome");
        else
            System.out.println(originalno + " is NOT a Palindrome");

	}

}
