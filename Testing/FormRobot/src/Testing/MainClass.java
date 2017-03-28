package Testing;

import java.awt.AWTException;
import java.util.Scanner;

public class MainClass 
{
	public static void main(String[] args)
	{
		int HelpLine = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("-----------------------------------");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("1 - Login Form");
		System.out.println("2 - Products");
		System.out.println("3 - Customer Report");
		System.out.println("4 - Staff Information");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("-----------------------------------");
		
	    HelpLine = input.nextInt();
	    
	    String helplineString = null;
	    switch(HelpLine) {
	    
	    case 1: Login_Form();
	    break;
	    case 2: Products();
	    break;
	    case 3: Customer_Report();
	    break;
	    /*case 4: Staff_Information();
	    break;*/
	    default: System.out.println("Enter a valid choice");
	    }
	    System.out.println(helplineString);
	    input.close();
	    }  	
	    
	    public static void Login_Form() {
			Login_Form robotprogram = null;
			try {
				robotprogram = new Login_Form();
			} catch (AWTException e) {
				e.printStackTrace();
			}
			robotprogram.loginTest();
	    }
	    
	    public static void Products() {
			Products robotprogram = null;
			try {
				robotprogram = new Products();
			} catch (AWTException e) {
				e.printStackTrace();
			}
			robotprogram.productsTest();
	}
	    
	    public static void Customer_Report() {
			Customer_Report robotprogram = null;
			try {
				robotprogram = new Customer_Report();
			} catch (AWTException e) {
				e.printStackTrace();
			}
			robotprogram.reportsTest();
	}
}