package String_Study;

import java.util.Scanner;

public class Demn {
	
	

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter aa URL: ");
        String url = input.nextLine();
        String domain, extension;
        boolean starting, ending;
        starting = url.startsWith("www.");
        ending = url.endsWith(".com")?true : url.endsWith(".net")?true 
                :url.endsWith(".edu")?true: url.endsWith(".org")?true
                        :url.endsWith(".gov")?true : false;
        
        
        if (starting && ending) {
            
            System.out.println("Domain:"+url.substring(4,(url.length()-4)));
            System.out.println("Extension:"+ url.substring(url.length()-3));
            
            
        }
        else {
            System.out.println("it is not a valid adress!");
        }
    }
		
		

	}


