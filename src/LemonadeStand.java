import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;							

/**********************************************************************************************************
 * @author LennyCastaneda - Assignment 3 & EXTRA CREDIT	
 *  This program simulates a lemonade stand.
 * It provides the cost of a cup and calculates the total costs with tax.
 * The payment is processed and recorded to a text document.
 ***********************************************************************************************************/

//**********************************************************************************************************
// LennyCastaneda - Assignment 3 & EXTRA CREDIT	                                                            
// Create a Java program that simulates your summer job at the Lemonade stand.   
// 																																
//**********************************************************************************************************

//Create public class LemonadeStand
public class LemonadeStand {
	
	public static void main(String[]args) throws IOException{
		
		//Create variables to hold the values for the price of a cup of lemonade.
		double subTotal;
		double totalTax;
		double totalPrice;
		
		int totalCups;
		
		final double pricePerGlass = 2;									//Price per glass variable as a constant variable.. 	
		final double TAX_RATE = 0.08;									//Store the San Diego tax rate of 8% as a constant variable. 
		
		char paymentMethod;
		
		String name;																	//String object to hold user's name.
		
		//Instantiate a DecimalFormat object and assign it to df
		//Make all currency data printed to the screen display 2 decimal places and '$" signs. 
		DecimalFormat df = new DecimalFormat("$#,###,##0.00");
		//DecimalFormat df = (DecimalFormat) DecimalFormat.getCurrencyInstance(Locale.US);	
		
		Scanner keyboard = new Scanner(System.in);						//Create a Scanner object to read user input.
		
		// Extra Credit Assignment
		//Using the PrintWriter class, write out all the output from your program to a text file called "results.txt" 
		PrintWriter results = new PrintWriter(new FileWriter("results.txt"));
		
		//Display any welcome message at the top of the output screen
		System.out.println("\nWelcome to Lenny's Lemonade Stand.");	
		//Print output to text file EXTRA CREDIT.
		results.println("\nWelcome to Lenny's Lemonade Stand.");
		
		//Display the price per glass. 
		System.out.println("\nThe Price Per Lemonade Glass is " + (df.format(pricePerGlass)));
		//Print output to text file EXTRA CREDIT.
		results.println("\nThe Price Per Lemonade Glass is " + (df.format(pricePerGlass)));
		
		//Ask the user for their name, and store it as a String object.
		System.out.print("\nWhat is your name? ");						
		name = keyboard.nextLine();
		//Print output to text file EXTRA CREDIT.
		results.println("\nWhat is your name? ");
		
		//Ask the user how many glasses of lemonade they would like to order. 
		//Refer to the user by name, whenever you can. 
		System.out.print("\nHi " + name + ", many glasses of lemonade would you like to order? ");	
		totalCups = keyboard.nextInt();		//Save this as a variable with the appropriate data type.
		//Print output to text file EXTRA CREDIT.
		results.println("\nHi " + name + ", many glasses of lemonade would you like to order? ");	
		
		//Calculate the sub-total, total tax, and total price.
		subTotal = totalCups * pricePerGlass;
		totalTax = subTotal * TAX_RATE;
		totalPrice = subTotal + totalTax;
		
		//Display calculations on the screen. 
		System.out.println("\nSubtotal: " + (df.format(subTotal)));
		results.println("\nSubtotal: " + (df.format(subTotal)));
		
		System.out.println("\nTax:      " + (df.format(totalTax)));
		results.println("\nTax:      " + (df.format(totalTax)));
		
		System.out.println("\nTotal:    " + (df.format(totalPrice)));
		results.println("\nTotal:    " + (df.format(totalPrice)));
		
		//Ask the user how they would like to pay for the lemonade 
		System.out.print("\nHow will you be paying " + name + "? (Enter 'm' for money, 'c' for credit card, or 'g' for gold): ");
		results.println("\nHow will you be paying " + name + "? (Enter 'm' for money, 'c' for credit card, or 'g' for gold): ");
		
		//Save the input as a char variable. 
		paymentMethod = keyboard.next().charAt(0);
				
		//Using a switch statement on the payment type
		switch(paymentMethod)
		{
		//If the user entered 'm' or 'M', display "You are paying using money" to the screen 
		case 'm': 
		case 'M':
				System.out.println("\nYou are paying using money");
				results.println("\nYou are paying using money");
				break;
		
		//If the user entered 'c' or 'C', display "You are paying by Credit Card" to the screen
		case 'c':
		case 'C':
				System.out.println("\nYou are paying by Credit Card");
				results.println("\nYou are paying by Credit Card");
				break;
		
		//If the user entered 'g' or 'G', display "You are paying with Gold" to the screen	
		case 'g':
		case 'G':
				System.out.println("\nYou are paying with Gold");
				results.println("\nYou are paying with Gold");
				break;	
		}
		//Using a single if-else-if statement (also called a multi-branch if-else statement)
		//If the quantity is 2 , and the total is less than $5, display "Enjoy!"
		//So if the total cups entered by the user is 1 then "Enjoy!" is not displayed
		if (totalCups == 2 && totalPrice < 5 ) {
			System.out.println("\nEnjoy!");
			results.println("\nEnjoy!");
		}
		
		//If the quantity between 3 and 10, and the the total is greater than or equal to $5, display "You earned a free glass of Lemonade!"
		//Based on the logic above this would mean the numbers between 3 and 10, which is 4 through 9.
		//And the total price is $5 or more, but but both conditions must be met to display the text.
		else if ((totalCups >= 3 && totalCups <= 10) && (totalPrice > 5)) {
			System.out.println("\nYou earned a free glass of Lemonade!");
			results.println("\nYou earned a free glass of Lemonade!");
		}
		
		//If the quantity is more than 10, display whatever message you want such as "Wow thanks, I'm going to Disneyland!"
		else if (totalCups > 10) {
			System.out.println("\nWow thanks, I'm going to Disneyland!");
			results.println("\nWow thanks, I'm going to Disneyland!");
		}  
		
		System.out.println("\nThanks " + name + ", we appreciate the business!");
		results.println("\nThanks " + name + ", we appreciate the business!");
			
		keyboard.close();
		results.close();

	}
}





