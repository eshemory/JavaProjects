/**
 * 
 */
package lab6;

/**
 * @author sheelij
 *
 */
public class Fraction {
	private int numerator;
	private int denominator;
	
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public Fraction(Fraction that) {
		this.numerator = that.numerator;
		this.denominator = that.denominator;
	}
	
	public double getValue() {
		double val = (double) numerator/ (double) denominator;
		return val;
	}
	
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	
	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	
	public int gcd(int a, int b) {
		while(b != 0) {
			int t = b;
			b = a % b;
			a = t;
		}
		return a;
	}
	
	public String toString() {
		int gcd = gcd(numerator, denominator);
		if (denominator == 0)
			return "Infinity";
		int num = numerator / gcd;
		int den = denominator / gcd;
		
		return num + "/" + den;
	}
	
	public boolean equals(Fraction that) {
		return (this.numerator == that.numerator &&
				this.denominator == that.denominator);
	}
}
