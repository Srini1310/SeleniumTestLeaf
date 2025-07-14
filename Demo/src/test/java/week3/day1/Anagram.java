package week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  text1 = "stops";  
	    String text2 = "potss";
	    
	    // Convert strings to char arrays
        char[] len1 = text1.toCharArray();
        char[] len2 = text2.toCharArray();

        // Sort both char arrays
        Arrays.sort(len1);
        Arrays.sort(len2);
        
       // Compare sorted arrays
	    if (Arrays.equals(len1,len2))
	    {
	    	System.out.println("Length of the strings is same.so, it's strings are an Anagram ");
	    }else{
	    	System.out.println("Length of the strings is not same.so, it's strings are not an Anagram ");
	    }
				

	}

}
