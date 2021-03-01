import java.util.Scanner;
import java.util.regex.Pattern;

public class Firstname {
	
	static   Scanner name = new  Scanner (System.in); 
				
		
	static void MobNumber() {
		
	String mobilenumber = name.nextLine();
	
	// validate first name
	  	boolean  user= Pattern.matches("^[0-9]{2}[ ][6-9]{1}[0-9]{9}$",mobilenumber );
	
	if (user == true ) {
		System.out.println("you entered a valid mobile number  :" +mobilenumber);
	}else { System.out.println ("Not a valid mobile number");
			System.out.println("Enter valid mobile number");
			MobNumber();
	}
	
	}
	
	
   public static void main( String[] args ) {
	   System.out.println("enter mobile number");
	   MobNumber();

}
}

   
