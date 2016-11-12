import java.text.DecimalFormat; //import statements at the very top
import java.util.Scanner;


/**
 * LemonadeStand class
 * @author jgappy
 *
 */
public class LemonadeStand {  

	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args) 
	{
		final double CA_TAX = 0.08; //create constant variable for the tax rate
		
		DecimalFormat df = new DecimalFormat("$0.00"); //Create DecimalFormat object
		Scanner keyboard = new Scanner(System.in); //Create Scanner object to read keyboard input
		
		//welcome 
		System.out.println("Welcome to James' Lemonade Stand");
		
		//menu
		double price = 2.0; //price per glass
		System.out.println("Price per glass of lemonade: " + df.format(price));
		
		//get user info
		System.out.println("What is your name?:");
		String name = keyboard.next();
		
		System.out.println("Hi " + name + ", how many glasses of lemonade do you want?");
		int qty = keyboard.nextInt();
		
		//get totals
		double subtotal = price * qty;
		System.out.println("Subtotal: " + df.format(subtotal));
		
		double tax = subtotal * CA_TAX;
		System.out.println("Tax: " + df.format(tax));
		
		double total  = subtotal + tax;
		System.out.println("Total: " + df.format(total));
		
		//get payment type from user
		System.out.println("How will you be paying, Billy? (Enter 'm' for money, 'c' for credit card, or 'g' for gold):");
		char paymentType = keyboard.next().charAt(0);
		
		System.out.println("Thanks " + name + ", have a nice day");

	}

}
