package week4.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetPratices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Name ="Google";
		char[] charArray = Name.toCharArray();
		
		Set<Character> unique=new LinkedHashSet<Character>(); //Output need same order in input . so, we used linkedHasSet
		for (int i=0;i<charArray.length;i++) {
			System.out.println(charArray[i]);
			 unique.add(charArray[i]);
	}
		System.out.println("unique values are:"+unique);
}}
