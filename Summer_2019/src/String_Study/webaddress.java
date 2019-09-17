package String_Study;

import java.util.Scanner;

public class webaddress {
	
	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		
		System.out.println("Enter URL: ");
		String Url = read.next();
		
		int Begin = Url.indexOf("www.")+4;
		int End = Url.lastIndexOf(".");
		
		String domain = Url.substring(Begin, End);
		
		
		int begin = Url.lastIndexOf(".")+1;
		int end = Url.length();
		
		String extension = Url.substring(begin, end);
		
		
		String ch = ""+ Url.charAt((Url.length()-4));
		
		
		if(Url.startsWith("www.")) {
			if(ch.equals(".")) {
				if(extension.equals("com") || extension.equals("org") || extension.equals("net") || extension.equals("gov") || extension.equals("edu")) 
				{
					System.out.println("Domain: "+ domain);
					System.out.println("Extension: "+ extension);
				}
				
			}
			else {
				System.out.println("No dot before extension");
			}
			
		}
		else {
			System.out.println("URL doesn't start with wwww");
		}
		
	}

}
