package day15_Scanner_StringClass;

import java.util.*;
public class Test1 {
	

		  public static void main(String[] args) {
		    //Do not change
			   			    
				Scanner input = new Scanner(System.in);
				System.out.println("Enter Your First name: ");
				String firstName = input.next();
				 	
			 	System.out.println("Enter Your Last Name: ");
			 	String lastName = input.next();
			 	
			 	String fullname =firstName+" "+lastName;
			 	String full=fullname.toUpperCase();
			 	System.out.println(full);
					

}
}