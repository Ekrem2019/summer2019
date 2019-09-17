package day14_Scanner;
//Scanner: it is a class that provides the methods to get user inputs
//Scanner class presented in package "java.util" package
//in order to use scanner class , the scanner class MUST be imported: import java.util.Scanner;
//the important statement MUST be placed between package and className	
//declaration of Scanner: Scanner VariableName= new Scanner (System.in);
		// VariableName: can reference an object of the scanner class
		// new Scanner(System.in) : creates the object of the scanner class 
//methods of scanner class :
//		VariableName.nextByte():
import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Byte Value");
		byte byteNum=input.nextByte();
		System.out.println("You have entered:"+byteNum);
		System.out.println("Enter aByte Value 2");
		byte byteNum2=input.nextByte();
		System.out.println("You have entered:"+byteNum2);
		
		System.out.println("Addition is: "+(byteNum*byteNum2));
		
		
		
	}

}

