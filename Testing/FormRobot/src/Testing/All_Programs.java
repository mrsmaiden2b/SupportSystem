package Testing;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.omg.SendingContext.RunTime;

import static java.awt.event.InputEvent.BUTTON1_DOWN_MASK;
import static java.awt.event.InputEvent.BUTTON2_DOWN_MASK;
import static java.awt.event.KeyEvent.*;

public class All_Programs 
{
	private Robot robot;
	private Runtime runtime;
	boolean successful = false;
	public boolean programTest()
	{
		
		runtime = Runtime.getRuntime();
		All_Programs keyboard = null;
		try{
		keyboard = new All_Programs();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		try {
			Runtime.getRuntime().exec("cmd /c start C:\\Users\\Vanilla\\Documents\\SupportSystem\\Code\\HelpLine\\dist\\HelpLine.jar");
			robot.delay(3000);
			successful = true;
		} catch (IOException e) {
			e.printStackTrace();
			successful = false;
		}
		robot.delay(1000);
		//Login Page
		keyboard.Username("2");
		keyboard.Password("Michelle19700414");
		
		//Products Page
		keyboard.ProdName("Graphics Card");
		keyboard.DateIn("2017-03-21");
		keyboard.Manufacturer("MSI");
		keyboard.Problem("Ports on Hard not working");
		keyboard.ModelNumber("11");
		keyboard.FixDate("2017-03-22");
		keyboard.serialNumber("77");
		
		//Customer Reports Page
		keyboard.EquipType("Router");
		keyboard.FirstName("Gloria");
		keyboard.CustProblem("faulty Cable");
		keyboard.Surname("Priest");
		keyboard.Address("67 Bishopgate Street");
		//keyboard.StaffRec("Mary Porter");
		keyboard.Postcode("LA10 7SN");
		//keyboard.StaffFix("Thomas Davis");
		keyboard.Telephone("07757143071");
		keyboard.DateRes("2017-03-28");
		keyboard.DateRep("2017-03-27");
		keyboard.EstCost("5");
		
		//Staff Information Page
		keyboard.Staff_Address("5 Boroughbridge Road");
		keyboard.StaffF_Name("Joanna");
		keyboard.Staff_Postcode("NP6 9PS");
		keyboard.Staff_Surname("Hall");
		keyboard.Staff_Dob("1970-02-13");
		keyboard.Email("JoannaHall@hotmail.com");
		return successful;
		
	}
	public All_Programs() throws AWTException
	{
		this.robot = new Robot();
	}
	
	//Login Page Start
	public void Username(CharSequence characters)
	{
		int length = characters.length();
		for (int i =0; i < length; i++)
		{
			char character = characters.charAt(i);
			type(character);
		}
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
	    }

		public void Password(CharSequence characters)

		{
			int length = characters.length();
		for (int i =0; i < length; i++)
		{
			char character = characters.charAt(i);
			type(character);
		}
		
		
		//Login
		robot.mouseMove(954, 556);
		robot.mousePress(BUTTON1_DOWN_MASK);
		robot.delay(500);
		robot.mouseRelease(BUTTON1_DOWN_MASK);
		robot.delay(400);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		//Product Page Starts
		robot.delay(1000);
		robot.mouseMove(819, 420);
		robot.delay(500);
		robot.mousePress(BUTTON1_DOWN_MASK);
		robot.delay(1000);
		robot.mouseRelease(BUTTON1_DOWN_MASK);
		
		//Select Text Box
		robot.delay(1200);
		robot.mouseMove(725, 410);
		robot.mousePress(BUTTON1_DOWN_MASK);
		robot.delay(500);
		robot.mouseRelease(BUTTON1_DOWN_MASK);
		}
	
		public void ProdName(CharSequence characters)
		{
			int length = characters.length();
			for (int i =0; i < length; i++)
			{
				char character = characters.charAt(i);
				type(character);
			}
			robot.delay(300);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
		    }
		
		public void DateIn(CharSequence characters)
		{
			int length = characters.length();
			for (int i =0; i < length; i++)
			{
				char character = characters.charAt(i);
				type(character);
			}
			robot.delay(300);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
		    }
		
		public void Manufacturer(CharSequence characters)
		{
			int length = characters.length();
			for (int i =0; i < length; i++)
			{
				char character = characters.charAt(i);
				type(character);
			}
			robot.delay(300);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
		    }
		
		public void Problem(CharSequence characters)
		{
			int length = characters.length();
			for (int i =0; i < length; i++)
			{
				char character = characters.charAt(i);
				type(character);
			}
			robot.delay(300);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
		    }
		
		public void ModelNumber(CharSequence characters)
		{
			int length = characters.length();
			for (int i =0; i < length; i++)
			{
				char character = characters.charAt(i);
				type(character);
			}
			robot.delay(300);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
		    }
		
		public void FixDate(CharSequence characters)
		{
			int length = characters.length();
			for (int i =0; i < length; i++)
			{
				char character = characters.charAt(i);
				type(character);
			}
			robot.delay(300);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
		    }
		
		public void serialNumber(CharSequence characters)
		{
			int length = characters.length();
			for (int i =0; i < length; i++)
			{
				char character = characters.charAt(i);
				type(character);
			}
			robot.delay(300);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
		    }
		
		public void Finished(CharSequence characters)
		{
			int length = characters.length();
			for (int i =0; i < length; i++)
			{
				char character = characters.charAt(i);
				type(character);
			}
			robot.delay(300);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			robot.delay(300);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			robot.delay(1000);
			robot.mouseMove(1041, 550);
			robot.delay(1000);
			robot.mousePress(BUTTON1_DOWN_MASK);
			robot.delay(1000);
			robot.mouseRelease(BUTTON1_DOWN_MASK);
			robot.delay(2000);
			robot.mouseMove(596, 550);
			robot.delay(1000);
			robot.mousePress(BUTTON1_DOWN_MASK);
			robot.delay(1000);
			robot.mouseRelease(BUTTON1_DOWN_MASK);
			robot.delay(1000);
			robot.mouseMove(770, 445);
			robot.delay(500);
			robot.mousePress(BUTTON1_DOWN_MASK);
			robot.delay(1000);
			robot.mouseRelease(BUTTON1_DOWN_MASK);
			
			robot.delay(1000);
			robot.mouseMove(955, 322);
			robot.delay(500);
			robot.mousePress(BUTTON1_DOWN_MASK);
			robot.delay(500);
			robot.mouseRelease(BUTTON1_DOWN_MASK);
		    }
		//Products Page Ends
	    
	   //Customer Report Starts
		public void EquipType(CharSequence characters)
		{
			int length = characters.length();
		for (int i =0; i < length; i++)
		{
			char character = characters.charAt(i);
			type(character);
		}
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.delay(1000);
		}
		
		public void FirstName(CharSequence characters)
		{
			int length = characters.length();
		for (int i =0; i < length; i++)
		{
			char character = characters.charAt(i);
			type(character);
		}
		robot.delay(300);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		}
		
		public void CustProblem(CharSequence characters)
		{
			int length = characters.length();
		for (int i =0; i < length; i++)
		{
			char character = characters.charAt(i);
			type(character);
		}
		robot.delay(300);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		}
		
		public void Surname(CharSequence characters)
		{
			int length = characters.length();
		for (int i =0; i < length; i++)
		{
			char character = characters.charAt(i);
			type(character);
		}
		robot.delay(1000);
		robot.mouseMove(985, 410);
		robot.delay(1000);
		robot.mousePress(BUTTON1_DOWN_MASK);
		robot.delay(800);
		robot.mouseMove(985, 440);
		robot.delay(1000);
		robot.mouseRelease(BUTTON1_DOWN_MASK);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		}
		
		public void Address(CharSequence characters)
		{
			int length = characters.length();
		for (int i =0; i < length; i++)
		{
			char character = characters.charAt(i);
			type(character);
		}
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		}
	
		/*public void StaffRec(CharSequence characters)
		{
			int length = characters.length();
		for (int i =0; i < length; i++)
		{
			char character = characters.charAt(i);
			type(character);
		}
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		}*/
		
		public void Postcode(CharSequence characters)
		{
			int length = characters.length();
		for (int i =0; i < length; i++)
		{
			char character = characters.charAt(i);
			type(character);
		}
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		}
		
		/*public void StaffFix(CharSequence characters)
		{
			int length = characters.length();
		for (int i =0; i < length; i++)
		{
			char character = characters.charAt(i);
			type(character);
		}
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		}*/
		
		public void Telephone(CharSequence characters)
		{
			int length = characters.length();
		for (int i =0; i < length; i++)
		{
			char character = characters.charAt(i);
			type(character);
		}
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		}
		
		public void DateRes(CharSequence characters)
		{
			int length = characters.length();
		for (int i =0; i < length; i++)
		{
			char character = characters.charAt(i);
			type(character);
		}
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		}
		
		public void DateRep(CharSequence characters)
		{
			int length = characters.length();
		for (int i =0; i < length; i++)
		{
			char character = characters.charAt(i);
			type(character);
		}
		robot.delay(300);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		}
		
		public void EstCost(CharSequence characters)
		{
			int length = characters.length();
		for (int i =0; i < length; i++)
		{
			char character = characters.charAt(i);
			type(character);
		}

            robot.delay(1000);
            robot.mouseMove(990, 620);
            robot.delay(1000);
            robot.mousePress(BUTTON1_DOWN_MASK);
            robot.delay(1000);
            robot.mouseRelease(BUTTON1_DOWN_MASK);
            robot.delay(2000);
            robot.mouseMove(589, 620);
            robot.delay(1000);
            robot.mousePress(BUTTON1_DOWN_MASK);
            robot.delay(1000);
            robot.mouseRelease(BUTTON1_DOWN_MASK);
            robot.delay(1000);
            robot.delay(1000);
            robot.mouseMove(800, 490);
            robot.delay(500);
            robot.mousePress(BUTTON1_DOWN_MASK);
            robot.delay(1000);
            robot.mouseRelease(BUTTON1_DOWN_MASK);
            robot.delay(1000);
            robot.mouseMove(1025, 280);
            robot.delay(500);
            robot.mousePress(BUTTON1_DOWN_MASK);
            robot.delay(500);
            robot.mouseRelease(BUTTON1_DOWN_MASK);
		}
		//Customer Report Ends
		
		//Staff Info Starts
		public void Staff_Address(CharSequence characters)
		{
			int length = characters.length();
			for (int i =0; i < length; i++)
			{
				char character = characters.charAt(i);
				type(character);
			}
			robot.delay(300);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
		    }
		
		
		public void StaffF_Name(CharSequence characters)
		{
			int length = characters.length();
			for (int i =0; i < length; i++)
			{
				char character = characters.charAt(i);
				type(character);
			}
			robot.delay(300);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
		    }
		
		public void Staff_Postcode(CharSequence characters)
		{
			int length = characters.length();
			for (int i =0; i < length; i++)
			{
				char character = characters.charAt(i);
				type(character);
			}
			robot.delay(300);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
		    }
		
		public void Staff_Surname(CharSequence characters)
		{
			int length = characters.length();
			for (int i =0; i < length; i++)
			{
				char character = characters.charAt(i);
				type(character);
			}
			robot.delay(300);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
		    }
		
	
		public void Staff_Dob(CharSequence characters)
		{
			int length = characters.length();
			for (int i =0; i < length; i++)
			{
				char character = characters.charAt(i);
				type(character);
			}
			robot.delay(300);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
		    }
		
		
		public void Email(CharSequence characters)
		{
			int length = characters.length();
			for (int i =0; i < length; i++)
			{
				char character = characters.charAt(i);
				type(character);
			}
			robot.delay(300);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			robot.delay(1000);
			robot.mouseMove(1143, 440);
			robot.delay(500);
			robot.mousePress(BUTTON1_DOWN_MASK);
			robot.delay(500);
			robot.mouseRelease(BUTTON2_DOWN_MASK);
		}
		
		//staff Info Ends
	 public void type(char character) 
     {
		 switch (character) {
	     case 'a': doType(VK_A); break;
	     case 'b': doType(VK_B); break;
	     case 'c': doType(VK_C); break;
	     case 'd': doType(VK_D); break;
	     case 'e': doType(VK_E); break;
	     case 'f': doType(VK_F); break;
	     case 'g': doType(VK_G); break;
	     case 'h': doType(VK_H); break;
	     case 'i': doType(VK_I); break;
	     case 'j': doType(VK_J); break;
	     case 'k': doType(VK_K); break;
	     case 'l': doType(VK_L); break;
	     case 'm': doType(VK_M); break;
	     case 'n': doType(VK_N); break;
	     case 'o': doType(VK_O); break;
	     case 'p': doType(VK_P); break;
	     case 'q': doType(VK_Q); break;
	     case 'r': doType(VK_R); break;
	     case 's': doType(VK_S); break;
	     case 't': doType(VK_T); break;
	     case 'u': doType(VK_U); break;
	     case 'v': doType(VK_V); break;
	     case 'w': doType(VK_W); break;
	     case 'x': doType(VK_X); break;
	     case 'y': doType(VK_Y); break;
	     case 'z': doType(VK_Z); break;
	     case 'A': doType(VK_SHIFT, VK_A); break;
	     case 'B': doType(VK_SHIFT, VK_B); break;
	     case 'C': doType(VK_SHIFT, VK_C); break;
	     case 'D': doType(VK_SHIFT, VK_D); break;
	     case 'E': doType(VK_SHIFT, VK_E); break;
	     case 'F': doType(VK_SHIFT, VK_F); break;
	     case 'G': doType(VK_SHIFT, VK_G); break;
	     case 'H': doType(VK_SHIFT, VK_H); break;
	     case 'I': doType(VK_SHIFT, VK_I); break;
	     case 'J': doType(VK_SHIFT, VK_J); break;
	     case 'K': doType(VK_SHIFT, VK_K); break;
	     case 'L': doType(VK_SHIFT, VK_L); break;
	     case 'M': doType(VK_SHIFT, VK_M); break;
	     case 'N': doType(VK_SHIFT, VK_N); break;
	     case 'O': doType(VK_SHIFT, VK_O); break;
	     case 'P': doType(VK_SHIFT, VK_P); break;
	     case 'Q': doType(VK_SHIFT, VK_Q); break;
	     case 'R': doType(VK_SHIFT, VK_R); break;
	     case 'S': doType(VK_SHIFT, VK_S); break;
	     case 'T': doType(VK_SHIFT, VK_T); break;
	     case 'U': doType(VK_SHIFT, VK_U); break;
	     case 'V': doType(VK_SHIFT, VK_V); break;
	     case 'W': doType(VK_SHIFT, VK_W); break;
	     case 'X': doType(VK_SHIFT, VK_X); break;
	     case 'Y': doType(VK_SHIFT, VK_Y); break;
	     case 'Z': doType(VK_SHIFT, VK_Z); break;
	     case '`': doType(VK_BACK_QUOTE); break;
	     case '0': doType(VK_0); break;
	     case '1': doType(VK_1); break;
	     case '2': doType(VK_2); break;
	     case '3': doType(VK_3); break;
	     case '4': doType(VK_4); break;
	     case '5': doType(VK_5); break;
	     case '6': doType(VK_6); break;
	     case '7': doType(VK_7); break;
	     case '8': doType(VK_8); break;
	     case '9': doType(VK_9); break;
	     case '-': doType(VK_MINUS); break;
	     case '=': doType(VK_EQUALS); break;
	     case '~': doType(VK_SHIFT, VK_BACK_QUOTE); break;
	     case '!': doType(VK_EXCLAMATION_MARK); break;
	     case '@': doType(VK_SHIFT, VK_QUOTE); break;
	     case '#': doType(VK_NUMBER_SIGN); break;
	     case '$': doType(VK_DOLLAR); break;
	     case '%': doType(VK_SHIFT, VK_5); break;
	     case '^': doType(VK_CIRCUMFLEX); break;
	     case '&': doType(VK_AMPERSAND); break;
	     case '*': doType(VK_ASTERISK); break;
	     case '(': doType(VK_LEFT_PARENTHESIS); break;
	     case ')': doType(VK_RIGHT_PARENTHESIS); break;
	     case '_': doType(VK_UNDERSCORE); break;
	     case '+': doType(VK_PLUS); break;
	     case '\t': doType(VK_TAB); break;
	     case '\n': doType(VK_ENTER); break;
	     case '[': doType(VK_OPEN_BRACKET); break;
	     case ']': doType(VK_CLOSE_BRACKET); break;
	     case '\\': doType(VK_BACK_SLASH); break;
	     case '{': doType(VK_SHIFT, VK_OPEN_BRACKET); break;
	     case '}': doType(VK_SHIFT, VK_CLOSE_BRACKET); break;
	     case '|': doType(VK_SHIFT, VK_BACK_SLASH); break;
	     case ';': doType(VK_SEMICOLON); break;
	     case ':': doType(VK_COLON); break;
	     case '\'': doType(VK_BACK_SLASH); break;
	     case '"': doType(VK_QUOTEDBL); break;
	     case ',': doType(VK_COMMA); break;
	     case '<': doType(VK_SHIFT, VK_COMMA); break;
	     case '.': doType(VK_PERIOD); break;
	     case '>': doType(VK_SHIFT, VK_PERIOD); break;
	     case '/': doType(VK_SLASH); break;
	     case '?': doType(VK_SHIFT, VK_SLASH); break;
	     case ' ': doType(VK_SPACE); break;
     default:
         throw new IllegalArgumentException("Cannot type character " + character);
     }
     
 }

 private void doType(int... keyCodes) 
 {
     doType(keyCodes, 0, keyCodes.length);
 }
 
 private void doType(int[] keyCodes, int offset, int length) 
 {
     if (length == 0) 
     {
         return;
     }  
     //Entering the text
     robot.delay(50);
	    robot.keyPress(keyCodes[offset]);
     doType(keyCodes, offset + 1, length - 1);
     robot.keyRelease(keyCodes[offset]);
     }
 
}