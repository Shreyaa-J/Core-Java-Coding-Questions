
public class Grades {
	public static void main(String args[]) {
		char grade='A';
		switch(grade) {
		case 'A':
			System.out.println("Excellent");
			break;
		case 'B':
			System.out.println("Good");
			break;
		case 'C':
			System.out.println("Average");
			break;
		case 'D':
			System.out.println("Poor");
			break;
		case 'E':
			System.out.println("Fail");
			break;
		default:System.out.println("Invalid input...");	
		}
	}

}
