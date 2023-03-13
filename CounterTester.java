/**
 * 
 */
package lab7;

/**
 * @author sheelij
 *
 */
public class CounterTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Counter c1 = new Counter();
		Counter c2 = new Counter(10);
		Counter c3 = new Counter(-10);
		
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		int n = 10;
		while (n > 0) {
			c1.increment();
			c2.increment();
			c3.increment();
			n--;
		}
		System.out.println("After inc...");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		n = 20;
		while (n > 0) {
			c1.decrement();
			c2.decrement();
			c3.decrement();
			n--;
		}
		System.out.println("After dec...");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		c3.increment();
		System.out.println(c1.equals(c3));
		System.out.println("c3 has " + c3.getCount());
	}

}
