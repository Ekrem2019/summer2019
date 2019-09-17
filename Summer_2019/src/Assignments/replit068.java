package Assignments;
import java.util.Scanner;
public class replit068 {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter a word");
	    String word = scan.nextLine();
	    System.out.println("Enter a sentence");
	    String sentence = scan.nextLine();
	    if (sentence.contains(word)) {
	    	System.out.println("true");
	    }else {System.out.println("false");}
	    
	    
	}
}
