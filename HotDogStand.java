/**
 * 
 */
package exam4;

/**
 * @author sheelij
 *
 */
public class HotDogStand {
	private int id;				// Hot dog stand's id number
	private int hotDogsSold;	// Number of hot dogs sold
	private static int totalHotDogsSold;

	/**
	 * Creates a new hot dog stand with the specified id and number of hot dogs sold.
	 * 
	 * @param id the id number of the hot dog stand
	 * @param hotDogsSold the number of hot dogs sold by the hot dog stand
	 */
	public HotDogStand(int id, int hotDogsSold) {
		this.id = id;
		this.hotDogsSold = hotDogsSold;
		totalHotDogsSold += hotDogsSold;  // add the hot dogs sold by this stand to the total
	}

	/**
	 * Records the sale of a hot dog by this hot dog stand.
	 * 
	 * Updates both the number of hot dogs sold by this stand and the total number of hot dogs sold.
	 */
	public void justSold() {
		hotDogsSold++;
		totalHotDogsSold++;
	}

	/**
	 * Returns the number of hot dogs sold by this hot dog stand.
	 * 
	 * @return the number of hot dogs sold by this hot dog stand
	 */
	public int getSold() {
		return hotDogsSold;
	}

	/**
	 * Returns the id number of this hot dog stand.
	 * 
	 * @return the id number of this hot dog stand
	 */
	public int getIdentity() {
		return id;
	}

	/**
	 * Returns the total number of hot dogs sold by all hot dog stands.
	 * 
	 * @return the total number of hot dogs sold by all hot dog stands
	 */
	public static int getTotalSold() {
		return totalHotDogsSold;
	}
}


