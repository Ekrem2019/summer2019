package Assignments;
import java.util.*;
public class replit067 {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a word");
	String word = scan.next();
	if ((word.length())==5) {
		System.out.print(word.charAt(4));
		System.out.print(word.charAt(3));
		System.out.print(word.charAt(2));
		System.out.print(word.charAt(1));
		System.out.print(word.charAt(0));}
	else if ((word.length())>5) {System.out.println("Too long!");}
	else System.out.println("Too short!");
	
	
	
}}
