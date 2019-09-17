package day04_Variables2;

public class WarmUpTask {

	/*
	 * 1. Cucumber 		=> 2.5$ => float or double
	 * 2. Onion			=> 1.5$ => float or double
	 * 3. Green Pepper	=> 2$	=>byte,short,int,long,float,double
	 * 4. Tomato		=> 3$	=>byte,short,int,long,float,double
	 * 5. Carrot		=> 4$	=>byte,short,int,long,float,double
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// Cucumber:
		// int Cucumber = 2.5; we can anly assign whole numbers to int, byte, short
		
		
		// float Cucumber = 2.5;	// float cannot contain double
		float Cucumber = 2.5f; 
		float Cucumber0 = 2.5f;
		double Cucumber2 = 2.5f;
		double cucumber3 = 2.5f;
		
		System.out.println(Cucumber0);
		System.out.println(cucumber3);
		System.out.println(Cucumber);
		
		// Onion = 1.5
		
		float Onion = 1.5f;
		double Onion2 = 1.5f;
		
		System.out.println(Onion2);
		
		// Green Pepper = 2$
		
		byte GreenPepper = 2;
		short GreenPepper2 = 2;
		int GreenPepper3 = 2;
		long GreenPepper4 = 2l;
		float GreenPepper5 = 2; //only time we add f or F is , when are assigning decimals
		double GreenPepper6 = 2;
			
		System.out.println(GreenPepper);
		System.out.println(GreenPepper2);
		System.out.println(GreenPepper3);
		System.out.println(GreenPepper4);
		System.out.println(GreenPepper5); // double and float converts the whole numbers to decimals
		System.out.println(GreenPepper6);
	
		
		
	}

}
