/* Starting code for Assignment 1
 * Student: Ruben Yanez
 * CISC 3115
 * School: Brooklyn College
*/
import java.util.Scanner;
public class Homework1 {
	public static void main(String[] args) {
	 Scanner keyboard = new Scanner(System.in);
		int pin = 12345;
		int tries = 0;
		int maxtry =4;

		System.out.println("WELCOME TO THE BANK OF BC.");
		System.out.print("ENTER YOUR PIN: ");
		int entry = keyboard.nextInt();
		tries++;

		while ( entry != pin && tries < maxtry )
		{
			System.out.println("\nINCORRECT PIN. TRY AGAIN.");
			System.out.print("ENTER YOUR PIN: ");
			entry = keyboard.nextInt();
			tries++;
		}

		if ( entry == pin )
			System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
		else if ( tries >= maxtry )
			System.out.println("\nYOU HAVE RUN OUT OF TRIES. ACCOUNT LOCKED.");
}
}
