import java.util.Scanner;
import java.util.regex.Pattern;

public class Firstname {
	
	static   Scanner name = new  Scanner (System.in); 
				
		
	static void lastname() {
		
	String Lastname = name.nextLine();
	
	// validate first name
	  	boolean  user= Pattern.matches( "^[A-Z]{1}[a-z]{2}$",Lastname );
	
	if (user == true ) {
		System.out.println("you entered a valid last name  :" +Lastname);
	}else { System.out.println ("not a valid name");
			System.out.println("Enter valid name");
			lastname();
	}
	
	}
	
	
   public static void main( String[] args ) {
	   System.out.println("enter last name");
	   lastname();

}
}

   
