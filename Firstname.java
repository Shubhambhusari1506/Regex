import java.util.Scanner;
import java.util.regex.Pattern;

public class Firstname {
	
	static   Scanner name = new  Scanner (System.in); 
				
		
	static void Pass() {
		
	String password = name.nextLine();
	
	// validate password
	  	boolean  user= Pattern.matches("^[A-Za-z]{8}$",password);
	
	if (user == true ) {
		System.out.println("you entered a valid password  :" +password);
	}else { System.out.println ("Not a valid password");
			System.out.println("Enter valid password");
			Pass();
	}
	
	}
	
	
   public static void main( String[] args ) {
	   System.out.println("enter password using eight characters");
	   Pass();

}
}

   
