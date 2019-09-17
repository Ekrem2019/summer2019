package Assignments;

import java.util.Scanner;

public class replit_ifStatementGrade {
	
	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		    System.out.println("Enter grade:");
		    int grade = scan.nextInt();
		    if (grade>90 && grade<101) {
		    	System.out.println("excellent");}
		    else if(grade>70 && grade<90) {
		    	System.out.println("good");}
		    else if (grade>60 && grade<70) {
		    	System.out.println("pass");}
		    else {System.out.println("fail");
		    }
}
}