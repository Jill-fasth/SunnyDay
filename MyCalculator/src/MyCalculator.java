import java.util.Scanner;

public class MyCalculator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Time to do some math");
		String yesOrNo;
		do {
				
		System.out.println("Enter your first number");
		double number1 = scan.nextDouble();
		
		System.out.println("Do you want to +, -, * or /?");
		String Count = scan.next();
		
		System.out.println("Enter your second number");
		double number2 = scan.nextDouble();
		
		System.out.println("You added "+number1+Count+number2);
		
		AddNumbers numbers = new AddNumbers(number1, number2);
		
		
		if (Count.equals("+")) {
			System.out.println("Result is: " +numbers.add());
		} else if (Count.equals("-")) {
			System.out.println("Result is: " +numbers.sub());
		} else if (Count.equals("*")) {
			System.out.println("Result is: " +numbers.multi());
		} else if (Count.equals("/")) {
			System.out.println("Result is: " +numbers.div());
		} else {
			System.out.println("\nNoooo something when wrong! :( ");
		}
		
				
		System.out.println("Do you want to count one more time write Yes or No");
			
		yesOrNo = scan.nextLine();
		if (yesOrNo.toLowerCase().equals("yes")) {
			System.out.println("Lets go again");
		}else if (yesOrNo.toLowerCase().equals("no")) {
			System.out.println("Good work today!");
		}else {
			System.out.println("Sorry I did not get that");
		}
		
		}while(yesOrNo.toLowerCase().equals("yes"));
	}
	
}
