package Assignments;
import java.util.Scanner;

public class replit043 {
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    System.out.println("Enter first number:");
	    int num1 = s.nextInt();
	    System.out.println("Enter second number:");
	    int num2 = s.nextInt();
	    System.out.println("Enter third number:");
	    int num3 = s.nextInt();
	    
	    if (num1<num2 && num1>num3) {
	    	System.out.println("Medium value is: "+num1);
	    }else if (num1>num2 && num1<num3) {
	    	System.out.println("Medium value is: "+num1);
	} else if (num2<num1 && num2>num3){
		System.out.println("Medium value is: "+num2);
	}else if (num2>num1 && num2<num3) {
		System.out.println("Medium value is: "+num2);
	}	else System.out.println("Medium value is: "+num3);
	    }
}
