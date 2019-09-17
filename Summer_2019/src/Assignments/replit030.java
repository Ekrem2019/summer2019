package Assignments;

import java.util.Scanner;

public class replit030 {
	public static void main(String[] args) {
		
	
	Scanner Scanner = new Scanner(System.in);
    int InputSeconds;
    int hours;
    int minutes;
    int seconds;
    System.out.println("Enter seconds:");
    InputSeconds = Scanner.nextInt();
    minutes = InputSeconds / 60;
    hours = minutes / 60;
    minutes = minutes % 60;
    seconds = InputSeconds % 60;
    System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds + " seconds"); 
		   
	}
}
