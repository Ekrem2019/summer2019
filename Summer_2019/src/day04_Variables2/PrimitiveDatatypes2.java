package day04_Variables2;

public class PrimitiveDatatypes2 {
	/*
	 * Primitives : byte, short, int, long, float, double, boolean, char
	 * 
	 * boolean: takes either True or False boolean expressions
	 * 
	 * char: declared with in the single quote ''; single character only
	 * '' is a must when you give character
	 */
	public static void main(String[] args) {
		
		// boolean result = Earth is Flat
		// boolean num1= 100; boolean only takes true or false results
		
		boolean result = true;
		boolean result2 = false;
		boolean result3 = 9 > 3;
		
			System.out.println(result);
			
			System.out.println(result2);
			System.out.println(result3);
			
		
			
		// char:
			
			char char1 = 'a';
			
			System.out.println(char1);
			
			char char2 = 'b';
			char char3 = '#';
			System.out.println("\n\n");
			
			int int0='E';
			
			System.out.println(int0);
			
			
			// char with numbers
			
			char char4 = 67; // only time we use '' for char is when we are declaring single character
			
			System.out.println(char4);
			
			char char5 ='C'; // prints the character as it's
			System.out.println(char5);		
			
			char char6 = '{';
			System.out.println(char6);
			char char7 = 123;
			System.out.println(char7); // prints the character that has the number of 123 from ASCII Table
			
			// initializing char to other primitives : byte, short, int, long, float, double
			
			
			char MyCar1 = 'b';
			
			// nt MyInt = MyChar1; // the number that represents b is initalized to the int
			
			//
			//System.out.println(MyInt); //98
			
			 // char's memory is 2byte, byte's memory is 1 byte
			
			byte MyByte2 = 'b'; //b's corresponding number is 98
			System.out.println(MyByte2);
			// short ShortNum = MyChar1; // char' memory is could be bigger than short , range is gretaer 
			short ShortNum2 = 'b';
			System.out.println(ShortNum2);
			
			
		//	long LongNum = MyChar1; // long's memory is 8 bytes
			long LongNum2 = 'b'; //98.0
			//System.out.println(LongNum);
			//float floatNum = MyChar1;
			//float floatNum2 = 'b';
			//System.out.println(floatnum2); //
			
			
			//double doubleNum = MyChar1;
			//double doubleNum2 = 'b';
			//System.out.println(doubleNum2);//98.0
			
			// java is case sensitive : A does not equal to a
			
			char mycharValue = 200;
			System.out.println(mycharValue);
			
			
			
			
					
			
				
			
			
			
			

	
}
}
