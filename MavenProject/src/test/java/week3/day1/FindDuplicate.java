package week3.day1;

import java.util.Arrays;

public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = { 2, 5, 7, 7, 5, 9, 2, 3 };
		for (int i = 0; i < num.length; i++) {
			/*
			 * if(num[i]==num[i+1]) { System.out.println("Duplicate value is "+num[i]); }
			 */
			//Another way to identify the dupliacte values
		for (int j=i+1;j<num.length;j++) {
			if (num[i]==num[j]) {
				System.out.println("Duplicate value is "+num[i]);
			}else {
				continue;
			}
	}
		}

	}

}
