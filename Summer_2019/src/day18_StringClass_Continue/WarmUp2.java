package day18_StringClass_Continue;

import java.util.Scanner;

public class WarmUp2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first name");
		String firstName = scan.nextLine();
		//		mUhtAr
		firstName = firstName.substring(0,1).toUpperCase()
					+ firstName.substring(1).toLowerCase();
		
		System.out.println("Enter your last name");
		String lastName = scan.nextLine();
		
		lastName = (""+lastName.charAt(0)).toUpperCase()
					+ lastName.substring(1).toLowerCase();
		
		String FullName = firstName+" "+lastName;
		System.out.println(FullName);
		
		
		
	}

}
