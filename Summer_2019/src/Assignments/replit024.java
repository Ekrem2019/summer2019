package Assignments;

import java.util.Scanner;

public class replit024 {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");
        System.out.println("Enter your first name");
        String f = scan.nextLine();
        System.out.println("Enter your last name");
        String l = scan.nextLine();
        System.out.println("Enter your email");
        String em = scan.nextLine();
        System.out.println("Enter your street");
        String str = scan.nextLine();
        System.out.println("Enter your city");
        String ct = scan.nextLine();
        System.out.println("Enter your state");
        String state = scan.nextLine();
        System.out.println("Enter your zip code");
        int zip = scan.nextInt();
        System.out.println("Enter your work phone number");
        long workPhone = scan.nextLong();
        System.out.println("Enter your personal phone number");
        long perPhone = scan.nextLong();
        System.out.println("Enter your age");
        int age = scan.nextInt();
        System.out.println("Enter your height");
        double hei = scan.nextDouble();
        System.out.println("Enter your weight");
        double wei = scan.nextDouble();
        System.out.println("Are you married?");
        String mar = scan.next();
        System.out.println("Patient personal information");
        System.out.println("Full name: "+l +", "+f);
        System.out.println("Address: "+str +", "+ ct + ", "+ state +" " + zip);
        System.out.println("Contacts: work phone number - "+ workPhone +", personal phone number - "+ perPhone + ", email: "+ em);
        System.out.println("Age: "+ age);
        System.out.println("Height: "+ hei);
        System.out.println("Weight: "+ wei +" pounds");
        System.out.println("Married?: "+ mar);
		
		
		
		
		
		
		
	}
}
