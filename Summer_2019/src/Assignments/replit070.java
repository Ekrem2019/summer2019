package Assignments;

import java.util.Scanner;

public class replit070 {
public static void main(String[] args) {
	
	Scanner mail=new Scanner (System.in);
	String email=mail.nextLine();
	String key="alejandro";
	if (email.contains(key))  {
    	System.out.println("read this email");
    }else {System.out.println("dont read");}
}
}
