/**
 * 
 */
package exam2;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 * @author sheelij
 *
 */
public class Automobile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		NumberFormat myformatter = NumberFormat.getCurrencyInstance();
		
		System.out.print("Enter the commuting distance in miles: ");
		double distance = scan.nextDouble(); // in miles
		
		System.out.print("Enter the automobile's fuel consumption in mpg: ");
		double fuelConsumption = scan.nextDouble(); // in miles per gallon
		
		System.out.print("Enter the price of a gallon of fuel: ");
		double pricePerGallon = scan.nextDouble(); // price of fuel
		
		double cost = pricePerGallon * (distance / fuelConsumption);
		
		System.out.println("The cost of your commute is " + myformatter.format(cost));
		
		
		

	}

}
