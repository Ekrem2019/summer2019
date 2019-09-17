package Assignments;

import java.util.Scanner;

public class replit041 {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter age:");
	    int age = scan.nextInt();
	    
	    if (age<2 && age>18) {
	    	System.out.println("Ineligible");
	    }else if (age==2) {
	    	System.out.println("Toddler");
	} else if (age>2 && age<6){
		System.out.println("Early Childhood");
	}else if (age>5 && age<8) {
		System.out.println("Young Reader");
	}	else if (age>7 && age<11) {
			System.out.println("Elementary");
	    }else if (age>10 && age<13) {
	    	System.out.println("Middle");
	    }else if (age==13) {
	    	System.out.println("Impossible");
	    }else if (age>13 && age<17) {
	    	System.out.println("High School");
	    }else  if(age>16 && age<19) {
	    	System.out.println("Scholar");
	    }else System.out.println("Ineligible");
	}
}
