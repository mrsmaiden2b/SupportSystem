package Testing;

import java.awt.AWTException;
import java.util.Scanner;

public class MainClass 
{
	
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) throws AWTException
	{
		String Line;
		int HelpLine = 0;
		boolean quit = false;
		boolean success = false;
		do {
		
		System.out.println("-----------------------------------");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("1 - Login Form");
		System.out.println("2 - Products");
		System.out.println("3 - Customer Report");
		System.out.println("4 - Staff Information");
		System.out.println("5 - Run Through All Pages");
		System.out.println("6 - Quit");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("-----------------------------------");
		System.out.println("Enter Choice: ");
		
	   Line = input.nextLine();
	   HelpLine = Integer.parseInt(Line);
	    
	    String helplineString = "";
	    switch(HelpLine) {
	    
	    case 1: Login_Form lf = new Login_Form();
	            success = lf.loginTest();
	            if (success == true)
	            {System.out.print("Was a Success");}
	            else { System.out.print("Has Failed");}
	    break;
	    
	    case 2: Products pr = new Products();
	            success = pr.productsTest();
	            if (success == true)
	            {System.out.print("Was a Success");}
	            else { System.out.print("Has Failed");}
	    break;
	    
	    case 3: Customer_Report cr = new Customer_Report();
	            success = cr.reportsTest();
	            if (success == true)
	            {System.out.print("Was a Success");}
	            else { System.out.print("Has Failed");}
	    break;
	    
	    case 4: Staff_Information si = new Staff_Information();
	            success = si.staffTest();
	            if (success == true)
	            {System.out.print("Was a Success");}
	            else { System.out.print("Has Failed");}
	    break;
	    
	    case 5: All_Programs ap = new All_Programs();
	            success = ap.programTest();
	            if (success == true)
	            {System.out.print("Was a Success");}
	            else { System.out.print("Has Failed");}
	    break;
	    
	    case 6: quit = true;
	    break;
	    
	    default: System.out.println("Enter a valid choice");
	    }
	    
	    System.out.println(helplineString);
	  
	    } while (quit == false);
		  input.close();
	}
}