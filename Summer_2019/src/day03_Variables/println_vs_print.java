package day03_Variables;

public class println_vs_print {
	
	// the only characters we can give for any is: _ and $
	
	public static void main(String[] args) {
		System.out.println("Hello Cybertek"); // prints from a new line
		System.out.println("School");
		System.out.println();
		
		System.out.println("============================");
		
		
		System.out.print("Hello Cybertek");
		System.out.print("School");
		System.out.println();
		// printing takes place from where it's left off
		
		System.out.println("============================");
		
		System.out.println("Today is");
		System.out.print("great day");
		
	}

}
