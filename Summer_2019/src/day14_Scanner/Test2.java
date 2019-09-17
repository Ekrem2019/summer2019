package day14_Scanner;
import java.util.Scanner;
public class Test2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //TASK1
        
        System.out.println("Pick a number.");
        int num1= input.nextInt();
        System.out.println(num1+ " is an Awesome number! Pick another number.");
        int num2= input.nextInt();
        int num3 = num1+num2;
        System.out.println("Great!The sum of the numbers you entered is "+num3+".\n\n\n");
        
        //TASK2
        
        System.out.println("Gimme a new number.");
        int num4= input.nextInt();
        System.out.println("Thank you for " +num4+"! Pick another number.");
        int num5= input.nextInt();
        System.out.println(num4+" and "+num5+ " are awesome. Pick one more number.");
        int num6 = input.nextInt();
        int max = (num4 > num5 && num4 > num6) ? num4
                : (num5 > num4 && num5 > num6 )? num5
                : (num6 > num4 && num6 > num5 )? num6
                : num6;
        
        System.out.println("Greatest number of " +num4+ ", "+num5+" and "+num6+ " is "+max+".\n\n\n");
    
        //Task3
        
        System.out.println("What's your name?");
        String name= input.next();
        System.out.println("What's your last name?");
        String lastName =input.next();
        System.out.println("What's your age?");
        int age = input.nextInt();
        System.out.println("What's your quote?");
        String quote =input.next();
        quote += input.nextLine();
        
        System.out.print("Thank you "+ name + " "+ lastName+ ", you are " + age +" years old ");
        System.out.println("and your quote is "+ quote +".");
        
        
        
    }      
        
    }







