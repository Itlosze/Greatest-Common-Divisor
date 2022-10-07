import java.util.InputMismatchException;
import java.util.Scanner;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		System.out.println("--- Greatest Common Divisor ---");
		int firstNumber=1;
		int secondNumber=1;
		try (Scanner scanner = new Scanner(System.in)) {
			try {
				System.out.println("First number: ");
				firstNumber = scanner.nextInt();
				System.out.println("Second number: ");
				secondNumber = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Not a number!");
			}
		}
		System.out.println("The greatest common divisor: "+greatestCommonDivisor(firstNumber,secondNumber));

	}
	public static Integer greatestCommonDivisor(Integer a, Integer b) {
		if (b == 0) {
		    return a;
		}
		return greatestCommonDivisor(b, a % b); 
		} 
}
