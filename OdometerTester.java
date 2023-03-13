/**
 * 
 */
package lab7;

import java.text.DecimalFormat;

/**
 * @author sheelij
 *
 */
public class OdometerTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("**** Testing Odomoter ****");
		Odometer o1 = new Odometer();
		double mpg = 21;
		double milesDriven = 27.5;
		o1.setFuelEfficiency(mpg);
		System.out.println("Drove " + milesDriven + " miles.");
		o1.milesDriven(milesDriven);
		milesDriven = 15.0;
		System.out.println("Drove another " + milesDriven + " miles.");
		milesDriven = 18.0;
		System.out.println("Drove another " + milesDriven + " miles.");		
		o1.milesDriven(milesDriven);		
		DecimalFormat df = new DecimalFormat("#0.00");
		System.out.println("Fuel consumed so far is " + df.format(o1.fuelConsumed()) + " gallons");
		
		System.out.println("Drove  another " + milesDriven + " miles.");
		o1.milesDriven(milesDriven);
		milesDriven = 15.0;
		System.out.println("Drove another " + milesDriven + " miles.");
		milesDriven = 18.0;
		System.out.println("Drove another " + milesDriven + " miles.");		
		o1.milesDriven(milesDriven);	
		System.out.println("Fuel consumed is " + df.format(o1.fuelConsumed()) + " gallons");

	}

}
