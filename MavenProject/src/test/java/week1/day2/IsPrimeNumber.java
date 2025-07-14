package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=13;
		
		//Directly checking number is prime or not
		if ((num % num == 0) && (num % 1 == 0)) {
			System.out.println(num + " is Prime number");
		} else {
			System.out.println(num + " is non Prime number");
		}

		//Iterate the number and then checking number is prime or not
		for (int i = 2; i <= num; i++) {
			if ((num % i == 0) && (num % 1 == 0)) {
				System.out.println(i + " is Prime number");
			} else {
				System.out.println(i + " is non Prime number");
			}
		}

	}

}
