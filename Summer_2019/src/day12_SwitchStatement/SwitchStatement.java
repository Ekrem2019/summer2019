package day12_SwitchStatement;

public class SwitchStatement {
	
	public static void main(String[] args) {
	/*
	 
	 */
	int score=1;
switch(score) {
case 1:
	System.out.println("1");
	break;
	
case 2:
	System.out.println("2");
	break;
	
default:
	System.out.println("Invalid");
}


String str="Java";
switch (str) {
default: 
	System.out.println("Invalid");
	
case "C#":
		System.out.println("C#");
		break;
case "Python":
	System.out.println("Python");
	break;
	
	}

char grade='A';
switch (grade) {

case 'B':
	System.out.println("passed with B");
	
case 'C':
	System.out.println("passed with C");
default:
	System.out.println("Failed");
	
	
}
int number =10;

if(--number > 10) {

System.out.println("Hello Cybertek "+number);

}else if(number ==9) {

System.out.println("Hello World "+number);

}
	}
}
