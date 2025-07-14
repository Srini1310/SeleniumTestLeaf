package week4.day1;

public class Overridding extends Overloading {

	public void reportStep(String message, String status)
	{
		//overriding
		System.out.println("Message: " + message );
		System.out.println( " Status: " + status);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overridding OR= new Overridding();
		OR.reportStep("Hello", "PASS1");
	}
				

}
