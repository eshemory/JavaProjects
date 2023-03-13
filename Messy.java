/**
 * 
 */
package exam1;

/**
 * @author sheelij
 *
 */
public class Messy {

	public static final double DISTANCE = 6.21;

	
	public static void main(String[] args) {
		double time, pace;
		System.out.println("This program calculates your pace given a time and distance traveled.");
		time = 35.5; // 35 minutes and 30 seconds
		pace = DISTANCE / time;
		System.out.println("Your pace is " + pace + " miles per minute.");
	}

}
