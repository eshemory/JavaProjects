/**
 * 
 */
package lab6;

/**
 * @author sheelij
 *
 */
public class Euclid {
	public int gcd(int a, int b) {
		while(b != 0) {
			int t = b;
			b = a % b;
			a = t;
		}
		return a;
	}
	
	public static int fib(int n) {
		if (n == 0)
			return 1;
		if (n == 1)
			return 1;
		return fib(n-1) + fib(n-2);
	}
	
	public static int gcdR(int a, int b) {
		if (b == 0)
			return a;
		return gcdR(b, a%b);
	}
	
	public static void main(String[] args) {
		System.out.println(gcdR(24,32));
		System.out.println(fib(9));
	}
}
