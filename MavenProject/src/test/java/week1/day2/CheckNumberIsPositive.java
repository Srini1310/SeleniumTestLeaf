package week1.day2;

public class CheckNumberIsPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int version = 10;
		// Check if the number is even or odd
		if (version % 2 == 0) {
			System.out.println(version + " is even number");
		} else {
			System.out.println(version + " is odd number");
		}
		// Check if the number is positive, negative, or zero
		for (int i = 1; i <= version; i++) {
			if (i > 0) {
				System.out.println(i + " is postive");
			} else if (i < 0) {
				System.out.println(i + " is negative");
			} else {
				System.out.println(i + " is zero");
			}
		}

	}
}
