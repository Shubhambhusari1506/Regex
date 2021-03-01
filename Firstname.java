import java.util.Scanner;
import java.util.regex.Pattern;

public class Firstname {
	
	static   Scanner name = new  Scanner (System.in); 
				
		
	static void email() {
		
	String mail = name.nextLine();
	
	// validate email id
	  	boolean  user= Pattern.matches( "^[_A-Za-z0-9-\\+]+(\\.[A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$",mail );
	
	if (user == true ) {
	
	System.out.println("you entered a valid email  :" +mail);
	
	}else { System.out.println ("Not a valid email");
	
	System.out.println("Enter valid email");

	email();
	}
	
	}
	
	
   public static void main( String[] args ) {

	 System.out.println("enter email ID");
	 
	 email();

}
}

   
