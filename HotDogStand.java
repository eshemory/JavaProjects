/**
 * 
 */
package exam4;

/**
 * @author sheelij
 *
 */
public class HotDogStand {
	private int id;		// Hot dog stand's id number
	private int hotDogsSold;	// Number of hot dogs sold
	private static int totalHotDogsSold;
	
	public HotDogStand(int id, int hotDogsSold)
	{
		this.id = id;
		this.hotDogsSold = hotDogsSold;
		this.totalHotDogsSold += hotDogsSold;
	}
	
	public void justSold()
	{
		totalHotDogsSold = hotDogsSold++;
	}
	
	public int getSold()
	{
		return hotDogsSold;
	}
	
	public int getIdentity()
	{
		return id;
	}
	
	public static int getTotalSold()
	{
		return totalHotDogsSold;
	}
}
