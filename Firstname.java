import java.util.Scanner;
import java.util.regex.Pattern;

public class Firstname {
	
	static   Scanner name = new  Scanner (System.in); 
	
		
	static void firstname() {
		
	String Firstname = name.nextLine();
	
	// validate first name
	  	boolean  user= Pattern.matches( "^[A-Z]{1}[a-z]{2}$",Firstname );
	if (user == true ) {
		System.out.println("you entered a valid first name  :" +Firstname);
	}else { System.out.println ("not a valid name");
			System.out.println("Enter valid name");
			firstname();
	}
	
}
	
	
   public static void main( String[] args ) {
	   System.out.println("enter first name");
	   firstname();

}
}
