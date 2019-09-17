package day14_Scanner;

public class Ternary {
	
	public static void main(String[] args) {
		int num=0;
		if (false) {
			num=100;
		}else {
			num=50;
					}
		int n = (false) ? 100 : 50;
		int y = false ? 100 : 50;
		
		System.out.println(num);
		System.out.println(n);
		System.out.println(y);
		
		String Schoolname="";
		boolean Batch12 = true;
		
		if (Batch12) {
			Schoolname="Cybertek";
			} else {
				Schoolname="Invalid";
			}
		System.out.println(Batch12 ? "Cybertek" : "Invalid");
		String Bestschool=Batch12 ? "Cybertek" : "Invalid";
		System.out.println(Bestschool);
		
		double d=10;
		if (true) {
			d=10.5;
				}
		double z = true ? 10.5 : 0;
		
		double interestRate = 0;
		boolean GoodCredit = true;
		
		interestRate = (GoodCredit == true) ? 0.5 : 0.9;
		System.out.println(interestRate);
		byte grade=60;
		boolean Passed = grade >= 60 ? true : false;
		System.out.println(Passed);
		
	int score=110;
	char Finals = ' ';
	
	//if (score>=90 && score<=100)
		//Finals = 'A';
		//else if (score >=80 && score <=89)
		//Finals = 'B';
		//else if (score >=70 && score <=79)
			//Finals = 'C';
		//else if (score >=60 && score <=69)
			//Finals = 'D';
		//else if (score >=0 && score <=59)
			//Finals = 'F';
	//	else
		//	Finals ='';
	
	Finals = (score >=80 && score <=89) ? 'A'
				:(score >=70 && score <=79) ? 'B'
					:(score >=70 && score <=79) ? 'C'
						:(score >=60 && score <=69) ? 'D'
								:(score >=0 && score <=59) ? 'F'
									:' ';
							System.out.println(Finals);
							
							
	int n1=100, n2=300, n3=400;
	int max= (n1>n2 && n1>n3) ? n1
			: (n2>n1 && n2>n3) ? n2
					:n3;
	System.out.println(max);
		
		
		
		
		
	}
	}

