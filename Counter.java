/**
 * 
 */
package lab7;

/**
 * @author sheelij
 *
 */
public class Counter {
	private int count = 0;
	
	public Counter() {
		count = 0;
	}
	
	public Counter(int count) {
		if(count > 0)
		this.count = count;
	}
	
	public void reset() {
		count = 0;
	}
	
	public void increment() {
		count++;
	}
	
	public void decrement() {
		if (count > 0)
			count--;
	}
	
	public int getCount() {
		return count;
	}
	
	public String toString() {
		String str = "Count = " + count;
		return str;
	}
	
	public boolean equals(Counter that) {
		return (this.count == that.count);
	}
}
