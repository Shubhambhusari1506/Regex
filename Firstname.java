import java.util.Scanner;
import java.util.regex.Pattern;

public class Firstname {
	
	static   Scanner name = new  Scanner (System.in); 
				
		
	static void Pass() {
		
	String password = name.nextLine();
	
	// validate password
	  	boolean  user= Pattern.matches("(?=.*?[A-Z]).{1,}(?=.*?[a-z]).{7,}$",password);
	
	if (user == true ) {
		System.out.println("you entered a valid password  :" +password);
	}else { System.out.println ("Not a valid password");
			System.out.println("Enter valid password");
			Pass();
	}
	
	}
	
	
   public static void main( String[] args ) {
	   System.out.println("enter password of eight characters with having atleast one upper case");
	   Pass();

}
}

   
