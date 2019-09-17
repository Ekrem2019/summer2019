package day14_Scanner;

public class Test1 {
	
	public static void main(String[] args) {
		
	   int	 statusCode= 201;
	
		switch (statusCode) {
	
		case 200:
			System.out.println("okay");
			break;
		case 201:
			System.out.println("created");
			break;
		case 202:
			System.out.println("accepted");
			break;
		case 301:
			System.out.println("moved permanently");
			break;
		case 303:
			System.out.println("see other");
			break;
		default:
				System.out.println("invalid");
			
		}
		
		}

}
