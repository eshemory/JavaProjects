/**
 * 
 */
package exam1;

/**
 * @author sheelij
 *
 */
public class Arcade {

	public static final int PRICE_OF_CANDY = 10; // Candy costs 10 coupons
	
	public static final int PRICE_OF_GUMBALLS = 3; // Gumballs cost 3 coupons
	
	public static void main(String[] args) {
		
		int coupons = 48;
		
		int candy = coupons / PRICE_OF_CANDY; 
		
		int gumballs = (coupons % PRICE_OF_CANDY) / PRICE_OF_GUMBALLS; 
		
		System.out.println("You have " + coupons + " coupons");
		System.out.println("You bought " + candy + " candy bars");
		System.out.println("and you bought " + gumballs + " gumballs");

	}

}
