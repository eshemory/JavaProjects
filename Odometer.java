/**
 * 
 */
package lab7;

/**
 * @author sheelij
 *
 */
public class Odometer {
	private double milesDriven;
	private double fuelEfficiency;
	
	public void reset() {
		milesDriven = 0;
	}
	
	public void setFuelEfficiency(double fuelEfficiency) {
		this.fuelEfficiency = fuelEfficiency;
	}
	
	public void milesDriven(double milesDriven) {
		this.milesDriven += milesDriven;
	}
	
	public double fuelConsumed() {
		return (milesDriven / fuelEfficiency);
	}
}
