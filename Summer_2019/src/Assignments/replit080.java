package Assignments;
import java.util.*;
public class replit080 {
	public static void main(String[] args) {
	    int freeBooks = 0;
	    Scanner scan = new Scanner(System.in);
	    System.out.println("customer type");
	    boolean isPremiumCustomer = scan.nextBoolean();
	    System.out.println("total books");
	    int nbooksPurchased = scan.nextInt();
		if(nbooksPurchased > 4){
			if(isPremiumCustomer){
			freeBooks = 1;
			if(nbooksPurchased > 7){
			freeBooks = 2;
			}
			}else{
			freeBooks = 0;
			if(nbooksPurchased > 6){
			freeBooks = 1;
			}
			if(nbooksPurchased > 11){
			freeBooks = 2;
			}

			}
			}else{freeBooks = 0;}
		System.out.println(freeBooks+" free book");
	}

}
