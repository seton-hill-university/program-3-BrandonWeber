// Name 		Brandon Weber
// Github user	BrandonWeber
// date 		Sep 27, 2022
// version  	1
// description 	Program 3 - While loop and for loop. 

//import scanner
import java.util.Scanner ; 



public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// initialize scanner 
		Scanner keyboard = new Scanner (System.in);
		
// Get number between 1 and 100
		System.out.println("Enter a number between 1 and 100. ");
		int Num1 = keyboard.nextInt ();
		

// validate
	while (Num1 < 1 || Num1 > 100) 
		{
			System.out.println("That number is not valid. ");
			System.out.println("Try again. Your number needs to be between 1 and 100.");

			Num1 = keyboard.nextInt();
	
		}

	while (Num1 >1 || Num1 <100)
	{
			System.out.println("Thank you for your input Brandon!");
			break;

	}

// countdown
		
	for (int Num2 = Num1; Num1 > 1; Num2 --)
	{
		System.out.println("You have " + Num2 + " left. I swear this is entertaining.");
		if(Num2==0)
			break;
	}

	
	}
}