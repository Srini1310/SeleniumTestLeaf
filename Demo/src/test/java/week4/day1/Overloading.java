package week4.day1;

public class Overloading {

	public void reportStep(String message, String status)
	{
		System.out.println("Message: " + message + " Status: " + status);
	}
	public void reportStep(String message, String status, boolean snapshot)
	{
		System.out.println("Message: " + message + '\n'+" Status: " + status + " snapshot: "+snapshot);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading ol = new Overloading();
		ol.reportStep("Hi","Pass", true);
		ol.reportStep("Testleaf", "Pass");

	}

}
